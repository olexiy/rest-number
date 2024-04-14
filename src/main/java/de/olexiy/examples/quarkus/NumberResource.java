package de.olexiy.examples.quarkus;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.jboss.logging.Logger;

import java.time.Instant;
import java.util.Random;


@Path("/api/numbers")
@Tag(name = "This is the ISBN Number retrieval REST endpoint")
public class NumberResource {

    @Inject
    Logger logger;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(
            summary = "Generate ISBN numbers",
            description = "This endpoint generates a random ISBN numbers for the book."
    )
    public IsbnNumbers generateIsbnNumbers() {
        return new IsbnNumbers("10-" + new Random().nextInt(100_000),
                "13-" + new Random().nextInt(100_000_000),
                Instant.now());
    }
}
