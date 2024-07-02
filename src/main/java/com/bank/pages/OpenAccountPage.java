package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class OpenAccountPage extends Utility {


    private static final Logger log = LogManager.getLogger(AddCustomerPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Open Account']")
    WebElement openAccount;

    @CacheLookup
    @FindBy(id = "userSelect")
    WebElement customer;

    @CacheLookup
    @FindBy(id = "currency")
    WebElement pound;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Process']")
    WebElement processButton;


    public void clickOnOpenAccount() {
        clickOnElement(openAccount);
        log.info("click on open account" + openAccount.toString());
    }

    public void selectCustomerHarryBrown() {
        selectByVisibleTextFromDropDown(customer, "Hermoine Grange");
        log.info("select customer name Hermoine Grange" + customer.toString());

    }

    public void selectCurrencyPound() {
        selectByVisibleTextFromDropDown(pound, "Pound");
        log.info("select currency pound" + pound.toString());


    }

    public void clickOnProcessButton() {
        clickOnElement(processButton);
        log.info("click on process button" + processButton.toString());

    }

    //pop up verification
    public String verifyThePopUpMessage() {

        return getTextFromAlert();
    }
    public void clickOnOkayPopUp1Button(){
        switchToAcceptAlert();
    }

}
