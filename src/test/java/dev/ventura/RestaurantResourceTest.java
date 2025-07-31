package dev.ventura;

import io.quarkus.test.junit.QuarkusTest;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

@QuarkusTest
class RestaurantResourceTest {
    @Test
    void testListRestaurantsEndpoint() {
        given()
                .when().get("/api/restaurants")
                .then()
                .statusCode(200);

    }

}
