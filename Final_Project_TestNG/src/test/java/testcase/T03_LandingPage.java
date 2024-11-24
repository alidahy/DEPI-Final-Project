package testcase;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P02_login;
import pages.P03_LandingPage;
import pages.P05_Assert;

import java.util.List;

public class T03_LandingPage {
    public static ChromeDriver driver;  // Declaring ChromeDriver as static
    P03_LandingPage landingPage = new P03_LandingPage();
    P05_Assert Check = new P05_Assert();


    @BeforeMethod
    public void setup() {

        driver = new ChromeDriver();  // Initialize ChromeDriver
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
        // Scroll down to Hot Sellers section using moveToElement
//        Actions actions = new Actions(driver);
//        WebElement hotSellersSection = landingPage.getHotSellers();
    }

    @Test
    public void TC1_validateHotSellersSection() {


       // actions.moveToElement(hotSellersSection).perform();  // Scroll to Hot Sellers section

        // Validate Hot Sellers section is displayed

        // Scroll to Hot Sellers section
        Actions actions = new Actions(driver);
        WebElement hotSellersSection = landingPage.getHotSellers();
        actions.moveToElement(hotSellersSection).perform();
        Assert.assertTrue(hotSellersSection.isDisplayed(), "Hot Sellers");


        // Validate each product card displays a price in $
        List<WebElement> productPrices = landingPage.getProductPrices();
        for (WebElement price : productPrices) {
            String priceText = price.getText();
            Assert.assertTrue(priceText.contains("$"), "Each price should contain the $ symbol");
            //Double? ? ?
        }
    }
    @Test
    public void  each_card_should_display_Add_to_Cart_button_and_it_should_be_clickable(){
        Actions actions = new Actions(driver);
        WebElement hotSellersSection = landingPage.getHotSellers();
        actions.moveToElement(hotSellersSection).perform();
    List<WebElement> addButtons = landingPage.getAddToCartButtons();
        Assert.assertFalse(addButtons.isEmpty(), "Add to Cart buttons should be present");
        for (WebElement addButton : addButtons) {
        Assert.assertTrue(addButton.isDisplayed(), "'Add to Cart' button should be visible");
        Assert.assertTrue(addButton.isEnabled(), "'Add to Cart' button should be clickable");
    }
}

    @Test
    public void guest_user_can_add_product_to_cart() {
        Actions actions = new Actions(driver);
        WebElement hotSellersSection = landingPage.getHotSellers();
        actions.moveToElement(hotSellersSection).perform();
        WebElement productCard = landingPage.productCard();
        actions.moveToElement(productCard).perform();
        landingPage.productCard().click();




        //// Select size "M" by index
//WebDriverWait wait = new WebDriverWait(driver, 10);
//WebElement sizeDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("select id of the size dropdown")));
//        sizeDropdown.click();
//WebElement sizeOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='select id of the size dropdown']/option[2]")));
//        sizeOption.click();
        landingPage.selectSizeM().click();  // Select size
        landingPage.selectColor().click();  // Select color

            landingPage.pressAddToCart().click();// Click on Add to Cart
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        boolean t1 = Check.greenflash().isDisplayed();
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(t1);
        WebElement cartCountElement = Check.checkcart();
        String cartCount = cartCountElement.getText();
        Assert.assertEquals(cartCount, "1", "Cart should contain 1 product");
    }





//    @Test
//    public void TC3_validateAddToCartButtonForGuest() {
//
//        // Hover on "Breathe-Easy Tank" product card
//        WebElement productCard = landingPage.getProductCard("Breathe-Easy Tank");
//        actions.moveToElement(productCard).perform();  // Hover on the product card
//
//        // Select Size "M"
//        landingPage.getSizeOption().click();
//
//        // Select Color (assuming first color option is correct)
//        landingPage.getColorOption().click();
//
//        // Click on "Add to Cart" button
//        landingPage.getAddToCartButtons().get(1).click();  // Add the first product to the cart
//
//        // Validate product is added to cart
//        String cartCount = driver.findElement(By.cssSelector(".counter-number")).getText();
//        Assert.assertEquals(cartCount, "1", "Cart should contain 1 product");
//    }

    @AfterMethod
    public void tearDown() {
        driver.quit();  // Close the browser after each test
    }
}
