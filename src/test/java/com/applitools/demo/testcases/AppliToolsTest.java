package com.applitools.demo.testcases;

import com.applitools.demo.Pages.BasePage;
import com.applitools.demo.Pages.AutomobileInsurancePage;
import com.applitools.demo.Pages.TricentisHomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class AppliToolsTest extends BasePage {

    private TricentisHomePage tricentisHomePage;
    private AutomobileInsurancePage automobileInsurancePage;

    @BeforeMethod(alwaysRun = true)
    public void setupSuite(Method method) {
        tricentisHomePage = new TricentisHomePage(driver);
        automobileInsurancePage = new AutomobileInsurancePage(driver);

        logger = reports.startTest("Automation Test on Tricentis Vehicle Insurance");
    }

    @Test(priority = 0)
    public void automobileInsurancePage() throws InterruptedException {
        tricentisHomePage.clickOnAutomobileLink();
        automobileInsurancePage.navigateToAutomobileInsurancePage();
        automobileInsurancePage.enterVehicleDetails();
        automobileInsurancePage.enterInsuranceData();
        automobileInsurancePage.enterProductData();
        automobileInsurancePage.selectPriceOption();
        automobileInsurancePage.sendQuote();
    }

}
