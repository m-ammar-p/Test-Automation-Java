package api.endpoints;

public class Routes {

    public static String  baseUrl = "https://fakerestapi.azurewebsites.net/api/v1";

    // Activities Module
    public static String postUrlActivities = baseUrl + "/Activities";
    public static String getUrlAllActivities = baseUrl + "/Activities";
    public static String getUrlSpecificActivities = baseUrl + "/Activities/{id}";
    public static String updateUrlActivities = baseUrl + "/Activities/{id}";
    public static String deleteUrlActivities = baseUrl + "/Activities/{id}";

    // Authors Module
    public static String postUrlAuthors = baseUrl + "/Authors";
    public static String getUrlAllAuthors = baseUrl + "/Authors";
    public static String getUrlSpecificAuthors = baseUrl + "/Authors/{id}";
    public static String updateUrlAuthors = baseUrl + "/Authors/{id}";
    public static String deleteUrlAuthors = baseUrl + "/Authors/{id}";

    // Books Module
    public static String postUrlBooks = baseUrl + "/Books";
    public static String getUrlAllBooks = baseUrl + "/Books";
    public static String getUrlSpecificBook = baseUrl + "/Books/{id}";
    public static String updateUrlBooks = baseUrl + "/Books/{id}";
    public static String deleteUrlBook = baseUrl + "/Books/{id}";

    // Cover Photos Module
    public static String postUrlCoverPhotos = baseUrl + "/CoverPhotos";
    public static String getUrlAllCoverPhotos = baseUrl + "/CoverPhotos";
    public static String getUrlSpecificCoverPhoto = baseUrl + "/CoverPhotos/{id}";
    public static String updateUrlCoverPhoto = baseUrl + "/CoverPhotos/{id}";
    public static String deleteUrlCoverPhoto = baseUrl + "/CoverPhotos/{id}";

    // Users Module
    public static String postUrlUsers = baseUrl + "/Users";
    public static String getUrlAllUsers = baseUrl + "/Users";
    public static String getUrlSpecificUser = baseUrl + "/Users/{id}";
    public static String updateUrlUser = baseUrl + "/Users/{id}";
    public static String deleteUrlUser = baseUrl + "/Users/{id}";

} // End of Routes
