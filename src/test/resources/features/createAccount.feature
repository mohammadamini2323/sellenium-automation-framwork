Feature:  creating an account
  Background:
  Given user is on amazon web page
    When user clicks on sign in button
    Then user should be navigated to sign in page
Then user clicks on create your amazon account button
#Then user should be navigated to create account page

  Scenario: successfully creating an account by phone number
    When user enters Ahmad ahmadi as a value in your name field
    And enters 1234567890 as value in mobil number or email field
    And enters passcode12 as value in password field
    And  enters passcode12 as value in re_enter password field
    And clicks on verify email button
#    Then user has to be navigated to "otp" page
#    Then user enters valid "opt"
#    And clicks on "create your anmazon account"
#    Then user should be navigatet to home page and can see his name on top of sign in button


#  Scenario Outline: successfully creating an account by email
#    When user enters "<Ahmad ahmadi>" as a value in your name field
#    And enters"<hreemail@gmail.com>" as value in "mobil number or email" field
#    And enters "<passcode12@>" ws value in password field
#    And  enters "<passcode12@>" ws value in re_enter password border
#    And clicks on "verify mobile number" button
#    Then user has to be navigated to "otp" page
#    Then user enters valid "opt"
#    And clicks on "create your anmazon account"
#    Then user should be navigatet to home page and can see his name on top of sign in button
#    Examples:
#      | full name    | email              | password    | re_enter password |
#      | Ahmad ahmadi | hreemail@gmail.com | passcode12@ | passcode12@       |
