#author
#date
#Gherkin
@tag
Feature: Sign in feature
Description: simple user login functionality

Scenario: login with standard user

#Given, When, Then, And, But
Given user is in the login page
When user insert user name standard user in the user name textbox
When user insert password in the password textbox
And user click on login button
Then user should be able to login

@smoke
Scenario: login with locked out user
Given user is in the login page
When user insert user name lockedout user in the user name textbox
When user insert password in the password textbox
And user click on login button
Then user should be able to login