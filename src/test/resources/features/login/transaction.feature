@Transaksi
Feature: Transaksi
  As a user
  I want see my transaction
  So I can see my transaction

  Scenario: Transaksi
    Given I open the website
    And I have login
    And I click beli button product 1
    And I click beli button product 2
    And I click cart icon
    And see all order
    When I click profile icon
    And I click transaksi button
    Then see transaction
