package com.project.UserApplication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {
	
	@Bean
	public OpenAPI openApi() {
		return new OpenAPI()
				.info(new Info().title("User Management Application")
						.description("Swagger Configuration dempo using Springboot userApp")
						.version("1.0")
						.contact(new Contact()
						        .name("API support team")
						        .email("sandhya@gmail.com")
						        .url("https:8080"))
						.license(new License()
								.name("Apache 2.0")
								.url("http://www.apache.org./licenses/LICENSES-2.0")));
				
	}

}
