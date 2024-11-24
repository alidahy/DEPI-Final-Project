package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import testcase.T01_Register;
import testcase.T02_login;

public class P02_login {
    public WebElement selectsignin() {
        return T02_login.driver.findElement(By.linkText("Sign In"));
    }

    public WebElement Emailfield() {
        return T02_login.driver.findElement(By.id("email"));
    }
    public WebElement passwordfield() {
        return T02_login.driver.findElement(By.id("pass"));
    }
    public WebElement Signinbtn() {
        return T02_login.driver.findElement(By.id("send2"));
    }



}
