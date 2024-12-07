
**************amazon web page**********************
Feature : finding web page on the googles results

  Scenario : seeing web page as one of the results of googles search
    Given user is on the google home page

    When user types “<amazon>” into the google search border

    And clicks on search icon

    Then user should see amazon.com web page as one of the results on the screen





Feature: navigating to home page

  Scenario: successfully navigating to home page

    Given  user can see amazon.com web page as one of the results on the screen

    When user clicks on the amazon web page link

    Then user should be navigated to the amazon home page





Feature : functionality of hovering on hello sign in button

  Scenario seeing result of hovering on hello sign in button
 Given user is on the amazon home page
 When user hovers mouse on the hello sign in button
 Then  user should see a small new window that contains a sign in buttton



Feature: functionality of sign in button

  Scenario: successfully navigating to sign in page by clicking on sign in button

    Given user is on the amazon home page and can see hello sign in button

    When user clicks on sign in button

    Then user should be navigated to the sign in page



Feature: successfully sinning in

 Scenario: sinning in whit a correct existing username

  Given user is on sign in page

  When user enters username

  And clicks on cotinue button

  Then user should be navigated to sign in password page


 Scenario: sinning in whit a correct existing password

  Given user is on sinning in password page

  When user enters  password

  And clicks on sign in button

  Then user should be signed in to his/her account and can see his name on the top of sign in button


 //***************************************facebook*****************************************************

Feature: unsuccessful sinning in

  Scenario Outline: trying to sin in by different credentials

    Given user is on sin in page

    When user enters “<username>” and “<password>”

    Then user should see “<message>”

    Examples:

      | username         | password         | message                                                                                             |
      | valid username   | invalid password | The password you’ve entered is incorrect. Forgot Password?                                          |
      | invalid username | valid password   | The email or mobile number you entered isn’t connected to an account. Find your account and log in. |
      | invalid username | invalid password | The email or mobile number you entered isn’t connected to an account. Find your account and log in. |
      |                  |                  |                                                                                                     |

