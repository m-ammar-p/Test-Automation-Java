package api.endpoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import payload.UsersAPIPage;

import static io.restassured.RestAssured.given;

public class UsersAPIEndPoints {

    public static Response getAllUsers(){
        Response response = given()
                .when()
                .get(Routes.getUrlAllUsers);

        return response;
    } // getAllUsers
    public static Response getSpecificUser(int id){
        Response response = given()
                .pathParams("id",id)
                .when()
                .get(Routes.getUrlSpecificUser);

        return response;
    } // getSpecificUser

    public static Response postUsers(UsersAPIPage payload){
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
                .when()

                .post(Routes.postUrlUsers);

        return  response;
    } // postUsers

    public static Response updateUser(int id, UsersAPIPage payload){
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
                .pathParams("id",id)
                .when()
                .put(Routes.updateUrlUser);

        return  response;
    } // updateUser

    public static Response deleteUsers(int id){
        Response response = given()
                .pathParams("id",id)
                .when()
                .delete(Routes.deleteUrlUser);

        return  response;
    } // deleteUsers
} // End of UsersAPIEndPoints
