package com.java.academy.rest.tests;

import com.java.academy.rest.Constants;
import io.restassured.http.ContentType;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.*;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class StudentsApiTest {

    protected static String URL;
    protected static RequestSpecification SPEC;

    @BeforeAll
    public static void setUrl() {
        URL = Constants.URL;
        SPEC = new RequestSpecBuilder().setBaseUri(URL).build();
    }

    @Test
    public void testInvalidPath() {
        given().spec(SPEC)
                .get("/studentsinvaidpath")
                .then()
                .statusCode(404);
    }

    @Test
    public void testUnsupportedMethod() {
        given().spec(SPEC)
                .delete("/students")
                .then()
                .statusCode(405);
    }

    @Test
    public void testGetStudents() {
        given().spec(SPEC)
                .get("/students")
                .then()
                .statusCode(200).contentType(ContentType.JSON);
    }

    @Test
    public void testPostStudent() {

        Map<String, Object> student = getStudent();

        given().spec(SPEC)
                .contentType(ContentType.JSON)
                .body(student)
                .post("/students")
                .then()
                .statusCode(201).contentType(ContentType.JSON);
    }

    @Test
    public void testGetStudentById() {

        Map<String, Object> student = getStudent();

        int studentId = createStudent(student);

        given().spec(SPEC)
                .contentType(ContentType.JSON)
                .body(student)
                .get("/students/" + studentId)
                .then()
                .statusCode(200).contentType(ContentType.JSON)
                .body("name", equalTo(student.get("name")))
                .body("studentNumber", equalTo(student.get("studentNumber")));
    }

    @Test
    public void testPutStudent() {

        Map<String, Object> student = getStudent();

        int studentId = createStudent(student);

        given().spec(SPEC)
                .contentType(ContentType.JSON)
                .body(student)
                .get("/students/" + studentId)
                .then()
                .statusCode(200).contentType(ContentType.JSON)
                .body("name", equalTo(student.get("name")))
                .body("studentNumber", equalTo(student.get("studentNumber")));

        student.put("name", "Nuevo Víctor");
        student.put("studentNumber", "A" + Constants.getRandomId());

        given().spec(SPEC)
                .contentType(ContentType.JSON)
                .body(student)
                .put("/students/" + studentId)
                .then()
                .statusCode(200).contentType(ContentType.JSON);

        given().spec(SPEC)
                .contentType(ContentType.JSON)
                .body(student)
                .get("/students/" + studentId)
                .then()
                .statusCode(200).contentType(ContentType.JSON)
                .body("name", equalTo(student.get("name")))
                .body("studentNumber", equalTo(student.get("studentNumber")));

    }

    @Test
    public void testPutStudentWithWrongFields() {

        Map<String, Object> student = getStudent();

        int studentId = createStudent(student);

        given().spec(SPEC)
                .contentType(ContentType.JSON)
                .body(student)
                .get("/students/" + studentId)
                .then()
                .statusCode(200).contentType(ContentType.JSON)
                .body("name", equalTo(student.get("name")))
                .body("studentNumber", equalTo(student.get("studentNumber")));

        student.put("name", null);
        student.put("studentNumber", -1.223d);

        given().spec(SPEC)
                .contentType(ContentType.JSON)
                .body(student)
                .put("/students/" + studentId)
                .then()
                .statusCode(400).contentType(ContentType.JSON);
    }

    @Test
    public void testPostStudentWithWrongFields() {

        Map<String, Object> student = new HashMap<>();
        student.put("id", 0);
        student.put("name", "");
        student.put("lastName", null);
        student.put("studentNumber", Constants.getRandomId());
        student.put("average", -1.2d);

        given().spec(SPEC)
                .contentType(ContentType.JSON)
                .body(student)
                .post("/students")
                .then()
                .statusCode(400).contentType(ContentType.JSON);
    }

    @Test
    public void testDeleteStudent() {

        Map<String, Object> student = getStudent();

        int studentId = createStudent(student);

        given().spec(SPEC)
                .contentType(ContentType.JSON)
                .body(student)
                .get("/students/" + studentId)
                .then()
                .statusCode(200).contentType(ContentType.JSON);

        given().spec(SPEC)
                .delete("/students/" + studentId)
                .then()
                .statusCode(200);

        given().spec(SPEC)
                .get("/students/" + studentId)
                .then()
                .statusCode(404);

    }

    @Test
    public void testDeleteWrongStudent() {

        Map<String, Object> student = getStudent();

        int studentId = createStudent(student);

        given().spec(SPEC)
                .delete("/students/" + Constants.getRandomId())
                .then()
                .statusCode(404);

    }

    protected int createStudent(Map<String, Object> student) {
        return given().spec(SPEC)
                .contentType(ContentType.JSON)
                .body(student)
                .post("/students")
                .then()
                .statusCode(201).contentType(ContentType.JSON)
                .extract()
                .path("id");
    }

    protected Map<String, Object> getStudent() {
        Map<String, Object> student = new HashMap<>();
        student.put("name", "Victor");
        student.put("lastName", "Lavalle");
        student.put("studentNumber", "A" + Constants.getRandomId());
        student.put("average", Constants.getAverage());
        return student;
    }

}
