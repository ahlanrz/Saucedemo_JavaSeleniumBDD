Feature: Login User

#  Scenario: User login username password invalid
#    When User go to Web Psikotest Online
#    And User enter username password invalid
#    And User click button login
#    Then User invalid credentials
#    Then User click button Oke


  Scenario: User valid login
    When User go to Web Psikotest Online
    And User enter username password valid
    And User click button login valid
    Then User valid credentials