@Detail
Feature: Page Home
  As a user
  I want click detail product
  So I can get detail product

  Scenario: I click button detail after login
    Given I open the website
    And I have login
    When I click detail button
    Then I go to detail product

  Scenario: give 4 star after login
    Given I go to detail product
    And I have login
    When I click 4 star
    Then I can see 4 star

  Scenario: give 4 star before login
    Given I go to detail product
    When I click 4 star
    Then I can see 4 star