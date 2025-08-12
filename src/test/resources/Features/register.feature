Feature: Feature to test registration functionality

  Scenario: Registration with valid details from fixture file
    Given I am on the home page
    When I go to register page
    And I enter details from fixture file
    And I click register
    Then I verify registration completed

  Scenario: Multiple Registrations with valid details from fixture file
    Given I am on the registration page
    When I enter multiple details from fixture file and click register, I verify registration completed