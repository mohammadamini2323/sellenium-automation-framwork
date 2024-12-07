package tests.amazon;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.amazon.CreateYourAmazonAccount_PF;
import pages.amazon.Dashboard_PF;
import pages.amazon.SignInPage_PF;

import utils.WaitUtils;

public class CreateAmazonAccount extends BaseTest {
    @Test
    public void createAccount() {
        CreateYourAmazonAccount_PF createAmazonAccountPage = new CreateYourAmazonAccount_PF(driver);
        Dashboard_PF dashboardPage = new Dashboard_PF(driver);
        SignInPage_PF signInPage = new SignInPage_PF(driver);
        WaitUtils.applyGlobalWaite();
        WaitUtils.applyGlobalWaite();
        WaitUtils.applyGlobalWaite();

        dashboardPage.clickOnSignInButton();
        WaitUtils.applyGlobalWaite();
        signInPage.clickOnCreateYourAmazonAccount_button();
        WaitUtils.applyGlobalWaite();
        createAmazonAccountPage.enterFullName("ahmad ahmadi");
        createAmazonAccountPage.enterEmailAddressOrPhoneNumber(1234567890);
        createAmazonAccountPage.enterPassword("passcode12");
        createAmazonAccountPage.reEnterPassword("passcode12");
        createAmazonAccountPage.clickOnContinueButton();
        WaitUtils.applyGlobalWaite();



    }
}
