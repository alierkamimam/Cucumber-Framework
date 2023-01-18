package stepDefs;

import org.testng.asserts.SoftAssert;
import utilities.Pages;

public class BaseStep {
    protected Pages pages = new Pages();
    SoftAssert softAssert = new SoftAssert();
}
