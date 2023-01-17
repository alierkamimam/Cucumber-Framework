package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends BasePage{
   @FindBy(id="submit")
    private WebElement payAndConfirmOrderButton;

   @FindBy(xpath = "//div[@class='col-md-12 form-group']")
    private WebElement paymentGroupBox;

   @FindBy(xpath = "//div[contains(text(),'Your order has been placed successfully!')]")
   private WebElement alertSuccessMessageOfCard;

   public void clickPayAndConfirmOrderButton(){
       payAndConfirmOrderButton.click();
   }
   public void setPaymentGroupBox(String value){
       paymentGroupBox.sendKeys(value);
   }
   public String getAlertSuccessMessageOfCard(){
       return alertSuccessMessageOfCard.getText();
   }
}
