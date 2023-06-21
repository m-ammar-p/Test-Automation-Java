Feature: Verify CoverPhotos API of GET, POST, Update and Delete Request

  Scenario: Validate GET Request From CoverPhotos API For All CoverPhotos
    Given Set The Base API and EndPoints of CoverPhotos API
    Then Response must be 200 For CoverPhotos API

  Scenario: Validate GET Request From CoverPhotos API For Specific CoverPhoto
    Given Set The Base API and EndPoints of CoverPhotos API For Specific CoverPhotos
    Then Response must be 200 For CoverPhotos API

  Scenario: Validate POST Request From CoverPhotos API
    Given Set The Payload For POST Request For CoverPhotos API
    When Set The Base API and EndPoints of CoverPhotos For POST Request
    Then Response must be 200 For CoverPhotos API

  Scenario: Validate PUT Request From CoverPhotos API
    Given Set The Payload To Update CoverPhoto From CoverPhotos API
    When Set The Base API and EndPoints of CoverPhotos For PUT Request
    Then Response must be 200 For CoverPhotos API
    Then Verify CoverPhoto After Update

  Scenario: Validate Delete Request From CoverPhotos API
    Given Set The Base API and EndPoints of CoverPhotos API For Specific Id
    Then Response must be 200 For CoverPhotos API