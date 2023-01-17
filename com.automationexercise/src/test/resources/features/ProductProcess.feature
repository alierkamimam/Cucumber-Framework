@smoke
Feature:  As a automationexercise.com user I should be able to verify product quantity in Cart


  Scenario: TestCase 13 Verify Product quantity in Cart

    Given the user is on the login page
    Then I should see Home Page
    When I scroll down
    And I click on View Product button on Home Page
    And I dismiss pop_ups
    Then I should verify product detail is opened
    When I increase quantity to 4
    And I click 'Add to cart' button
    And I click 'View Cart' button
    Then I should verify that product is displayed in cart page with exact quantity






