Feature: Message Functionality

  Scenario: Verify the inline Functionality
    Given Launch the application
    When Click on the Misc
    And Click on the Message
    And User enters the details into below fields
      | First Name | Test                |
      | Last Name  | User                |
      | Email      | Test@mailinator.com |
    Then Click on the Submit button


