
Feature: Wishlist


  Scenario: Validate that Guest user cannot add product to Wishlist
    Given  Guest user open the homepage
    When Guest user scroll down to the Hot Sellers section
    And Guest user hover over any card
    And Guest user click on Add to Wishlist
    Then Guest user should be navigated to the login page


  Scenario: Validate that Logged in user can add product to Wishlist
    Given  Guest user open the homepage
    When Guest user open the SignInPage
    And user enter the email
    And user enter the password
    And user clicks on Sign in
    And loggedinuser scroll down to the Hot Sellers section
    And loggedinuser hover over any card
    And loggedinuser click on Add to Wishlist
    Then loggedinuser should be navigated to the My Wishlist page with the product added


