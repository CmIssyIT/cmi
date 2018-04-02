package fr.cmi;

import fr.cmi.config.SwaggerConfig;
import org.junit.Test;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import static org.assertj.core.api.Assertions.assertThat;

public class SwaggerConfigTest {

    private final SwaggerConfig app = new SwaggerConfig();

    @Test
    public void should_create_docket_for_swagger_configuration() throws Exception {

        Docket result = app.docket();

        assertThat(result).isNotNull();
        assertThat(result.getDocumentationType()).isEqualTo(DocumentationType.SWAGGER_2);
    }

}
