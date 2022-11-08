@Beli
Feature: Button Beli
  As a user
  I want buy product
  So I can get product

  Scenario Outline: Beli one product
    Given I open the website
    And I click sign in button
    And I input "<email>" email and "<pass>" password valid
    And click login button
    And I can login "<result>"
    When I click beli button product 1
    Then product increases
    Examples:
      | email | pass  | result  |
      |maylananggi@gmail.com  | maylanqe22  | can login |

  Scenario Outline: see order
    Given I open the website
    And I click sign in button
    And I input "<email>" email and "<pass>" password valid
    And click login button
    And I can login "<result>"
    When I click beli button product 1
    And product increases
    And I click beli button product 2
    And product increases
    And I click cart icon
    Then see all order
    Examples:
      | email | pass  | result  |
      |maylananggi@gmail.com  | maylanqe22  | can login |

  Scenario Outline: Bayar product
    Given I open the website
    And I click sign in button
    And I input "<email>" email and "<pass>" password valid
    And click login button
    And I can login "<result>"
    When I click beli button product 1
    And I click beli button product 2
    And I click cart icon
    And see all order
    And click bayar button
    Then see transaction
    Examples:
      | email | pass  | result  |
      |maylananggi@gmail.com  | maylanqe22  | can login |

