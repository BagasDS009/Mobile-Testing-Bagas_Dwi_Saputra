Feature: As user i want to register

  Scenario: Register Account
    Given android user on home screen
    When android user tap icon login
    And android user tap register account
    And validate on register page
    And android user input name
    And android user input email
    Then android user input password
    And android user tap button register
    And android user see the login page