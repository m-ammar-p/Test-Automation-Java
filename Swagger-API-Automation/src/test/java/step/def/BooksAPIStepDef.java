package step.def;
import api.endpoints.BooksAPIEndPoints;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import payload.BooksAPIPage;

public class BooksAPIStepDef {
    Response response;
    BooksAPIPage booksPayload;
    @Given("Set The Base API and EndPoints of Books API")
    public void setTheBaseAPIAndEndPointsOfBooksAPI() {
        response = BooksAPIEndPoints.getAllBooks();
        response.then().log();
    }

    @Then("Response must be {int} For Books API")
    public void responseMustBeForBooksAPI(int expectedCode) {
        int actualResponseCode = response.then().extract().statusCode();
        Assert.assertEquals(actualResponseCode,expectedCode);
    }

    @Given("Set The Base API and EndPoints of Books API For Specific Book")
    public void setTheBaseAPIAndEndPointsOfBooksAPIForSpecificBook() {
        response = BooksAPIEndPoints.getSpecificBook(5);
        response.then().log();
    }

    @Given("Set The Payload For POST Request For Books API")
    public void setThePayloadForPOSTRequestForBooksAPI() {
        booksPayload = new BooksAPIPage(5,"Harry Potter","Description Here",100,
                "Excerpt Here","2023-06-22T01:56:54.2341281+00:00");
    }

    @When("Set The Base API and EndPoints of Books For POST Request")
    public void setTheBaseAPIAndEndPointsOfBooksForPOSTRequest() {
        response = BooksAPIEndPoints.postBooks(booksPayload);
        response.then().log();
    }

    @Given("Set The Payload To Update Books From Books API")
    public void setThePayloadToUpdateBooksFromBooksAPI() {
        booksPayload = new BooksAPIPage(5,"Java","Description Here",50,
                "Excerpt Here","2023-06-22T01:56:54.2341281+00:00");
    }

    @When("Set The Base API and EndPoints of Books For PUT Request")
    public void setTheBaseAPIAndEndPointsOfBooksForPUTRequest() {
        response = BooksAPIEndPoints.updateBooks(5,booksPayload);
        response.then().log();
    }

    @Then("Verify Books After Update")
    public void verifyBooksAfterUpdate() {
        response = BooksAPIEndPoints.getSpecificBook(5);
        response.then().log();

        // Assert
        int actualResponseCode = response.then().extract().statusCode();
        Assert.assertEquals(actualResponseCode,200);
    }

    @Given("Set The Base API and EndPoints of Books API For Specific Id")
    public void setTheBaseAPIAndEndPointsOfBooksAPIForSpecificId() {

        response = BooksAPIEndPoints.deleteBook(5);
    }
}
