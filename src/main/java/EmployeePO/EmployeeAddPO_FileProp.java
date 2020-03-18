package EmployeePO;

import SetUp.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class EmployeeAddPO_FileProp extends BasePage {
    public EmployeeAddPO_FileProp(WebDriver driver) {

        super(driver);
    }
    ////////////////Locator Start//////////////////////////////////////


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
    //public By image_xpath = By.xpath("//input[@name ='profileImg']");
    public By SaveClose_xPath = By.xpath("//*[text() ='Save & Close']");


//////////////////// Locator End////////////////////////////////////


    //////////////////////////////  Method Start//////////////////////////////////////////////////////////
    // Click Users

    public boolean clickUsers() {
        try {

            WebElement UserName = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(Users_xPath));
            UserName.getAttribute("title");
            UserName.click();
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            Thread.sleep(2000);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

// Click EEs

    public boolean clickEmployees() {
        try {

            WebElement clickEmployees = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(Employee_xPath));
            clickEmployees.getAttribute("title");
            clickEmployees.click();
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            Thread.sleep(3000);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
// Click AddEmployee

    public boolean clickAddEmployees() {
        try {

            WebElement clickAddEmployees = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(AddEE_xPath));
            clickAddEmployees.getAttribute("title");
            clickAddEmployees.click();
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //*********how to read data from file**********
    public void readFile() throws IOException {
        Properties prop = new Properties();
        //*********testing reading data from config file *******
        prop.load(new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\Config_EE.properties"));
        System.out.println(prop.getProperty("config_FirstName"));
    }

// Enter FirstName

    public boolean enterFirstName(String firstname) {
        try {

            WebElement enterFirstName = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(FName_xPath));
            enterFirstName.sendKeys(firstname);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
// Enter LastName

    public boolean enterLastName(String lastname) {
        try {

            WebElement enterLastName = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(LName_xPath));
            enterLastName.sendKeys(lastname);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
// Enter EEID(UserName)

    public boolean enterEEID(String eeID) {
        try {
            Thread.sleep(2000);
            WebElement enterEEID = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(EEid_xPath));
            enterEEID.sendKeys(eeID);
            Thread.sleep(2000);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
// Enter Jobzone Dropdown

    public boolean enterJobzone(String jobzone) {
        try {

            WebElement enterJobzone = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(Jobzone_xPath));
            enterJobzone.click();
            List<WebElement> jobzonelist = driver.findElements(By.xpath("//select[@id='jobzone_id']//option"));
            System.out.println("Total Checkbox " + jobzonelist.size());
            for (WebElement element : jobzonelist) {
                Actions action = new Actions(driver);//used for mouse clicking or mouse hover or scrolling the list
                action.moveToElement(element);

                // ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",checkboxTicketlinkWebL);

                String jobzonenames = element.getText();
                if (jobzonenames.contains(jobzone)) {
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
    // Enter Password

    public boolean enterPwd(String PWD) {
        try {

            WebElement enterPwd = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(Passwd_xPath));
            enterPwd.sendKeys(PWD);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    // Enter ConPassword

    public boolean enterConPassword(String Confirmpwd) {
        try {

            WebElement enterConPassword = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(ConPassword_xPath));
            enterConPassword.sendKeys(Confirmpwd);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    // Enter Barcode

    public boolean enterBarCode(String BarCode) {
        try {

            WebElement enterBarCode = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(Barcode_xPath));
            enterBarCode.sendKeys(BarCode);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    // Enter LockrNo

    public boolean enterLockerNo(String LockerNumber) {
        try {

            WebElement enterLockerNo = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(LockerNo_xPath));
            enterLockerNo.sendKeys(LockerNumber);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    // Enter Department dropdown


    public boolean enterDept(String DeptNumber) {
        try {

            WebElement enterDept = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(Jobzone_xPath));
            enterDept.click();
            List<WebElement> DeptList = driver.findElements(By.xpath("//select[@id='department_id']//option"));
            System.out.println("Total Checkbox " + DeptList.size());
            for (WebElement element : DeptList) {
                Actions action = new Actions(driver);//used for mouse clicking or mouse hover or scrolling the list
                action.moveToElement(element);

                // ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",checkboxTicketlinkWebL);

                String deptnames = element.getText();
                if (deptnames.contains(DeptNumber)) {
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

    // Enter Location

    public boolean enterLocation(String Loc) {
        try {

            WebElement enterLocation = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(location_xPath));
            enterLocation.sendKeys(Loc);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    // Enter CombinationNumber

    public boolean enterCombinationNo(String CombinationNum) {
        try {

            WebElement enterCombinationNo = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(CombNo_xPath));
            enterCombinationNo.sendKeys(CombinationNum);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    // Enter DateofHire

    public boolean enterDtofHire() {
        try {

            WebElement enterDtofHire = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(DtofHire_xPath));
            enterDtofHire.sendKeys();

            return true;
        } catch (Exception e) {
            return false;
        }

/*
        //Upload Image
        public boolean imageUpLoad () {
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
*/

/*
        // Click Save&Close

        public boolean clickSaveClose () {
            try {

                WebElement clickSaveClose = (new WebDriverWait(driver, 90))
                        .until(ExpectedConditions.visibilityOfElementLocated(SaveClose_xPath));
                clickSaveClose.click();
                return true;
            } catch (Exception e) {
                return false;
            }
        }
*/

    }
}


