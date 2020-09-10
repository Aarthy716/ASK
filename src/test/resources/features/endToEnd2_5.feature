Feature: End to End 2.5

  Scenario: Create Quiz and assign to 5 individual students
    Given I open "login" page
    When I type email "qa.sofi@gmail.com"
    And I type password "12345"
    And I click Sign in button
    And I wait 5 seconds
    Then Text "MyNew" appears
    Then Text "TEACHER" appears
    When I click on Quizzes
    And I wait 10 seconds
    Then I delete quiz name "End to End 2.5"
    And I wait 3 seconds
    And I click [Create New Quizz] button
    And I wait 3 seconds
    And I enter "End to End 2.5" quiz title on Create Quiz page
    And I click [Add Question] button
    And I select Single-choice option in Question 1 type checkbox
    And I wait 3 seconds
    And I enter "1234?" question text in Question 1 field
    And I enter "12" text in Option1 field in Question 1 field
    And I enter "56" text in Option2 field in Question 1 field
    And I select option2 as a correct answer in "single" Question 1 checkbox
    And I again click [Add Question] button
    And I wait 3 seconds
    And I select Multiple-choice option in Question 2 type checkbox
    And I enter "3456" question text in Question 2 field
    And I enter "12" text in Option1 field in Question 2 field
    And I enter "56" text in Option2 field in Question 2 field
    And I click Add Option button 1 times in Question 2 field
    And I enter "78" text in Option3 field in Question 2 field
    And I select option1 as a correct answer in "multiple" Question 2 checkbox
    And I select option3 as a correct answer in "multiple" Question 2 checkbox
    And I click [Save] button
    And I wait 5 seconds
    Then quiz with name "End to End 2.5" appears
    And I wait 5 seconds
    And I select Assignments
    And I wait 15 seconds
    And I click [Create New Assignment] button
    And I wait 5 seconds
    And I click on Select Quiz to assign select box
    And I wait 3 seconds
    And I select name "End to End 2.5" of Quiz in Quiz to assign select box
    And I select 5 "Student" in the Users list on Give Assignment page
    And I wait 3 seconds
    And I click [Give Assignment] button
    And I wait 5 seconds
  #  Then Assignment with quiz name "End to End 2.5" appears
    And I click [Log Out] button
    And I confirm Log Out on Confirmation popup
