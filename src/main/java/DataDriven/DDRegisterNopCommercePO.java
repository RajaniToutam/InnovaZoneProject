package DataDriven;

import SetUp.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DDRegisterNopCommercePO extends BasePage {
    public DDRegisterNopCommercePO(WebDriver driver) {
        super(driver);
    }

    ////////////////////////Locator Start//////////////////////////////

    public By LoginBtn_xPath = By.xpath("//a[@class='ico-login']");
    public By Email_xPath = By.xpath("//input[@id='Email']");
    public By Password_xPath = By.xpath("//input[@id='Password']");
    public By RememMe_xPath = By.xpath("//input[@id='RememberMe']");
    public By SubmitBtn_xPath = By.xpath("//input[@class= 'button-1 login-button']");
    public By Books_xPath = By.xpath("//div[@class='header-menu']//li[5]");
    public By Prodsorting_xPath = By.xpath("//select[@id = 'products-orderby']//option[text()='Price: High to Low']");
    public By AddtoCart_xPath = By.xpath("//input[ @onclick= 'return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/39/1/1\"),!1']");
    public By ShoppingCart_xPath = By.xpath("//SPAN[@class='cart-label']");
    public By TermofServ_xPath = By.xpath("  //input[@id='termsofservice']");
    public By Chkout_xPath = By.xpath("//button[@id='checkout']");
    public By Uncheckbox_xPath = By.xpath("//input[@id='ShipToSameAddress']");
    public By NewAddress_xPath = By.xpath("//select[@id='billing-address-select']");
    public By Country_xPath = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    public By State_xPath = By.xpath("//select[@id = 'BillingNewAddress_StateProvinceId']");
    public By City_xPath = By.xpath("//input[@id = 'BillingNewAddress_City']");
    public By Address_xPath = By.xpath("//input[@id = 'BillingNewAddress_Address1']");
    public By Zip_xPath = By.xpath("//input[@id = 'BillingNewAddress_ZipPostalCode']");
    public By Phone_xPath = By.xpath("//input[@id = 'BillingNewAddress_PhoneNumber']");
    public By BillingContinuebtn_xPath = By.xpath("//input[@onclick='Billing.save()']");
    public By ShippingSaveBtn_xPath = By.xpath("//input[@onclick ='Shipping.save()']");
    public By ShippingBtn_xPath = By.xpath("//input[@onclick ='ShippingMethod.save()']");
    public By PaymentCont_xPath = By.xpath("//input[@onclick='PaymentMethod.save()']");
    public By PaymentInfo_xPath = By.xpath("//input[@onclick='PaymentInfo.save()']");
    public By ConfirmBtn_xPath = By.xpath("//input[@onclick='ConfirmOrder.save()']");

}
