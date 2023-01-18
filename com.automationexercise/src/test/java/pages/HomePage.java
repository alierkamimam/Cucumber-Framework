package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BrowserUtils;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    private WebElement signUpLoginButton;

    @FindBy(xpath = "//*[@id='header']/div/div/div/div[2]/div/ul/li[2]/a")
    private WebElement productButton;

    @FindBy(xpath = "//li[10]//a[1]")
    private WebElement loggedInAsGivenName;

    @FindBy(xpath = "//a[normalize-space()='Delete Account']")
    private WebElement deleteAccountButton;

    @FindBy(xpath = "//div[@class='item active']//span[1]")
    private WebElement automationTextWebElement;

    @FindBy(xpath = "//a[normalize-space()='Logout']")
    private WebElement logoutButton;

    @FindBy(xpath = "//a[normalize-space()='Contact us']")
    private WebElement contactUsButton;

    @FindBy(xpath = "//a[contains(text(),'Test Cases')]")
    private WebElement testCasesButton;

    @FindBy(xpath = "//h2[normalize-space()='Subscription']")
    private WebElement subscriptionTextWebElement;

    @FindBy(xpath = "//input[@id='susbscribe_email']")
    private WebElement emailSubscriptionBox;

    @FindBy(id = "subscribe")
    private WebElement subscribeSubmitButton;

    @FindBy(xpath = "//div[@class='alert-success alert']")
    private WebElement alertSuccessSubscribeMessageWebElement;

    @FindBy(xpath = "//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
    private WebElement cartButton;

    @FindBy(xpath = "(//a[contains(text(),'View Product')])[1]")
    private WebElement viewProductButton;

    @FindBy(xpath = "//body/section/div[@class='container']/div[@class='row']/div[@class='col-sm-9 padding-right']/div[@class='features_items']/div[2]/div[1]/div[1]/div[1]/a[1]")
    private WebElement addToCartButton;
    @FindBy(xpath = "//u[normalize-space()='View Cart']")
    private WebElement viewCartButton;

    @FindBy(xpath = "//body/section/div[@class='container']/div[@class='row']/div[@class='col-sm-9 padding-right']/div[@class='features_items']/div[2]/div[1]/div[1]/div[1]")
    public WebElement firstItem;

    @FindBy(id = "susbscribe_email")
    private WebElement subscribeEmailBox;

    public void setSubscribeEmailBox(String email){
        subscribeEmailBox.sendKeys(email);
    }


    public void clickProductsButton() {
        BrowserUtils.verifyElementDisplayed(productButton);
        productButton.click();
    }

    public void clickCartButton() {
        cartButton.click();
    }

    public void clickSignUpLoginButton() {
        signUpLoginButton.click();
    }

    public void clickTestCasesButton() {
        testCasesButton.click();
    }


    public void clickLogoutButton() {
        logoutButton.click();
    }

    public void clickContactUsButton() {
        contactUsButton.click();
    }

    public void clickDeleteAccountButton() {
        deleteAccountButton.click();
    }

    public void clickAddToCartButton() {
        addToCartButton.click();
    }

    public void clickViewProductButton() {
        viewProductButton.click();
    }
    public void clickViewCartButton() {
        viewCartButton.click();
    }


    public void clickSubscribeSubmitButton() {
        subscribeSubmitButton.click();
    }


    public String getLoggedInAsGivenNameResult() {
        return loggedInAsGivenName.getText();
    }


    public String getAutomationText() {
        return automationTextWebElement.getText();
    }


    public String getSubscriptionText() {
        return subscriptionTextWebElement.getText();
    }

    public void setEmailSubscriptionBox(String email) {
        emailSubscriptionBox.sendKeys(email);
    }


    public String getAlertSuccessSubscribeMessage() {
        return alertSuccessSubscribeMessageWebElement.getText();
    }

}
