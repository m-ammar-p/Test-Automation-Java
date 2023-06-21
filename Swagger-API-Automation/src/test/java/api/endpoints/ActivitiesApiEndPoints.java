package api.endpoints;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import payload.ActivitiesAPIPage;

import static io.restassured.RestAssured.given;

public class ActivitiesApiEndPoints {

    public static Response postActivities(ActivitiesAPIPage payload){
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

    public static Response updateActivities(int id, ActivitiesAPIPage payload){
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

} // End of ActivitiesApiEndPoints
