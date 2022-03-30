package com.salaryfinance.cucumber.steps;

import com.salaryfinance.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    static String EmailAddress = "xyz@gmail.com";
    static String ContactNo = "07447588091";

    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @When("^I click On contactUs Button$")
    public void iClickOnContactUsButton() {
        new HomePage().clickOnAcceptcookies();
        new HomePage().clickOnContactUs();

    }

    @And("^I enter FirstName \"([^\"]*)\"$")
    public void iEnterFirstName(String name) {
        new HomePage().enterFirstName(name);

    }

    @And("^I enter LastName \"([^\"]*)\"$")
    public void iEnterLastName(String name) {
        new HomePage().enterLastname(name);

    }

    @And("^I enter Company Email$")
    public void iEnterCompanyEmail() {
        new HomePage().enterCompanyName(EmailAddress);
    }

    @And("^I enter Contact Number$")
    public void iEnterContactNumber() {
        new HomePage().enterContactNumber(ContactNo);
    }

    @And("^I select Country \"([^\"]*)\"$")
    public void iSelectCountry(String name) {
      new HomePage().selectCountry(name);
    }

    @And("^I enter Company Name \"([^\"]*)\"$")
    public void iEnterCompanyName(String name) {
     new HomePage().enterCompanyName(name);
    }

    @And("^I select An Employee From DropDown \"([^\"]*)\"$")
    public void iSelectAnEmployeeFromDropDown(String name) {
        new HomePage().selectEmployee(name);

    }

    @And("^I Enter Job Title \"([^\"]*)\"$")
    public void iEnterJobTitle(String text) {
    new HomePage().enterJobTitle(text);
    }

    @And("^I Select Company Size \"([^\"]*)\"$")
    public void iSelectCompanySize(String size)  {
        new HomePage().selectCompanySize(size);

    }

    @And("^I enter Massage \"([^\"]*)\"$")
    public void iEnterMassage(String text ) {
        new HomePage().enterMessage(text);

    }

    @Then("^I click on submit Button$")
    public void iClickOnSubmitButton() {
        new HomePage().clickOnsubmitBtn();
    }
}
