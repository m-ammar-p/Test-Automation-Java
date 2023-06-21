package api.endpoints;

public class Routes {

    public static String  baseUrl = "https://fakerestapi.azurewebsites.net/api/v1";

    // Activities Module
    public static String postUrlActivities = baseUrl + "/Activities";
    public static String getUrlAllActivities = baseUrl + "/Activities";
    public static String getUrlSpecificActivities = baseUrl + "/Activities/{id}";
    public static String updateUrlActivities = baseUrl + "/Activities/{id}";
    public static String deleteUrlActivities = baseUrl + "/Activities/{id}";


} // End of Routes
