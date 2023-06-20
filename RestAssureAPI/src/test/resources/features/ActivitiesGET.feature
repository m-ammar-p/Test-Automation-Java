Feature: Verify Activities GET API for all posts

  Scenario: GET all post from Activities API
    Given User Sets The Base API request
    Then Response is "200"


  Scenario: GET Specific post from Activities API
    Given User Sets The Base API request for specific Activities
    Then Response is 200

  Scenario: Create Post from Activities API
    Given User Sets The Payload
    When User Set The API to Post
    Then Response is check 200

    Scenario: Update Activity from Activities API
      Given User Set The Payload To Update Activity
      When User Set The API To Update Activity
      Then Response is 200
      Then Check Activity After Update

      Scenario: Delete Activity from Activities API
        Given User Set The the API to Specific id to delete
        Then Response is 200