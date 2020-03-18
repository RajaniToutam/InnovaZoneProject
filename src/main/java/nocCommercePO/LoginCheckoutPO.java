package nocCommercePO;

import SetUp.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LoginCheckoutPO extends BasePage {

    public LoginCheckoutPO(WebDriver driver) {
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
    //  public By OrderNum_xPath = By.xpath("//div[@class='order-number']");


/////////////////////////////Locator End///////////////////////////

    //////////////////////////////  Method Start//////////////////////////////////////////////////////////
    //Click LoginIn Button
    public boolean clickLoginInBtn() {
        try {

            WebElement clickLoginInBtn = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(LoginBtn_xPath));
            clickLoginInBtn.click();
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            Thread.sleep(1000);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //Click EmailID provide
    public boolean enterEmailID(String email) {
        try {

            Thread.sleep(2000);
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)");
            WebElement enterEmailID = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(Email_xPath));
            enterEmailID.sendKeys(email);
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            Thread.sleep(1000);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //Click Password provide
    public boolean enterPassword(String pwd) {
        try {

            WebElement enterPassword = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(Password_xPath));
            enterPassword.sendKeys(pwd);
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            Thread.sleep(1000);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //Click on Remember me checkbox
    public boolean clickRemMe() {
        try {

            WebElement clickRemMe = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(RememMe_xPath));
            clickRemMe.click();
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            Thread.sleep(1000);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //Click Password provide
    public boolean clickSubmit() {
        try {

            WebElement clickSubmit = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(SubmitBtn_xPath));
            clickSubmit.click();
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            Thread.sleep(1000);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    //Click Books Link
    public boolean clickBooksLink() {
        try {

            WebElement clickBooksLink = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(Books_xPath));
            clickBooksLink.click();
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            Thread.sleep(1000);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //Click Sorting by options dropdown
    public boolean clickSortByOptions(String Prodnames) {
        try {

            Thread.sleep(3000);

            WebElement clickSortByOptions = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(Prodsorting_xPath));
            clickSortByOptions.click();
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            Thread.sleep(1000);

            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");

            List<WebElement> prodList = driver.findElements(By.xpath("//select[@id = 'products-orderby']//option"));
            System.out.println("Total dropdown " + prodList.size());
            for (WebElement element : prodList) {
                Actions action = new Actions(driver);
                action.moveToElement(element);

                String prodnames = element.getText();
                if (prodnames.contains(Prodnames)) {
                    element.click();
                    return true;
                } else {
                    continue;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    //Click to Add to cart
    public boolean clickAddtoCart() {
        try {

            WebElement clickAddtoCart = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(AddtoCart_xPath));
            clickAddtoCart.click();
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            Thread.sleep(2000);
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,2000)");
            Thread.sleep(2000);

            return true;
        } catch (Exception e) {
            return false;
        }

    }

    //Click  Shopping cart
    public boolean clickShoppingCart() {
        try {

            Thread.sleep(2000);
            WebElement clickShoppingCart = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(ShoppingCart_xPath));
            clickShoppingCart.click();
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            Thread.sleep(2000);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    //Click  Termof service
    public boolean clickTermofServ() {
        try {

            WebElement clickTermofServ = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(TermofServ_xPath));
            clickTermofServ.click();
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    //Click on check out button
    public boolean clickCheckOutBtn() {
        try {

            WebElement clickCheckOutBtn = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(Chkout_xPath));
            clickCheckOutBtn.click();
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            Thread.sleep(1000);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //Click on Ship to same address to uncheck
    public boolean clickUnCheckBtn() {
        try {

            WebElement clickUnCheckBtn = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(Uncheckbox_xPath));
            clickUnCheckBtn.click();
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            Thread.sleep(1000);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //Select on New addrees
    public boolean enterNewAddress(String newaddress) {
        try {

            Thread.sleep(2000);
            WebElement enterNewAddress = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(NewAddress_xPath));
            enterNewAddress.sendKeys(newaddress);
            List<WebElement> DropdownList = driver.findElements(By.xpath("//select[@id='billing-address-select']//option"));
            System.out.println("Total dropdown items " + DropdownList.size());
            for (WebElement element : DropdownList) {
                Actions action = new Actions(driver);
                action.moveToElement(element);

                String DropdownOpt = element.getText();
                if (DropdownOpt.contains(newaddress)) {
                    element.click();
                    return true;
                } else {
                    continue;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }


    //Select on country
    public boolean enterCountry(String country) {
        try {

            Thread.sleep(2000);
            WebElement enterCountry = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(Country_xPath));
            enterCountry.sendKeys(country);
            List<WebElement> CountryList = driver.findElements(By.xpath("//select[@id='BillingNewAddress_CountryId']//option"));
            System.out.println("Total dropdown items " + CountryList.size());
            for (WebElement element : CountryList) {
                Actions action = new Actions(driver);
                action.moveToElement(element);

                String countrynames = element.getText();
                if (countrynames.contains(country)) {
                    element.click();
                    return true;
                } else {
                    continue;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    //Select on state
    public boolean enterState(String state) {
        try {

            Thread.sleep(2000);
            WebElement enterState = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(State_xPath));
            enterState.click();

            List<WebElement> StateList = driver.findElements(By.xpath("//select[@id = 'BillingNewAddress_StateProvinceId']//option"));
            System.out.println("Total dropdown items " + StateList.size());
            for (WebElement element : StateList) {
                Actions action = new Actions(driver);
                action.moveToElement(element);

                String stateNames = element.getText();
                if (stateNames.contains(state)) {
                    element.click();
                    return true;
                } else {
                    continue;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    //Select on city
    public boolean enterCity(String city) {
        try {

            WebElement enterCity = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(City_xPath));
            enterCity.sendKeys(city);
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            Thread.sleep(1000);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //Select on address
    public boolean enterAddress(String address) {
        try {

            WebElement enterAddress = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(Address_xPath));
            enterAddress.sendKeys(address);
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            Thread.sleep(1000);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //Select on zip
    public boolean enterzip(String zip) {
        try {

            WebElement enterzip = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(Zip_xPath));
            enterzip.sendKeys(zip);
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            Thread.sleep(1000);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //Select on phone
    public boolean enterphone(String phone) {
        try {

            WebElement enterphone = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(Phone_xPath));
            enterphone.sendKeys(phone);
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            Thread.sleep(1000);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //Click on (Billing)Continue button
    public boolean clickBillingContinueBtn() {
        try {

            WebElement clickBillingContinueBtn = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(BillingContinuebtn_xPath));
            clickBillingContinueBtn.click();
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            Thread.sleep(1000);
            return true;
        } catch (Exception e) {
            return false;
        }

    }
    //Click on (Billing)Continue1 button
    public boolean clickShippingSaveBtn() {
        try {

            WebElement clickShippingSaveBtn = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(ShippingSaveBtn_xPath));
            clickShippingSaveBtn.click();
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            Thread.sleep(1000);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //Click on Continue button agian on Shipping page
    public boolean clickShippingContinueBtn() {
        try {

            WebElement clickShippingContinueBtn = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(ShippingBtn_xPath));
            clickShippingContinueBtn.click();
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            Thread.sleep(1000);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    //Click on Continue button agian on Payment page
    public boolean clickPaymentContinueBtn() {
        try {

            WebElement clickPaymentContinueBtn = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(PaymentCont_xPath));
            clickPaymentContinueBtn.click();
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            Thread.sleep(1000);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //Click on Continue button agian on Payment Info page
    public boolean clickPaymentinfoBtn() {
        try {

            WebElement clickPaymentinfoBtn = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(PaymentInfo_xPath));
            clickPaymentinfoBtn.click();
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            Thread.sleep(1000);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //Click on Confirm button
    public boolean clickConfirmBtn() {
        try {

            WebElement clickConfirmBtn = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(ConfirmBtn_xPath));
            clickConfirmBtn.click();
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            Thread.sleep(1000);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

/*    //Click on Order number
    public boolean clickOrderNumber() {
        try {

            WebElement clickConfirmBtn = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(OrderNum_xPath));
            clickConfirmBtn.click();
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            Thread.sleep(1000);
            return true;
        } catch (Exception e) {
            return false;
        }
    }*/





















}
