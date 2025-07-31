package dev.ventura.restaurant;

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

    @Test
    void createRestaurantsEndpoint() {
        given()
                .body("{\"name\":\"Test Restaurant\",\"category\":\"Italian\",\"rating\":4.5,\"deliveryEstimate\":\"30 mins\",\"imagePath\":\"/images/test.jpg\"}")
                .header("Content-Type", "application/json")
                .when().post("/api/restaurants")
                .then()
                .statusCode(201);
    }

}
