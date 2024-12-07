package pages.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard_PF {
WebDriver driver;
@FindBy(xpath = "//a[@id='nav-link-accountList']")
public WebElement sign_in_button;
public Dashboard_PF(WebDriver driver){
    this.driver=driver;
    PageFactory.initElements(driver,this);
    //this.sign_in_button=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));

}
public void clickOnSignInButton(){
    this.sign_in_button.click();
}
}
