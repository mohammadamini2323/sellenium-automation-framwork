package pages.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage_PF {
    WebDriver driver;
    @FindBy(xpath = "//a[@id='createAccountSubmit']")
   public WebElement createYourAmazonAccount;

    public SignInPage_PF( WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public void clickOnCreateYourAmazonAccount_button(){
        this.createYourAmazonAccount.click();
    }


}
