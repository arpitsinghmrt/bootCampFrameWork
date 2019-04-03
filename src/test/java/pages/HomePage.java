package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver _driver;
    @FindBy(id = "wp-admin-bar-my-account")
    WebElement homePageUserName;

    public HomePage(WebDriver driver) {
        this._driver = driver;
        PageFactory.initElements(driver, this);

    }


    public String getHomePageUserName() {
        return homePageUserName.getText();
    }

}



