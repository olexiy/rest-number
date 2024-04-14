package de.olexiy.examples.quarkus;


import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


@QuarkusTest
class NumberResourceTest {

    @Test
    void generateIsbnNumbers() {
        given()
          .when()
                .get("/api/numbers")
          .then()
             .statusCode(200)
             .body("isbn_10", startsWith("10-"))
                .body("isbn_13", startsWith("13-"))
                .body(not(hasKey("generationDate")));
    }
}
