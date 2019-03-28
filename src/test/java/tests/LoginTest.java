package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.BaseClass;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseClass {
    HomePage homePageObject;
    LoginPage loginPageObject;

//    public LoginTest() {
//        super();
//    }


    @Before
    public void initialize() {
        setUp();
        loginPageObject = new LoginPage();
        homePageObject = new HomePage();
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
