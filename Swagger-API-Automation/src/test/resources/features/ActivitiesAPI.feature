Feature: Verify Activities API of GET, POST, Update and Delete Request

  Scenario: Validate GET Request From Activities API For All Activities
    Given Set The Base API and EndPoints of Activities API
    Then Response must be 200

  Scenario: Validate GET Request From Activities API For Specific Activities
    Given Set The Base API and EndPoints of Activities API For Specific Activity
    Then Response must be 200

  Scenario: Validate POST Request From Activities API
    Given Set The Payload For POST Request
    When Set The Base API and EndPoints of Activities For POST Request
    Then Response must be 200

  Scenario: Validate PUT Request From Activities API
    Given Set The Payload To Update Activity From Activities API
    When Set The Base API and EndPoints of Activities For PUT Request
    Then Response must be 200
    Then Verify Activity After Update

  Scenario: Validate Delete Request From Activities API
    Given Set The Base API and EndPoints of Activities API For Specific Id
    Then Response must be 200
