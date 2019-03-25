import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClass {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
        driver.findElement(By.id("user_login")).sendKeys("opensourcecms");
        driver.findElement(By.id("user_pass")).sendKeys("opensourcecms");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        Assert.assertEquals("Howdy, opensourcecms",driver.findElement(By.id("wp-admin-bar-my-account")).getText());
        driver.quit();
    }
}

