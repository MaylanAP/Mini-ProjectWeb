@Logout
Feature: Logout
  As a user
  I want logout account
  So I can logout

  Scenario: Logout
    Given I open the website
    And I have login
    When I click profile icon
    And I click logout button
    Then I go to login page