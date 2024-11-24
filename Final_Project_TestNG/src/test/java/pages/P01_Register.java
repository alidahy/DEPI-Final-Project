package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import testcase.T01_Register;

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

    public WebElement MYACC (){
        return T01_Register.driver.findElement(By.id("page-title-wrapper"));
    }
    //*[@id="maincontent"]/div[2]/div[1]/div[3]/div[2]/div/div[1]
    public WebElement Contact () {
        return  T01_Register.driver.findElement(By.cssSelector(".box-information .box-content "));
    }


}

