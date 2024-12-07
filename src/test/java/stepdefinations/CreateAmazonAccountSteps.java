package stepdefinations;

import base.BaseTest;
import config.ConfigManager;
import enums.WaitStrategy;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.opentelemetry.internal.shaded.jctools.queues.MessagePassingQueue;
import org.apache.logging.log4j.core.async.JCToolsBlockingQueueFactory;
import org.junit.After;
import org.junit.Assert;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.amazon.CreateYourAmazonAccount_PF;
import pages.amazon.Dashboard_PF;
import pages.amazon.SignInPage_PF;
import utils.WaitUtils;

import java.time.Duration;

public class CreateAmazonAccountSteps extends BaseTest {

    SignInPage_PF signInPagePf;
    Dashboard_PF dashboardPf;
    CreateYourAmazonAccount_PF createYourAmazonAccountPf;
    WebDriverWait wait;
    @Before
    public void driverSetup(){
        setup();
       this.createYourAmazonAccountPf=new CreateYourAmazonAccount_PF(driver);
        this.dashboardPf=new Dashboard_PF(driver);
        this.signInPagePf=new SignInPage_PF(driver);
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    @Given( "user is on amazon web page")
    public void user_is_on_amazon_web_page(){
    }

    @When("user clicks on sign in button")

    public void user_clicks_on_sign_in_button(){

        WaitUtils.applyWait(dashboardPf.sign_in_button,driver,WaitStrategy.CLICKABLE);
        dashboardPf.clickOnSignInButton();
    }

    @Then("user should be navigated to sign in page")
    public void is_equal(){
        Assert.assertEquals("faild","https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0",driver.getCurrentUrl());


    }
    @Then("user clicks on create your amazon account button")
    public void user_clicks_on_create_your_amazon_account_button(){
        WaitUtils.applyWait(signInPagePf.createYourAmazonAccount,driver,WaitStrategy.CLICKABLE);
        signInPagePf.clickOnCreateYourAmazonAccount_button();
    }
//    @Then("user should be navigated to create account page")
//    public void user_should_be_navigated_to_create_account_page(){
//        Assert.assertEquals("failed","https://www.amazon.com/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&prevRID=3C8GS2MA4XBNW1ZS8RWB&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=usflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0",driver.getCurrentUrl());
//       // wait.until(ExpectedConditions.urlToBe("https://www.amazon.com/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&prevRID=C8N4DQ13FR2DN5Y33MMB&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=usflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0"));
//    }
    @When("user enters Ahmad ahmadi as a value in your name field")
    public  void user_enters_Ahmad_ahmadi_as_a_value_in_your_name_field(){
        WaitUtils.applyWait(createYourAmazonAccountPf.fullName,driver,WaitStrategy.VISIBLE);
        createYourAmazonAccountPf.enterFullName("Ahmad ahmadi");
    }
    @And("enters 1234567890 as value in mobil number or email field")
    public  void user_enters_1234567890_as_a_value_in_your_name_field(){
        createYourAmazonAccountPf.enterEmailAddressOrPhoneNumber(1234567890);
    }
    @And("enters passcode12 as value in password field")
    public void user_enters_passcode12_as_value_in_password_field(){
        createYourAmazonAccountPf.enterPassword("passcode12");
    }
    @And("enters passcode12 as value in re_enter password field")
    public void user_enters_passcode12_as_value_in_re_enter_password_field(){
        createYourAmazonAccountPf.reEnterPassword("passcode12");
    }
    @Then("clicks on verify email button")
    public void user_clicks_on_verify_email_button(){
        createYourAmazonAccountPf.clickOnContinueButton();
        WaitUtils.applyGlobalWaite();
    }
    @After
    public void driverTearDown(){
        tearDown();
    }


}
