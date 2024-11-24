package StepDefinitions;

import Pages.P01_Register;
import Pages.P02_login;
import Pages.P05_Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class T01_Register {
    public static ChromeDriver driver;
    P01_Register registerPage = new P01_Register();
    P05_Assert Asser = new P05_Assert();

    @Given("user opens the LUMA  page")

    public void user_opens_the_LUMA_page() {
        driver = new ChromeDriver();//open chrome
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");

    }
    @When("users open registration page")

    public void users_open_registration_page (){
        registerPage.selectcreateacc().click();
    }

    @Then("the user should be navigated to the create Account page")
    public void the_user_should_be_navigated_to_the_create_account_page() {
        boolean x1 = Asser.Createaccpage().isDisplayed(); //check that the user is on the create account page
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(x1);
    }

    @When("the user fills in the first name")
    public void the_user_fills_in_the_first_name() {

        registerPage.enterfirstname().sendKeys("Peter");
    }

    @When("the user fills in the last name")
    public void the_user_fills_in_the_last_name() {

        registerPage.enterlasttname().sendKeys("Parker");
    }

    @When("the user fills in the email")
    public void the_user_fills_in_the_email() {

        registerPage.eneteremail().sendKeys("PeterParkker2023@gamail.com");
    }

    @When("the user fills in the password")
    public void the_user_fills_in_the_password() {
        registerPage.enterpassword().sendKeys("Pp123456789");
    }

    @When("the user leaves the confirm password field empty")
    public void the_user_leaves_the_confirm_password_field_empty() {
        registerPage.ConfirmPassword().clear();
    }



    @When("the user clicks on Create an Account")
    public void the_user_clicks_on_create_account() {
        registerPage.clickCreateAccountSubmit().click();
    }



    @Then("the user should see an error message")
    public void the_user_should_see_an_error_message() {

        String errorMsg = Asser.getConfirmPasswordError();
        Assert.assertEquals(errorMsg, "This is a required field.");
    }

    @When("user open registration page")

    public void user_open_registration_page (){
        registerPage.selectcreateacc().click();
    }


    @Then("user should be navigated to the create Account page")
    public void user_should_be_navigated_to_the_create_account_page() {
        boolean x2 = Asser.Createaccpage().isDisplayed();
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(x2);
    }

    @When("user fills in the first name")
    public void user_fills_in_the_first_name() {
        registerPage.enterfirstname().sendKeys("Peter");
    }

    @When("user fills in the last name")
    public void user_fills_in_the_last_name() {
        registerPage.enterlasttname().sendKeys("Parker");
    }

    @When("user fills in the email")
    public void user_fills_in_the_email() {
        registerPage.eneteremail().sendKeys("PeterParkker2023@gamail.com");
    }

    @When("user fills in the password")
    public void user_fills_in_the_password() {
        registerPage.enterpassword().sendKeys("456789");
    }
@When("user fills in the confirm password")
public void  user_fills_in_the_confirm_password(){
        registerPage.ConfirmPassword().sendKeys("Pp123456789");
}
    @When("user clicks on Create an Account")
    public void user_clicks_on_create_account() {
        registerPage.clickCreateAccountSubmit().click();
    }


    @Then("user should see an 2nd error message")
    public void user_should_see_an_2nd_error_message() {

        String errorMsg = Asser.getConfirmPasswordError();
        Assert.assertEquals(errorMsg, "Please enter the same value again.");
    }


//TC_3
    @When("user open the registration page")

    public void user_open_the_registration_page (){
        registerPage.selectcreateacc().click();
    }

    @When("Customer fills in the first name")
    public void Customer_fills_in_the_first_name() {
        registerPage.enterfirstname().sendKeys("Peter");
    }

    @When("Customer fills in the last name")
    public void Customer_fills_in_the_last_name() {
        registerPage.enterlasttname().sendKeys("Parker");
    }

    @When("Customer fills in the email")
    public void Customer_fills_in_the_email() {
        registerPage.eneteremail().sendKeys("PeterPaarkerr2023@gmail.com");
    }

    @When("Customer fills in the password")
    public void Customer_fills_in_the_password() {
        registerPage.enterpassword().sendKeys("Pp123456789");
    }
    @When("Customer fills in the confirm password")
    public void  Customer_fills_in_the_confirm_password(){
        registerPage.ConfirmPassword().sendKeys("Pp123456789");
    }
    @When("Customer clicks on Create an Account")
    public void Customer_clicks_on_create_account() {
        registerPage.clickCreateAccountSubmit().click();
    }
    @Then("Customer should be navigated to the My Account page")
    public void Customer_should_be_navigated_to_the_my_account_page() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        boolean x3 = Asser.MyACCPage().isDisplayed();
//        SoftAssert soft = new SoftAssert();
//        soft.assertTrue(x3, "'My Account' title is not displayed!");
//        soft.assertAll(); // Important to call this to validate all assertions


        String currentUrl = Asser.getcuurenturl();
        Assert.assertEquals(currentUrl, "https://magento.softwaretestingboard.com/customer/account/");
    }



    @Then("Customer contact information should display")
    public void Customer_contact_information_should_display() {
        boolean P1 = registerPage.Contact().getText().contains("Peter Parker");
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(P1);
        boolean P2 = registerPage.Contact().getText().contains("PeterParker2023@gmail.com");
        SoftAssert soft2 = new SoftAssert();
        soft2.assertTrue(P2);
//       String actualFirstname = Asser.getContactFirstName();
//        Assert.assertEquals(actualFirstname,"Peter");
//        String actualLastname = Asser.getContactLastName();
//        Assert.assertEquals(actualLastname,"Parkkers");
//        String actualEmail = Asser.getContactEmail();
//        Assert.assertEquals(actualEmail,"Peteraarkker887032@gmail.com");
    }

}
