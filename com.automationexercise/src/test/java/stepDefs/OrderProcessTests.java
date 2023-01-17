package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import utilities.BrowserUtils;
import utilities.ConfigReader;
import utilities.Driver;

public class OrderProcessTests extends BaseStep {
    SoftAssert softAssert = new SoftAssert();

//    @Given("the user is on the login page")
//    public void user_is_on_the_login_page() {
//        String url = ConfigReader.getProperty("url");
//        Driver.getDriver().get(url);
//        System.out.println("Open :: " + url);
//        BrowserUtils.wait(1);
//
//    }
//
//    @Then("I should see Home Page")
//    public void see_home_page() {
//        // Verify that home page is visible successfully
//        String automationText = pages.getHomePage().getAutomationText();
//        Assert.assertEquals(automationText, "Automation", "Test case 8  Verify that home page is visible successfully");
//    }
//
//    @When("I scroll down")
//    public void should_scroll_down() {
//        BrowserUtils.scrollDown("200");
//    }

//    @When("I dismiss pop_ups")
//    public void should_dismiss_popups() {
//        BrowserUtils.navigateBackAndForwardToDismissAds();
//
//    }

    @When("^I click 'Add to cart' button in Home Page$")
    public void i_click_add_to_cart_button_in_home_page() {
        pages.getHomePage().clickAddToCartButton();
    }

    @When("^I click ' View Cart' button in Home Page$")
    public void i_click_view_cart_button_in_home_page() {
        pages.getHomePage().clickViewCartButton();
    }

    @When("^I click proceed to checkout$")
    public void i_click_proceed_to_checkout() {
        pages.getCartPage().clickProceedToCheckoutButton();

    }

    @When("^I click RegisterLogin button$")
    public void i_click_registerlogin_button() {
        pages.getCartPage().clickRegisterLoginButton();
    }

    @When("^I Fill all details in Signup and create account$")
    public void i_fill_all_details_in_signup_and_create_account() {
        pages.getLoginPage().setSignupNewUserName(ConfigReader.getProperty("name"));
        pages.getLoginPage().setSignupEmailAddressBox(ConfigReader.getProperty("email"));
        pages.getLoginPage().clickSignupButton();

        // Fill details: Title, Name, Email, Password, Date of birth
        pages.getSignupPage().selectTitleMen();
        pages.getSignupPage().setPassword(ConfigReader.getProperty("password"));
        pages.getSignupPage().setDateOfBirth("13", "April", "1999");

        //Select checkbox 'Sign up for our newsletter!'
        //Select checkbox 'Receive special offers from our partners!'
        pages.getSignupPage().selectNewsletterCheckbox();
        pages.getSignupPage().selectSpecialOfferCheckbox();


        //Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        pages.getSignupPage().setFirstName(ConfigReader.getProperty("name"));
        pages.getSignupPage().setLastName(ConfigReader.getProperty("lastname"));
        pages.getSignupPage().setCompany(ConfigReader.getProperty("company"));
        pages.getSignupPage().setAddress1(ConfigReader.getProperty("address1"));
        pages.getSignupPage().setAddress2(ConfigReader.getProperty("address2"));
        pages.getSignupPage().setCountry(ConfigReader.getProperty("country"));
        pages.getSignupPage().setState(ConfigReader.getProperty("state"));
        pages.getSignupPage().setCity(ConfigReader.getProperty("city"));
        pages.getSignupPage().setZipcode(ConfigReader.getProperty("zipcode"));
        pages.getSignupPage().setMobileNumber(ConfigReader.getProperty("mobileNumber"));

        //Click 'Create Account button'
        pages.getSignupPage().clickCreateAccount();
    }

    @When("^I click 'Cart' button$")
    public void i_click_cart_button() {
        pages.getHomePage().clickCartButton();
    }

    @When("^I Click 'Proceed To Checkout' button$")
    public void i_click_proceed_to_checkout_button() {
        pages.getCartPage().clickProceedToCheckoutButton();
    }

    @When("^I Enter description in comment text area and click 'Place Order'$")
    public void i_enter_description_in_comment_text_area_and_click_place_order() {
        pages.getCartPage().setCommentMessageBox("Good products, thanx..");

        //click place order
        pages.getCartPage().clickPlaceOrderButton();
    }

