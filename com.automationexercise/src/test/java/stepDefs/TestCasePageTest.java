package stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import utilities.BrowserUtils;
import utilities.Driver;

public class TestCasePageTest extends BaseStep {
    SoftAssert softAssert = new SoftAssert();

    @Then("Verify that home page is visible successfully")
    public void Verify_that_home_page_is_visible_successfully() {
        String message = pages.getHomePage().getAutomationText();
        softAssert.assertEquals(message, "Automation");

    }

    @When("click on Test Case button")
    public void clickOnTestCseButton() {
        pages.getHomePage().clickTestCasesButton();
        BrowserUtils.navigateBackAndForwardToDismissAds();

    }


    @Then("verify user is navigated to test cases page successfully")
    public void verify_user_is_navigated_to_test_cases_page_successfully() {



    }


}
