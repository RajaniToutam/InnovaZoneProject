package AutomationPracTC;


import AutomationPrac.AutoPrac_PO;
import SetUp.BaseTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class AutoPrac_TC extends BaseTest {

    public AutoPrac_TC() {    }

    public AutoPrac_TC(WebDriver passDriver) {
        driver = passDriver;
    }

    @Test
    public void AutoPracTC() throws Exception {

        AutoPrac_PO autoPrac_Obj = new AutoPrac_PO(driver);

        test = extent.createTest("Test Passed", "Verify Register");
        test.assignCategory("Module 1 - User Registration Page  ");
        test.log(Status.INFO, "Test Case Started");

        // Step 1. Enter valid email address

        String email1 = "niksharma111@gmail.com";
        Assert.assertTrue(autoPrac_Obj.enterTextInInputField(email1, autoPrac_Obj.Email_xpath), "Opps!! unable to enter email");
        test.log(Status.PASS, "Register link tab is available");

        //Step 2.Click on ""Create an account"" button.
        Assert.assertTrue(autoPrac_Obj.clickOnDesiredLink(autoPrac_Obj.SubmitBtn_xpath), "Opps!! unable to click");

        //Step 3. Enter value in all require fields. Click on "Register" button.

        String Fname = "Softweb";
        Assert.assertTrue(autoPrac_Obj.enterTextInInputField(Fname, autoPrac_Obj.FirstName_xpath), "Opps!! unable to enter Fname");

        String Lname = "Team";
        Assert.assertTrue(autoPrac_Obj.enterTextInInputField(Lname, autoPrac_Obj.LastName_xpath), "Opps!! unable to enter Fname");

        String email2 = "softwebIndia3321@gmail.com";
        Assert.assertTrue(autoPrac_Obj.enterTextInInputField(email2, autoPrac_Obj.Email1_xpath), "Opps!! unable to enter email1");

        String pwd1 = "test1234";
        Assert.assertTrue(autoPrac_Obj.enterTextInInputField(pwd1, autoPrac_Obj.Password_xpath), "Opps!! unable to enter pwd");

        String Date = "11";
        //Assert.assertEquals(autoPrac_Obj.selectDt(Date), true, "Opps!! unable to enter day");

        Assert.assertEquals(autoPrac_Obj.clickOnDropDownDate(Date, "days"), true, "Opps!! unable to enter day");

        String Month = "May";
        // Assert.assertEquals(autoPrac_Obj.selectMonth(Month), true, "Opps!! unable to select month");
        Assert.assertEquals(autoPrac_Obj.clickOnDropDownDate(Month, "months"), true, "Opps!! unable to enter Month");

        String year = "1990";
        // Assert.assertEquals(autoPrac_Obj.selectYear(year), true, "Opps!! unable to enter year");
        Assert.assertEquals(autoPrac_Obj.clickOnDropDownDate(year, "years"), true, "Opps!! unable to enter Year");

        String Fname1 = "Softweb";
        Assert.assertTrue(autoPrac_Obj.enterTextInInputField(Fname1, autoPrac_Obj.FirstName1_xpath), "Opps!! unable to enter Fname1");

        String Lname1 = "SoftwebTest";
        Assert.assertTrue(autoPrac_Obj.enterTextInInputField(Lname1, autoPrac_Obj.LastName1_xpath), "Opps!! unable to enter Lname1");

        String Company = "Softweb";
        Assert.assertTrue(autoPrac_Obj.enterTextInInputField(Company, autoPrac_Obj.Comapny_xpath), "Opps!! unable to enter Company");

        String address = "PO Box 2324";
        Assert.assertTrue(autoPrac_Obj.enterTextInInputField(address, autoPrac_Obj.Address_xpath), "Opps!! unable to enter address");

        String city = "Angel Wood";
        Assert.assertTrue(autoPrac_Obj.enterTextInInputField(city, autoPrac_Obj.City_xpath), "Opps!! unable to enter city");

        String State = "Arizona";
        Assert.assertEquals(autoPrac_Obj.clickOnDropDownDate(State, "id_state"), true, "Opps!! unable to enter year");

        String PostalCode = "25469";
        Assert.assertTrue(autoPrac_Obj.enterTextInInputField(PostalCode, autoPrac_Obj.PostalCode_xpath), "Opps!! unable to enter zipcode");

        //Note: Prepoulated.

        // String Country = "United States";
        //Assert.assertTrue(autoPrac_Obj.clickDropDownSelection(Country), "Opps!! unable to enter country");

        String mphone = "9966225588";
        Assert.assertTrue(autoPrac_Obj.enterTextInInputField(mphone, autoPrac_Obj.MPhone_xpath), "Opps!! unable to enter mobile ph");

        String alias = "Softweb";
        Assert.assertTrue(autoPrac_Obj.enterTextInInputField(alias, autoPrac_Obj.Alias_xpath));

        Assert.assertTrue(autoPrac_Obj.clickOnDesiredLink(autoPrac_Obj.SubmitACC_xpath), "Opps!! unable to click submit");


        /////////////////Test cases 02 - Women Evening Dresses//////////////////

        //Step 1.Hover mouse on "Women" tab.
        assertTrue(autoPrac_Obj.clickOnWoman(autoPrac_Obj.Women_xpath), "Not able to click on Women link");

        //Step 2. Under "Dresses" section click on "Evening Dresses".
        String text = "Evening Dresses";
        assertTrue(autoPrac_Obj.clickAction(text), "Not able to click on Women evening dresses");

        //Step 3. Hover mouse on first image of dress.
        assertTrue(autoPrac_Obj.clickOnDesiredLink(autoPrac_Obj.PrintedDress_xpath), "Not able to click on printed dress");

        //Step 4. Click on ""More"" button"
        //  Assert.assertTrue(autoPrac_Obj.clickOnDesiredLink(autoPrac_Obj.More_xpath), "Not able to click on More link");

        //Step 5. Click on ""+"" icon of quantity
        assertTrue(autoPrac_Obj.clickOnDesiredLink(autoPrac_Obj.Quantity_xpath), "Not able to click on quantity");

        //Step 6. Change size ""S"" to ""M"".
        String Size = "M";
        assertTrue(autoPrac_Obj.clickOnDropDownDate(Size, "group_1"), "Not able to click on Women size");

        //Step 7. Click on ""Add to Cart"" button.
        assertTrue(autoPrac_Obj.clickOnDesiredLink(autoPrac_Obj.AddToCart_xpath), "Not able to click on Addto cart");

        //Step 8. Click on "Continue shopping" button.
        assertTrue(autoPrac_Obj.clickOnDesiredLink(autoPrac_Obj.ContinueShopping_xpath), "Not able to click on Continue shopping");

        /////////////////Test cases 03 - Women Summer Dresses//////////////////

        //Step 1: Hover mouse on "Women" tab.
        assertTrue(autoPrac_Obj.clickOnWoman(autoPrac_Obj.Women1_xpath), "Not able to click on Women link");

        //Step 2:Under "Dresses" section click on "Summer Dresses".
        String text1 = "Summer Dresses";
        assertTrue(autoPrac_Obj.clickAction(text1), "Not able to click on Women Summer dresses");

        //Step 3: Hover mouse over first dress
        assertTrue(autoPrac_Obj.clickOnDesiredLink(autoPrac_Obj.SummerDressPrinted_xpath), "Not able to click on summer dress");

        //Step 4: click on "Add to cart" button.
        assertTrue(autoPrac_Obj.clickOnDesiredLink(autoPrac_Obj.AddToCart1_xpath), "Not able to click on add cart button");

        //Step 5: Click on "Proceed to Checkout" button.
        assertTrue(autoPrac_Obj.clickOnDesiredLink(autoPrac_Obj.ProceedToCheckout_xpath1), "Not able to click on add cart button");

        //Step 6: Click on "Proceed to Checkout" button of "SHOPPING-CART SUMMARY" page.
        assertTrue(autoPrac_Obj.clickOnDesiredLink(autoPrac_Obj.ShoppingCartProceedToCheckout_xpath), "Not able to click on Shopping Cart Proceed To checkout link");


        /////////////////Test cases 04 - Address Tab//////////////////

        // Step 1: Click on "Update" button of "YOUR DELIVERY ADDRESS" section.
         assertTrue(autoPrac_Obj.clickOnDesiredLink(autoPrac_Obj.ShoppingUpdate_xpath), "Not able to click on update button");

        //Step 2: Click on "Save" button.
         assertTrue(autoPrac_Obj.clickOnDesiredLink(autoPrac_Obj.ShoppingSave_xpath), "Not able to click on save button");

        //Step 3: Click on Proceed to Checkout" button.
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1500)");
        assertTrue(autoPrac_Obj.clickOnDesiredLink(autoPrac_Obj.AddressProceedToCheckOut), "Not able to click on Address tab Cart Proceed To checkout link");

        /////////////////Test cases 05 - Shipping Tab//////////////////

        //Step 1: Click on "Close" button. - Not able to find it in UI.

        //Step 2. Check checkbox "Terms of service".
        assertTrue(autoPrac_Obj.clickOnTermCondition(), "Not able to click on term and condition button");

        //Step 3. Click on Proceed to Checkout" button on "Shipping" tab.
        assertTrue(autoPrac_Obj.clickOnDesiredLink(autoPrac_Obj.ShippingProceedToCKout1), "Not able to click on shipping proceed check out");


        ///////////////////////////////////////End  of text cases/////////////////////
        test.log(Status.INFO, "Test Case Ended");


    }


}

