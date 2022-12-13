package com.xyzbank.pages;

import com.xyzbank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class OpenAccountPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//button[@ng-click = 'manager()']")
    WebElement clickOnTab;

    @CacheLookup
    @FindBy(xpath = "//button[@ng-class = 'btnClass2']")
    WebElement clickOpenAccount;

    @CacheLookup
    @FindBy(xpath = "//select[@name = 'userSelect']")
    WebElement searchCustomer;

    @CacheLookup
    @FindBy(xpath = "//select[@name = 'currency']")
    WebElement selectPound;

    @CacheLookup
    @FindBy(xpath = "//button[@type = 'submit']")
    WebElement clickProcessButton;
    @CacheLookup
    @FindBy(xpath = "")
    WebElement verifyAccountCreatedSuccessfully;

    @CacheLookup
    @FindBy(id = "PopUp")
    WebElement acceptAlertpopupDisplay;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement clickOnCustomerLogin;

    @CacheLookup
    @FindBy(xpath = "//select[@name = 'userSelect']")
    WebElement searchcustomer2;

    @CacheLookup
    @FindBy(xpath = "//button[@class = 'btn btn-default']")
    WebElement clickOnLoginButton;


    @CacheLookup
    @FindBy(xpath = "//button[@ng-class = 'btnClass3']")
    WebElement clickOnWithdrawlTab;

    @CacheLookup
    @FindBy(xpath = "//input[@type = 'number']")
    WebElement enteramout50;


    @CacheLookup
    @FindBy(xpath = "//button[@type = 'submit']")
    WebElement clickOnWithdrawlButtonAfterEnterAmount;


    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Transaction successful')]")
    WebElement verifyTransactionsuccessfulMessage;

    public void clickOnTab() {
        Reporter.log("clickOnTab" + clickOnTab.toString());
        clickOnElement(clickOnTab);
    }

    public void clickOpenAccount() {
        Reporter.log("clickOpenAccount" + clickOpenAccount.toString());
        clickOnElement(clickOpenAccount);
    }

    public void searchCustomer() {
        Reporter.log("searchCustomer" + searchCustomer.toString());
        selectByVisibleTextFromDropDown(searchCustomer, "Harry Potter");
    }

    public void selectPound() {
        Reporter.log("selectPound" + selectPound.toString());
        selectByVisibleTextFromDropDown(selectPound, "Pound");
    }

    public void clickProcessButton() {
        Reporter.log("clickProcessButton" + clickProcessButton.toString());
        clickOnElement(clickProcessButton);
    }

    public String getverifyAccountCreatedSuccessfully() {
        Reporter.log("verifyAccountCreatedSuccessfully" + verifyAccountCreatedSuccessfully.toString());
        return getTextFromElement(verifyAccountCreatedSuccessfully);
    }

    public void acceptAlertpopupDisplay() {
        driver.switchTo().alert().accept();
    }

    public void clickOnCustomerLogin() {
        Reporter.log("clickOnCustomerLogin" + clickOnLoginButton.toString());
        clickOnElement(clickOnCustomerLogin);
    }

    public void searchcustomer2() {
        Reporter.log("searchcustomer2" + searchcustomer2.toString());
        selectByVisibleTextFromDropDown(searchcustomer2, "Harry Potter");
    }

    public void clickOnLoginButton() {
        Reporter.log("clickOnLoginButton" + clickOnLoginButton.toString());
        clickOnElement(clickOnLoginButton);
    }

    public void clickOnWithdrawlTab() {
        Reporter.log("clickOnWithdrawlTab" + clickOnWithdrawlTab.toString());
        clickOnElement(clickOnWithdrawlTab);
    }

    public void enteramount50(String amount) {
        Reporter.log("enteramout50" + enteramout50.toString());
        sendTextToElement(enteramout50, "50");
    }

    public void clickOnWithdrawlButtonAfterEnterAmount() {
        Reporter.log("clickOnWithdrawlButtonAfterEnterAmount" + clickOnWithdrawlButtonAfterEnterAmount.toString());
        clickOnElement(clickOnWithdrawlButtonAfterEnterAmount);
    }

    public String getverifyTransactionSuccessfulMessage() {
        Reporter.log("verifyTransactionsuccessfulMessage" + verifyTransactionsuccessfulMessage.toString());
        return getTextFromElement(verifyTransactionsuccessfulMessage);
    }

}
