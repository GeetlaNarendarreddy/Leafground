Feature: Message Functionality

  Background:
    Given Launch the application
    When Click on the Misc
    And Click on the Message


  Scenario: Verify the inline(form) Functionality
    And User enters the details into below fields
      | First Name | Test                |
      | Last Name  | User                |
      | Email      | Test@mailinator.com |
    Then Click on the Submit button

  Scenario: Verify the Messages info Functionality
    And User click on the Info
    Then Info Message popup should be show
    Then Click on the cross button

  Scenario: Verify the Messages Warn Functionality
    And User click on the Warn
    Then Warn Message popup should be show
    Then Click on the cross button

  Scenario: Verify the Messages Error Functionality
    And User click on the Error
    Then Error Message popup should be show
    Then Click on the cross button





