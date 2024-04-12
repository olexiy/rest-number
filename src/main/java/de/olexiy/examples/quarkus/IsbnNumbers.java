package de.olexiy.examples.quarkus;

import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbTransient;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.time.Instant;

@Schema(name = "IsbnNumbers", description = "This class represents ISBN numbers for the book.")
public record IsbnNumbers(@JsonbProperty("isbn_10") @Schema(required = true) String isbn10,
                          @JsonbProperty("isbn_13") @Schema(required = true) String isbn13,
                          @JsonbTransient Instant generationDate) {
}
