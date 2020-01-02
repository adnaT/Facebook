@Web
Feature: Messenger Page Feature

  Background:
    Given I am on messenger Page

 @login1
  Scenario: Verify signup button
    When I enter zeynep into firstname text field on the messenger page
    And I enter turkmen into lastname text field on the messenger page
    Then I verify that signup button is disable at homepage

  @enterData
  Scenario Outline: Signup form should not accept any invalid email address
    When I enter Test into firstname text fields on home screen
    And I enter Test into lastname text fields on home screen
    And I enter <email> into Mobilenumber text fields on home screen
    And I click on password text field on home screen
    And I click on email text field on home screen
    Then I verify Error Message for invalid email on homepage
    Examples:
      | email                        |
      | plainaddress.com             |
      | #@%^%#$@#$@#com              |
      | @example.com                 |
#      | Joe Smith <emailexample.com> |
#      | email.example.com            |
#      | emailexampleexample.com      |
#      | .emailexample.@com           |
#      | @email.example.com           |
#      | email..emailexample.com      |
#      | あいうえおexample.com         |
#      | emailexample.com @(Joe Smith)|
#      | email@example                |
#      | @email-example.com           |
#      | @emailexample.web            |
#      | email111.222.333.44444       |
#      | emailexample@.com            |
#      | Abc..123example.com          |