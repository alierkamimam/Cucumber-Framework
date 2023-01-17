@smoke
Feature: As a automationexercise.com user I should be able to place an order:

  @orderRegisterWhileCheckout
  Scenario: TestCase 14 Place Order: Register while Checkout

    Given the user is on the login page
    Then I should see Home Page
    When I scroll down
    When I hover over product
    When I click 'Add to cart' button in Home Page
    When I click ' View Cart' button in Home Page
    Then I should verify hat cart page is displayed
    When I click proceed to checkout
    When I click RegisterLogin button
    When I Fill all details in Signup and create account
    Then I should verify ACCOUNT CREATED! and click Continue button
    Then I should verify ' Logged in as username' at top
    When I click 'Cart' button
    When I Click 'Proceed To Checkout' button
    Then I should verify Address Details and Review Your Order
    When I Enter description in comment text area and click 'Place Order'

  ####ElementNotInteractableException: element not interactable
    When I Enter payment details: Name on Card, Card Number, CVC, Expiration date
#    When I Click 'Pay and Confirm Order' button
#    Then I should Verify success message 'Your order has been placed successfully!'



 # When I Click 'Delete Account' button
 # Then I should Verify 'ACCOUNT DELETED!' and click 'Continue' button



  @orderRegisterBeforeCheckout
  Scenario: TestCase 15 Place Order: Register Before Checkout

    Given the user is on the login page
    Then I should see Home Page
    When I click 'Signup/Login' button
    And I Fill all details in Signup and create account
    Then I should verify ACCOUNT CREATED! and click Continue button
    And I should verify ' Logged in as username' at top
    When I click 'Add to cart' button in Home Page
    And I click ' View Cart' button in Home Page
    Then I should verify hat cart page is displayed
    When I click proceed to checkout
    Then I should verify Address Details and Review Your Order
    When I Enter description in comment text area and click 'Place Order'


 ####ElementNotInteractableException: element not interactable
    When I Enter payment details: Name on Card, Card Number, CVC, Expiration date
#    When I Click 'Pay and Confirm Order' button
#    Then I should Verify success message 'Your order has been placed successfully!'



 # When I Click 'Delete Account' button
 # Then I should Verify 'ACCOUNT DELETED!' and click 'Continue' button



  @orderLoginBeforeCheckout
  Scenario: TestCase 16 Place Order: Register Before Checkout

    Given the user is on the login page
    Then I should see Home Page
    When I click 'Signup/Login' button
    When I fill email password and click 'Login' button
    Then I should verify ' Logged in as username' at top
    When I click 'Add to cart' button in Home Page
    And I click ' View Cart' button in Home Page
    Then I should verify hat cart page is displayed
    When I click proceed to checkout
    Then I should verify Address Details and Review Your Order
    When I Enter description in comment text area and click 'Place Order'
    And I dismiss pop_ups

####ElementNotInteractableException: element not interactable
    When I Enter payment details: Name on Card, Card Number, CVC, Expiration date
#    When I Click 'Pay and Confirm Order' button
#    Then I should Verify success message 'Your order has been placed successfully!'



 # When I Click 'Delete Account' button
 # Then I should Verify 'ACCOUNT DELETED!' and click 'Continue' button





