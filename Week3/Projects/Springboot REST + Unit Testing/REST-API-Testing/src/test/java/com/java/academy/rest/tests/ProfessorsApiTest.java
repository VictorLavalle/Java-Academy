package com.java.academy.rest.tests;

import com.java.academy.rest.Constants;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

// This is the main class for Professors API tests
public class ProfessorsApiTest {

    // URL is a static variable that holds the base URL for API requests
    private static String URL;
    // SPEC is a static variable that holds the RequestSpecification object, used in API requests
    private static RequestSpecification SPEC;

    // This method is annotated with @BeforeAll, which means it will run once before all test methods
    // In this method, the URL and SPEC variables are initialized
    @BeforeAll
    public static void setUrl() {
        URL = Constants.URL; // Constants.URL holds the base URL for API requests
        SPEC = new RequestSpecBuilder().setBaseUri(URL).build(); // SPEC is created using the RequestSpecBuilder
    }

    // This test method tests an invalid path for the API
    // It sends a GET request to "/professorsinvaidpath" and checks if the returned status code is 404
    @Test
    public void testInvalidPath() {
        given().spec(SPEC)
                .get("/professorsinvaidpath")
                .then()
                .statusCode(404);
    }

    // This test method tests an unsupported method for the API
    // It sends a DELETE request to "/professors" and checks if the returned status code is 405
    @Test
    public void testUnsupportedMethod() {
        given().spec(SPEC)
                .delete("/professors")
                .then()
                .statusCode(405);
    }

    // This test method tests the ability to get all professors from the API
    // It sends a GET request to "/professors" and checks if the returned status code is 200 and content type is JSON
    @Test
    public void testGetProfessors() {
        given().spec(SPEC)
                .get("/professors")
                .then()
                .statusCode(200).contentType(ContentType.JSON);
    }

    // This test method tests the ability to post a new professor to the API
    // It sends a POST request to "/professors" with a professor JSON object in the body and
    // checks if the returned status code is 201 and content type is JSON
    @Test
    public void testPostProfessor() {

        Map<String, Object> professor = getProfessor(); // gets a professor JSON object

        given().spec(SPEC)
                .contentType(ContentType.JSON)
                .body(professor)
                .post("/professors")
                .then()
                .statusCode(201).contentType(ContentType.JSON);
    }

    // This test method tests the ability to get a professor by id from the API
    // It first creates a professor and gets its id, then sends a GET request to "/professors/{id}"
    // and checks if the returned status code is 200 and content type is JSON, and if the returned
    // professor name and classHours match the professor object that was created
    @Test
    public void testGetProfessorById() {

        Map<String, Object> professor = getProfessor();

        int professorId = createProfessor(professor);

        given().spec(SPEC)
                .contentType(ContentType.JSON)
                .body(professor)
                .get("/professors/" + professorId)
                .then()
                .statusCode(200).contentType(ContentType.JSON)
                .body("name", equalTo(professor.get("name")))
                .body("classHours", equalTo(professor.get("classHours")));
    }


    @Test
    public void testPutProfessor() {

        Map<String, Object> professor = getProfessor();

        int professorId = createProfessor(professor);

        given().spec(SPEC)
                .contentType(ContentType.JSON)
                .body(professor)
                .get("/professors/" + professorId)
                .then()
                .statusCode(200).contentType(ContentType.JSON)
                .body("name", equalTo(professor.get("name")))
                .body("classHours", equalTo(professor.get("classHours")));

        professor.put("name", "New Professor");
        professor.put("classHours", Constants.getRandomHours());

        given().spec(SPEC)
                .contentType(ContentType.JSON)
                .body(professor)
                .put("/professors/" + professorId)
                .then()
                .statusCode(200).contentType(ContentType.JSON);

        given().spec(SPEC)
                .contentType(ContentType.JSON)
                .body(professor)
                .get("/professors/" + professorId)
                .then()
                .statusCode(200).contentType(ContentType.JSON)
                .body("name", equalTo(professor.get("name")))
                .body("classHours", equalTo(professor.get("classHours")));

    }

    @Test
    public void testPutProfessorWithWrongFields() {

        Map<String, Object> professor = getProfessor();

        int professorId = createProfessor(professor);

        given().spec(SPEC)
                .contentType(ContentType.JSON)
                .body(professor)
                .get("/professors/" + professorId)
                .then()
                .statusCode(200).contentType(ContentType.JSON)
                .body("name", equalTo(professor.get("name")))
                .body("classHours", equalTo(professor.get("classHours")));

        professor.put("name", null);
        professor.put("classHours", -1.26d);

        given().spec(SPEC)
                .contentType(ContentType.JSON)
                .body(professor)
                .put("/professors/" + professorId)
                .then()
                .statusCode(400).contentType(ContentType.JSON);

    }

    @Test
    public void testPostProfessorWithWrongFields() {

        Map<String, Object> professor = new HashMap<>();
        professor.put("id", 0);
        professor.put("name", "");
        professor.put("lastName", null);
        professor.put("employeeNumber", -3688);
        professor.put("classHours", -1.26d);

        given().spec(SPEC)
                .contentType(ContentType.JSON)
                .body(professor)
                .post("/professors")
                .then()
                .statusCode(400).contentType(ContentType.JSON);
    }

    @Test
    public void testDeleteProfessor() {

        Map<String, Object> professor = getProfessor();

        int professorId = createProfessor(professor);

        given().spec(SPEC)
                .contentType(ContentType.JSON)
                .body(professor)
                .get("/professors/" + professorId)
                .then()
                .statusCode(200).contentType(ContentType.JSON);

        given().spec(SPEC)
                .delete("/professors/" + professorId)
                .then()
                .statusCode(200);

        given().spec(SPEC)
                .get("/professors/" + professorId)
                .then()
                .statusCode(404);

    }

    @Test
    public void testDeleteWrongProfessor() {

        Map<String, Object> professor = getProfessor();

        given().spec(SPEC)
                .contentType(ContentType.JSON)
                .body(professor)
                .post("/professors")
                .then()
                .statusCode(201).contentType(ContentType.JSON);

        given().spec(SPEC)
                .delete("/professors/" + Constants.getRandomId())
                .then()
                .statusCode(404);
    }

    // createProfessor method is a helper method that creates a professor by sending a POST
    // request to the "/professors" endpoint with the professor information passed as an argument.
    // It returns the id of the created professor.
    private int createProfessor(Map<String, Object> professor) {
        return given().spec(SPEC)
                .contentType(ContentType.JSON)
                .body(professor)
                .post("/professors")
                .then()
                .statusCode(201).contentType(ContentType.JSON)
                .extract().path("id");
    }

    private Map<String, Object> getProfessor() {
        Map<String, Object> professor = new HashMap<>();
        professor.put("name", "Profesor");
        professor.put("lastName", "Lavalle");
        professor.put("employeeNumber", Constants.getRandomId());
        professor.put("classHours", Constants.getRandomHours());
        return professor;
    }

}
