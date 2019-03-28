package pages;

import org.openqa.selenium.By;

public class LoginPage extends BaseClass{

    By userNameTextBox = By.id("user_login");
    By passWordTextBox = By.id("user_pass");
    By loginButton = By.cssSelector("input[type='submit'");


    public void enterUserName (String userName)
    {
        driver.findElement(userNameTextBox).sendKeys(userName);

    }

    public void enterPassword (String password)
    {
        driver.findElement(passWordTextBox).sendKeys(password);

    }

    public void clickLoginButton()
    {
        driver.findElement(loginButton).click();

    }

    public void performLogin(String userName, String password)
    {
        this.enterUserName(userName);
        this.enterPassword(password);
        this.clickLoginButton();
    }
}
