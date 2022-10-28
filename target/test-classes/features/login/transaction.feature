@Transaksi
Feature: Transaksi
  As a user
  I want see my transaction
  So I can see my transaction

  Scenario Outline:
    Given I open the website
    And I click sign in button
    And I input "<email>" email and "<pass>" password valid
    And click login button
    And I can login "<result>"
    And I click beli button product 1
    And I click beli button product 2
    And I click cart icon
    And see all order
    When I click profile icon
    And I click transaksi button
    Then see transaction
    Examples:
      | email | pass  | result  |
      |maylananggi@gmail.com  | maylanqe22  | can login |
