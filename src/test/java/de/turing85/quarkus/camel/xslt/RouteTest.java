package de.turing85.quarkus.camel.xslt;

import static com.google.common.truth.Truth.assertThat;
import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import javax.ws.rs.core.Response;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;

@QuarkusTest
class RouteTest {
  @Test
  void worksAsExpected() throws IOException {
    // @formatter:off
    final String request = new String(
        getClass().getClassLoader().getResourceAsStream("request.xml").readAllBytes(),
        StandardCharsets.UTF_8);
    String expected = new String(
        getClass().getClassLoader().getResourceAsStream("response.xml").readAllBytes(),
        StandardCharsets.UTF_8);
    String actual =
        given()
            .body(request)
            .contentType(ContentType.XML)
        .when()
            .post("/hello")
        .then()
            .statusCode(Response.Status.OK.getStatusCode())
            .extract().asString();
    // @formatter:on
    assertThat(actual).isEqualTo(expected);
  }
}