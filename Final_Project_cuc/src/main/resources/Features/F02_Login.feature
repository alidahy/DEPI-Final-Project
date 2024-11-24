Feature: User Login

  @Login
  Scenario: Validate that a user can log in with a registered email and password
    Given user open the login page
    When user fill in the email
    And user fill in the password
    And user click on Sign in
    Then user should be navigated to home page
    Then user should see the welcome message containing his name
