package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{

    WebDriver _driver;

    @FindBy(id = "user_login")
    WebElement userNameTextBox;

    @FindBy(id = "user_pass")
    WebElement passWordTextBox;

    @FindBy(css = "input[type='submit'")
    WebElement loginButton;

    public LoginPage(WebDriver driver)
    {
        this._driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void enterUserName(String userName) {
        userNameTextBox.sendKeys(userName);

    }

    public void enterPassword(String password) {
        passWordTextBox.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void performLogin(String userName, String password) {
        this.enterUserName(userName);
        this.enterPassword(password);
        this.clickLoginButton();
    }
}
