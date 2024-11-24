package Pages;

import StepDefinitions.T01_Register;
import StepDefinitions.T02_Login;
import StepDefinitions.T03_LandingPage;
import StepDefinitions.T04_Wishlist;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
    // Correct these locators if needed
    public String getContactFirstName() {
        return T01_Register.driver.findElement(By.cssSelector(".box-information .box-content .firstname")).getText();
    }
    public String getContactLastName() {
        return T01_Register.driver.findElement(By.cssSelector(".box-information .box-content .lastname")).getText();
    }
    public String getContactEmail() {
        return T01_Register.driver.findElement(By.cssSelector(".box-information .email")).getText();
    }

    //        public String getContactFirstName() {
//            return T01_Register.driver.findElement(By.cssSelector(".box-information .customer-name .firstname")).getText();
//        }
//        public String getContactLastName() {
//            return T01_Register.driver.findElement(By.cssSelector(".box-information .customer-name .lastname")).getText();
//        }
//        public String getContactEmail() {
//            return T01_Register.driver.findElement(By.cssSelector(".box-information .email")).getText();
//        }
        public WebElement MyACCPage(){
//            xpath("//span[@class='base' and @data-ui-id='page-title-wrapper' and text()='My Account']"));
            return T01_Register.driver.findElement(By.xpath("//div[@data-bind=\"html: $parent.prepareMessageForHtml(message.text)\" and text()='Thank you for registering with Main Website Store.']"));
            //div[@data-bind="html: $parent.prepareMessageForHtml(message.text)" and text()='Thank you for registering with Main Website Store.']
            ////span[@class='base' and @data-ui-id='page-title-wrapper' and text()='My Account']


        }

        public String getcuurenturl2() {
            return T02_Login.driver.getCurrentUrl();
        }
        public WebElement getWelcomeMessage() {

            return T02_Login.driver.findElement(By.xpath("//span[@class='logged-in']"));
            // return T02_Login.driver.findElement(By.cssSelector(".welcome-msg"));
        }


    public List<WebElement> prdprices() {
        return T03_LandingPage.driver.findElements(By.className("price-final_price"));
    }

    public List<WebElement> addToCartButtons() {
        return T03_LandingPage.driver.findElements(By.cssSelector(".product-item .action.tocart"));
    }


//     public WebElement greenflash(){
//            return T03_LandingPage.driver.findElement(By.className("product-view"));
//        }
    public WebElement greenflash(){
        return T03_LandingPage.driver.findElement(By.xpath("//div[contains(text(), 'You added Breathe-Easy Tank to your')]"));


    }
    public WebElement checkcart() {

        return T03_LandingPage.driver.findElement(By.className("counter-number"));
    }

//    public WebElement checkcart() {
//
//        return T03_LandingPage.driver.findElement(By.className("counter-number"));
//    }

    // This method locates the "Add to Wishlist" button on the product cards
//    public List<WebElement> addToWishlist() {
//        return T03_LandingPage.driver.findElements(By.cssSelector(".product-item .action.towishlist"));
//    }

    // This method locates the cart icon that shows the number of items in the cart
//    public WebElement cartIcon() {
//        return T03_LandingPage.driver.findElement(By.cssSelector(".action.showcart .count"));
//    }

    // This method locates the confirmation message after adding a product to the cart
//    public WebElement confirmationMessage() {
//        return T03_LandingPage.driver.findElement(By.cssSelector(".message-success"));
//    }


//        public List<WebElement> prdprices() {
//            return (List<WebElement>) T03_LandingPage.driver.findElement(By.cssSelector(".product-item .price"));
//        }
//        public WebElement addtocart() {
//            return T03_LandingPage.driver.findElement(By.cssSelector(".product-item .action.tocart"));
//        }
//   public WebElement getConfirmPasswordError() {
//       return T01_Register.driver.findElement(By.id("password-confirmation-error"));
//    }
    // This method locates the product card elements in the Hot Sellers section
//    public List<WebElement> prdcrds() {
//        return T03_LandingPage.driver.findElements(By.cssSelector(".block-products-list .product-item"));
//    }

    // This method locates the "Add to Cart" buttons on the product cards
public String getCurrentUrl() {
    return T04_Wishlist.driver.getCurrentUrl();
}
    public WebElement Getwishlistpage(){
        return T04_Wishlist.driver.findElement(By.xpath("//span[text()='My Wish List']"));
    }
public WebElement wishlistcheck(){
            return T04_Wishlist.driver.findElement(By.xpath("//img[@alt='Radiant Tee']"));

}
    public WebElement checkitem() {

        return T04_Wishlist.driver.findElement(By.xpath("//div[contains(text(), 'Radiant Tee has been added to your Wish List')]"));

    }


    }


