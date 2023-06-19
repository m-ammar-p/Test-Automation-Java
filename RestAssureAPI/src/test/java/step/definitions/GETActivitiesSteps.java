package step.definitions;

import groovy.transform.ToString;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

public class GETActivitiesSteps {

    RequestSpecification request;
    Response response;

    @Given("User Sets The Base API request {string}")
    public void userSetsTheBaseAPIRequestUrl(String url) {
        RestAssured.baseURI = url;
        response = RestAssured.get(url);
    }

    @When("user send the api end point to get all data")
    public void userSendTheApiEndPointToGetAllData() {
        String path = "/Activities";
        //response = request.get(path).then().extract().response();
    }
    @Then("Response is {string}")
    public void responseIsStatusCode(String statusCode) {
        String actualResponseCode = Integer.toString(response.then().extract().statusCode());
        Assert.assertEquals(statusCode,actualResponseCode);
    }

} // End of GETActivities
