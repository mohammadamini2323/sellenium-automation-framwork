Feature: login to facebook by invalid user and password
  Scenario: try to login with incorrrect username and password and see the massage
    Given  user is in login page
    When user enters invallid username and pass
