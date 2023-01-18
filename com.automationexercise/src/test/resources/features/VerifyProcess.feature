@smoke
Feature:  As a automationexercise.com user I should be able to verify Test Case Page

  @TestCase07
  Scenario: TestCase 07 Verify Test Cases Page,
    Given the user is on the login page
    Then Verify that home page is visible successfully
    When click on Test Case button
    Then verify user is navigated to test cases page successfully



  @TestCase08
  Scenario: TestCase 08 Verify All Products and product detail page
    Given the user is on the homepage
    Then Verify that home page is visible successfully
    When  Click on Products button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    Then  The products list is visible
    When Click on View Product of first product
    Then User is landed to product detail page


  @TestCase09
  Scenario: TestCase 09 Search Products
    Given the user is on the homepage
    Then Verify that home page is visible successfully
    When Click on Products button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    When Enter product 'Men Tshirt' in search input and click search button
    Then verify SEARCHED PRODUCTS is visible
    Then Verify all the products related to search are visible


  @TestCase10
  Scenario: Verify Subscription in home page
    Given the user is on the homepage
    Then Verify that home page is visible successfully
    When Scroll down to footer
    Then Verify text 'SUBSCRIPTION'
    When  Enter email 'erkam@gmail.com' in input and click arrow button
    Then Verify success message 'You have been successfully subscribed!' is visible






