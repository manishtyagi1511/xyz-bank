package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddCustomerPage extends Utility {

    private static final Logger log = LogManager.getLogger(AddCustomerPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add Customer']")
    WebElement addCustomer;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstName;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastName;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement postCode;

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]")
    WebElement addCustomerButton;

    //pop up window




    public void clickOnAddCustomer(){
        clickOnElement(addCustomer);
        log.info("click on add customer" + addCustomer.toString());
    }

    public void enterFirstName(){
        sendTextToElement(firstName,"Harryt");
        log.info("enter first name" + firstName.toString());
    }

    public void enterLastName(){
        sendTextToElement(lastName,"Brownt");
        log.info("enter last name" + lastName.toString());
    }

    public void enterPostCode(){
        sendTextToElement(postCode,"HA33C");
        log.info("enter post code" + postCode.toString());
    }

    public void clickOnAddCustomerButton(){
        clickOnElement(addCustomerButton);
        log.info("click on add customer button" + addCustomerButton.toString());
    }
    //pop verification
    public String verifyMessageForPopUP(){
        return getTextFromAlert();
    }
    public void clickOnOkayPopUpButton(){
    switchToAcceptAlert();
    }

}
