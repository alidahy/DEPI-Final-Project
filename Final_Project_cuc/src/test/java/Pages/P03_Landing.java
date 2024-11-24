package Pages;

import StepDefinitions.T03_LandingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_Landing {

    public WebElement getHotSellers() {
        return T03_LandingPage.driver.findElement(By.cssSelector(".block.block-products-list"));
    }


    // Locator for product card in Hot Sellers section
    public WebElement productCard() {
        return T03_LandingPage.driver.findElement(By.cssSelector("img[alt='Breathe-Easy Tank']"));
    }

    public List<WebElement> getProductPrices() {
        return T03_LandingPage.driver.findElements(By.cssSelector(".block-products-list .price"));
    }


    // Locator for selecting a size option for a product (Size M)
    public WebElement selectSizeM() {
        return T03_LandingPage.driver.findElement(By.id("option-label-size-143-item-167"));
    }


    // Locator for selecting a color option for a product
    public WebElement selectColor() {
        return T03_LandingPage.driver.findElement(By.id("option-label-color-93-item-57"));
    }

    // Locator for pressing the Add to Cart button
    public WebElement pressAddToCart() {
        return T03_LandingPage.driver.findElement(By.xpath("//span[text()='Add to Cart']"));
    }
}