package StepDefinitions;

import Pages.P02_login;
import Pages.P05_Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class T02_Login {
    public static ChromeDriver driver;
    P02_login loginPage = new P02_login();
    P05_Assert Asser = new P05_Assert();


    @Given("user open the login page")
    public void user_open_the_login_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
        loginPage.clickSignIn().click();
    }

    @When("user fill in the email")
    public void user_fill_in_the_email() {

        loginPage.enterEmail().sendKeys("PeterParker@gmail.com");
    }

    @When("user fill in the password")
    public void user_fill_in_the_password() {

        loginPage.enterPassword().sendKeys("Pp123456789");
    }

    @When("user click on Sign in")
    public void user_click_on_Sign_in() {

        loginPage.clickLoginButton().click();
    }
    @Then("user should be navigated to home page")
    public void user_should_be_navigated_to_home_page(){

    String currenturl= Asser.getcuurenturl2();
        Assert.assertEquals(currenturl,"https://magento.softwaretestingboard.com/");
    }


    @Then("user should see the welcome message containing his name")
    public void user_should_see_the_welcome_message_containing_his_name() {
        boolean c1 = Asser.getWelcomeMessage().getText().contains("Peter");
        boolean c2 = Asser.getWelcomeMessage().getText().contains("Parker");
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(c1);
        soft.assertTrue(c2);

    }
}
