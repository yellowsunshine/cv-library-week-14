package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {

    @FindBy(css = "div[class='search-header__title'] h1")
    WebElement resultText;

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    public void verifyTheResults(String expected){
        Reporter.log("verifying the results "+resultText.toString()+"</br>");
        pmVerifyElements(resultText, expected, "Results are displayed incorrectly");

    }
}
