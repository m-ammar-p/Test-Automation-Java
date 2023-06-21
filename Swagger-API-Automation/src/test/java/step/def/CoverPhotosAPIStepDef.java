package step.def;
import api.endpoints.CoverPhotosAPIEndPoints;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import payload.CoverPhotosAPIPage;

public class CoverPhotosAPIStepDef {
    Response response;
    CoverPhotosAPIPage coverPhotosPayload;
    @Given("Set The Base API and EndPoints of CoverPhotos API")
    public void setTheBaseAPIAndEndPointsOfCoverPhotosAPI() {
        response = CoverPhotosAPIEndPoints.getAllCoverPhotos();
        response.then().log();
    }

    @Then("Response must be {int} For CoverPhotos API")
    public void responseMustBeForCoverPhotosAPI(int expectedCode) {
        int actualResponseCode = response.then().extract().statusCode();
        Assert.assertEquals(actualResponseCode,expectedCode);
    }

    @Given("Set The Base API and EndPoints of CoverPhotos API For Specific CoverPhotos")
    public void setTheBaseAPIAndEndPointsOfCoverPhotosAPIForSpecificCoverPhotos() {
        response = CoverPhotosAPIEndPoints.getSpecificCoverPhoto(5);
        response.then().log();
    }

    @Given("Set The Payload For POST Request For CoverPhotos API")
    public void setThePayloadForPOSTRequestForCoverPhotosAPI() {
        coverPhotosPayload = new CoverPhotosAPIPage(5, 5, "https://placeholdit.imgix.net/~text?txtsize=33&txt=Book 6&w=250&h=350");
    }
    @When("Set The Base API and EndPoints of CoverPhotos For POST Request")
    public void setTheBaseAPIAndEndPointsOfCoverPhotosForPOSTRequest() {
        response = CoverPhotosAPIEndPoints.postCoverPhotos(coverPhotosPayload);
        response.then().log();
    }

    @Given("Set The Payload To Update CoverPhoto From CoverPhotos API")
    public void setThePayloadToUpdateCoverPhotoFromCoverPhotosAPI() {
            coverPhotosPayload = new CoverPhotosAPIPage(5,5,"https://placeholdit.imgix.net/~text?txtsize=33&txt=Book 6&w=250&h=350");
    }

    @When("Set The Base API and EndPoints of CoverPhotos For PUT Request")
    public void setTheBaseAPIAndEndPointsOfCoverPhotosForPUTRequest() {
        response = CoverPhotosAPIEndPoints.updateCoverPhoto(5,coverPhotosPayload);
        response.then().log();
    }

    @Then("Verify CoverPhoto After Update")
    public void verifyCoverPhotoAfterUpdate() {
        response = CoverPhotosAPIEndPoints.getSpecificCoverPhoto(5);
        response.then().log();

        // Assert
        int actualResponseCode = response.then().extract().statusCode();
        Assert.assertEquals(actualResponseCode,200);
    }

    @Given("Set The Base API and EndPoints of CoverPhotos API For Specific Id")
    public void setTheBaseAPIAndEndPointsOfCoverPhotosAPIForSpecificId() {
        response = CoverPhotosAPIEndPoints.deleteCoverPhoto(5);
    }
}
