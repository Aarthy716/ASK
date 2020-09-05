Feature: password

  @password1
  Scenario: Alphanumeric & Special characters
    Given I open "login" page
    Then I type in "6thalaivaveriya@9phum.com" in email
    Then I type in "Test123"in password
    Then I click Signin button
    Then I click on "Settings" on the side
    Then I Click "Change password" and I type in "Test123" in password and "Test123!@" in new password and "Test123!@" in confirm password

  @password2
  Scenario: Change Password-Less than 5 characters
    Given I open "login" page
    Then I type in "6thalaivaveriya@9phum.com" in email
    Then I type in "Test123"in password
    Then I click Signin button
    Then I click on "Settings" on the side
    Then I Click "Change password" and I type in "Test123" in password and "Te" in new password and "Te" in confirm password
    Then text "Too short. Should be at least 5 characters" Appears

  @password3 #Known bug see bug A6-121 in jira
  Scenario: password more then 35 characters
    Given I open "login" page
    Then I type in "6thalaivaveriya@9phum.com" in email
    Then I type in "Test123"in password
    Then I click Signin button
    Then I click on "Settings" on the side
    Then I Click "Change password" and I type in "Test123" in password and "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456!" in new password and "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456!" in confirm password

  @password4
  Scenario: white spaces not allowed
    Given I open "login" page
    Then I type in "6thalaivaveriya@9phum.com" in email
    Then I type in "Test123"in password
    Then I click Signin button
    Then I click on "Settings" on the side
    Then I Click "Change password" and I type in "Test123" in password and "T e" in new password and "T e" in confirm password
    Then text "Whitespaces are not allowed" Appears

  @password5
  Scenario: Passwords must match
    Given I open "login" page
    Then I type in "6thalaivaveriya@9phum.com" in email
    Then I type in "Test123"in password
    Then I click Signin button
    Then I click on "Settings" on the side
    Then I Click "Change password" and I type in "Test123" in password and "Tasdsade" in new password and "Tafdaae" in confirm password
    Then text "Entered passwords should match" Appears

  @password6
  Scenario: New password field cannot be blank
    Given I open "login" page
    Then I type in "6thalaivaveriya@9phum.com" in email
    Then I type in "Test123"in password
    Then I click Signin button
    Then I click on "Settings" on the side
    Then I Click "Change password" and I type in "Test123" in password and "" in new password and "" in confirm password
    Then text "This field is required" Appears









