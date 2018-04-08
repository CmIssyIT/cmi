package fr.cmi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;

import static io.restassured.RestAssured.get;
import static org.hamcrest.CoreMatchers.equalTo;

@AppITConfig
@RunWith(SpringRunner.class)
public class ApplicationIT {

    @Test
    public void should_have_health_endpoint() throws Exception {

        get(AppITConfig.BASE_URL + "/health")
            .then()
            .statusCode(HttpStatus.OK.value());

    }

    @Test
    public void should_have_info_endpoint() throws Exception {

        get(AppITConfig.BASE_URL + "/info")
            .then()
            .statusCode(HttpStatus.OK.value());
    }

    @Test
    public void should_have_env_endpoint() {
        get(AppITConfig.BASE_URL + "/env")
            .then()
            .statusCode(HttpStatus.UNAUTHORIZED.value());
    }

    //@Test
    public void should_have_swagger_ui() throws Exception {
        get(AppITConfig.BASE_URL + "/swagger-ui.html")
            .then()
            .statusCode(200)
            .body("html.head.title", equalTo("Swagger UI")); // yes, this is html path
    }

}
