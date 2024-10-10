Feature: Login User

  Background:
    Given User is on the saucedemo login page

  Scenario Outline: User valid login
    When User enter <username> and <password> invalid
    And User click button login
    Then User get invalid <credentials>

    Examples:
      |username     |password     |credentials                        |
      |             |             |Epic sadface: Username is required |
      |             |secret_sauce |Epic sadface: Username is required |
      |standard_user|             |Epic sadface: Password is required |
      |standard_    |secret_sauce |Epic sadface: Username and password do not match any user in this service|
      |standard_user|secret_      |Epic sadface: Username and password do not match any user in this service|
      |standard_    |secret_      |Epic sadface: Username and password do not match any user in this service|