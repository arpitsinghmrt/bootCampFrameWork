package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pages.BaseClass;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseClass {
    HomePage homePageObject;
    LoginPage loginPageObject;

//    public LoginTest() {
//        PageFactory.initElements(driver,LoginPage.class);
//        PageFactory.initElements(driver,HomePage.class);
//    }


    @Before
    public void initialize() {
        setUp();
        loginPageObject = new LoginPage(driver);
        homePageObject = new HomePage(driver);
    }

    @Test
    public void testLogin() throws InterruptedException {


        loginPageObject.performLogin("opensourcecms", "opensourcecms");
        Assert.assertEquals("Howdy, opensourcecms", homePageObject.getHomePageUserName());
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
