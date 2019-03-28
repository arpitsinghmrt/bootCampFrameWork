package pages;

import org.openqa.selenium.By;

public class HomePage extends BaseClass {


    By homePageUserName = By.id("wp-admin-bar-my-account");


    public String getHomePageUserName()
    {
        return driver.findElement(homePageUserName).getText();
    }
}



