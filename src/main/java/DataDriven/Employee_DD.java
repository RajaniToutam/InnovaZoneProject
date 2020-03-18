package DataDriven;

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

public class Employee_DD extends BasePage {
    public Employee_DD(WebDriver driver) {
        super(driver);
    }
    ////////Locator Start//////////////////////////////////////////////


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


/////////// Locator End/////////////////////////////////////////////
//////////////////////////////  Method Start//////////////////////////////////////////////////////////
    // Click Users

    public boolean clickUsers() {
        try {
                   WebElement UserName = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(Users_xPath));
            UserName.getAttribute("title");
            UserName.click();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

// Click EEs

    public boolean clickEmployees() {
        try {
            Thread.sleep(3000);
            WebElement clickEmployees = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(Employee_xPath));
            clickEmployees.getAttribute("title");
            clickEmployees.click();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
// Click AddEmployee

    public boolean clickAddEmployees() {
        try {
            Thread.sleep(3000);
            WebElement clickAddEmployees = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(AddEE_xPath));
            clickAddEmployees.getAttribute("title");
            clickAddEmployees.click();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //Dynamic Method for all the input feilds

    public boolean enterTextInInputField(String text, By locatorName, int time) {
        try {

            WebElement webElement = (new WebDriverWait(driver, 60))
                    .until(ExpectedConditions.visibilityOfElementLocated(locatorName));
            webElement.sendKeys(text);
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

    public boolean enterDtofHire() {
        try {

            driver.findElement(DtofHire_xPath).click();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //Upload Image
    public boolean imageUpLoad() {
        try {
            Thread.sleep(2000);
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
            driver.findElement(image_xpath).sendKeys("C:\\Sketch 1.png");
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", imageUpLoad());
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    // Click Save&Close

    public boolean clickSaveClose() {
        try {
            driver.findElement(SaveClose_xPath).click();
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}
