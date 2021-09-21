package com.controle.ponto.swagger;



import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Arrays;

public class SwaggerConfig {

    @Bean
    public Docket api(){
            return new Docket(DocumentationType.SWAGGER_2)
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("Projeto criado para bootcamp DIO - Santander / Backend"))
                    .paths(PathSelectors.any())
                    .build()
                    .useDefaultResponseMessages(false)
                    .securitySchemes(Arrays.asList(new ApiKey("Token Access", HttpHeaders.AUTHORIZATION, SecurityScheme.In.HEADER.name())))
                    .apiInfo(apiInfo());
        }

    @Bean
    public ApiInfo apiInfo() {
            return new ApiInfoBuilder()
                    .title("Projeto criado para bootcamp DIO - Santander / Backend")
                    .description("Controle Ponto")
                    .version("1.0")
                    .license("Apache License Version 2.0")
                    .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
                    .build();
        }
    }

