Feature: Verify Activities GET API for all posts

  Scenario: GET all post from Activities API
    Given User Sets The Base API request "https://fakerestapi.azurewebsites.net/api/v1/Activities"
    When  user send the api end point to get all data
    Then Response is "200"

