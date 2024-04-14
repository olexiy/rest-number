package de.olexiy.examples.quarkus;


import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.ExternalDocumentation;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;


@ApplicationPath("/")
@OpenAPIDefinition(
        info = @Info(
                title = "Number Microservice",
                version = "1.0",
                description = "This is a simple microservice that generates random ISBN numbers.",
                contact = @Contact(
                        name = "Olexiy S",
                        email = "olexiy@mail.com")
        ),

                externalDocs = @ExternalDocumentation(
                        description = "More information about the microservice",
                        url = "https://github.com/olexiy/rest-number"

        ),
        tags = {
                @Tag(name = "api", description = "This is the ISBN Number retrieval REST endpoint"),
                @Tag(name = "numbers", description = "Any ISBN number related operations")
        }
)
public class NumberMicroservice extends Application {
}
