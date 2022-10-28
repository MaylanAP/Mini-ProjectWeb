@Detail
Feature: Page Home
  As a user
  I want click detail product
  So I can get detail product

  Scenario Outline: I click button detail after login
    Given I open the website
    And I click sign in button
    And I input "<email>" email and "<pass>" password valid
    And click login button
    And I can login "<result>"
    When I click detail button
    Then I go to detail product
  Examples:
    | email | pass  | result  |
    |maylananggi@gmail.com  | maylanqe22  | can login |

  Scenario: give 4 star
    Given I go to detail product
    When I click 4 star
    Then I can see 4 star