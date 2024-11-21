package pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleMainPage_PF {
    public WebDriver driver;

    @FindBy(xpath = "//a[text()='Store']")
    public WebElement storeButton;

    @FindBy(xpath = "//a[text()='About']")
    public WebElement aboutButton;

    public GoogleMainPage_PF(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void clickOnAboutButton(){
        this.aboutButton.click();
    }
}