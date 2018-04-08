package fr.cmi.member.web;

import fr.cmi.AppITConfig;
import fr.cmi.inscription.domain.Inscription;
import fr.cmi.member.domain.Member;
import fr.cmi.member.domain.MemberService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

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
@Sql(scripts = {
    "classpath:sql/reset.sql",
    "classpath:sql/membersTest/members.sql"
})
public class MemberControllerIT {
    @Autowired
    private MemberService memberService;

    @Test
    public void should_return_all_members_formatted_as_json() throws Exception {

        get(BASE_URL + "/members")
            .then()
            .statusCode(OK.value())
            .contentType(JSON)
            .body("size()", equalTo(3))
            .body("id", contains("1", "2", "3"))
            .body("firstName", contains("firstName1", "firstName2", "firstName3"))
            .body("lastName", contains("lastName1", "lastName2", "lastName3"));
    }

    //@Test
    @Sql(scripts = {
        "classpath:sql/reset.sql"
    })
    public void should_successfully_save_member() {
        final Member expected =  Member.builder().id("1").firstName("testFirstName").lastName("testLastName").build();

        given()
            .contentType(APPLICATION_JSON_VALUE)
            .body(expected)
            .post(BASE_URL + "/members")
            .then()
            .statusCode(OK.value())
            .contentType(JSON)
            .body("id", notNullValue())
            .body("firstName", equalTo("testFirstName"))
            .body("lastName", equalTo("testLastName"));

        assertThat(memberService.findAllMembers())
            .hasSize(1);
        //.usingElementComparator(Comparator.comparing(Member::getFirstName).thenComparing(Member::getLastName))
        //.containsOnly(expected)
        //.extracting(Member::getId).isNotNull();
    }

    //@Test
    public void should_return_bad_request_when_posted_member_body_is_not_valid() {
        given()
            .contentType(APPLICATION_JSON_VALUE)
            .body(new Inscription())
            .post(BASE_URL + "/members")
            .then()
            .statusCode(BAD_REQUEST.value())
            .contentType(JSON)
            .body("message", equalTo(BAD_REQUEST.getReasonPhrase()));
    }

}
