package nocCommercePO;

import SetUp.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RegisterNopCommercePO extends BasePage {

    public RegisterNopCommercePO(WebDriver driver) {
        super(driver);
    }

    ////////////////////////Locator Start//////////////////////////////

    public By Register_xPath=By.xpath("//a[@class='ico-register']");
    public By Gender_xPath=By.xpath("//input[@id='gender-female']\n");
    public By FirstName_xPath=By.xpath("//input[@id='FirstName']");
    public By LastName_xPath=By.xpath("//input[@id='LastName']");
//DropDown Dates
    public By Date_xPath=By.xpath("//select[@name='DateOfBirthDay']//option");
    public By Month_xPath=By.xpath("//select[@name='DateOfBirthMonth']//option");
    public By Year_xPath=By.xpath("//select[@name='DateOfBirthYear']//option");
    public By Company_xPath=By.xpath("//input[@id='Company']");
    public By Email_xpath=By.xpath("//input[@id='Email']");
    public By Password_xpath=By.xpath("//input[@id='Password']");
    public By ConfirmPwd_xpath=By.xpath("//input[@id='ConfirmPassword']");
    public By RegisBtn_xpath=By.xpath("//input[@id='register-button']");
    public By ContinueBtn_xpath=By.xpath("//input[@name='register-continue']");

    /////////////////////////////Locator End///////////////////////////

    //////////////////////////////  Method Start//////////////////////////////////////////////////////////
    //Click Register
    public boolean clickRegister() {
        try {

            driver.findElement(RegisBtn_xpath).click();

            Thread.sleep(1000);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    //Select gender
    public boolean clickGender() {
        try {

            WebElement Gender = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(Gender_xPath));
            Gender.click();
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            Thread.sleep(1000);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    //Select first name
    public boolean enterFirstName(String FName) {
        try {

            WebElement FirstName = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(FirstName_xPath));
            FirstName.sendKeys(FName);
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            Thread.sleep(1000);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    //Select gender
    public boolean enterLastName(String LName) {
        try {

            WebElement LastName = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(LastName_xPath));
            LastName.sendKeys(LName);
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            Thread.sleep(1000);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
//select date
    public boolean selectDt(String date) {
        try {
            Thread.sleep(1000);

            WebElement Dt = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(Date_xPath));
            Dt.click();
            List<WebElement> datelist=driver.findElements(By.xpath("//select[@name='DateOfBirthDay']//option"));
              for (WebElement element:datelist){
                Actions action= new Actions(driver);//used for mouse clicking or mouse hover or scrolling the list
                action.moveToElement(element);

                // ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",checkboxTicketlinkWebL);

                String numberofdays=element.getText();
                if (numberofdays.contains(date)) {
                    element.click();
                    Thread.sleep(1000);

                    return true;
                }
                else{
                    continue;}
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }
    //select date
    public boolean selectMonth(String month) {
        try {
            Thread.sleep(1000);

            WebElement seltMonth = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(Month_xPath));
            seltMonth.click();
            List<WebElement> Monthlist=driver.findElements(By.xpath("//select[@name='DateOfBirthMonth']//option"));

            for (WebElement element:Monthlist){
                Actions action= new Actions(driver);//used for mouse clicking or mouse hover or scrolling the list
                action.moveToElement(element);

                // ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",checkboxTicketlinkWebL);

                String numberofmonth=element.getText();
                if (numberofmonth.contains(month)) {
                    element.click();
                    Thread.sleep(1000);
                    return true;
                }
                else{
                    continue;}
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }
    //select date
    public boolean selectYear(String yr) {
        try {
            Thread.sleep(1000);

            WebElement selectYear = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(Year_xPath));
            selectYear.click();
            List<WebElement> Yrlist=driver.findElements(By.xpath("//select[@name='DateOfBirthYear']//option"));
            System.out.println("Total Checkbox "+ Yrlist.size());
            for (WebElement element:Yrlist){
                Actions action= new Actions(driver);//used for mouse clicking or mouse hover or scrolling the list
                action.moveToElement(element);
                // ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",checkboxTicketlinkWebL);

                String selectYr=element.getText();
                if (selectYr.contains(yr)) {
                    element.click();
                    Thread.sleep(1000);
                    return true;
                }
                else{
                    continue;}
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }
    //Enter Email
    public boolean enterEmail(String email) {
        try {

            WebElement enterEmail = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(Email_xpath));
            enterEmail.sendKeys(email);
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            Thread.sleep(1000);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //Enter Comapny info
    public boolean enterComp(String Company) {
        try {

            WebElement enterComp = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(Company_xPath));
            enterComp.sendKeys(Company);
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            Thread.sleep(1000);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //Enter PWD
    public boolean enterPassword(String password) {
        try {

            WebElement enterPassword = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(Password_xpath));
            enterPassword.sendKeys(password);
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            Thread.sleep(1000);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    //Enter ConfirmPwd
    public boolean enterConfirmPwd(String Confirmpwd) {
        try {

            WebElement enterConfirmPwd = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(ConfirmPwd_xpath));
            enterConfirmPwd.sendKeys(Confirmpwd);
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            Thread.sleep(1000);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    //ClickRegisBtn
    public boolean clickRegisBtn() {
        try {

            WebElement clickRegisBtn = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(RegisBtn_xpath));
            clickRegisBtn.click();
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            Thread.sleep(1000);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    //Click Continue Btn
    public boolean clickContinueBtn() {
        try {

            WebElement clickContBtn = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(ContinueBtn_xpath));
            clickContBtn.click();
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

  }
