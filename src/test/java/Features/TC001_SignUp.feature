Feature: Sign up new account

  Scenario: Sign up new account
    Given I am on home page
    Then I click on sign up link
    Then I enter email on the email address box and submit
    Then I select gender is female
    Then I enter first name in personal information area
    Then I enter last name in personal information area
    Then I enter password in personal information area
    Then I enter first name in address area
    Then I enter last name in address area
    Then I enter address
    Then I enter city
    Then I select state
    Then I enter zip code
    Then I enter mobile phone
    And I click on register button
    Then I logout page
    Then I click on page logo