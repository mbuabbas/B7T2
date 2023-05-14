package step_definitions.API;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import pages.CreateProjectPojos;
import utils.CucumberLogUtils;


import java.util.List;
import java.util.Map;


public class Api_StepDefinitions {
    Response response;
    private String endpoint;
    private String apiKey;
    String studentId;

    @Given("the {string} course endpoint is {string}")
    public void theSDETCourseEndpointIs(String courseType, String endpoint) {
        if (courseType.equalsIgnoreCase("SDET")) {
            this.endpoint = endpoint;
        } else if (courseType.equalsIgnoreCase("Dev")) {
            this.endpoint = endpoint;
        } else {
            throw new IllegalArgumentException("Invalid course type: " + courseType);
        }
    }

    @Then("the response status code is {int}")
    public void theResponseStatusCodeIs(int code) {
        Assert.assertEquals(code, response.statusCode());
    }

    @When("I send a POST request with body {string}, {string}")
    public void iSendAPOSTRequestToTheSDETCourseEndpointWithBody(String name, String duration) {
        String payload = "{\n" +
                "  \"name\": \"" + name + "\",\n" +
                "  \"duration\": \"" + duration + "\"\n" +
                "}";
        RequestSpecification request = RestAssured.given();
        response = request.header("Content-type", "application/json")
                .and()
                .body(payload)
                .when()
                .post(endpoint)
                .then().
                log().all()
                .extract().response();
    }

    @And("the response body contains the following fields {string}, {string}")
    public void theResponseBodyContainsTheFollowingFields(String name, String duration) {
        response = response.then().log().all().extract().response();
        Assert.assertTrue(response.getBody().asString().contains(name));
        Assert.assertTrue(response.getBody().asString().contains(duration));
    }

    @When("I send a DELETE request to the SDET course with {string}")
    public void iSendADELETERequestToTheSDETCourseWith(String name) {
        RequestSpecification request = RestAssured.given();
        response = request.header("Content-type", "application/json")
                .when()
                .delete(endpoint + "?name=" + name)
                .then()
                .log().all()
                .extract().response();
    }

    @And("the {string} not exist in  response body")
    public void theNotExistInResponseBody(String name) {
        response = response.then().log().all().extract().response();
        if (response.getBody().asString().contains(name)) {
            Assert.fail();
        } else {
            Assert.assertTrue(true);
        }
    }

    @Given("I perform get request to  {string}")
    public void iPerformGetRequestTo(String endpoint) {
        response = RestAssured.given()
                .get(endpoint)
                .then()
                .log()
                .all()
                .extract()
                .response();
    }

    @And("the response body contains the following fields:")
    public void theResponseBodyContainsTheFollowingFields(List<String> expectedFields) {
        response = response.then().log().all().extract().response();
        for (String field : expectedFields) {
            Assert.assertTrue(response.getBody().asString().contains(field));
        }
    }


    @Given("The API key is {string}")
    public void theAPIKeyIs(String apiKey) {
        this.apiKey = apiKey;
    }

    @And("The student ID is {string}")
    public void theStudentIDIs(String studentId) {
        this.studentId = studentId;
    }

    @When("The delete request is sent to {string}")
    public void theDeleteRequestIsSentTo(String endpoint) {
        RequestSpecification request = RestAssured.given();
        response = request.header("Authorization", apiKey)
                .when()
                .delete(endpoint, this.studentId)
                .then()
                .log().all()
                .extract().response();
    }

=======

    @Given("I perform get request to {string} endpoint")
    public void iPerformGetRequestToEndpoint(String endpoint)
    {
        RestAssured.baseURI = "https://tla-school-api.herokuapp.com/api/school/programs/";

        Response response = RestAssured.given()
                .when()
                .get(endpoint)
                .then()
                .log()
                .all()
                .extract()
                .response();
        System.out.println(response.prettyPeek());
    }

    @Then("Verify response status code is {int}")
    public void verifyResponseStatusCodeIs(int code) {
        Assert.assertEquals(code, response.statusCode());
    }
    @Given("I send a POST request to {string} with body:")
    public void iSendAPOSTRequestToWithBody(String endpoint, Map<String, String> inputBody) {
        CreateProjectPojos project = new CreateProjectPojos();
        project.setBatch(inputBody.get("batch"));
        project.setFirstName(inputBody.get("firstname"));
        project.setLastName(inputBody.get("lastname"));
        project.setEmail(inputBody.get("email"));


        response = RestAssured.given().header("Content-type", "application/json")
                .and()
                .body(project)
                .when()
                .post(endpoint)
                .then().
                log().all()
                .extract().response();
        studentId = response.jsonPath().getString("data._id");
        System.out.println(studentId);
    }

    @Given("I perform a PUT request to {string} with body:")
    public void iPerformAPUTRequestToWithBody(String endpoint, Map<String, String> inputBody) {
        System.out.println(studentId);

        CreateProjectPojos project = new CreateProjectPojos();
        project.setStreetAddress(inputBody.get("streetAddress"));
        project.setCity(inputBody.get("city"));
        project.setState(inputBody.get("state"));
        project.setZip(inputBody.get("zip"));
        project.setPlaces(inputBody.get("places"));
        project.setCompany(inputBody.get("company"));
        project.setLocation(inputBody.get("location"));
        project.setFirstName(inputBody.get("firstName"));
        project.setLastName(inputBody.get("lastName"));
        project.setBatch(inputBody.get("batch"));
        project.setEmail(inputBody.get("email"));

        response = RestAssured.given()
                .header("Content-type", "application/json")
                .queryParam("key", "d03e989018msh7f4691c614e87a9p1a8181j")
                .and()
                .body(project)
                .when()
                .put(endpoint  + "/" + studentId)
                .then().
                log().all()
                .extract().response();

    }

    @Given("I perform post request to {string} endpoint")
    public void iPerformPostRequestToEndpoint(String path)
    {
        String jsonPayload = "{\"name\":\"Paul\",\"duration\":\" 7 month\"}";
        response = RestAssured.given()
                .and()
                .body(jsonPayload)
                .when()
                .post(path)
                .then()
                .log()
                .all()
                .extract()
                .response();
        System.out.println(response.prettyPeek());
        System.out.println(response.jsonPath().getString("name"));
        Assert.assertEquals(response.jsonPath().getString("name"),"Paul");
        Assert.assertEquals(response.jsonPath().getString("duration"), "7 months");

    }

}