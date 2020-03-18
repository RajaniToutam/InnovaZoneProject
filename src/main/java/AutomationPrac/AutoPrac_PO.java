package AutomationPrac;

import SetUp.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AutoPrac_PO extends BasePage {
    public AutoPrac_PO(WebDriver driver) {
        super(driver);
    }


////////Locator Start//////////////////////////////////////////////

    public By AlreadyEmail_xpath =By.xpath("//input[@id ='email']");
    public By Pwd_xpath =By.xpath("//input[@id ='passwd']");
    public By SigninBtn_xpath =By.xpath("//button[@id ='SubmitLogin']");

////////////Testcase-01****Login and register in the automation website/////////////

    public By Email_xpath = By.xpath("//input[@id = 'email_create']");
    public By SubmitBtn_xpath = By.xpath("//button[@id = 'SubmitCreate']");
    public By FirstName_xpath = By.xpath("//input[@id = 'customer_firstname']");
    public By LastName_xpath = By.xpath("//input[@id = 'customer_lastname']");
    public By Email1_xpath = By.xpath("//input[@id = 'email']");
    public By Password_xpath = By.xpath("//input[@id = 'passwd']");
    public By DayDrpDw_xpath = By.xpath("//select[@id = 'days']//option");
    public By MonthDrpDw_xpath = By.xpath("//select[@id = 'months']//option");
    public By YearDrpDw_xpath = By.xpath("//select[@id = 'years']//option");
    public By FirstName1_xpath = By.xpath("//input[@id = 'firstname']");
    public By LastName1_xpath = By.xpath("//input[@id = 'lastname']");
    public By Comapny_xpath = By.xpath("//input[@id = 'company']");
    public By Address_xpath = By.xpath("//input[@id = 'address1']");
    public By City_xpath = By.xpath("//input[@id = 'city']");
    public By State_xpath = By.xpath("//select[@id = 'id_state']//option");
    public By PostalCode_xpath = By.xpath("//input[@name = 'postcode']");
    public By Country_xpath = By.xpath("//select[@id = 'id_country']//option");
    public By HPhone_xpath = By.xpath("//input[@id = 'phone']");
    public By MPhone_xpath = By.xpath("//input[@id = 'phone_mobile']");
    public By Alias_xpath = By.xpath("//input[@id = 'alias']");
    public By SubmitACC_xpath = By.xpath("//button[@id = 'submitAccount']");

    //////////////////Testcase-02***Home-EveningWomen//////////////////////
    public By Women_xpath = By.xpath("//a[text()= 'Women']");
    public By EveningDress_xpath = By.xpath("//ul[@class='submenu-container clearfix first-in-line-xs']//li//li/a[@title='Evening Dresses']");
    //public By EveningDress1_xpath = By.xpath("//*[@title = 'Summer Dresses']//following::a[text() ='Evening Dresses' ]");
    public By PrintedDress_xpath = By.xpath("//img[@title = 'Printed Dress']");
    public By More_xpath = By.xpath("//SPAN[text()='More']");
    public By Quantity_xpath = By.xpath("//i[@class='icon-plus']");
    public By Size_xpath = By.xpath("//select[@id='group_1']//option");
    public By AddToCart_xpath = By.xpath("//span[text()='Add to cart']");
    public By ContinueShopping_xpath = By.xpath("//span[@title='Continue shopping']");



    //////////////////Testcase-03***Home-SummerDresses//////////////////////
    public By Women1_xpath = By.xpath("//div[@class ='sf-contener clearfix col-lg-12']//ul//a[@title = 'Women']");
    public By SummerDress_xpath = By.xpath("//ul[@class='submenu-container clearfix first-in-line-xs']//li//li/a[@title='Summer Dresses']");
    public By SummerDressPrinted_xpath = By.xpath("//li[@class = 'ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line']//img[@title = 'Printed Summer Dress']");
    public By AddToCart1_xpath = By.xpath("//span[text()='Add to cart']");
    public By ProceedToCheckout_xpath1 = By.xpath("//a[@title = 'Proceed to checkout']");
    public By ShoppingCartProceedToCheckout_xpath = By.xpath("//span[text() = 'Proceed to checkout']");

    /////////////////////////////Testcase-04***Address///////////////////////////

    public By ShoppingUpdate_xpath = By.xpath("//div[@class='col-xs-12 col-sm-6']//ul[@id = 'address_delivery']//a[@title = 'Update']");  //Not able to get it --update showing two //ul[@id = 'address_delivery']//span[text()= 'Update']
    public By ShoppingSave_xpath = By.xpath("//button[@id = 'submitAddress']");
    public By AddressProceedToCheckOut = By.xpath("//button[@name='processAddress']");

    /////////////////////////////Testcase-05***Shipping///////////////////////////
    public By ShippingProceedToCheckout_xptah = By.xpath("//button[@name = 'processCarrier']");
    public By ShippingTermConditions_xpath = By.xpath("//div[@id = 'uniform-cgv']//input[@id= 'cgv']");
    public By ShippingProceedToCKout1 = By.xpath(" //button[@name= 'processCarrier']");

    /////////////////////////LogOut////////////////////////
    public By LogoutBtn_xpath = By.xpath("//a[@class = 'logout' ]");
   // public By LogoutBtn_xpath = By.xpath("//a[@class = 'logout' ]");

    /////////////////////////////Locator End///////////////////////////
    //////////////////////////////  Method Start///////////////////////

    public boolean enterTextInInputField(String text, By locatorName) {
        try {
            WebElement webElement = (new WebDriverWait(driver, 30))
                    .until(ExpectedConditions.visibilityOfElementLocated(locatorName));
            webElement.sendKeys(text);
            if (webElement.isDisplayed()) {
                webElement.clear();
                webElement.sendKeys(text);

                return true;            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }



    public boolean clickOnDesiredLink(By by) {
        try {

            WebElement webElement = (new WebDriverWait(driver, 60))
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
            webElement.click();
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    public boolean clickOnWoman(By by) {
        try {
            Thread.sleep(5000);
            Actions actions = new Actions(driver);
            WebElement clickWomen = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
            actions.moveToElement(clickWomen).build().perform();
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    public boolean clickOnDropDownDate(String Date, String DropDownLocater) {
        try {

           /* WebElement clickSortByOptions = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated());
            clickSortByOptions.click();*/

            driver.findElement(By.xpath("//select[@id = '"+DropDownLocater+"']")).click();
            Thread.sleep(2000);
            List<WebElement> prodList = driver.findElements(By.xpath("//select[@id='"+DropDownLocater+"']//option"));
            System.out.println("Total dropdown " + prodList.size());
            for (WebElement element : prodList) {
                Actions action = new Actions(driver);
                action.moveToElement(element);

                String prodnames = element.getText();
                if (prodnames.contains(Date)) {
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


    public boolean clickAction(String text) {
        try {
            Thread.sleep(2000);
            List<WebElement> dressesList = driver.findElements(By.xpath("//ul[@class='submenu-container clearfix first-in-line-xs']//li//li"));
            System.out.println("Total dropdown " + dressesList.size());

            for (WebElement element : dressesList) {
                Actions action = new Actions(driver);
                action.moveToElement(element).build().perform();

                String dressnames = element.getText();
                System.out.println("dress names  " + dressnames);
                if (dressnames.contains(text)) {
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

    public boolean clickAction1(String text) {
        try {
            Thread.sleep(2000);
            List<WebElement> dressesList = driver.findElements(By.xpath("//ul[@class='submenu-container clearfix first-in-line-xs']//li//li"));
            System.out.println("Total dropdown " + dressesList.size());

            for (WebElement element : dressesList) {
                Actions action = new Actions(driver);
                action.moveToElement(element).build().perform();

                String dressnames = element.getText();
                System.out.println("dress names  " + dressnames);
                if (dressnames.contains(text)) {
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

    public boolean clickOnTermCondition(){
        try{
            JavascriptExecutor jse = ((JavascriptExecutor) driver);
            WebElement element = driver.findElement(By.xpath("//div[@id = 'uniform-cgv']//input[@id= 'cgv']"));
            jse.executeScript("arguments[0].click();",element);
            Thread.sleep(2000);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1500)");
}