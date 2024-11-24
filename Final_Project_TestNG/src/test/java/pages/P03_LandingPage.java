package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import testcase.T02_login;
import testcase.T03_LandingPage;

import java.util.List;

public class P03_LandingPage {

    public WebElement getHotSellers() {
        return T03_LandingPage.driver.findElement(By.cssSelector(".block.block-products-list"));
    }

    public List<WebElement> getProductPrices() {
        return T03_LandingPage.driver.findElements(By.cssSelector(".block-products-list .price"));
    }
//    public WebElement getProductCard(String productName) {
//        return T03_LandingPage.driver.findElement(By.xpath("//a[contains(text(),'" + productName + "')]/ancestor::li"));
//    }
    // Locator for product card in Hot Sellers section
    public WebElement productCard() {
        return T03_LandingPage.driver.findElement(By.cssSelector("img[alt='Breathe-Easy Tank']"));
    }

    public List<WebElement> getAddToCartButtons() {
        return T03_LandingPage.driver.findElements(By.cssSelector(".product-item .action.tocart"));
    }
    // Locator for selecting a size option for a product (Size M)
    public WebElement selectSizeM() {
        return T03_LandingPage.driver.findElement(By.id("option-label-size-143-item-167"));
    }
    // Locator for pressing the Add to Cart button
    public WebElement pressAddToCart() {
        return T03_LandingPage.driver.findElement(By.id("product-addtocart-button"));
                //xpath("//span[text()='Add to Cart']"));

    }

    // Locator for selecting a color option for a product
    public WebElement selectColor() {
        return T03_LandingPage.driver.findElement(By.id("option-label-color-93-item-57"));
    }

    // Get Size option for the product
   // public WebElement getSizeOption() {
     //   return T03_LandingPage.driver.findElement(By.id("option-label-size-143-item-167"));
    //}

    // Get Color option for the product
    //public WebElement getColorOption() {
      //  return T03_LandingPage.driver.findElement(By.id("option-label-color-93-item-57"));
    //}
}

