Feature: Feature to test registration functionality

  Scenario: Registration with valid details from fixture file
    Given I am on the home page
    When I go to register page
    And I enter details from fixture file
    And I click register
    Then I verify registration completed