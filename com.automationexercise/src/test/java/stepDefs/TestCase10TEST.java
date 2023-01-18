package stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import utilities.BrowserUtils;

public class TestCase10TEST extends BaseStep {


    @When("Scroll down to footer")
    public void scroll_down_to_footer() {
        BrowserUtils.scrollDown("8500");
        BrowserUtils.wait(1);
    }


    @Then("Verify text {string}")
    public void verifyTextSUBSCRIPTION(String string) {
        String subscribeText = pages.getHomePage().getSubscriptionText();
        softAssert.assertEquals(subscribeText, string, "TestCase 10 : Verify text 'SUBSCRIPTION'");


    }

    @When("Enter email {string} in input and click arrow button")
    public void enterEmailErkamGmailComInInputAndClickArrowButton(String email) {
        pages.getHomePage().setSubscribeEmailBox(email);
        pages.getHomePage().clickSubscribeSubmitButton();
    }


    @Then("Verify success message {string} is visible")
    public void verifySuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible(String string) {
        String message = pages.getHomePage().getAlertSuccessSubscribeMessage();
        softAssert.assertEquals(message, string);
        softAssert.assertAll();
    }


}
