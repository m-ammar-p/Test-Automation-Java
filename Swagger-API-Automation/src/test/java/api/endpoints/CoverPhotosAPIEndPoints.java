package api.endpoints;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import payload.CoverPhotosAPIPage;

import static io.restassured.RestAssured.given;

public class CoverPhotosAPIEndPoints {

    public static Response getAllCoverPhotos(){
        Response response = given()
                .when()
                .get(Routes.getUrlAllCoverPhotos);

        return response;
    } // getAllCoverPhotos
    public static Response getSpecificCoverPhoto(int id){
        Response response = given()
                .pathParams("id",id)
                .when()
                .get(Routes.getUrlSpecificCoverPhoto);

        return response;
    } // getSpecificCoverPhoto

    public static Response postCoverPhotos(CoverPhotosAPIPage payload){
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
                .when()

                .post(Routes.postUrlCoverPhotos);

        return  response;
    } // postCoverPhotos

    public static Response updateCoverPhoto(int id, CoverPhotosAPIPage payload){
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
                .pathParams("id",id)
                .when()
                .put(Routes.updateUrlCoverPhoto);

        return  response;
    } // updateCoverPhoto

    public static Response deleteCoverPhoto(int id){
        Response response = given()
                .pathParams("id",id)
                .when()
                .delete(Routes.deleteUrlCoverPhoto);

        return  response;
    } // deleteCoverPhoto
} // End of CoverPhotosAPIEndPoints
