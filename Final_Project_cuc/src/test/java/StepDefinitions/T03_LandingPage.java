package StepDefinitions;

import Pages.P03_Landing;
import Pages.P05_Assert;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class T03_LandingPage {
    public static ChromeDriver driver;  // Static driver to use across methods
    P03_Landing landingPage = new P03_Landing();
    P05_Assert Check = new P05_Assert();
    Actions action;

    @Given("user opens the main page")
    public void user_opens_the_main_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
        action = new Actions(driver);
    }

    @When("scroll down to the Hot Sellers section")
    public void scroll_to_the_Hot_sellers_section() {
        WebElement hotSellersSection = landingPage.getHotSellers();
        action.moveToElement(hotSellersSection).perform();
              Assert.assertTrue(hotSellersSection.isDisplayed(), "Hot Sellers");



    }

    @Then("each card should display price")
   public void each_card_should_display_price() {
        Actions actions = new Actions(driver);
        WebElement hotSellersSection = landingPage.getHotSellers();
        actions.moveToElement(hotSellersSection).perform();
        // Validate each product card displays a price in $


        // Validate each product card displays a price in $
        List<WebElement> productPrices = landingPage.getProductPrices();
        for (WebElement price : productPrices) {
            String priceText = price.getText();
            Assert.assertTrue(priceText.contains("$"), "Each price should contain the $ symbol");
        }


        // Report all assertion results

    }

//    @Then("each card should display price")
//    public void each_card_should_display_price() {
//        for (int i =0; i <6;i++){
//      boolean b1= Check.prdprices().get(i).getText().contains("$");
//            SoftAssert soft = new SoftAssert();
//
//            soft.assertTrue(b1);
//        soft.assertAll();
//       }
//       }

    @Then("Each card should display price as Double not integer")
    public void Each_card_should_display_price_as_Double_not_integer() {
        List<WebElement> productPrices2 = landingPage.getProductPrices();
        for (WebElement price2 : productPrices2) {
            String priceText = price2.getText();
            Assert.assertTrue(priceText.contains("."), "Each price should contain the .");
        }
//        List<WebElement> prices = Check.prdprices();
//        for (WebElement priceElement : prices) {
//            String priceText = priceElement.getText();
//            double priceValue = Double.parseDouble(priceText);
//            SoftAssert soft = new SoftAssert();
//            Assert.assertTrue(priceValue % 1 != 0, "Price should be a double value, not an integer");
//            soft.assertAll();
//        }


    }

//
//            // Remove the dollar sign for numerical validation
//            String numericPrice = priceText.replace("$", "").trim();
//
//            try {
//                double priceValue = Double.parseDouble(numericPrice);
//
//                // Check if the value is a double (i.e., not a whole number)
//                Assert.assertTrue(priceValue % 1 != 0,
//                        "Price should be a double value, not an integer: " + priceValue);
//            } catch (NumberFormatException e) {
//                Assert.fail("Failed to parse price as double: " + numericPrice);
//            }
//        }
//    }


    @Then("each card should display Add to Cart button and it should be clickable")
    public void each_card_should_display_Add_to_Cart_button_and_it_should_be_clickable() {
        List<WebElement> addButtons = Check.addToCartButtons();
        Assert.assertFalse(addButtons.isEmpty(), "Add to Cart buttons should be present");
        for (WebElement addButton : addButtons) {
            Assert.assertTrue(addButton.isDisplayed(), "'Add to Cart' button should be visible");
            Assert.assertTrue(addButton.isEnabled(), "'Add to Cart' button should be clickable");
        }
    }






    //// Select size "M" by index
//WebDriverWait wait = new WebDriverWait(driver, 10);
//WebElement sizeDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("select id of the size dropdown")));
//        sizeDropdown.click();
//WebElement sizeOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='select id of the size dropdown']/option[2]")));
//        sizeOption.click();






@When("user hovers on Card")
    public void user_hovers_on_card() {

        WebElement productCard = landingPage.productCard();
        action.moveToElement(productCard).perform();
        landingPage.productCard().click();
    }

    @When("user selects size and color")
    public void user_selects_size_and_color() {
        //// Select size "M" by index
//WebDriverWait wait = new WebDriverWait(driver, 10);
//WebElement sizeDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("select id of the size dropdown")));
//        sizeDropdown.click();
//WebElement sizeOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='select id of the size dropdown']/option[2]")));
//        sizeOption.click();
        landingPage.selectSizeM().click();  // Select size
        landingPage.selectColor().click();  // Select color


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    @When("user clicks on Add to Cart button")
    public void user_clicks_on_Add_to_Cart_button() {
        landingPage.pressAddToCart().click();  // Click on Add to Cart
    }

    @Then("product should be added to cart successfully")
    public void product_should_be_added_to_cart_successfully() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        boolean t1 = Check.greenflash().isDisplayed();
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(t1);
//        WebElement cartCountElement = Check.checkcart();
//        String cartCount = cartCountElement.getText();
//        Assert.assertEquals(cartCount, "1", "Cart should contain 1 product");


    }


    @Then("cart icon should display number")
    public void cart_icon_should_display_number() {
        WebElement cartCountElement = Check.checkcart();
        String cartCount = cartCountElement.getText();
        Assert.assertEquals(cartCount, "1", "Cart should contain 1 product");
    }
}
    //---------------------------------
//



//--------------------------
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement cartCountElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("counter-number")));
//    String cartCountText = cartCountElement.getText();
//
//    // Print out the cart count
//        System.out.println("Cart count: " + cartCountText);
//
//    // Verify that the cart count equals 1
//    int cartCount = Integer.parseInt(cartCountText.trim());
//        if (cartCount == 1) {
//        System.out.println("Cart count is correct!");
//    } else {
//        System.out.println("Cart count is incorrect!");
//    }


//public class Main {
//    public static void main(String[] args) {
//        // Set the path to your ChromeDriver
//        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
//        WebDriver driver = new ChromeDriver();
//
////        // Navigate to the w
//ebsite
//        driver.get("https://magento.softwaretestingboard.com");
//
//// Find the product "Breathe-Easy Tank"
//WebElement product = driver.findElement(By.linkText("Breathe-Easy Tank"));
//        product.click();
//

//
//// Select color "Yellow" by index
//WebElement colorDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("select id of the color dropdown")));
//        colorDropdown.click();
//WebElement colorOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='select id of the color dropdown']/option[3]")));
//        colorOption.click();
//
//// Add the item to the cart
//WebElement addToCart = wait.until(ExpectedConditions.elementToBeClickable(By.id("product-addtocart-button")));
//        addToCart.click();
//
//// Close the WebDriver
//        driver.quit();
//    }
//            }