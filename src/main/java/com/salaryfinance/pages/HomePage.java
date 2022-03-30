package com.salaryfinance.pages;

import com.salaryfinance.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='ccc-notify-accept']")
    WebElement acceptCookies;
    @CacheLookup
    @FindBy(xpath = "(//a[contains(@class,'nav-link-primary')][normalize-space()='Contact Us'])[1]")
    WebElement contactUs;
    @CacheLookup
    @FindBy(css = "#f6718dda-0e45-48f9-bf8f-ecfe8a500a9e")
    WebElement firstname;
    @CacheLookup
    @FindBy(xpath = "(//input[@id='8672ae66-ff4b-471d-83eb-919703f6758e'])[1]")
    WebElement lastname;
    @CacheLookup
    @FindBy(css = "#c9204231-7756-4e10-cb50-60870fb4bb73")
    WebElement companyemail;
    @CacheLookup
    @FindBy(xpath = "(//input[@id='3984635b-1ba6-432c-f6e1-92ecf538430c'])[1]")
    WebElement contactNumber;
    @CacheLookup
    @FindBy(xpath = "(//select[@id='90751f80-5abd-4338-eec4-7518c2bf4d9c'])[1]")
    WebElement Country;
    @CacheLookup
    @FindBy(xpath = "(//input[@id='4b06c74d-f022-4f37-ffed-8a5101f131cc'])[1]")
    WebElement CompanyName;
    @CacheLookup
    @FindBy(xpath = "(//select[@id='8f9810c3-ba59-4083-e286-ca8cc7aa7506'])[1]")
    WebElement employee;
    @CacheLookup
    @FindBy(css = "#a3a1ad6b-5468-4ea9-b699-85b9d46e60e3")
    WebElement jobtitle;
    @CacheLookup
    @FindBy(xpath = "(//select[@id='44038438-be22-46a7-8d47-29fd09eb458a'])[1]")
    WebElement CompanySize;
    @CacheLookup
    @FindBy(xpath = "(//textarea[@id='787e0a64-ebfe-4b63-e24a-063ff08bc21f'])[1]")
    WebElement massage;
    @CacheLookup
    @FindBy(xpath = "(//section[contains(@class,'contact-form')])[1]")
    WebElement submit;
    public void clickOnAcceptcookies(){
        log.info("clicking on button : " + acceptCookies.toString());
        pmClickOnElement(acceptCookies);
    }
    public void clickOnContactUs(){
        log.info("clicking on button : " + contactUs.toString());
        pmClickOnElement(contactUs);
    }
    public void enterFirstName(String name){
        log.info("Enter name : " + firstname.toString());
        sendTextToElement(firstname,name);
    }
    public void enterLastname(String name){
        log.info("Enter name : " + lastname.toString());
        sendTextToElement(lastname,name);
    }
    public void enterCompanyEmail(String email){
        log.info("enter company Email: " + companyemail.toString());
        sendTextToElement(companyemail,email);
    }
    public void enterContactNumber(String number){
        log.info("enter company Number : " + contactNumber.toString());
        sendTextToElement(contactNumber,number);
    }
    public void selectCountry(String name){
        log.info("select Country : " + Country.toString());
        pmSelectByValueFromDropDown(Country,name);
    }
    public void enterCompanyName(String name){
        log.info("enter CompanyName : " + CompanyName.toString());
        sendTextToElement(CompanyName,name);
    }
    public void selectEmployee(String name){
        log.info("Select Employee : " + employee.toString());
        pmSelectByValueFromDropDown(employee,name);
    }
    public void enterJobTitle(String text){
        log.info("enter Job Title : " + jobtitle.toString());
        sendTextToElement(jobtitle,text);
    }
    public void selectCompanySize(String size){
        log.info("select Company Size : " + CompanySize.toString());
        pmSelectByValueFromDropDown(CompanySize,size);
    }
    public void enterMessage(String text){
        log.info("Enter Massage : " + massage.toString());
        pmSendTextToElement(massage,text);
    }
    public void clickOnsubmitBtn(){
        log.info("clicking on button : " + submit.toString());
        clickOnElement(submit);
    }

}
