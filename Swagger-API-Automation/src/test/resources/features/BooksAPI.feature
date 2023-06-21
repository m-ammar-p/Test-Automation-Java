Feature: Verify Books API of GET, POST, Update and Delete Request

  Scenario: Validate GET Request From Books API For All Books
    Given Set The Base API and EndPoints of Books API
    Then Response must be 200 For Books API

  Scenario: Validate GET Request From Books API For Specific Book
    Given Set The Base API and EndPoints of Books API For Specific Book
    Then Response must be 200 For Books API

  Scenario: Validate POST Request From Books API
    Given Set The Payload For POST Request For Books API
    When Set The Base API and EndPoints of Books For POST Request
    Then Response must be 200 For Books API

  Scenario: Validate PUT Request From Authors API
    Given Set The Payload To Update Books From Books API
    When Set The Base API and EndPoints of Books For PUT Request
    Then Response must be 200 For Books API
    Then Verify Books After Update

  Scenario: Validate Delete Request From Authors API
    Given Set The Base API and EndPoints of Books API For Specific Id
    Then Response must be 200 For Books API