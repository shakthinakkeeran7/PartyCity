Feature: Login Functionality

  As a user,
  I want to be able to login to the e-commerce website,
  So that I can access my account and make purchases.

  Scenario: Successful login with valid username and password
    Given I am on the login page
    When I enter my valid username and password
    And I click the login button
    Then I should be redirected to the home page

  Scenario: Successful login with valid email and password
    Given I am on the login page
    When I enter my valid email and password
    And I click the login button
    Then I should be redirected to the home page

  Scenario: Failed login with invalid username and password
    Given I am on the login page
    When I enter an invalid username and password
    And I click the login button
    Then I should see an error message indicating the login failed

  Scenario: Failed login with invalid email and password
    Given I am on the login page
    When I enter an invalid email and password
    And I click the login button
    Then I should see an error message indicating the login failed

  Scenario: Failed login with empty username or email field
    Given I am on the login page
    When I leave the username or email field empty
    And I enter a valid password
    And I click the login button
    Then I should see an error message indicating the login failed

  Scenario: Failed login with empty password field
    Given I am on the login page
    When I enter a valid username or email
    And I leave the password field empty
    And I click the login button
    Then I should see an error message indicating the login failed

  Scenario: Failed login with whitespace characters in the username or email field
    Given I am on the login page
    When I enter whitespace characters in the username or email field
    And I enter a valid password
    And I click the login button
    Then I should see an error message indicating the login failed

  Scenario: Failed login with whitespace characters in the password field
    Given I am on the login page
    When I enter a valid username or email
    And I enter whitespace characters in the password field
    And I click the login button
    Then I should
