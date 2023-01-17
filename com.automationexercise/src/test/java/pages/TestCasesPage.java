package pages;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCasesPage extends BasePage {

    @FindBy(xpath = "//b[contains(text(),'Test Cases')]")
    private WebElement testCaseMessage;

    public String TestCaseMessage(){
        return testCaseMessage.getText();
    }
}
