package TestAutomation.tests;

import TestAutomation.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.ConfigUtils;

import java.util.Properties;

public class LoginTests {

    WebDriver driver;
    LoginPage loginPg;

    @BeforeClass
    public void openPage() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:\\WebdriverJava\\chromedriver.exe");
        driver = new ChromeDriver();

        //  getting this from resources (data.properties)
        // driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Properties prop = ConfigUtils.getProps("data");
        driver.get(prop.getProperty("URL"));
        Thread.sleep(2000);
    }

    @Test(description = "Login Test", priority = 1)
    public void login() throws InterruptedException {

        loginPg = new LoginPage(driver);
        loginPg.login();

        // verification for login
        String text = driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
        if (text.contains("Dashboard"))
            System.out.println("Login Successfully");

        // verification for login with Assertion
        Assert.assertEquals(text,"Dashboard");

    } // end of login()

    @Test(description = "Logout Test", priority = 2)
    public void logout() throws InterruptedException {

        loginPg.logout();

        String title = driver.getTitle();
        System.out.println(title);

        // verification for logout
        String url = driver.getCurrentUrl();
        if (url.contains("/login"))
            System.out.println("Logout Successfully");

        // verification for logout with Assertion
        Assert.assertTrue(url.contains("/login"));

    } // end of logout

    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }
} // end of LoginTests Class
