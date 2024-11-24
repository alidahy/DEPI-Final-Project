package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import testcase.T02_login;
import testcase.T04_Wishlist;

import java.util.List;

public class P04_Wishlist {
    public WebElement trysignin() {
        return T04_Wishlist.driver.findElement(By.xpath("//a[contains(@href, 'customer/account/login')]"));
    }

    public WebElement enterEmailfield() {
        return T04_Wishlist.driver.findElement(By.id("email"));
    }
    public WebElement enterpasswordfield() {
        return T04_Wishlist.driver.findElement(By.id("pass"));
    }
    public WebElement enterSigninbtn() {
        return T04_Wishlist.driver.findElement(By.id("send2"));
    }
    public WebElement getHotSellers() {
        return T04_Wishlist.driver.findElement(By.cssSelector(".block.block-products-list"));
    }

    // Get a specific product card based on the index
    public WebElement getProductCard(int index) {
        List<WebElement> productCards = T04_Wishlist.driver.findElements(By.cssSelector(".product-item"));
        return productCards.get(index);  // Return the product card at the specified index
    }

    // Get the "Add to Wishlist" button from the product card
    public WebElement getAddToWishlistButton() {
        return T04_Wishlist.driver.findElement(By.cssSelector(".product-item .action.towishlist"));  // Assuming a single button
    }
}
