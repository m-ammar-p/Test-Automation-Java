Feature: Verify Authors API of GET, POST, Update and Delete Request

  Scenario: Validate GET Request From Authors API For All Authors
    Given Set The Base API and EndPoints of Authors API
    Then Response must be 200 For Authors API

  Scenario: Validate GET Request From Authors API For Specific Author
    Given Set The Base API and EndPoints of Authors API For Specific Author
    Then Response must be 200 For Authors API

  Scenario: Validate POST Request From Authors API
    Given Set The Payload For POST Request For Authors API
    When Set The Base API and EndPoints of Authors For POST Request
    Then Response must be 200 For Authors API

  Scenario: Validate PUT Request From Authors API
    Given Set The Payload To Update Authors From Authors API
    When Set The Base API and EndPoints of Authors For PUT Request
    Then Response must be 200 For Authors API
    Then Verify Author After Update

  Scenario: Validate Delete Request From Authors API
    Given Set The Base API and EndPoints of Authors API For Specific Id
    Then Response must be 200 For Authors API