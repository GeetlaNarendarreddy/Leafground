Feature: File Functionality

  Background:
    Given Launch the application
    When Click on the Misc
    And Click on the File

  Scenario:Verify the Basic Upload Functionality
    And  click on the choose  "String"
    Then File should be upload successfully
