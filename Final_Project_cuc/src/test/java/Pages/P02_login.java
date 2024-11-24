package Pages;

import StepDefinitions.T02_Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {
    public WebElement clickSignIn() {
        return T02_Login.driver.findElement(By.linkText("Sign In"));
        //return T02_Login.driver.findElement(By.xpath("//a[@href='https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/' and text()='Sign In']"));
    }

    public WebElement enterEmail() {
        return T02_Login.driver.findElement(By.id("email"));
    }
    public WebElement enterPassword() {
        return T02_Login.driver.findElement(By.id("pass"));
    }
    public WebElement clickLoginButton() {
        return T02_Login.driver.findElement(By.id("send2"));
    }
//    public void clickSignIn() {
//        T02_Login.driver.findElement(By.linkText("Sign In")).click();
//    }
//
//    public void enterEmail() {
//        T02_Login.driver.findElement(By.id("email"));
//    }
//
//    public void enterPassword() {
//        T02_Login.driver.findElement(By.id("pass"));
//    }
//
//    public void clickLoginButton() {
//        T02_Login.driver.findElement(By.cssSelector("button[type='submit']"));
//    }
//
//    public WebElement getWelcomeMessage() {
//        return T02_Login.driver.findElement(By.cssSelector(".welcome-msg"));
//    }
}

