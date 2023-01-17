@smoke
  Feature:  As a automationexercise.com user I should be able to verify Test Case Page

    @VerifyTestCasePage
    Scenario: TestCase 7 Verify Test Cases Page,
      Given the user is on the login page
      Then Verify that home page is visible successfully
      When click on Test Case button
      Then verify user is navigated to test cases page successfully

