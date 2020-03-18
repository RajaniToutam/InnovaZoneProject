/*
package ProductManagement;
import SetUp.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.By;

public class ProductPO BasePage {


    public ProductPO(WebDriver driver) {

        super(driver);
}


    //////////////////////////////////////////////////////Locator Start

    public By ProdManagement_xPath = By.xpath("//span[text()='Product Management']");
    public By Products_xPath = By.xpath("//span[text()='Products']");
    public By AddProd_xPath = By.xpath("//button[@class = 'btn btn-primary']");
    public By ProdTitle_xPath = By.xpath("//input[@name= 'product_title']");
    public By ModelNo_xPath = By.xpath("//input[@name= 'model_no']");
    public By Barcode_xPath = By.xpath("//input[@name= 'barcode']");
    public By BinLoc_xPath = By.xpath("//input[@name= 'bin_location']");

    public By ProdPrice_xPath = By.xpath("//input[@name= 'product_price']");
    public By MinProd_xPath = By.xpath("//input[@name= 'min_quantity']");
    public By MaxProd_xPath = By.xpath("//input[@name= 'max_quantity']");
    public By YearlyBudget_xPath = By.xpath("//input[@name= 'estimated_budget']");
    public By CurrMiles_xPath = By.xpath("//input[@name= 'current_miles']");
    public By EngineHrs_xPath = By.xpath("//input[@name= 'engine_hours']");
    public By Desc_xPath = By.xpath("//input[@name= 'description']");
    public By Email_xPath = By.xpath("//input[@name= 'alert_email']");
    public By minMax_xPath = By.xpath("//input[@ng-reflect-name= 'min_max_0']");
    public By UponIssue_xPath = By.xpath("//input[@ng-reflect-name= 'upon_issue_0']");
    public By NoMonths_xPath = By.xpath("//input[@ng-reflect-name= 'no_of_months']");
    public By NoDays_xPath = By.xpath("//input[@ng-reflect-name= 'no_of_days']");
    public By SaveClose_xPath = By.xpath("//button[@class= 'btn btn-inline btn-primary' ]");

//////////////////////////////////////////////////////// Locator End


    //////////////////////////////  Method Start//////////////////////////////////////////////////////////
    // Click ProdManagement

    public boolean ProdManagement(){
        try {

            WebElement ProdManagement = (new WebDriverWait(driver,90))
                    .until(ExpectedConditions.visibilityOfElementLocated(ProdManagement_xPath));
            ProdManagement.Click();
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    // Click Products

    public boolean Products(){
        try {

            WebElement Products = (new WebDriverWait(driver,90))
                    .until(ExpectedConditions.visibilityOfElementLocated(Products_xPath));
            Products.Click();
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    // Click Add Products

    public boolean AddProducts(){
        try {

            WebElement AddProducts = (new WebDriverWait(driver,90))
                    .until(ExpectedConditions.visibilityOfElementLocated(AddProd_xPath));
            AddProducts.Click();
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
// Click Add Products

    public boolean AddPrProdTitle(){
        try {

            WebElement AddProducts = (new WebDriverWait(driver,90))
                    .until(ExpectedConditions.visibilityOfElementLocated(ProdTitle_xPath));
            AddProducts.Click();
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }



}
*/
