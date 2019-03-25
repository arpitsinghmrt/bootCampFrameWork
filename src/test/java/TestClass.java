import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClass {
    WebDriver driver;

    @Before
    public void setUp()
    {
        driver = new FirefoxDriver();

    }

    @Test
    public void testLogin()
    {
        driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
        driver.findElement(By.id("user_login")).sendKeys("opensourcecms");
        driver.findElement(By.id("user_pass")).sendKeys("opensourcecms");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        Assert.assertEquals("Howdy, opensourcecms",driver.findElement(By.id("wp-admin-bar-my-account")).getText());
    }

    @After
    public void tearDown()
    {
        driver.quit();
    }

}

