Feature: Login User

  Scenario: User valid login
    When User go to Web Sauce Demo
    And User enter username password valid
    And User click button login valid
    Then User valid credentials