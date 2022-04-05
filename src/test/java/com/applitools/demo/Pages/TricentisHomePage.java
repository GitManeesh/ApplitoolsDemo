package com.applitools.demo.Pages;

import com.relevantcodes.extentreports.LogStatus;
import com.applitools.demo.utility.PageUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class TricentisHomePage extends BasePage {

    protected WebDriver driver;

    public TricentisHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "nav_automobile")
    WebElement automobileLink;

    @FindBy(how = How.ID, using = "make")
    WebElement selectMake;

    @FindBy(how = How.ID, using = "login-button")
    WebElement clickLoginButton;



    public void clickOnAutomobileLink() {
        logger.log(LogStatus.INFO,"User in Home page");
        PageUtil.click(automobileLink);
        logger.log(LogStatus.PASS, "Clicked on Automobile Link");
    }

    public void navigateToAutomobileInsurance() {
        logger.log(LogStatus.INFO, "Automobile Insurance page displayed");
    }

}
