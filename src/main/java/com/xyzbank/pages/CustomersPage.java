package com.xyzbank.pages;

import com.xyzbank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CustomersPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement clickOnCustomerLoginTab;

    /*search customer that you created.
        By searchCustomer3 = By.xpath("//select[@name = 'userSelect']");
        public void searchCustomer3(){
        selectByVisibleTextFromDropDown(searchCustomer3,"Harry Potter");
         }*/
    @CacheLookup
    @FindBy(xpath = "//button[@type = 'submit']")
    WebElement clickOnLoginButton;

    @CacheLookup
    @FindBy(xpath = "//button[@ng-class = 'btnClass2']")
    WebElement clickOnDepositTab;

    @CacheLookup
    @FindBy(xpath = "//input[@type = 'number']")
    WebElement enteramount;

    @CacheLookup
    @FindBy(xpath = "//button[@type = 'submit']")
    WebElement clickOnDepositButton;


    @CacheLookup
    @FindBy(xpath = "//span[@class = 'error ng-binding']")
    WebElement verifymessageDepositSuccessful;


    public void clickOnCustomerLoginTab() {
        Reporter.log("clickOnCustomerLoginTab" + clickOnCustomerLoginTab.toString());
        getTextFromElement(clickOnCustomerLoginTab);
    }

    public void clickOnLoginButton() {
        Reporter.log("clickOnLoginButton" + clickOnLoginButton.toString());
        clickOnElement(clickOnLoginButton);
    }

    public void clickOnDepositTab() {
        Reporter.log("clickOnDepositTab" + clickOnDepositTab.toString());
        clickOnElement(clickOnDepositTab);
    }

    public void enteramount() {
        Reporter.log("enteramount" + enteramount.toString());
        sendTextToElement(enteramount, "100");
    }

    public void clickOnDepositButton() {
        Reporter.log("clickOnDepositButton" + clickOnDepositButton.toString());
        clickOnElement(clickOnDepositButton);
    }

    public String getverifymessageDepositSuccessful() {
        Reporter.log("verifymessageDepositSuccessful" + verifymessageDepositSuccessful.toString());
        return getTextFromElement(verifymessageDepositSuccessful);
    }

}
