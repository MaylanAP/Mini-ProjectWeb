@Login
Feature: Login
  As a user
  I want login
  So I can buy product

  Scenario Outline: login with email and password
    Given I open the website
    When I click sign in button
    And I input "<email>" email
    And I input "<password>" password
    And I click login button
    Then i get "<result>" result
  Examples:
    | email                 | password       | result        |
    | maylananggi@gmail.com | maylanqe22     | can login     |
    | maylananggi@gmail.com | passwordmaylan | error message |
    | akumaylan@gmail.com   | maylanqe22     | error message |
    | akumaylan@gmail.com   | passwordmaylan | error message |
    |                       |                | error message |
    |                       | maylanqe22     | error message |
    |                       | passwordmaylan | error message |
    | maylananggi@gmail.com |                | error message |
    | akumaylan@gmail.com   |                | error message |
