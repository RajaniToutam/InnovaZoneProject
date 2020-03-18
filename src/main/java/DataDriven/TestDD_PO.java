package DataDriven;

import SetUp.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestDD_PO extends BasePage {

    public TestDD_PO(WebDriver driver){
       super(driver);

    }
    ////////Locator Start//////////////////////////////////////////////

    public By EmailName_xPath = By.xpath("//input[@name='email']");
    public By Password_xPath=By.xpath("//input[@name='password']");
    public By SignBtn_xPath=By.xpath("//BUTTON[@class='btn'][text()='Sign In']");
    public By WelCome_xPath=By.xpath("//button[contains(text(),'Welcome')]");
    public By Users_xPath = By.xpath("//span[@title='Users']");
    public By Employee_xPath = By.xpath("//span[text()='Employees']");
    public By AddEE_xPath = By.xpath("//BUTTON[text()='Add Employee']");
    public By FName_xPath = By.xpath("//input[@name='first_name']");
    public By LName_xPath = By.xpath("//input[@name='last_name']");
    public By EEid_xPath = By.xpath("//input[@name='username']");
    public By Jobzone_xPath = By.xpath("//select[@id='jobzone_id']");
    public By Passwd_xPath = By.xpath("//input[@name='password']");
    public By ConPassword_xPath = By.xpath("//input[@name='confirm_password']");
    public By Barcode_xPath = By.xpath("//input[@name='barcode']");
    public By LockerNo_xPath = By.xpath("//input[@name='locker_no']");
    public By Dept_xPath = By.xpath("//select[@id='department_id']//option[text()='General']");
    public By location_xPath = By.xpath("//input[@name='location']");
    public By CombNo_xPath = By.xpath("//input[@name='combination_no']");
    public By DtofHire_xPath = By.xpath("//input[@name='date_of_hire']");
    public By image_xpath = By.xpath("//input[@name ='profileImg']");
    public By SaveClose_xPath = By.xpath("//*[text() ='Save & Close']");
    public By userlogged_xPath = By.xpath("//span[@class='hidden-xs']");
    public By Logout_xPath = By.xpath("//a[@class = 'dropdown-item'][text()='Logout']");


    //A[@class='dropdown-item']
//button[@id= 'dd-user-menu']
    //button[@id='dd-user-menu']

//a[text()='Logout']
/////////// Locator End/////////////////////////////////////////////
//////////////////////////////  Method Start//////////////////////////////////////////////////////////
public boolean imageUpLoad() {
    try {
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");

        WebElement imageUpLoad = (new WebDriverWait(driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(image_xpath));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", imageUpLoad);
        imageUpLoad.sendKeys("C:\\Sketch 1.png");
        Thread.sleep(2000);
        return true;
    } catch (Exception e) {
        return false;
    }

}

}




