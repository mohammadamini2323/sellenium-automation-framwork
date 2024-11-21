package tests.facebook;

import base.BaseTest;
import config.ConfigManager;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.facebook.FacebookLoginPage_PF;
import utils.WaitUtils;


@Test
public class FacebookMainTest extends BaseTest {
    public void enterEmailAndPassword() {
        FacebookLoginPage_PF facebookLoginPagePf = new FacebookLoginPage_PF(driver);
        String expectedUrl="https://www.facebook.com/";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl," you did not navigate to correct url");


        facebookLoginPagePf.enterEmailAddress("emailmy123@gmail.com");
        WaitUtils.applyGlobalWaite();
        facebookLoginPagePf.enterPassword("mypass@12345");
        WaitUtils.applyGlobalWaite();
        facebookLoginPagePf.clickOnLoginButton();
        WaitUtils.applyGlobalWaite();


    }

}
