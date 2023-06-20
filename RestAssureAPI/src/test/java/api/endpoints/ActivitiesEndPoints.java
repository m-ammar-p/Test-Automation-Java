package api.endpoints;
import api.payload.Activities;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ActivitiesEndPoints {

    public static Response postActivities(Activities payload){
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
                .when()

                .post(Routes.postUrlActivities);

        return  response;
    } // createActivities

    public static Response getAllActivities(){
        Response response = given()
                .when()
                .get(Routes.getUrlAllActivities);

        return response;
    } // getSpecificActivities
    public static Response getSpecificActivities(int id){
        Response response = given()
                .pathParams("id",id)
                .when()
                .get(Routes.getUrlSpecificActivities);

        return response;
    } // getSpecificActivities

    public static Response updateActivities(int id, Activities payload){
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
                .pathParams("id",id)
                .when()
                .put(Routes.updateUrlActivities);

        return  response;
    } // updateActivities

    public static Response deleteActivities(int id){
        Response response = given()
                .pathParams("id",id)
                .when()
                .delete(Routes.deleteUrlActivities);

        return  response;
    } // deleteActivities

} // End of ActivitiesEndPoints
