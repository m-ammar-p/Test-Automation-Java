package pomJava.tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import pomJava.BaseClass.BasePage;
import pomJava.PageClass.LoginPage;

import java.time.Duration;

public class LoginTests extends BasePage{

    @BeforeTest
    public void TestInit(){
        SeleniumInit();
    }// End of TestInit

    @AfterTest
    public void TestCleanUp()
    {
        SeleniumQuit();

    } // End of SeleniumQuit
    @Test
    public void Test_Login_001() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.Login("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login", "Admin", "admin123");

        // Assert
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        By loc_welcome = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6");
        String welcomeText = wait.until(driver -> driver.findElement(loc_welcome).getText());

        Assert.assertEquals(welcomeText,"Dashboard");


    } // Test_Login_001

} // End of LoginTest
