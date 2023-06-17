package TestAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    By username = new By.ByName("username");
    By loginBtn = new By.ByXPath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");

    By logoutMenu = new By.ByXPath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[2]/ul/li/span");
    By logoutLink = new By.ByLinkText("Logout");
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void login() throws InterruptedException {
        // login
        driver.findElement(username).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(loginBtn).click();
        Thread.sleep(2000);
    } // end of login()

    public void logout() throws InterruptedException {
        driver.findElement(logoutMenu).click();
        Thread.sleep(2000);
        driver.findElement(logoutLink).click();
    } // end of logout()
} // end of LoginPage Class
