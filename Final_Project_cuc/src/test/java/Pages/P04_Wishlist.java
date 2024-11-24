package Pages;

import StepDefinitions.T02_Login;
import StepDefinitions.T03_LandingPage;
import StepDefinitions.T04_Wishlist;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P04_Wishlist {
//    public WebElement getHotSellers() {
//        return T04_Wishlist.driver.findElement(By.cssSelector(".block.block-products-list"));
//    }
    public WebElement getHotSellers() {
        return T04_Wishlist.driver.findElement(By.cssSelector(".block.block-products-list"));
    }
    public WebElement ClickSignIn() {
        return T04_Wishlist.driver.findElement(By.xpath("//a[contains(@href, 'customer/account/login')]"));
       // return T04_Wishlist.driver.findElement(By.linkText("Sign In"));
    }

    public WebElement getProductCard(int index) {
        List<WebElement> productCards = T04_Wishlist.driver.findElements(By.cssSelector(".product-item"));
        return productCards.get(index);  // Return the product card at the specified index
    }
    public WebElement getAddToWishlistButton() {
        return T04_Wishlist.driver.findElement(By.cssSelector(".product-item .action.towishlist"));  // Assuming a single button
    }
    //another locator By.xpath("//a[@title='Add to Wish List' and @data-action='add-to-wishlist']")


    public WebElement enterEmailfield() {
        return T04_Wishlist.driver.findElement(By.id("email"));
    }
    public WebElement enterpasswordfield() {
        return T04_Wishlist.driver.findElement(By.id("pass"));
    }
    public WebElement enterSigninbtn() {
        return T04_Wishlist.driver.findElement(By.id("send2"));
    }
    public WebElement getmainpage(){
        return T04_Wishlist.driver.findElement(By.cssSelector("img[src*='logo.svg']"));

    }
    public WebElement goHotSellers() {
        return T04_Wishlist.driver.findElement(By.xpath("//h2[text()='Hot Sellers']"));
    }
    public WebElement ProductCard(int index) {
        List<WebElement> productCards = T04_Wishlist.driver.findElements(By.cssSelector(".product-item"));
        return productCards.get(index);  // Return the product card at the specified index
    }

    // Get the "Add to Wishlist" button from the product card

//    public WebElement () {
//        return T04_Wishlist.driver.findElement(By.cssSelector("img.product-image-photo[alt='Radiant Tee']"));
//    }
    public WebElement AddTOWishlists(){
        return T04_Wishlist.driver.findElement(By.cssSelector(".product-item .action.towishlist"));  // Assuming a single button

       // return T04_Wishlist.driver.findElement(By.xpath("//img[@alt='']"));
    }


    // Get a specific product card based on the index


    // Get the "Add to Wishlist" button from the product card

}
