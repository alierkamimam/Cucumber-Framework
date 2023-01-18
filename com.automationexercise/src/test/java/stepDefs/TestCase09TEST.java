package stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class TestCase09TEST extends BaseStep {
    SoftAssert softAssert = new SoftAssert();

    @When("Enter product {string} in search input and click search button")
    public void enter_product_name_in_search_input_and_click_search_button(String string) {
        pages.getProductsPage().searchProduct(string);
        pages.getProductsPage().clickSearchButton();
    }

    @Then("verify SEARCHED PRODUCTS is visible")
    public void verifySEARCHEDPRODUCTSIsVisible() {
        String searchProductMessage = pages.getProductsPage().getSearchedProductsMessage();
        softAssert.assertEquals(searchProductMessage, "SEARCHED PRODUCTS", "TESTCASE 09--> Verify 'SEARCHED PRODUCTS' is visible");


    }

    @Then("Verify all the products related to search are visible")
    public void verifyAllTheProductsRelatedToSearchAreVisible() {
        String searchedMessage = pages.getProductsPage().getSearhedMenTshirt();
        softAssert.assertEquals(searchedMessage,"Men Tshirt","TESTCASE 09--> Verify 'Men Tshirt' is visible");

    }
}
