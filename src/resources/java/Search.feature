
Feature: Search

  Scenario: Correct search
    Given User is in the Home page
    When The user enters the product name "Head"
    And The user is navigated to the product page
    And The product is added to the cart
    And The payment is made
    Then The product is purchased
   

    Scenario: Incorrect search
    Given User is in Home page
    When The users enters the product name "Haed"
    Then The product is not found

  