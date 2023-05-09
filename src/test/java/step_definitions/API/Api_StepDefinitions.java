package step_definitions.API;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;


public class Api_StepDefinitions {
    Response response;
    HashMap<String, String> actualFields;
    HashMap<String, String> actualValues;
    private String endpoint;

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

    @When("I send a GET request to the SDET course endpoint")
    public void iSendAGETRequestToTheSDETCourseEndpoint() {
        RequestSpecification request = RestAssured.given();
        response = request.get(endpoint).then().log().all().extract().response();
    }

    @Then("the response status code is {int}")
    public void theResponseStatusCodeIs(int code) {
        Assert.assertEquals(code, response.statusCode());
    }


    @And("the response body contains the following fields:")
    public void theResponseBodyContainsTheFollowingFields(List<String> expectedFields) {
        response = response.then().log().all().extract().response();
        for (String field : expectedFields) {
            Assert.assertTrue(response.getBody().asString().contains(field));

        }

    }

    @When("I send a POST request to the SDET course endpoint with body:")
    public void iSendAPOSTRequestToTheSDETCourseEndpointWithBody(Map<String, String> map) {
        String payload = "{\n" +
                "  \"name\": \"Uran test Sasuke\",\n" +
                "  \"duration\": \"1002 days\"\n" +
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

    @When("I send a DELETE request to the SDET course with name {string}")
    public void iSendADELETERequestToTheSDETCourseWithName(String name) {
        RequestSpecification request = RestAssured.given();
        response = request.header("Content-type", "application/json")
                .when()
                .delete(endpoint + "?name=" + name)
                .then()
                .statusCode(200)
                .log().all()
                .extract().response();
    }

    @And("the name {string} not exist in  response body")
    public void theNameNotExistInResponseBody(String name) {
        response = response.then().log().all().extract().response();
        if(response.getBody().asString().contains(name)){
            Assert.fail();
        } else {
            Assert.assertTrue(true);
        }
    }
}