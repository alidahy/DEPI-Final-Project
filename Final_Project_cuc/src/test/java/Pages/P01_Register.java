package Pages;

import StepDefinitions.T01_Register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_Register {


    public WebElement selectcreateacc() {
        return T01_Register.driver.findElement(By.linkText("Create an Account"));
    }

    public WebElement enterfirstname() {
        return T01_Register.driver.findElement(By.id("firstname"));
    }

    public WebElement enterlasttname() {
        return T01_Register.driver.findElement(By.id("lastname"));
    }
    public WebElement eneteremail() {
        return T01_Register.driver.findElement(By.id("email_address"));
    }

    public WebElement enterpassword() {
        return T01_Register.driver.findElement(By.id("password"));
    }

    public WebElement ConfirmPassword() {
        return T01_Register.driver.findElement(By.id("password-confirmation"));
    }
    // public void enterConfirmPassword(String confirmPassword) {
    //        driver.findElement(confirmPasswordField).sendKeys(confirmPassword);
    //    }
    public WebElement clickCreateAccountSubmit() {
        return T01_Register.driver.findElement(By.cssSelector("button[title='Create an Account']"));
    }
    public WebElement Contact () {
        return  T01_Register.driver.findElement(By.cssSelector(".box-information .box-content "));
    }
}
