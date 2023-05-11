package step_definitions.API;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.util.List;


public class Api_StepDefinitions {
    Response response;
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
    public void verifyResponseStatusCodeIs(int code)
    {
        Assert.assertEquals(code, response.statusCode());
    }
}