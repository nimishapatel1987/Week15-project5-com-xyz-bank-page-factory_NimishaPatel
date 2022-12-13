package com.xyzbank.testsuite;

import com.xyzbank.pages.*;
import com.xyzbank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {
    HomePage homePage = new HomePage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    CustomersPage customersPage = new CustomersPage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    OpenAccountPage openAccountPage = new OpenAccountPage();


    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        bankManagerLoginPage = new BankManagerLoginPage();
        customerLoginPage = new CustomerLoginPage();
        customersPage = new CustomersPage();
        addCustomerPage = new AddCustomerPage();
        openAccountPage = new OpenAccountPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void bankManagerShouldAddCustomerSuccessfully() {

        bankManagerLoginPage.clickOnTab();
        bankManagerLoginPage.clickOnAddCustomerTab();
        bankManagerLoginPage.sendTextToFirstNameField("Pari");
        bankManagerLoginPage.sendTextToLastNameField("Patel");
        bankManagerLoginPage.sendTextToPostCodeField("CB4 3NB");
        bankManagerLoginPage.clickOnButton();
        Assert.assertEquals(bankManagerLoginPage.getTextFromAlert(), "Customer added successfully with customer id :6");
        bankManagerLoginPage.acceptAlertpopupDisplay();
    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully() {
        openAccountPage.clickOnTab();
        openAccountPage.clickOpenAccount();
        openAccountPage.searchCustomer();
        openAccountPage.selectPound();
        openAccountPage.clickProcessButton();
        Assert.assertEquals(openAccountPage.getTextFromAlert(), "Account created successfully with account Number :1016");
        openAccountPage.acceptAlertpopupDisplay();

    }

    @Test(groups = {"smoke", "regression"})
    public void customerShouldLoginAndLogoutSuceessfully() {
        customerLoginPage.clickOnCustomerLoginTab();
        customerLoginPage.searchcustomer1();
        customerLoginPage.clickOnLoginButton();
        // customerLoginPage.getverifyLogoutdisplayed();
        Assert.assertEquals(customerLoginPage.getverifyLogoutdisplayed(), "Logout");
        customerLoginPage.clickOnLogOut();
        //   Assert.assertEquals(customerLoginPage.getTextFromAlert(),"Your Name :");
    }

    @Test(groups = "regression")
    public void customerShouldDepositMoneySuccessfully() {
        customersPage.clickOnCustomerLoginTab();
        customerLoginPage.searchcustomer1();
        customersPage.clickOnLoginButton();
        customersPage.clickOnDepositTab();
        customersPage.enteramount();
        customersPage.clickOnDepositButton();
        customersPage.getverifymessageDepositSuccessful();
        Assert.assertEquals(customersPage.getverifymessageDepositSuccessful(), "Deposit Successful");
    }

    @Test(groups = "regression")
    public void customerShouldWithdrawMoneySuccessfully() {
        openAccountPage.clickOnCustomerLogin();
        openAccountPage.searchcustomer2();
        openAccountPage.clickOnLoginButton();
        openAccountPage.clickOnWithdrawlTab();
        openAccountPage.enteramount50("50");
        openAccountPage.clickOnWithdrawlButtonAfterEnterAmount();
        //  Assert.assertEquals(openAccountPage.getverifyAccountCreatedSuccessfully(),"Transaction successful");


    }

}
