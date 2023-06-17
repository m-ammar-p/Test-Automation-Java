package TestAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigUtils;

import java.util.Properties;

public class main {
    public static void main (String[] arg) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\WebdriverJava\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //  getting this from resources (data.properties)
        // driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Properties prop = ConfigUtils.getProps("data");
        driver.get(prop.getProperty("URL"));
        Thread.sleep(2000);


        LoginPage loginPg = new LoginPage(driver);
        loginPg.login();

        // verification for login
        String text = driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
        if (text.contains("Dashboard"))
            System.out.println("Login Successfully");


        loginPg.logout();

        String title = driver.getTitle();
        System.out.println(title);

        // verification for logout
        String url = driver.getCurrentUrl();
        if(url.contains("/login"))
            System.out.println("Logout Successfully");

        driver.quit();

    }
}
