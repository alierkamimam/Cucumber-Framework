package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import utilities.BrowserUtils;
import utilities.ConfigReader;
import utilities.Driver;

public class ProductProcessTests extends BaseStep {
    SoftAssert softAssert = new SoftAssert();

    @Given("the user is on the login page")
    public void user_is_on_the_login_page() {
        String url = ConfigReader.getProperty("url");
        Driver.getDriver().get(url);
        System.out.println("Open :: " + url);
        BrowserUtils.wait(1);

    }

    @Then("I should see Home Page")
    public void see_home_page() {
        // Verify that home page is visible successfully
        String automationText = pages.getHomePage().getAutomationText();
        Assert.assertEquals(automationText, "Automation", "Test case 8  Verify that home page is visible successfully");
    }

    @When("I scroll down")
    public void should_scroll_down() {
        BrowserUtils.scrollDown("200");
    }

    @When("I dismiss pop_ups")
    public void should_dismiss_popups() {
        BrowserUtils.navigateBackAndForwardToDismissAds();

    }
    @When("I hover over product")
    public void i_hover_over_product(){
        BrowserUtils.hoverOver(pages.getHomePage().firstItem);
    }

    @When("I click on View Product button on Home Page")
    public void click_on_view_product_button_on_home_page() {
        pages.getHomePage().clickViewProductButton();
    }

    @When("^I click 'Signup/Login' button$")
    public void i_click_signup_login_button(){
        pages.getHomePage().clickSignUpLoginButton();
    }
    @Then("I should verify product detail is opened")
    public void should_verify_product_detail_is_opened() {
        String actualProductDetailUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualProductDetailUrl, "https://automationexercise.com/product_details/1");
    }

    @When("I increase quantity to 4")
    public void increase_quantity_to_4() {
        pages.getProductDetailPage().changeQuantityNumber("4");
    }

    @When("I click 'Add to cart' button")
    public void i_click_add_to_cart_button() {
        pages.getProductDetailPage().clickAddToCartButton();
    }

    @When("I click 'View Cart' button")
    public void i_click_view_cart_button() {
        pages.getProductDetailPage().clickViewCartButton();

    }


    @Then("I should verify that product is displayed in cart page with exact quantity")
    public void verify_that_product_is_displayed_in_cart_page_with_exact_quantity() {
        String actualQuantityInBox = pages.getCartPage().getQuantity_4_Box();
        Assert.assertEquals(actualQuantityInBox, "4");

    }


}
