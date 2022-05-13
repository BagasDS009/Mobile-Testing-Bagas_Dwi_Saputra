@Login
Feature: As user i want to login account
  Background:
    Given android user on home screen
    When android user tap icon login

  @SuksesLogin
  Scenario: Login Account
    And android user input email "bagas@gmail.com"
    And android user input password "Nmklop90"
    Then android user tap button login

  @LoginInvalidEmail
  Scenario: Login Account but email is not valid
    And android user input email "09897982"
    And android user input password "Nmklop90"
    Then android user tap button login