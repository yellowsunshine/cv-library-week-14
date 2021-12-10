package uk.co.library.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;
import uk.co.library.customlisteners.RetryAnalyzer;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.TestBase;

public class JobSearchTest extends TestBase {

    HomePage homePage;
    ResultPage resultPage;

    @BeforeMethod(groups = {"regression"})
    public void init() {
        homePage = new HomePage();
        new HomePage().setAcceptCookies();
        resultPage = new ResultPage();
    }


    @Test(groups = {"regression"},  dataProvider = "criteria", dataProviderClass = TestData.class, retryAnalyzer = RetryAnalyzer.class)
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String distance,
                                                           String salaryMin, String salaryMax, String salaryType, String jobType, String result) throws InterruptedException {


        homePage.enterJobTitle(jobTitle);
        homePage.enterLocation(location);
        homePage.selectDistance(distance);
        homePage.clickOnMoreSearchOptionLink();
        homePage.enterMinSalary(salaryMin);
        homePage.enterMaxSalary(salaryMax);
        homePage.selectSalaryType(salaryType);
        homePage.selectJobType(jobType);
        homePage.clickOnFindJobsButton();
        resultPage.verifyTheResults(result);

    }


}
