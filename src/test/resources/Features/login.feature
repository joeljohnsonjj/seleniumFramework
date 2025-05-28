Feature: Feature to test login functionality

  Scenario: Login with valid credentials
    Given I am on the login page
    When I enter valid username and password
    And I click on login button
    Then I should be logged in

  Scenario: Login with valid credentials from fixture file
    Given I am on the login page
    When I enter valid username and password
    And I click on login button
    Then I should be logged in