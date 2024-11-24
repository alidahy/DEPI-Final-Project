package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import testcase.T01_Register;
import testcase.T02_login;
import testcase.T03_LandingPage;
import testcase.T04_Wishlist;

import java.util.List;


public class P05_Assert {


    public WebElement Createaccpage() {
        return T01_Register.driver.findElement(By.className("base"));
    }

    public String getConfirmPasswordError() {
        return T01_Register.driver.findElement(By.id("password-confirmation-error")).getText();
    }
    public String getcuurenturl() {
        return T01_Register.driver.getCurrentUrl();
    }
    public String getContactFirstName() {
        return T01_Register.driver.findElement(By.cssSelector(".box-information .customer-name .firstname")).getText();
    }
    public String getContactLastName() {
        return T01_Register.driver.findElement(By.cssSelector(".box-information .customer-name .lastname")).getText();
    }
    public String getContactEmail() {
        return T01_Register.driver.findElement(By.cssSelector(".box-information .email")).getText();
    }

    public String getcuurenturl2() {
        return T02_login.driver.getCurrentUrl();
    }
    public WebElement welcomemsg() {
        return T02_login.driver.findElement(By.xpath("//span[@class='logged-in']"));
    }

//    public List<WebElement> prdprices() {
//        return (List<WebElement>) T03_LandingPage.driver.findElement(By.cssSelector(".product-item .price"));
//    }
//    public WebElement addtocart() {
//        return T03_LandingPage.driver.findElement(By.cssSelector(".product-item .action.tocart"));
//    }
    public WebElement greenflash(){
        return T03_LandingPage.driver.findElement(By.xpath("//div[contains(text(), 'You added Breathe-Easy Tank to your')]"));


    }
    public WebElement checkcart() {

        return T03_LandingPage.driver.findElement(By.className("counter-number"));
    }
//   public WebElement getConfirmPasswordError() {
//       return T01_Register.driver.findElement(By.id("password-confirmation-error"));
//    }
    public WebElement checkitem() {

        return T04_Wishlist.driver.findElement(By.xpath("//div[contains(text(), 'Radiant Tee has been added to your Wish List')]"));

    }

}
