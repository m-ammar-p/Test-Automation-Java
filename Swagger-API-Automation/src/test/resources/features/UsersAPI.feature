Feature: Verify Users API of GET, POST, Update and Delete Request

  Scenario: Validate GET Request From Users API For All Users
    Given Set The Base API and EndPoints of Users API
    Then Response must be 200 For Users API

  Scenario: Validate GET Request From Users API For Specific User
    Given Set The Base API and EndPoints of Users API For Specific User
    Then Response must be 200 For Users API

  Scenario: Validate POST Request From Users API
    Given Set The Payload For POST Request For Users API
    When Set The Base API and EndPoints of Users For POST Request
    Then Response must be 200 For Users API

  Scenario: Validate PUT Request From Users API
    Given Set The Payload To Update User From Users API
    When Set The Base API and EndPoints of Users For PUT Request
    Then Response must be 200 For Users API
    Then Verify Users After Update

  Scenario: Validate Delete Request From Users API
    Given Set The Base API and EndPoints of Users API For Specific Id
    Then Response must be 200 For Users API