package testcase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P02_login;
import pages.P04_Wishlist;
import pages.P05_Assert;

public class T04_Wishlist {

    public static ChromeDriver driver;  // Declaring ChromeDriver as static
    P04_Wishlist wishlistPage = new P04_Wishlist();
    P04_Wishlist wlocs = new P04_Wishlist();
    P05_Assert Look = new P05_Assert();


    @BeforeMethod
    public void setup() {

        driver = new ChromeDriver();  // Initialize ChromeDriver
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
    }

    @Test
    public void TC1_validateGuestUserCannotAddToWishlist() {
        // Scroll to Hot Sellers section
        Actions actions = new Actions(driver);
        actions.moveToElement(wishlistPage.getHotSellers()).perform();  // Scroll down to Hot Sellers section

        // Hover on any product card (let's say the first one) and click on "Add to Wishlist"
        WebElement productCard = wishlistPage.getProductCard(0);  // Get the first product card
        actions.moveToElement(productCard).perform();  // Hover on the product card
        wishlistPage.getAddToWishlistButton().click();  // Click on Add to Wishlist

        // Validate user is navigated to the login page
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("customer/account/login"), "User should be redirected to the login page.");
    }

    @Test
    public void TC2_validateLoggedInUserCanAddToWishlist() {
        // Precondition:  the user is already logged in
        wlocs.trysignin().click();
        wlocs.enterEmailfield().sendKeys("davidtorres@gmail.com");
        wlocs.enterpasswordfield().sendKeys("DavidTorres96");
        wlocs.enterSigninbtn().click();

        // Scroll to Hot Sellers section
        Actions actions = new Actions(driver);
        actions.moveToElement(wishlistPage.getHotSellers()).perform();  // Scroll down to Hot Sellers section

        // Hover on any product card (let's say the first one) and click on "Add to Wishlist"
        WebElement productCard = wishlistPage.getProductCard(0);  // Get the first product card
        actions.moveToElement(productCard).perform();  // Hover on the product card
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        wishlistPage.getAddToWishlistButton().click();  // Click on Add to Wishlist

        // Validate user is navigated to My Wishlist page
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("wishlist"), "User should be redirected to My Wishlist page.");
        boolean L1 = Look.checkitem().isDisplayed();
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(L1);

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();  // Close the browser after each test
    }
}

