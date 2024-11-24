package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P01_Register;
import pages.P05_Assert;

public class T01_Register {

    P01_Register Hlocs = new P01_Register();
    P05_Assert Asser = new P05_Assert();


    public static ChromeDriver driver;


    @BeforeMethod
    void setup() {
        driver = new ChromeDriver(); // open browser
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
    }

    @Test
    public void TC1_Validate_EmptyConfirmPassword() {


        Hlocs.selectcreateacc().click();
        Hlocs.enterfirstname().sendKeys("Peter");
        Hlocs.enterlasttname().sendKeys("Parker");
        Hlocs.eneteremail().sendKeys("PeterParker@gmail.com");
        Hlocs.enterpassword().sendKeys("Pp123456789");
        Hlocs.ConfirmPassword().clear();
        Hlocs.clickCreateAccountSubmit().click();
        boolean x1 = Asser.Createaccpage().isDisplayed();
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(x1);
        String errorMsg = Asser.getConfirmPasswordError();
        Assert.assertEquals(errorMsg, "This is a required field.");
//        boolean x2 = Asser.getConfirmPasswordError().isDisplayed();
//        soft.assertTrue(x2);


//        boolean c1 = Asser.getGreenLogoLoc().getText().contains("Success");
//
//
//        boolean c2 = Asser.getlogoutBtn().isDisplayed();
//        soft.assertTrue(c2);
//
//        soft.assertAll();
//        driver.quit();
    }

    @Test
    public void TC2_Validate_PasswordMismatch() {


        Hlocs.selectcreateacc().click();
        Hlocs.enterfirstname().sendKeys("Peter");
        Hlocs.enterlasttname().sendKeys("Parker");
        Hlocs.eneteremail().sendKeys("PeterParker@gmail.com");
        Hlocs.enterpassword().sendKeys("Pp123456789");
        Hlocs.ConfirmPassword().sendKeys("123456789");
        Hlocs.clickCreateAccountSubmit().click();
        boolean x2 = Asser.Createaccpage().isDisplayed();
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(x2);
        String errorMsg = Asser.getConfirmPasswordError();
        Assert.assertEquals(errorMsg, "Please enter the same value again.");
        //boolean x2 = Asser.getConfirmPasswordError().isDisplayed();
        //soft.assertTrue(x2);


    }

    @Test
    public void TC3_Validate_SuccessfulRegistration() {
        Hlocs.selectcreateacc().click();
        Hlocs.enterfirstname().sendKeys("bat");
        Hlocs.enterlasttname().sendKeys("Paarker");
        Hlocs.eneteremail().sendKeys("PeterPaarkerr6133@gmail.com");
        Hlocs.enterpassword().sendKeys("Pp123456789");
        Hlocs.ConfirmPassword().sendKeys("Pp123456789");
        Hlocs.clickCreateAccountSubmit().click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        boolean P1 = Hlocs.MYACC().isDisplayed();
//        SoftAssert soft = new SoftAssert();
//        soft.assertTrue(P1);

      String currentUrl = Asser.getcuurenturl();
        Assert.assertEquals(currentUrl, "https://magento.softwaretestingboard.com/customer/account/");
       boolean P1 = Hlocs.Contact().getText().contains("bat Paarker");
      SoftAssert soft = new SoftAssert();
       soft.assertTrue(P1);
        boolean P2 = Hlocs.Contact().getText().contains("PeterPaarkerr6133@gmail.com");;
        SoftAssert soft2 = new SoftAssert();
        soft2.assertTrue(P2);
       //String actcualfirstname = Asser.getContactFirstName();
        //Assert.assertEquals(actcualfirstname,"Peter");
//        String actcuallastname = Asser.getContactLastName();
//        Assert.assertEquals(actcuallastname,"Paarker");
//        String actcualemail = Asser.getContactEmail();
//        Assert.assertEquals(actcualemail,"PeterParkerr4133@gmail.com");






    }


    }
