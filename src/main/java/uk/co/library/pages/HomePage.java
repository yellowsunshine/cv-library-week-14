package uk.co.library.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.co.library.utility.Utility;

import java.util.concurrent.TimeUnit;

public class HomePage extends Utility {

    @FindBy(id = "keywords")
    WebElement jobTitle;

    @FindBy(id = "location")
    WebElement location;

    @FindBy(xpath = "(//select[@id='distance'])[1]")
    WebElement distanceDropDown;

    @FindBy(id = "toggle-hp-search")
    WebElement moreSearchOptionsLink;

    @FindBy(id = "salarymin")
    WebElement salaryMin;

    @FindBy(id = "salarymax")
    WebElement salaryMax;

    @FindBy(xpath = "(//select[@id='salarytype'])[1]")
    WebElement salaryTypeDropDown;

    @FindBy(xpath = "(//select[@id='tempperm'])[1]")
    WebElement jobTypeDropDown;

    @FindBy(id = "hp-search-btn")
    WebElement findJobsBtn;

    @CacheLookup
    @FindBy(xpath = "//span//div//span[normalize-space()='Accept All']")
    WebElement acceptCookies;

    @CacheLookup
    @FindBy(id ="gdpr-consent-notice")
    WebElement iframe;



    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void enterJobTitle(String jobTitles){
        Reporter.log("Entering Job Title "+jobTitle.toString()+"</br>");
        pmSendTextToElement(jobTitle, jobTitles);

    }

    public void enterLocation(String locations){
        Reporter.log("Entering Location "+ location.toString()+"</br>");
        pmSendTextToElement(location, locations);

    }

    public void selectDistance(String distance){
        Reporter.log("Selecting Distance "+distanceDropDown.toString()+"</br>");
        pmSelectByVisibleTextFromDropDown(distanceDropDown, distance);

    }

    public void clickOnMoreSearchOptionLink(){
        Reporter.log("Clicking on more search Option Link "+moreSearchOptionsLink.toString()+"</br>");
        pmClickOnElement(moreSearchOptionsLink);

    }

    public void enterMinSalary(String minSalary){
        Reporter.log("Entering Minimum Salary "+salaryMin.toString()+"</br>");
        pmSendTextToElement(salaryMin, minSalary);

    }

    public void enterMaxSalary(String maxSalary){
        Reporter.log("Entering Max Salary "+salaryMax.toString()+"</br>");
        pmSendTextToElement(salaryMax, maxSalary);

    }

    public void selectSalaryType(String sType){
        Reporter.log("Selecting Salary Type "+salaryTypeDropDown.toString()+"</br>");
        pmSelectByVisibleTextFromDropDown(salaryTypeDropDown, sType);



    }

    public void selectJobType(String jobType){
        Reporter.log("Selecting Job Type "+jobTypeDropDown.toString()+"</br>");
        pmSelectByVisibleTextFromDropDown(jobTypeDropDown, jobType);

    }

    public void clickOnFindJobsButton(){
        Reporter.log("Clicking on find jobs button "+findJobsBtn.toString()+"</br>");
        pmClickOnElement(findJobsBtn);

    }

    public void setAcceptCookies(){
        switchToIframe(iframe);
        pmClickOnElement(acceptCookies);
        driver.switchTo().defaultContent();
    }



}
