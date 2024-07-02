package com.bank.steps;

import com.bank.pages.CustomersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CustomerTestSteps {
    @When("I click on Customer Login Tab")
    public void iClickOnCustomerLoginTab() {
        new CustomersPage().clickOnCustomerLogin();

    }

    @And("I search customer that I created")
    public void iSearchCustomerThatICreated() {
        new CustomersPage().selectCustomerHarryPotter();
    }

    @And("I click on Login Button")
    public void iClickOnLoginButton() {
        new CustomersPage().clickOnLoginButton();
    }

    @And("I verify Logout tab displayed")
    public void iVerifyLogoutTabDisplayed() {
       new CustomersPage().verifyLogoutButton();

    }

    @And("I click on Logout")
    public void iClickOnLogout() {
        new CustomersPage().clickOnLogoutButton();
    }

    @Then("I verify your name text displayed")
    public void iVerifyYourNameTextDisplayed() {
        new CustomersPage().verifyTextYourName();
       // Assert.assertEquals(new CustomersPage().verifyTextYourName(),"---Your Name---","Your Name text is not verified");
    }

    @And("I click on Deposit button")
    public void iClickOnDepositButton() {
        new CustomersPage().clickOnDepositButton();
    }

    @And("I enter amount hundred")
    public void iEnterAmountHundred() {
        new CustomersPage().enterAmountHundred();
    }

    @And("I click on deposit button{int}")
    public void iClickOnDepositButton(int arg0) {
        new CustomersPage().clickOnDepositAfterHundred();
    }

    @Then("I verify the message Deposit Successful")
    public void iVerifyTheMessageDepositSuccessful() {
        Assert.assertEquals(new CustomersPage().verifyDepositSuccessful(),"Deposit Successful","Text is not verified");
    }

    @And("I click on Withdrawl Tab")
    public void iClickOnWithdrawlTab() {
        new CustomersPage().clickOnWithdrawal();

    }

    @And("I enter amount fifty")
    public void iEnterAmountFifty() {
        new CustomersPage().enterAmountFifty();
    }

    @And("I click on Withdrawl button")
    public void iClickOnWithdrawlButton() {
        new CustomersPage().clickOnWithdrawl1();

    }

    @Then("I verify the message Transaction Successful")
    public void iVerifyTheMessageTransactionSuccessful() {
        Assert.assertEquals(new CustomersPage().verifyTextTransactionSuccessful(),"Transaction successful","Text is not verified ");

    }
}
