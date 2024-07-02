package com.bank.steps;

import com.bank.pages.AddCustomerPage;
import com.bank.pages.HomePage;
import com.bank.pages.OpenAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BankTestSteps {


    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {

    }

    @When("I click on Bank Manager login tab")
    public void iClickOnBankManagerLoginTab() {
        new HomePage().clickOnBankManagerLogin();
    }

    @And("I click on add customer tab")
    public void iClickOnAddCustomerTab() {
        new AddCustomerPage().clickOnAddCustomer();

    }

    @And("I enter firstname")
    public void iEnterFirstname() {
        new AddCustomerPage().enterFirstName();

    }

    @And("I enter last name")
    public void iEnterLastName() {
        new AddCustomerPage().enterLastName();
    }

    @And("I enter postcode")
    public void iEnterPostcode() {
        new AddCustomerPage().enterPostCode();
    }

    @And("I click on add customer button")
    public void iClickOnAddCustomerButton() {
        new AddCustomerPage().clickOnAddCustomerButton();
    }

    @And("pop up display")
    public void popUpDisplay() {

    }


    @And("I should verify the message Customer added successfully")
    public void iShouldVerifyTheMessageCustomerAddedSuccessfully() {
        new AddCustomerPage().verifyMessageForPopUP();
    }

    @Then("I click on Okay button on pop")
    public void iClickOnOkayButtonOnPop() {
        new AddCustomerPage().clickOnOkayPopUpButton();

    }

    // 2nd Method
    @And("I click on Open Account Tab")
    public void iClickOnOpenAccountTab() {
        new OpenAccountPage().clickOnOpenAccount();
    }

    @And("I select customer that created in first test")
    public void iSelectCustomerThatCreatedInFirstTest() {
        new OpenAccountPage().selectCustomerHarryBrown();
    }

    @And("I select currency Pound")
    public void iSelectCurrencyPound() {
        new OpenAccountPage().selectCurrencyPound();
    }

    @And("I click on Process button")
    public void iClickOnProcessButton() {
        new OpenAccountPage().clickOnProcessButton();
    }

    @And("pop up display{int}")
    public void popUpDisplay(int arg0) {
    }

    @And("I verify the message Account created successfully")
    public void iVerifyTheMessageAccountCreatedSuccessfully() {
        new OpenAccountPage().verifyThePopUpMessage();
    }

    @Then("I click on Okay button on popup{int}")
    public void iClickOnOkayButtonOnPopup(int arg0) {
        new OpenAccountPage().clickOnOkayPopUp1Button();

    }
}
