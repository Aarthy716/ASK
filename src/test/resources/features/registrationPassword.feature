Feature: password confirm password
  Scenario: Valid data invalid password confirmation
    Given I open "registration" page
    When I type first name "YY"
    And I type last name "ZZZ"
    And I type email "yury.stepunin@gmail.com"
    And I type group code "A1-8"
    And I type password "Amaxim289!"
    And I type confirm password "Amaxim289"
    And I click register me button
    Then Text "Entered passwords should match" appears
  Scenario: Valid data valid password confirmation
    Given I open "registration" page
    When I type first name "YY"
    And I type last name "ZZZ"
    And I type email "yury.stepunin@gmail.com"
    And I type group code "A1-8"
    And I type password "Amaxim289!"
    And I type confirm password "Amaxim289!"
    And I click register me button
    Then Text "User already exists and activated" appears
  Scenario: Valid data but empty First Name
    Given I open "registration" page
    When I type first name ""
    And I type last name "ZZZ"
    And I type email "yury.stepunin@gmail.com"
    And I type group code "A1-8"
    And I type password "Amaxim289!"
    And I type confirm password "Amaxim289!"
    And I click register me button
    Then Text "This field is required" appears
  Scenario: Valid data but empty Last Name
    Given I open "registration" page
    When I type first name "YY"
    And I type last name ""
    And I type email "yury.stepunin@gmail.com"
    And I type group code "A1-8"
    And I type password "Amaxim289!"
    And I type confirm password "Amaxim289!"
    And I click register me button
    Then Text "This field is required" appears
  Scenario: Valid data but empty email
    Given I open "registration" page
    When I type first name "YY"
    And I type last name "ZZZ"
    And I type email ""
    And I type group code "A1-8"
    And I type password "Amaxim289!"
    And I type confirm password "Amaxim289!"
    And I click register me button
    Then Text "This field is required" appears
  Scenario: Valid data but empty Group Code
    Given I open "registration" page
    When I type first name "YY"
    And I type last name "ZZZ"
    And I type email "yury.stepunin@gmail.com"
    And I type group code ""
    And I type password "Amaxim289!"
    And I type confirm password "Amaxim289!"
    And I click register me button
    Then Text "This field is required" appears
  Scenario: Valid data but empty Password
    Given I open "registration" page
    When I type first name "YY"
    And I type last name "ZZZ"
    And I type email "yury.stepunin@gmail.com"
    And I type group code "A1-8"
    And I type password ""
    And I type confirm password "Amaxim289!"
    And I click register me button
    Then Text "This field is required" appears
  Scenario: Valid data
    Given I open "registration" page
    When I type first name "YY"
    And I type last name "ZZZ"
    And I type email "yury.stepunin@gmail.com"
    And I type group code "A1-8"
    And I type password "Amaxim289!"
    And I type confirm password "Amaxim289!"
    And I click register me button
    Then Text "User already exists and activated" appears