@Logout
Feature: Logout
  As a user
  I want logout account
  So I can logout

  Scenario Outline: Logout
    Given I open the website
    And I click sign in button
    And I input "<email>" email and "<pass>" password valid
    And click login button
    And I can login "<result>"
    When I click profile icon
    And I click logout button
    Then I go to login page
    Examples:
      | email | pass  | result  |
      |maylananggi@gmail.com  | maylanqe22  | can login |
