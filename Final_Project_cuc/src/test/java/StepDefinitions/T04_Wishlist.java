package StepDefinitions;


import Pages.P04_Wishlist;
import Pages.P05_Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class T04_Wishlist {




    public static ChromeDriver driver;  // Static driver to use across methods
    P04_Wishlist wishlistPage = new P04_Wishlist();
    P05_Assert verify = new P05_Assert();
    Actions action;


    @Given("Guest user open the homepage")
    public void Guest_user_open_the_homepage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
        action = new Actions(driver);

    }

    @When("Guest user scroll down to the Hot Sellers section")
    public void Guest_user_scroll_down_to_the_hot_Sellers_section() {
        WebElement hotSellersSection = wishlistPage.getHotSellers();
        action.moveToElement(hotSellersSection).perform();
        Assert.assertTrue(hotSellersSection.isDisplayed(), "Hot Sellers");
            // Scroll to Hot Sellers section
    }


    @When("Guest user hover over any card")
    public void Guest_user_hover_over_any_card() {
        WebElement productCard = wishlistPage.getProductCard(0);  // Get the first product card

        action.moveToElement(productCard).perform();  // Hover on the product card
    }

    @When("Guest user click on Add to Wishlist")
    public void Guest_user_click_on_Add_to_Wishlist() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        wishlistPage.getAddToWishlistButton().click();  // Click on Add to Wishlist
    }

    @Then("Guest user should be navigated to the login page")
    public void Guest_user_should_be_navigated_to_the_login_page() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("customer/account/login"), "User should be redirected to the login page.");
        //String CurrentUrl= verify.getCurrentUrl();
        //Assert.assertEquals(CurrentUrl,"https://magento.softwaretestingboard.com/");
    }

//   wlocs.trysignin().click();
//        wlocs.enterEmailfield().sendKeys("davidtorres@gmail.com");
//        wlocs.enterpasswordfield().sendKeys("DavidTorres96");
//        wlocs.enterSigninbtn().click();
//
//
@When("Guest user open the SignInPage")
public void Guest_user_open_the_SignInPage() {
        wishlistPage.ClickSignIn().click();

}

    @When("user enter the email")
            public void user_enter_the_email() {
        wishlistPage.enterEmailfield().sendKeys("davidtorres@gmail.com");

    }
    @When("user enter the password")
    public void user_enter_the_password() {
        wishlistPage.enterpasswordfield().sendKeys("DavidTorres96");

    }
    @When("user clicks on Sign in")
    public void user_clicks_on_Sign_in() {
        wishlistPage.enterSigninbtn().click();

    }
//    @When("user should be navigated to main page")
//    public void user_should_be_navigated_to_main_page(){
//        wishlistPage.getmainpage().click();
//
//    }
// Scroll to Hot Sellers section
//    Actions actions = new Actions(driver);
//        actions.moveToElement(wishlistPage.getHotSellers()).perform();  // Scroll down to Hot Sellers section
//
//    // Hover on any product card (let's say the first one) and click on "Add to Wishlist"
//    WebElement productCard = wishlistPage.getProductCard(0);  // Get the first product card
//        actions.moveToElement(productCard).perform();  // Hover on the product card
//
//        wishlistPage.getAddToWishlistButton().click();  // Click on Add to Wishlist
//
//    // Validate user is navigated to My Wishlist page
//    String currentUrl = driver.getCurrentUrl();
//        Assert.assertTrue(currentUrl.contains("wishlist"), "User should be redirected to My Wishlist page.");
//}
    @When("loggedinuser scroll down to the Hot Sellers section")
    public void loggedinuser_scroll_down_to_the_Hot_sellers_section() {

        WebElement scrollhotSellersSection = wishlistPage.goHotSellers();
        action.moveToElement(scrollhotSellersSection).perform();
        // Scroll to Hot Sellers section

    }
    @When("loggedinuser hover over any card")
    public void loggedinuseruser_hovers_over_any_card() {
        WebElement productCard = wishlistPage.ProductCard(0);  //  it locates the correct product

        action.moveToElement(productCard).perform();
        try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
   }
    }

    @When("loggedinuser click on Add to Wishlist")
    public void loggedinuser_click_on_Add_to_Wishlist(){
        wishlistPage.AddTOWishlists().click();
    }
    @Then("loggedinuser should be navigated to the My Wishlist page with the product added")
    public void loggedinuser_should_be_navigated_to_the_My_Wishlist_page_with_the_product_added(){
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("wishlist"), "User should be redirected to My Wishlist page.");
        boolean L1 = verify.checkitem().isDisplayed();
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(L1);
       // verify.Getwishlistpage().isDisplayed();
//        boolean k1 =  verify.wishlistcheck().getText().contains("Radiant");
//        SoftAssert soft = new SoftAssert();
//        soft.assertTrue(k1);

    }



}
