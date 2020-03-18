package AutomationPracTC;

import AutomationPrac.Guru99PO;
import SetUp.BaseTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Guru99TC extends BaseTest {
    public Guru99TC(){}

    public Guru99TC(WebDriver passDriver){
        driver = passDriver;
    }

    @Test
    public void Guru99TC() throws Exception{


        Guru99PO guru99POObj = new Guru99PO(driver);

        test = extent.createTest("Test Passed", "Verify Add New Customer ");
        test.assignCategory("Module 1 - New Customer Tab  ");
        test.log(Status.INFO, "Test Case Started");

        String userID = "mngr245253";
        Assert.assertTrue(guru99POObj.enterTextOnLink(userID, guru99POObj.userID_xpath ), "Opps not able to enter username");

        String pwd = "UhyterU";
        Assert.assertTrue(guru99POObj.enterTextOnLink(pwd, guru99POObj.pwd_xpath ), "Opps not able to enter pwd");

        Assert.assertTrue(guru99POObj.clickOnLink(guru99POObj.SubmitBtn),"Opps! not able to click login btn");

        Assert.assertTrue(guru99POObj.clickOnLink(guru99POObj.NewCust),"Opps! not able to click new customer tab");

        String name = "XYZtesting";
        Assert.assertTrue(guru99POObj.enterTextOnLink(name, guru99POObj.CustName));

        Assert.assertTrue(guru99POObj.clickOnLink(guru99POObj.Gender_xpath));

        String date = "02/02/2020";
        Assert.assertTrue(guru99POObj.enterTextOnLink(date, guru99POObj.DOB_xpath), "Not bale to enter date");

        String add = "test one drive";
        Assert.assertTrue(guru99POObj.enterTextOnLink(add, guru99POObj.Address_xpath), "not able to enter address");

        String city = "San Jose";
        Assert.assertTrue(guru99POObj.enterTextOnLink(city, guru99POObj.City_xpath), "not able to enter city");

        String state = "California";
        Assert.assertTrue(guru99POObj.enterTextOnLink(state, guru99POObj.State_xpath), "not able to enter state");

        String pin = "112233";
        Assert.assertTrue(guru99POObj.enterTextOnLink(pin, guru99POObj.Pincode_xpath), "not able to enter pincode");

        String phone = "111222333";
        Assert.assertTrue(guru99POObj.enterTextOnLink(phone, guru99POObj.Telephone_xpath), "not able to enter phone");

        String email = "test@hotmail.com";
        Assert.assertTrue(guru99POObj.enterTextOnLink(email, guru99POObj.EmailID_xpath), "not able to enter email");


        String password = "test=25890";
        Assert.assertTrue(guru99POObj.enterTextOnLink(password, guru99POObj.passw1_xpath), "not able to enter passwrd");

        Assert.assertTrue(guru99POObj.clickOnLink(guru99POObj.Submit_xpath));

        System.out.println("New customer successfully added in the system");

    }

}
