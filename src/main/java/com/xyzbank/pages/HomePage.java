package com.xyzbank.pages;

import com.xyzbank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement bankManagerLogin;

    @CacheLookup
    @FindBy(xpath = "//button[@class = 'btn home']")
    WebElement clickOnTab;


    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customerLogin;

    @CacheLookup
    @FindBy(xpath = "//label[@xpath = '1']")
    WebElement verifyYourNameDisplayed;


    public void clickOnBankMangerLoginButton() {
        Reporter.log("bankManagerLogin" + bankManagerLogin.toString());
        clickOnElement(bankManagerLogin);
    }

    public void clickOnTab() {
        Reporter.log("clickOnTab" + clickOnTab.toString());
        clickOnElement(clickOnTab);
    }

    public void clickOnCustomerLoginButton() {
        Reporter.log("customerLogin" + customerLogin.toString());
        clickOnElement(customerLogin);
    }

    public String getverifyYourNameDisplayed() {
        Reporter.log("verifyYourNameDisplayed" + verifyYourNameDisplayed.toString());
        return getTextFromElement(verifyYourNameDisplayed);
    }
}
