package step.def;
import api.endpoints.AuthorsAPIEndPoints;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import payload.AuthorsAPIPage;

public class AuthorsAPIStepDef {

    AuthorsAPIPage authorsPayload;
    Response response;
    @Given("Set The Base API and EndPoints of Authors API")
    public void setTheBaseAPIAndEndPointsOfAuthorsAPI() {
        response = AuthorsAPIEndPoints.getAllAuthors();
        response.then().log();
    }

    @Then("Response must be {int} For Authors API")
    public void responseMustBeForAuthorsAPI(int expectedCode) {
        int actualResponseCode = response.then().extract().statusCode();
        Assert.assertEquals(actualResponseCode,expectedCode);
    }

    @Given("Set The Base API and EndPoints of Authors API For Specific Author")
    public void setTheBaseAPIAndEndPointsOfAuthorsAPIForSpecificAuthor() {
        response = AuthorsAPIEndPoints.getSpecificAuthor(5);
        response.then().log();
    }

    @Given("Set The Payload For POST Request For Authors API")
    public void setThePayloadForPOSTRequestForAuthorsAPI() {

        authorsPayload = new AuthorsAPIPage(5,5,"Jason","Jack");
    }

    @When("Set The Base API and EndPoints of Authors For POST Request")
    public void setTheBaseAPIAndEndPointsOfAuthorsForPOSTRequest() {
        response = AuthorsAPIEndPoints.postAuthors(authorsPayload);
        response.then().log();
    }

    @Given("Set The Payload To Update Authors From Authors API")
    public void setThePayloadToUpdateAuthorsFromAuthorsAPI() {
        authorsPayload = new AuthorsAPIPage(5,5,"Jimmy","Mark");
    }

    @When("Set The Base API and EndPoints of Authors For PUT Request")
    public void setTheBaseAPIAndEndPointsOfAuthorsForPUTRequest() {
        response = AuthorsAPIEndPoints.updateAuthors(5,authorsPayload);
        response.then().log();
    }

    @Then("Verify Author After Update")
    public void verifyAuthorAfterUpdate() {
        response = AuthorsAPIEndPoints.getSpecificAuthor(5);
        response.then().log();

        // Assert
        int actualResponseCode = response.then().extract().statusCode();
        Assert.assertEquals(actualResponseCode,200);
    }

    @Given("Set The Base API and EndPoints of Authors API For Specific Id")
    public void setTheBaseAPIAndEndPointsOfAuthorsAPIForSpecificId() {
        response = AuthorsAPIEndPoints.deleteAuthors(5);
    }
}
