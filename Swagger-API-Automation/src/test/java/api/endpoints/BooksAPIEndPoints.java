package api.endpoints;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import payload.BooksAPIPage;
import static io.restassured.RestAssured.given;

public class BooksAPIEndPoints {

    public static Response getAllBooks(){
        Response response = given()
                .when()
                .get(Routes.getUrlAllBooks);

        return response;
    } // getAllBooks
    public static Response getSpecificBook(int id){
        Response response = given()
                .pathParams("id",id)
                .when()
                .get(Routes.getUrlSpecificBook);

        return response;
    } // getSpecificBook

    public static Response postBooks(BooksAPIPage payload){
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
                .when()

                .post(Routes.postUrlBooks);

        return  response;
    } // postBooks

    public static Response updateBooks(int id, BooksAPIPage payload){
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
                .pathParams("id",id)
                .when()
                .put(Routes.updateUrlBooks);

        return  response;
    } // updateBooks

    public static Response deleteBook(int id){
        Response response = given()
                .pathParams("id",id)
                .when()
                .delete(Routes.deleteUrlBook);

        return  response;
    } // deleteBook

} // End of BooksAPIEndPoints
