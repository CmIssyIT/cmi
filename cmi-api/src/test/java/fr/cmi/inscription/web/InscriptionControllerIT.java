package fr.cmi.inscription.web;

import fr.cmi.AppITConfig;
import fr.cmi.inscription.domain.Inscription;
import fr.cmi.inscription.domain.InscriptionRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Comparator;

import static fr.cmi.AppITConfig.BASE_URL;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.Matchers.contains;
import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@AppITConfig
@RunWith(SpringRunner.class)
public class InscriptionControllerIT {

    @Autowired
    private InscriptionRepository inscriptionRepository;

    @Test
    @Sql(statements = {
        "delete from inscription",
        "insert into inscription(id, first_name, last_name) values (1, 'firstName1','lastName1'), (2, 'firstName2','lastName2')"
    })
    public void should_return_all_inscriptions_formatted_as_json() throws Exception {

        get(BASE_URL + "/inscriptions")
            .then()
            .statusCode(OK.value())
            .contentType(JSON)
            .body("size()", equalTo(2))
            .body("id", contains(1, 2))
            .body("firstName", contains("firstName1", "firstName2"))
            .body("lastName", contains("lastName1", "lastName2"));
    }

    @Test
    @Sql(statements = "delete from inscription")
    public void should_successfully_save_inscription() {
        Inscription expected = new Inscription("testFirstName", "testLastName");

        given()
            .contentType(APPLICATION_JSON_VALUE)
            .body(expected)
            .post(BASE_URL + "/inscriptions")
            .then()
            .statusCode(OK.value())
            .contentType(JSON)
            .body("id", notNullValue())
            .body("firstName", equalTo("testFirstName"))
            .body("lastName", equalTo("testLastName"));

        assertThat(inscriptionRepository.findAll())
            .hasSize(1)
            .usingElementComparator(Comparator.comparing(Inscription::getFirstName).thenComparing(Inscription::getLastName))
            .containsOnly(expected)
            .extracting(Inscription::getId).isNotNull();
    }

    @Test
    public void should_return_bad_request_when_posted_inscription_body_is_not_valid() {
        given()
            .contentType(APPLICATION_JSON_VALUE)
            .body(new Inscription())
            .post(BASE_URL + "/inscriptions")
            .then()
            .statusCode(BAD_REQUEST.value())
            .contentType(JSON)
            .body("message", equalTo(BAD_REQUEST.getReasonPhrase()));
    }

}
