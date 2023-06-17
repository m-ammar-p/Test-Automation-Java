package pomJava.PageClass;

import pomJava.BaseClass.BasePage;
import org.openqa.selenium.By;
public class LoginPage extends BasePage {

    By loc_username = By.name("username");
    By loc_password = By.name("password");
    By loc_btnLogin = By.cssSelector("button[type='submit']");


    public void Login(String url, String username, String password) throws InterruptedException {

        driver.get(url);

        Thread.sleep(2000);

        driver.findElement(loc_username).sendKeys(username);
        driver.findElement(loc_password).sendKeys(password);
        driver.findElement(loc_btnLogin).click();

        Thread.sleep(3000);
    } // Login

} // End of LoginPage
