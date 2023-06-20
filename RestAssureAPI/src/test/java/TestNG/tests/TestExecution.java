package TestNG.tests;

import api.endpoints.ActivitiesEndPoints;
import api.payload.Activities;
import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestExecution {
    // Faker faker;
    //Activities activitiesPayload;

    @BeforeClass
    public void setUpData(){
//        faker = new  Faker();
//        activitiesPayload = new Activities();
//
//        activitiesPayload.setId(faker.idNumber().hashCode());
//        activitiesPayload.setTitle("Title 7");
//        activitiesPayload.setDueDate("123");
//        activitiesPayload.setCompleted(false);

    } // setUpData
    @Test
    public void APITest(){

        Response response = RestAssured.get("https://fakerestapi.azurewebsites.net/api/v1/Activities");
        System.out.println("Response: " + response.asString());
    } //

    @Test
    public void Test2(){
        Response response = ActivitiesEndPoints.getSpecificActivities(5);
        System.out.println("Response: " + response.asString());
    } // Test2

    @Test
    public void Test3_Post(){
        //2023-06-22T01:46:54.2341281+00:00

        Activities activitiesPayload = new Activities(0,"title 0", "2023-06-22T01:46:54.2341281+00:00", true);

        Response response = ActivitiesEndPoints.postActivities(activitiesPayload);
        response.then().log();
        System.out.println("Response: " + response.asString());
        System.out.println(activitiesPayload);
    } // Test3
}
