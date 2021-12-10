package uk.co.library.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.co.library.pages.HomePage;
import uk.co.library.propertyreader.PropertyReader;
import uk.co.library.utility.Utility;

public class TestBase extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod(groups = {"regression"})
    public void setUp(){
        selectBrowser(browser);
    }


/*

    //test to check framework template has set up successfully
    @Test
    public void test(){
        System.out.println("success");
    }
*/

    @AfterMethod(groups = {"sanity","smoke","regression"})
    public void tearDown(){
        closeBrowser();
    }
}
