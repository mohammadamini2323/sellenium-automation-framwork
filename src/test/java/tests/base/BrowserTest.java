package tests.base;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.home.GoogleMainPage;
import pages.home.GoogleMainPage_PF;
import utils.WaitUtils;

import static enums.WaitStrategy.CLICKABLE;

public class BrowserTest extends BaseTest {

    @Test
    public void myBrowserTest() {

        String expectedUrl = "https://www.google.com/";
        String actualUrl = driver.getCurrentUrl();
        WaitUtils.applyGlobalWaite();

        logger.info("Verifying that the browser is opened and we are navigating to correct URL.");

        Assert.assertEquals(actualUrl, expectedUrl, "Failed");
    }
    @Test
    public void myBrowserTestTow() {
        //GoogleMainPage googleMainPage=new GoogleMainPage(driver);
        GoogleMainPage_PF googleMainPage_pf=new GoogleMainPage_PF(driver);


        String expectedUrl = "https://www.google.com/";
        String actualUrl = driver.getCurrentUrl();
        WaitUtils.applyGlobalWaite();
        WebElement button=driver.findElement(By.xpath("//a[text()='About']"));
        WaitUtils.applyWait(button,driver,CLICKABLE);
        button.click();

        logger.info("Verifying that the browser is opened and we are navigating to correct URL.");

       Assert.assertEquals(actualUrl, expectedUrl, "Failed");
    }



}