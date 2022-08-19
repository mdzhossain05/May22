Feature: Testing Signin feature of sauce demo

  Scenario Outline: Login with multiple users
    Given user is in the login page
    When user insert "<userName>" in user name textbox
    When user insert "<password>" in password textbox
    And click on sign in button
    Then user should be able to login

    Examples: 
      | userName                | password     |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |

@smoke
  Scenario Outline: Login with m users
    Given user is in the login page
    When user insert "<userName>" in user name textbox
    When user insert "<password>" in password textbox
    And click on sign in button
    Then user should be able to login

    Examples: 
      | userName        | password     |
      | standard_user   | secret_sauce |
      | locked_out_user | secret_sauce |
