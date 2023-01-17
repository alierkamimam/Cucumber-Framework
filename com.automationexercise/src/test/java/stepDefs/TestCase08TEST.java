package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import utilities.BrowserUtils;
import utilities.ConfigReader;
import utilities.Driver;

public class TestCase08TEST extends BaseStep {
    SoftAssert softAssert = new SoftAssert();

    @Given("the user is on the homepage")
    public void the_user_is_on_the_homepage() {
        String url = ConfigReader.getProperty("url");
        Driver.getDriver().get(url);
        System.out.println("Open :: " + url);
        BrowserUtils.wait(1);
    }


    @When("Click on Products button")
    public void clickOnProductsButton() {
        pages.getHomePage().clickProductsButton();
        BrowserUtils.navigateBackAndForwardToDismissAds();
    }


    @Then("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
        String ALLPRODUCTSPage = pages.getProductsPage().getAllProductsText();
        softAssert.assertEquals(ALLPRODUCTSPage, "ALL PRODUCTS", " Verify that product  page is visible successfully");


    }

    @Then("The products list is visible")
    public void theProductsListIsVisible() {
        pages.getProductsPage().productListDisplay();
    }

    @When("Click on View Product of first product")
    public void clickOnViewProductOfFirstProduct() {
        BrowserUtils.scrollDown("500");
        pages.getProductsPage().clickFirstViewProductButton();
    }

    @Then("User is landed to product detail page")
    public void userIsLandedToProductDetailPage() {
        softAssert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://automationexercise.com/product_details/1");
        softAssert.assertAll();
    }

  /*  @Then("Verify that  detail is visible: product name, category, price, availability, condition, brand")
    public void verifyThatDetailIsVisibleProductNameCategoryPriceAvailabilityConditionBrand() {
        pages.*/

}

