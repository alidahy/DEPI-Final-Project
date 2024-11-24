Feature: Landing Page

  @LandingPage
    Scenario: Validate That Hot Sellers is displayed and each card contains Price in $
       Given user opens the main page
       When scroll down to the Hot Sellers section
       Then  each card should display price
       Then Each card should display price as Double not integer

  @LandingPage
  Scenario: Validate That each card contains "Add to Cart" button and is clickable
    Given user opens the main page
    When scroll down to the Hot Sellers section
    Then each card should display Add to Cart button and it should be clickable






  @LandingPage
  Scenario: Validate That Guest user can add product to cart
    Given user opens the main page
    When scroll down to the Hot Sellers section
    And user hovers on Card
    And user selects size and color
    And user clicks on Add to Cart button
    Then product should be added to cart successfully
    Then cart icon should display number