    @When("^I Enter payment details: Name on Card, Card Number, CVC, Expiration date$")
    public void i_enter_payment_details_name_on_card_card_number_cvc_expiration_date() {
        pages.getPaymentPage().clickPayAndConfirmOrderButton();
        pages.getPaymentPage().setPaymentGroupBox("William");
        pages.getPaymentPage().clickPayAndConfirmOrderButton();
        pages.getPaymentPage().setPaymentGroupBox("14423243");
        pages.getPaymentPage().clickPayAndConfirmOrderButton();
        pages.getPaymentPage().setPaymentGroupBox("243");
        pages.getPaymentPage().clickPayAndConfirmOrderButton();
        pages.getPaymentPage().setPaymentGroupBox("42");
        pages.getPaymentPage().clickPayAndConfirmOrderButton();
        pages.getPaymentPage().setPaymentGroupBox("3243");


        BrowserUtils.wait(3);

    }

    @When("^I Click 'Pay and Confirm Order' button$")
    public void i_click_pay_and_confirm_order_button() {
        pages.getPaymentPage().clickPayAndConfirmOrderButton();
    }

    @When("^I Click 'Delete Account' button$")
    public void i_click_delete_account_button() {
    }
    @When("^I fill email password and click 'Login' button$")
    public void i_fill_email_password_and_click_login_button(){
        pages.getLoginPage().setLoginEmailAddress("10erd@dll");
        pages.getLoginPage().setLoginEmailPassword("qwerty");
        pages.getLoginPage().clickLoginButton();
    }

//    @Then("^I should see Home Page$")
//    public void i_should_see_home_page() {
//    }

    @Then("^I should verify hat cart page is displayed$")
    public void i_should_verify_hat_cart_page_is_displayed() {
    }

    @Then("^I should verify ACCOUNT CREATED! and click Continue button$")
    public void i_should_verify_account_created_and_click_continue_button() {
        //Verify that 'ACCOUNT CREATED!' is visible
        String actualAccountCreatedMessage = pages.getAccountCreatedPage().getAccountCreatedMessage();
        softAssert.assertEquals(actualAccountCreatedMessage, "ACCOUNT CREATED!", "ERROR : Test Case 1 - Verify that 'ACCOUNT CREATED!' is visible\n");

        //Click 'Continue' button
        pages.getAccountCreatedPage().clickContinueButton();
    }

    @Then("^I should verify ' Logged in as username' at top$")
    public void i_should_verify_logged_in_as_username_at_top() {
        //Dismiss pop-ups by navigating back and forward page
        BrowserUtils.navigateBackAndForwardToDismissAds();

        //Verify that 'Logged in as username' is visible.
        softAssert.assertTrue(pages.getHomePage().getLoggedInAsGivenNameResult().contains("Logged in as " + ConfigReader.getProperty("name")), "Error !! No contains Logged result");
        softAssert.assertAll();
    }

    @Then("^I should verify Address Details and Review Your Order$")
    public void i_should_verify_address_details_and_review_your_order() {

        String actualAddressDetails = pages.getCartPage().getAddressDeliveryBox();
        Assert.assertEquals(actualAddressDetails, "YOUR DELIVERY ADDRESS" + "\n" + "Mr. " +
                ConfigReader.getProperty("name") + " " + ConfigReader.getProperty("lastname") + "\n" +
                ConfigReader.getProperty("company") + "\n" +
                ConfigReader.getProperty("address1") + "\n" +
                ConfigReader.getProperty("address2") + "\n" +
                ConfigReader.getProperty("city") + " " + ConfigReader.getProperty("state") + " " + ConfigReader.getProperty("zipcode") + "\n" +
                ConfigReader.getProperty("country") + "\n" +
                ConfigReader.getProperty("mobileNumber"));
    }

    @Then("^I should Verify success message 'Your order has been placed successfully!'$")
    public void i_should_verify_success_message_your_order_has_been_placed_successfully() {
        String actualAlertSuccessMessageOfCard = pages.getPaymentPage().getAlertSuccessMessageOfCard();
        softAssert.assertEquals(actualAlertSuccessMessageOfCard,"Your order has been placed successfully!");
        softAssert.assertAll();
    }

    @Then("^I should Verify 'ACCOUNT DELETED!' and click 'Continue' button$")
    public void i_should_verify_account_deleted_and_click_continue_button() {
    }


}
