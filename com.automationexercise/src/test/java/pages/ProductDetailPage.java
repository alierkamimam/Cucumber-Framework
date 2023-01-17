package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailPage extends BasePage{
    @FindBy(css = "div[class='product-information']")
    private WebElement productConditionWebElement;

    @FindBy(id="quantity")
    private  WebElement quantityBox;

    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    private  WebElement addToCartButton;
    @FindBy(xpath = "//u[normalize-space()='View Cart']")
    private WebElement viewCartButton;

    public WebElement getProductConditionWebElement(){
        return productConditionWebElement;
    }

    public void changeQuantityNumber(String num){
        quantityBox.clear();
        quantityBox.sendKeys(num);
    }
    public void clickAddToCartButton(){
        addToCartButton.click();
    }
    public void clickViewCartButton() {
        viewCartButton.click();
    }



}
