package step.def;
import api.endpoints.ActivitiesApiEndPoints;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import payload.ActivitiesAPIPage;

public class ActivitiesAPIStepDef {

    ActivitiesAPIPage activitiesPayload;

    Response response;
    @Given("Set The Base API and EndPoints of Activities API")
    public void setTheBaseAPIAndEndPointsOfActivitiesAPI() {

        response = ActivitiesApiEndPoints.getAllActivities();
        response.then().log();
    }

    @Then("Response must be {int}")
    public void responseMustBe(int expectedCode) {
        int actualResponseCode = response.then().extract().statusCode();
        Assert.assertEquals(actualResponseCode,expectedCode);
    }

    @Given("Set The Base API and EndPoints of Activities API For Specific Activity")
    public void setTheBaseAPIAndEndPointsOfActivitiesAPIForSpecificActivity() {
        response = ActivitiesApiEndPoints.getSpecificActivities(5);
        response.then().log();
    }

    @Given("Set The Payload For POST Request")
    public void setThePayloadForPOSTRequest() {
        activitiesPayload = new ActivitiesAPIPage(50,"title 50", "2023-06-22T01:46:54.2341281+00:00", true);
    }

    @When("Set The Base API and EndPoints of Activities For POST Request")
    public void setTheBaseAPIAndEndPointsOfActivitiesForPOSTRequest() {
        response = ActivitiesApiEndPoints.postActivities(activitiesPayload);
        response.then().log();
    }

    @Given("Set The Payload To Update Activity From Activities API")
    public void setThePayloadToUpdateActivityFromActivitiesAPI() {
        activitiesPayload = new ActivitiesAPIPage(5,"title Change", "2023-06-22T01:46:54.2341281+00:00", true);
    }

    @When("Set The Base API and EndPoints of Activities For PUT Request")
    public void setTheBaseAPIAndEndPointsOfActivitiesForPUTRequest() {
        response = ActivitiesApiEndPoints.updateActivities(5,activitiesPayload);
        response.then().log();
    }

    @Then("Verify Activity After Update")
    public void verifyActivityAfterUpdate() {
        response = ActivitiesApiEndPoints.getSpecificActivities(5);
        response.then().log();

        // Assert
        int actualResponseCode = response.then().extract().statusCode();
        Assert.assertEquals(actualResponseCode,200);
    }

    @Given("Set The Base API and EndPoints of Activities API For Specific Id")
    public void setTheBaseAPIAndEndPointsOfActivitiesAPIForSpecificId() {
        response = ActivitiesApiEndPoints.deleteActivities(0);
    }
} // ActivitiesAPIStepDef

