Feature: Login with exist account

  Scenario: Login with exist account
    Given I am on home page
    Then I click on sign in link
    Then I enter email
    Then I enter password
    Then I click on login button
    Then I should be in my account page
