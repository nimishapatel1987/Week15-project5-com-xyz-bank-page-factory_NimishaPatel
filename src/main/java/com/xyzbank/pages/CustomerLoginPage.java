package com.xyzbank.pages;

import com.xyzbank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CustomerLoginPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//button[@ng-click = 'customer()']")
    WebElement clickOnCustomerLoginTab;


    @CacheLookup
    @FindBy(xpath = "//select[@name = 'userSelect']")
    WebElement searchcustomer1;


    @CacheLookup
    @FindBy(xpath = "//button[@type = 'submit']")
    WebElement clickOnLoginButton;


    @CacheLookup
    @FindBy(xpath = "//button[@class = 'btn logout']")
    WebElement verifyLogoutTabdisplayed;


    @CacheLookup
    @FindBy(xpath = "//button[@class = 'btn logout']")
    WebElement clickOnLogout;


    @CacheLookup
    @FindBy(xpath = "//label[@xpath = '1']")
    WebElement verifyYourNameDisplayed;


    public void clickOnCustomerLoginTab() {
        Reporter.log("clickOnCustomerLoginTab" + clickOnCustomerLoginTab.toString());
        clickOnElement(clickOnCustomerLoginTab);
    }

    public void searchcustomer1() {
        Reporter.log("searchcustomer1" + searchcustomer1.toString());
        selectByVisibleTextFromDropDown(searchcustomer1, "Harry Potter");
    }

    public void clickOnLoginButton() {
        Reporter.log("clickOnLoginButton" + clickOnLoginButton.toString());
        clickOnElement(clickOnLoginButton);
    }

    public String getverifyLogoutdisplayed() {
        Reporter.log("verifyLogoutTabdisplayed" + verifyLogoutTabdisplayed);
        return getTextFromElement(verifyLogoutTabdisplayed);
    }

    public void clickOnLogOut() {
        Reporter.log("clickOnLogout" + clickOnLogout);
        clickOnElement(clickOnLogout);
    }

    public String getverifyYourNameDisplayed() {
        Reporter.log("verifyYourNameDisplayed" + verifyYourNameDisplayed);
        return getTextFromElement(verifyYourNameDisplayed);
    }


}
