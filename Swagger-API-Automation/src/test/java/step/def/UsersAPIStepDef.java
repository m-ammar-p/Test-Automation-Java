package step.def;
import api.endpoints.CoverPhotosAPIEndPoints;
import api.endpoints.UsersAPIEndPoints;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import payload.CoverPhotosAPIPage;
import payload.UsersAPIPage;

public class UsersAPIStepDef {
    Response response;
    UsersAPIPage userPayload;
    @Given("Set The Base API and EndPoints of Users API")
    public void setTheBaseAPIAndEndPointsOfUsersAPI() {
        response = UsersAPIEndPoints.getAllUsers();
        response.then().log();
    }

    @Then("Response must be {int} For Users API")
    public void responseMustBeForUsersAPI(int expectedCode) {
        int actualResponseCode = response.then().extract().statusCode();
        Assert.assertEquals(actualResponseCode,expectedCode);
    }

    @Given("Set The Base API and EndPoints of Users API For Specific User")
    public void setTheBaseAPIAndEndPointsOfUsersAPIForSpecificUser() {
        response = UsersAPIEndPoints.getSpecificUser(5);
        response.then().log();
    }

    @Given("Set The Payload For POST Request For Users API")
    public void setThePayloadForPOSTRequestForUsersAPI() {
        userPayload = new UsersAPIPage(5,"James","123456User");
    }

    @When("Set The Base API and EndPoints of Users For POST Request")
    public void setTheBaseAPIAndEndPointsOfUsersForPOSTRequest() {
        response = UsersAPIEndPoints.postUsers(userPayload);
        response.then().log();
    }

    @Given("Set The Payload To Update User From Users API")
    public void setThePayloadToUpdateUserFromUsersAPI() {
        userPayload = new UsersAPIPage(5,"James","123456User");
    }

    @When("Set The Base API and EndPoints of Users For PUT Request")
    public void setTheBaseAPIAndEndPointsOfUsersForPUTRequest() {
        response = UsersAPIEndPoints.updateUser(5,userPayload);
        response.then().log();
    }

    @Then("Verify Users After Update")
    public void verifyUsersAfterUpdate() {
        response = UsersAPIEndPoints.getSpecificUser(5);
        response.then().log();

        // Assert
        int actualResponseCode = response.then().extract().statusCode();
        Assert.assertEquals(actualResponseCode,200);
    }

    @Given("Set The Base API and EndPoints of Users API For Specific Id")
    public void setTheBaseAPIAndEndPointsOfUsersAPIForSpecificId() {
        response = UsersAPIEndPoints.deleteUsers(5);
    }
}
