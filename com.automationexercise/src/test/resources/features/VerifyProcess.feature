@smoke
Feature:  As a automationexercise.com user I should be able to verify Test Case Page

  @VerifyTestCasePage
  Scenario: TestCase 07 Verify Test Cases Page,
    Given the user is on the login page
    Then Verify that home page is visible successfully
    When click on Test Case button
    Then verify user is navigated to test cases page successfully



  @VerifyAllProducts

  Scenario: TestCase 08 Verify All Products and product detail page
    Given the user is on the homepage
    Then Verify that home page is visible successfully
    When  Click on Products button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    Then  The products list is visible
    When Click on View Product of first product
    Then User is landed to product detail page

