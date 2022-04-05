package com.applitools.demo.Pages;

import com.relevantcodes.extentreports.LogStatus;
import com.applitools.demo.utility.PageUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class AutomobileInsurancePage extends BasePage {
    protected WebDriver driver;

    public AutomobileInsurancePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "selectedinsurance")
    WebElement automobileInsuranceText;
    @FindBy(how = How.ID, using = "make")
    WebElement selectMake;
    @FindBy(how = How.ID, using = "dateofmanufacture")
    WebElement dateOfManufacture;
    @FindBy(how = How.ID, using = "engineperformance")
    WebElement enginePerformanceInputBox;
    @FindBy(how = How.ID, using = "numberofseats")
    WebElement numberOfSeats;
    @FindBy(how = How.ID, using = "fuel")
    WebElement fuelType;
    @FindBy(how = How.ID, using = "listprice")
    WebElement listPrice;
    @FindBy(how = How.ID, using = "licenseplatenumber")
    WebElement licensePlateNumber;
    @FindBy(how = How.ID, using = "annualmileage")
    WebElement annualMileage;
    @FindBy(how = How.ID, using = "nextenterinsurantdata")
    WebElement nextButton;
    @FindBy(how = How.ID, using = "firstname")
    WebElement firstName;
    @FindBy(how = How.ID, using = "lastname")
    WebElement lastName;
    @FindBy(how = How.ID, using = "birthdate")
    WebElement birtDate;
    @FindBy(how = How.XPATH, using = "//input[@id='gendermale']/../span")
    WebElement genderMale;
    @FindBy(how = How.ID, using = "streetaddress")
    WebElement streetAddress;
    @FindBy(how = How.XPATH, using = "//select[@id='country']")
    WebElement selectCountry;
    @FindBy(how = How.XPATH, using = "//select[@id='country']/option[@value='United Arab Emirates']")
    WebElement UAE;
    @FindBy(how = How.ID, using = "zipcode")
    WebElement zipCode;
    @FindBy(how = How.ID, using = "city")
    WebElement cityFiled;
    @FindBy(how = How.ID, using = "occupation")
    WebElement occupationDropDown;
    @FindBy(how = How.XPATH, using = "//*[@id='skydiving']/../span")
    WebElement skyDiving;
    @FindBy(how = How.ID, using = "nextenterproductdata")
    WebElement nextEnterProductDataButton;
    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Sending e-mail success!')]")
    WebElement PopMessage;
    @FindBy(how = How.ID, using = "startdate")
    WebElement startDate;
    @FindBy(how = How.ID, using = "insurancesum")
    WebElement insuranceSum;
    @FindBy(how = How.ID, using = "meritrating")
    WebElement meritRating;
    @FindBy(how = How.ID, using = "damageinsurance")
    WebElement damageInsurance;
    @FindBy(how = How.XPATH, using = "//*[@id='EuroProtection']/../span")
    WebElement euroProtection;
    @FindBy(how = How.ID, using = "courtesycar")
    WebElement courtesyCar;
    @FindBy(how = How.ID, using = "nextselectpriceoption")
    WebElement nextSelectionButton;
    @FindBy(how = How.XPATH, using = "//*[@id='selectplatinum']/../span")
    WebElement selectPlatinum;
    @FindBy(how = How.ID, using = "nextsendquote")
    WebElement nextSendQuoteButton;
    @FindBy(how = How.ID, using = "email")
    WebElement emailField;
    @FindBy(how = How.ID, using = "phone")
    WebElement phoneNumField;
    @FindBy(how = How.ID, using = "username")
    WebElement userName;
    @FindBy(how = How.ID, using = "password")
    WebElement passwordField;
    @FindBy(how = How.ID, using = "confirmpassword")
    WebElement confirmPasswordField;
    @FindBy(how = How.ID, using = "sendemail")
    WebElement sendEmail;


    public void navigateToAutomobileInsurancePage() {
        logger.log(LogStatus.INFO, "User is in Automobile Insurance page");
        PageUtil.containText(automobileInsuranceText, config.getDataFromConfig("dashBoardText"));
        //eyes.checkWindow(config.getDataFromConfig("dashBoardText"));
    }

    public void enterVehicleDetails() {
        logger.log(LogStatus.INFO, config.getDataFromConfig("vehiclePage"));
        PageUtil.selectOption("byValue", selectMake, config.getDataFromConfig("ModelBMW"));
        logger.log(LogStatus.PASS, "Select value BMW");
        PageUtil.sendKeys(enginePerformanceInputBox, "2000");
        logger.log(LogStatus.PASS, "Value 2000 is updated");
        PageUtil.sendKeys(dateOfManufacture, "10/02/2010");
        logger.log(LogStatus.PASS, "Value Manufacture date updated");
        PageUtil.selectOption("byValue", numberOfSeats, "4");
        logger.log(LogStatus.PASS, "Select number of seat as 4");
        PageUtil.selectOption("byValue", fuelType, "Diesel");
        logger.log(LogStatus.PASS, "Select Fuel type as Diesel");
        PageUtil.sendKeys(listPrice, "100000");
        logger.log(LogStatus.PASS, "Value 100000 is updated");
        PageUtil.sendKeys(licensePlateNumber, "EU R 2010");
        logger.log(LogStatus.PASS, "Value EU R 2010 is updated");
        PageUtil.sendKeys(annualMileage, "10000");
        // eyes.checkWindow("Check VehicleDetails Entered");
        logger.log(LogStatus.PASS, "Value 10000 is updated");
        PageUtil.click(nextButton);
        logger.log(LogStatus.PASS, "Click on next button");

    }

    public void enterInsuranceData() {
        logger.log(LogStatus.INFO, "Enter Insurance Data page is displayed");
        PageUtil.sendKeys(firstName, "TestAutomation");
        logger.log(LogStatus.PASS, "Enter First Name");
        PageUtil.sendKeys(lastName, "TestAutomation");
        logger.log(LogStatus.PASS, "Enter Last Name");
        PageUtil.sendKeys(birtDate, "02/01/1979");
        logger.log(LogStatus.PASS, "Entered Birth Date");
        PageUtil.click(genderMale);
        logger.log(LogStatus.PASS, "Select gender as Male");
        PageUtil.sendKeys(streetAddress, "12, Delpstraße");
        logger.log(LogStatus.PASS, "Enter street address");
        PageUtil.click(selectCountry);
        PageUtil.click(UAE);
        logger.log(LogStatus.PASS, "Select Country");
        PageUtil.sendKeys(cityFiled, "Dubai");
        logger.log(LogStatus.PASS, "Enter City Name");
        PageUtil.selectOption("byValue", occupationDropDown, "Employee");
        //selectDropdownValue = new Select(occupationDropDown);
        //selectDropdownValue.selectByValue("Employee");
        logger.log(LogStatus.PASS, "Select drop down value as Employee");
        PageUtil.sendKeys(zipCode, "1034");
        logger.log(LogStatus.PASS, "Enter Zip Code");
        // eyes.checkWindow("Check all the values Entered");
        PageUtil.click(skyDiving);
        //Thread.sleep(3000);
        logger.log(LogStatus.PASS, "Select skydiving option");
        PageUtil.click(nextEnterProductDataButton);
        logger.log(LogStatus.PASS, "Click on next button");
    }

    public void enterProductData() {
        logger.log(LogStatus.INFO, "Enter Product Data page is displayed");
        PageUtil.sendKeys(startDate, "12/02/2022");
        logger.log(LogStatus.PASS, "Enter Start Date");
        PageUtil.selectOption("byValue", insuranceSum, "3000000");
        //selectDropdownValue = new Select(insuranceSum);
        //selectDropdownValue.selectByValue("3000000");
        logger.log(LogStatus.PASS, "Select drop down value as 3000000");
        PageUtil.selectOption("byValue", meritRating, "Bonus 3");
        //selectDropdownValue = new Select(meritRating);
        //selectDropdownValue.selectByValue("Bonus 3");
        logger.log(LogStatus.PASS, "Select drop down value as Bonus 3");
        PageUtil.selectOption("byValue", damageInsurance, "Partial Coverage");
        //selectDropdownValue = new Select(damageInsurance);
        //selectDropdownValue.selectByValue("Partial Coverage");
        logger.log(LogStatus.PASS, "Select drop down value as Partial Coverage");
        PageUtil.click(euroProtection);
        logger.log(LogStatus.PASS, "Click on EuroProtection Option");
        PageUtil.selectOption("byValue", courtesyCar, "Yes");
        //selectDropdownValue = new Select(courtesyCar);
        //selectDropdownValue.selectByValue("Yes");
        //eyes.checkWindow("Check all the values Entered");
        //Thread.sleep(3000);
        logger.log(LogStatus.PASS, "Select drop down value as Yes");
        PageUtil.click(nextSelectionButton);
        logger.log(LogStatus.PASS, "Click on next button");
    }

    public void selectPriceOption() {
        logger.log(LogStatus.INFO, "Select Price Option page is displayed");
        PageUtil.click(selectPlatinum);
        logger.log(LogStatus.PASS, "Click on Platinum option");
        // eyes.checkWindow("Check all the values Entered");
        //Thread.sleep(3000);
        PageUtil.click(nextSendQuoteButton);
        logger.log(LogStatus.PASS, "Click on next button");
    }

    public void sendQuote()  {
        logger.log(LogStatus.INFO, "Send Quote page is displayed");
        PageUtil.sendKeys(emailField, "Test@gmail.com");
        logger.log(LogStatus.PASS, "Enter Email ID");
        PageUtil.sendKeys(phoneNumField, "12345678");
        logger.log(LogStatus.PASS, "Enter Phone Number");
        PageUtil.sendKeys(userName, "adfg");
        logger.log(LogStatus.PASS, "Enter User Name");
        PageUtil.sendKeys(passwordField, "Test123");
        logger.log(LogStatus.PASS, "Enter Password");
        PageUtil.sendKeys(confirmPasswordField, "Test123");
        logger.log(LogStatus.PASS, "Re-enter Password");
        // eyes.checkWindow("Check all the values Entered");
        // Thread.sleep(3000);
        PageUtil.click(sendEmail);
        logger.log(LogStatus.PASS, "Click on send email button");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        PageUtil.verifyText(PopMessage, "Sending e-mail success!");
        logger.log(LogStatus.PASS, "Sending e-mail success! message is displayed");
    }
}
