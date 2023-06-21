package api.endpoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import payload.AuthorsAPIPage;

import static io.restassured.RestAssured.given;

public class AuthorsAPIEndPoints {

    public static Response getAllAuthors(){
        Response response = given()
                .when()
                .get(Routes.getUrlAllAuthors);

        return response;
    } // getAllAuthors
    public static Response getSpecificAuthor(int id){
        Response response = given()
                .pathParams("id",id)
                .when()
                .get(Routes.getUrlSpecificAuthors);

        return response;
    } // getSpecificAuthor

    public static Response postAuthors(AuthorsAPIPage payload){
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
                .when()

                .post(Routes.postUrlAuthors);

        return  response;
    } // postAuthors

    public static Response updateAuthors(int id, AuthorsAPIPage payload){
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
                .pathParams("id",id)
                .when()
                .put(Routes.updateUrlAuthors);

        return  response;
    } // updateAuthors

    public static Response deleteAuthors(int id){
        Response response = given()
                .pathParams("id",id)
                .when()
                .delete(Routes.deleteUrlAuthors);

        return  response;
    } // deleteAuthors

} // AuthorsAPIEndPoints
