@Beli
Feature: Button Beli
  As a user
  I want buy product
  So I can get product

  Scenario: Beli one product
    Given I open the website
    And I have login
    When I click beli button product 1
    Then product increases

  Scenario: see order
    Given I open the website
    And I have login
    When I click beli button product 1
    And product increases
    And I click beli button product 2
    And product increases
    And I click cart icon
    Then see all order

  Scenario: Bayar product
    Given I open the website
    And I have login
    When I click beli button product 1
    And I click beli button product 2
    And I click cart icon
    And see all order
    And click bayar button
    Then see transaction

