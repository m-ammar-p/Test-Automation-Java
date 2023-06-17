package pomJava.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasePage {

    public static WebDriver driver;

    public static void SeleniumInit()
    {
        System.setProperty("webdriver.chrome.driver", "F:\\WebdriverJava\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);

    } // SeleniumInit

    public static void SeleniumQuit()
    {
        driver.quit();
    }
} // End of BasePage
