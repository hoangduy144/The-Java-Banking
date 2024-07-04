package com.example.the_java_bank;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "The Java Banking App",
				description = "Backend Rest API for TJ BANKING",
				version = "v1.0",
				contact = @Contact(
						name = "DANG HO HOANG DUY",
						email = "hoangduy8741@gmail.com",
						url = ""
				),
				license = @License(
						name = "The Java Banking",
						url = ""
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "The Java Banking App Documention",
				url = ""
		)
)
public class TheJavaBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheJavaBankApplication.class, args);
	}

}
