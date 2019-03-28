package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
    public static WebDriver driver;

    public static void setUp() {
        driver=new FirefoxDriver();
        driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");

    }
}
