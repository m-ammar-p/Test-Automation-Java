package TestNG.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class TestExecution {

    @Test
    public void APITest(){

        Response response = RestAssured.get("https://fakerestapi.azurewebsites.net/api/v1/Activities");
        System.out.println("Response: " + response.asString());
    }
}
