package step.definitions;

import api.endpoints.ActivitiesEndPoints;
import api.endpoints.Routes;
import api.payload.Activities;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GETActivitiesSteps {
    Faker faker;
    Activities activitiesPayload;

    Response response;
    @BeforeClass
    public void setUpData(){
//        faker = new  Faker();
//        activitiesPayload = new Activities();
//
//        activitiesPayload.setId(faker.idNumber().hashCode());
//        activitiesPayload.setTitle("Title 7");
//        activitiesPayload.setDueDate("123");
//        activitiesPayload.setCompleted(false);

    } // setUpData

    @Given("User Sets The Base API request {string}")
    public void userSetsTheBaseAPIRequestUrl(String url) {
        RestAssured.baseURI = url;
        response = RestAssured.get(url);

    }


    @Given("User Sets The Base API request")
    public void userSetsTheBaseAPIRequest() {

        response = ActivitiesEndPoints.getAllActivities();
        response.then().log();
    }
    @Then("Response is {string}")
    public void responseIsStatusCode(String statusCode) {
        String actualResponseCode = Integer.toString(response.then().extract().statusCode());
        Assert.assertEquals(actualResponseCode,statusCode);
    }


    @Given("User Sets The Base API request for specific Activities")
    public void userSetsTheBaseAPIRequestForSpecificActivities() {
        response = ActivitiesEndPoints.getSpecificActivities(5);
        response.then().log();
    }

    @Then("Response is {int}")
    public void responseIs(int statusCode) {
        int actualResponseCode = response.then().extract().statusCode();
        Assert.assertEquals(actualResponseCode,statusCode);
    }

    @Given("User Sets The Payload")
    public void userSetsThePayload() {

        activitiesPayload = new Activities(0,"title 0", "2023-06-22T01:46:54.2341281+00:00", true);

    } // userSetsThePayload

    @When("User Set The API to Post")
    public void userSetTheAPIToPost() {

        response = ActivitiesEndPoints.postActivities(activitiesPayload);
        response.then().log();

    }


    @Then("Response is check {int}")
    public void responseIsCheck(int statusCode) {
        int actualResponseCode = response.then().extract().statusCode();
        Assert.assertEquals(actualResponseCode,statusCode);
    }

    @Given("User Set The Payload To Update Activity")
    public void userSetThePayloadToUpdateActivity() {
        activitiesPayload = new Activities(5,"title No 5", "2023-06-22T01:46:54.2341281+00:00", false);
    }

    @When("User Set The API To Update Activity")
    public void userSetTheAPIToUpdateActivity() {
        response = ActivitiesEndPoints.updateActivities(5,activitiesPayload);
        response.then().log();
    }

    @Then("Check Activity After Update")
    public void checkActivityAfterUpdate() {

        response = ActivitiesEndPoints.getSpecificActivities(5);
        response.then().log();

        // Assert
        int actualResponseCode = response.then().extract().statusCode();
        Assert.assertEquals(actualResponseCode,200);
    }

    @Given("User Set The the API to Specific id to delete")
    public void userSetTheTheAPIToSpecificIdToDelete() {
        response = ActivitiesEndPoints.deleteActivities(0);
    }
} // End of GETActivities
