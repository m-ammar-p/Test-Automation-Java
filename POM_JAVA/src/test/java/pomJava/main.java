package pomJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {

    public static void main(String[] arg){

        System.setProperty("webdriver.chrome.driver", "F:\\WebdriverJava\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    } // End of Main

} // End of Main Class

