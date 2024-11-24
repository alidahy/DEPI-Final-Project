package testcase;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P02_login;
import pages.P05_Assert;

public class T02_login {
    P02_login Llocs = new P02_login();
    //P02_login Asse = new P02_login();
    P05_Assert Asser = new P05_Assert();



    public static ChromeDriver driver;

    @BeforeMethod
    void setup() {
        driver = new ChromeDriver(); // open browser
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");

    }

    @Test
    public void loginWithValidCredentials() {
        Llocs.selectsignin().click();
        Llocs.Emailfield().sendKeys("PeterParker@gmail.com");
        Llocs.passwordfield().sendKeys("Pp123456789");
        Llocs.Signinbtn().click();
        String crrturl= Asser.getcuurenturl2();
        Assert.assertEquals(crrturl,"https://magento.softwaretestingboard.com/");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        String wlcmsg = Asser.welcomemsg();
//        Assert.assertTrue(wlcmsg.contains("Peter")&& wlcmsg.contains("Parker"));
        boolean c1 = Asser.welcomemsg().getText().contains("Peter");
        boolean c2 = Asser.welcomemsg().getText().contains("Parker");
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(c1);
        soft.assertTrue(c2);



//        boolean c1 = Asser.welcomemsg().getText().contains("Peter");
//        SoftAssert soft = new SoftAssert();
//        soft.assertTrue(c1);


    }
}
