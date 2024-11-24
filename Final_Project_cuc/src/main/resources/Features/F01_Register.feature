Feature: User Registration Validation

  @Register
  Scenario: Validate error message when Confirm Password is empty
    Given user opens the LUMA  page
    When users open registration page
    Then the user should be navigated to the create Account page
    When the user fills in the first name
    And the user fills in the last name
    And the user fills in the email
    And the user fills in the password
    And the user leaves the confirm password field empty
    And the user clicks on Create an Account
    Then the user should see an error message

  @Register
  Scenario: Validate error message when passwords do not match
    Given user opens the LUMA  page
    When user open registration page
    Then user should be navigated to the create Account page
    When  user fills in the first name
    And  user fills in the last name
    And  user fills in the email
    And  user fills in the password
    And  user fills in the confirm password
    And  user clicks on Create an Account
    Then  user should see an 2nd error message

  @Register
  Scenario: Validate successful registration and navigation to My Account
    Given user opens the LUMA  page
    When user open the registration page
    When Customer fills in the first name
    And Customer fills in the last name
    And Customer fills in the email
    And Customer fills in the password
    And Customer fills in the confirm password
    And Customer clicks on Create an Account
    Then Customer should be navigated to the My Account page
    Then Customer contact information should display
