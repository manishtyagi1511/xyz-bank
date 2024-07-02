package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CustomersPage extends Utility {

    private static final Logger log = LogManager.getLogger(CustomersPage.class.getName());


    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customerLogin;

    @CacheLookup
    @FindBy(id = "userSelect")
    WebElement selectCustomerHarry;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement verifyLogout;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement clickLogout;

    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement verifyYourName;


    public void clickOnCustomerLogin(){
        clickOnElement(customerLogin);
        log.info("click on  customer login" + customerLogin.toString());

    }
    public void selectCustomerHarryPotter(){
        selectByVisibleTextFromDropDown(selectCustomerHarry,"Hermoine Granger");
        log.info("select customer harry potter" + selectCustomerHarry.toString());

    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
        log.info("click on login button" + loginButton.toString());

    }

    public String verifyLogoutButton(){
        log.info("verify logout button" + verifyLogout.toString());
        return getTextFromElement(verifyLogout);



    }

    public void clickOnLogoutButton(){
        clickOnElement(clickLogout);
        log.info("click on logout button" + clickLogout.toString());
    }

    public String verifyTextYourName(){
        log.info("verify text your name" + verifyYourName.toString());
        return getTextFromElement(verifyYourName);
    }



    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Deposit']")
    WebElement depositButton;

    public void clickOnDepositButton(){
        clickOnElement(depositButton);
        log.info("click on deposit button" + depositButton.toString());


    }
//Deposit
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement enterAmount;

    public void enterAmountHundred(){
        sendTextToElement(enterAmount,"100");
        log.info("enter amount 100" + enterAmount.toString());


    }
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement clickOnDeposit1;

    public void clickOnDepositAfterHundred(){
        clickOnElement(clickOnDeposit1);
        log.info("click on deposit after entering the £100 " + clickOnDeposit1.toString());
    }

    @CacheLookup
    @FindBy(xpath = " //span[@class='error ng-binding']")
    WebElement vDepositSuccessful;

    public String verifyDepositSuccessful(){
        log.info("verify deposit successfully" + vDepositSuccessful.toString());
        return getTextFromElement(vDepositSuccessful);

    }



//Withdrawl
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Withdrawl']")
    WebElement withdrwal;

    public void clickOnWithdrawal(){
        clickOnElement(withdrwal);
        log.info("click on withdrawl" + withdrwal.toString());

    }


    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement enterFifty;

    public void enterAmountFifty(){
        sendTextToElement(enterFifty,"50");
        log.info("enter amount £50" + enterFifty.toString());
    }



    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Withdraw']")
    WebElement clickWithdraw;

    public void clickOnWithdrawl1(){
        clickOnElement(clickWithdraw);
        log.info("click on withdrawl" + clickWithdraw.toString());
    }


    @CacheLookup
    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement vTransactionSuccessful;

    public String verifyTextTransactionSuccessful(){
        log.info("verify transaction successfully" + vTransactionSuccessful.toString());
        return getTextFromElement(vTransactionSuccessful);

    }




















}
