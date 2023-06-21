package step.def;
import api.endpoints.ActivitiesApiEndPoints;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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

} // ActivitiesAPIStepDef

