package com.xyzbank.pages;

import com.xyzbank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;


public class BankManagerLoginPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//button[@ng-click = 'manager()']")
    WebElement clickOnTab;


    @CacheLookup
    @FindBy(xpath = "//button[@ng-class = 'btnClass1']")
    WebElement clickOnAddCustomerTab;


    @CacheLookup
    @FindBy(xpath = "//input[@placeholder = 'First Name']")
    WebElement sendTextToFirstName;


    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement sendTextToLastName;


    @CacheLookup
    @FindBy(xpath = "//input[@placeholder = 'Post Code']")
    WebElement sendTextToPostCode;


    @CacheLookup
    @FindBy(xpath = "//button[@type = 'submit']")
    WebElement clickOnButton;


    @CacheLookup
    @FindBy(id = "PopUp")
    WebElement acceptAlertpopupDisplay;

    @CacheLookup
    @FindBy(xpath = "")
    WebElement verifyCustomeraddedSuccessfully;


    public void clickOnTab() {
        Reporter.log("clickOnTab" + clickOnTab.toString());
        clickOnElement(clickOnTab);
    }

    public void clickOnAddCustomerTab() {
        Reporter.log("clickOnAddCustomerTab" + clickOnAddCustomerTab.toString());
        clickOnElement(clickOnAddCustomerTab);
    }

    public void sendTextToFirstNameField(String firstname) {
        Reporter.log("sendTextToFirstName" + sendTextToFirstName.toString());
        sendTextToElement(sendTextToFirstName, firstname);
    }

    public void sendTextToLastNameField(String lastname) {
        Reporter.log("sendTextToLastName" + sendTextToLastName.toString());
        sendTextToElement(sendTextToLastName, lastname);
    }

    public void sendTextToPostCodeField(String postcode) {
        Reporter.log("sendTextToPostCode" + sendTextToPostCode.toString());
        sendTextToElement(sendTextToPostCode, postcode);
    }

    public void clickOnButton() {
        Reporter.log("clickOnButton" + clickOnButton.toString());
        clickOnElement(clickOnButton);
    }

    public String getverifyCustomeraddedSuccessfully() {
        Reporter.log("verifyCustomeraddedSuccessfully" + verifyCustomeraddedSuccessfully.toString());
        return getTextFromElement(verifyCustomeraddedSuccessfully);
    }

    public void acceptAlertpopupDisplay() {
        driver.switchTo().alert().accept();
    }
}
