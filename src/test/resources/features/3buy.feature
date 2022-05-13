Feature: Buy some items

  Scenario: Buy Item Once
    Given android user on home screen
    When android user tap buy one "once"
    And android user tap buy two "once"
    And android user tap buy three "once"
    Then android user tap icon shop chart "once"

  Scenario: Buy Item twice
    Given android user on home screen
    When android user tap buy one "twice"
    And android user tap buy two "twice"
    And android user tap buy three "twice"
    Then android user tap icon shop chart "once on twice"
