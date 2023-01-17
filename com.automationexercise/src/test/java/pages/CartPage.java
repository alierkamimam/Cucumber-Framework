package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    @FindBy(id = "susbscribe_email")
    private WebElement subscribeEmailBoxWebElement;

    @FindBy(id = "subscribe")
    private WebElement subscribeSubmitButton;

    @FindBy(xpath = "//h2[normalize-space()='Subscription']")
    private WebElement subscriptionTextWebElement;

    @FindBy(xpath = "//div[@class='alert-success alert']")
    private WebElement alertSuccessSubscriptionWebElement;
    @FindBy(xpath = "//a[normalize-space()='Blue Top']")
    private WebElement blueTopProductTextWebElement;

    @FindBy(xpath = "//a[normalize-space()='Men Tshirt']")
    private WebElement menTshirtProductTextWebElement;

    @FindBy(xpath = "//td[@class='cart_price']//p[contains(text(),'Rs. 500')]")
    private WebElement blueTopPriceWebElement;

    @FindBy(xpath = "//tr[@id='product-1']//button[@class='disabled'][normalize-space()='1']")
    private WebElement blueTopQuantityWebElement;
    @FindBy(xpath = "//p[@class='cart_total_price'][normalize-space()='Rs. 500']")
    private WebElement blueTopTotalPriceWebElement;

    @FindBy(xpath = "//td[@class='cart_price']//p[contains(text(),'Rs. 400')]")
    private WebElement menTshirtPriceWebElement;
    @FindBy(xpath = "//tr[@id='product-2']//button[@class='disabled'][normalize-space()='1']")
    private WebElement menTshirtQuantityWebElement;
    @FindBy(xpath = "//p[@class='cart_total_price'][normalize-space()='Rs. 400']")
    private WebElement menTshirtTotalPriceWebElement;
    @FindBy(xpath = "//button[normalize-space()='4']")
    private WebElement quantity_4_Box;

    @FindBy(xpath = "//a[normalize-space()='Proceed To Checkout']")
    private WebElement proceedToCheckoutButton;
    @FindBy(xpath = "//u[normalize-space()='Register / Login']")
    private WebElement registerLoginButton;

    @FindBy(xpath = "//ul[@id='address_delivery']")
    private WebElement addressDeliveryBoxWebElement;
    @FindBy(xpath = "//textarea[@name='message']")
    private WebElement commentMessageBox;
    @FindBy(xpath = "//a[normalize-space()='Place Order']")
    private WebElement placeOrderButton;


    public void setCommentMessageBox(String comments) {
        commentMessageBox.sendKeys(comments);
    }

    public void setSubscribeEmailBox(String email) {
        subscribeEmailBoxWebElement.sendKeys(email);
    }

    public void clickSubscribeSubmitButton() {
        subscribeSubmitButton.click();
    }

    public void clickProceedToCheckoutButton() {
        proceedToCheckoutButton.click();
    }

    public void clickRegisterLoginButton() {
        registerLoginButton.click();
    }

    public void clickPlaceOrderButton() {
        placeOrderButton.click();
    }

    public String getSubscriptionMessage() {
        return subscriptionTextWebElement.getText();
    }

    public String getAlertSuccessSubscribeMessage() {
        return alertSuccessSubscriptionWebElement.getText();
    }

    public String getBlueTopText() {
        return blueTopProductTextWebElement.getText();
    }

    public String getMenTshirt() {
        return menTshirtProductTextWebElement.getText();
    }

    public String getBlueTopQualifications() {
        return blueTopPriceWebElement.getText() + blueTopQuantityWebElement.getText() + blueTopTotalPriceWebElement.getText();
    }

    public String getMenTshirtQualifications() {
        return menTshirtPriceWebElement.getText() + menTshirtQuantityWebElement.getText() + menTshirtTotalPriceWebElement.getText();
    }

    public String getQuantity_4_Box() {
        return quantity_4_Box.getText();
    }

    public String getAddressDeliveryBox() {
        return addressDeliveryBoxWebElement.getText();
    }

}
