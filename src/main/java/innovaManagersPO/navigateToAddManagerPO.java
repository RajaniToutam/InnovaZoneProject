package innovaManagersPO;

import SetUp.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class navigateToAddManagerPO extends BasePage {

    public navigateToAddManagerPO(WebDriver driver) {

        super(driver);
    }
    //////////////Locator Start////////////////////////////////////////

    public By Users_xPath = By.xpath("//span[@title='Users']");
    public By managers_xPath = By.xpath("//span[text()='Managers']");
    public By addmanager_xPath = By.xpath("//button[@class= 'btn btn-inline btn-primary']");
    public By firstName_xPath = By.name("first_name");
    public By lastName_xPath = By.name("last_name");
    public By userName_xPath = By.name("username");
    public By email_xPath = By.name("email");
    public By mgrType_xPath = By.name("user_type");
    public By password_xPath = By.name("password");
    public By confirmPwd_xPath = By.name("confirm_password");
    public By phone_xPath = By.name("phone");
    public By cellNumber_xPath = By.name("cell_number");
    public By address_xPath = By.name("address1");
    public By city_xPath = By.name("city");
    public By state_xPath = By.name("state");
    public By zip_xPath = By.name("zip");
    public By SaveClose_xPath = By.xpath("//*[text() ='Save & Close']");
    public By Search_xPath = By.xpath("//input[@type = 'search']");
    public By StatusBtn_xpath = By.xpath("//div[@class='checkbox-bird green  list-status-icon manager-status-update']");
    ///////////////////////// Locator End///////////////////////////////


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

    // Click Managers
    public boolean clickManagers() {
        try {

            WebElement manager = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(managers_xPath));
            manager.getAttribute("title");
            manager.click();
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            Thread.sleep(2000);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // Click AddManager
    public boolean clickAddmanager(){
        try {

            WebElement addmanager = (new WebDriverWait(driver,90))
                    .until(ExpectedConditions.visibilityOfElementLocated(addmanager_xPath));
            addmanager.click();
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
    // enter firstName
    public boolean enterfirstName(String testname){
        try {

            WebElement enterfirstName = (new WebDriverWait(driver,90))
                    .until(ExpectedConditions.visibilityOfElementLocated(firstName_xPath));
            enterfirstName.sendKeys(testname);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
    // enter LastName
    public boolean enterLasttName(String lastname){
        try {

            WebElement enterLasttName = (new WebDriverWait(driver,90))
                    .until(ExpectedConditions.visibilityOfElementLocated(lastName_xPath));
            enterLasttName.sendKeys(lastname);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
    // enter UserName
    public boolean enterUserN(String UserN){
        try {

            WebElement enterUserN = (new WebDriverWait(driver,90))
                    .until(ExpectedConditions.visibilityOfElementLocated(userName_xPath));
            enterUserN.sendKeys(UserN);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
    // enter Email
    public boolean enterEmail(String Email){
        try {

            WebElement enterUserName = (new WebDriverWait(driver,90))
                    .until(ExpectedConditions.visibilityOfElementLocated(email_xPath));
            enterUserName.sendKeys(Email);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    // enter ManagerType
    public boolean enterManagerType(String MGRType){
        try {

            WebElement enterManagerType = (new WebDriverWait(driver,90))
                    .until(ExpectedConditions.visibilityOfElementLocated(mgrType_xPath));
            enterManagerType.sendKeys(MGRType);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
    // enter Password
    public boolean enterPassword(String pwd){
        try {

            WebElement enterPassword = (new WebDriverWait(driver,90))
                    .until(ExpectedConditions.visibilityOfElementLocated(password_xPath));
            enterPassword.sendKeys(pwd);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
    // enter ConfirmPwd
    public boolean enterConfirmPassword(String ConfirmPwd){
        try {

            WebElement enterConfirmPassword = (new WebDriverWait(driver,90))
                    .until(ExpectedConditions.visibilityOfElementLocated(confirmPwd_xPath));
            enterConfirmPassword.sendKeys(ConfirmPwd);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
    // enter Phone
    public boolean enterPhone(String Phone){
        try {

            WebElement enterPhone = (new WebDriverWait(driver,90))
                    .until(ExpectedConditions.visibilityOfElementLocated(phone_xPath));
            enterPhone.sendKeys(Phone);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
    // enter CellPhone
    public boolean enterCellPhone(String CellPhone){
        try {

            WebElement enterCellNumber = (new WebDriverWait(driver,90))
                    .until(ExpectedConditions.visibilityOfElementLocated(cellNumber_xPath));
            enterCellNumber.sendKeys(CellPhone);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
    // enter Address
    public boolean enterAddress(String Address){
        try {

            WebElement enterAddress = (new WebDriverWait(driver,90))
                    .until(ExpectedConditions.visibilityOfElementLocated(address_xPath));
            enterAddress.sendKeys(Address);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    // enter City
    public boolean enterCity(String City){
        try {

            WebElement enterCity = (new WebDriverWait(driver,90))
                    .until(ExpectedConditions.visibilityOfElementLocated(city_xPath));
            enterCity.sendKeys(City);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
    // enter State
    public boolean enterState(String State){
        try {

            WebElement enterState = (new WebDriverWait(driver,90))
                    .until(ExpectedConditions.visibilityOfElementLocated(state_xPath));
            enterState.sendKeys(State);
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
            Thread.sleep(2000);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    // enter Zip
    public boolean enterZip(String Zip){
        try {
            Thread.sleep(2000);
            WebElement enterZip = (new WebDriverWait(driver,90))
                    .until(ExpectedConditions.visibilityOfElementLocated(zip_xPath));
            enterZip.sendKeys(Zip);
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,3000)");
            Thread.sleep(2000);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
    // Click Save&Close

    public boolean clickSaveClose() {
        try {

            WebElement clickSaveClose = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(SaveClose_xPath));
            clickSaveClose.click();
            Thread.sleep(2000);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
// enter Search Button

    public boolean enterSearchName(String search) {
        try {

            Thread.sleep(2000);
            WebElement SearchName = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(Search_xPath));
            SearchName.sendKeys(search);
            Thread.sleep(2000);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    //Enter ok alert

    public boolean clickAlert() throws Exception {
        try {
            WebElement statusBtn = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(StatusBtn_xpath));

            if (statusBtn.isDisplayed()) {
                statusBtn.click();
                Thread.sleep(2000);
                WebDriverWait wait = new WebDriverWait(driver, 90);
                wait.until(ExpectedConditions.alertIsPresent());
                Alert okAlert = driver.switchTo().alert();
                okAlert.accept();
                Thread.sleep(2000);
                return true;

            } else {
                System.out.println("btn  is not clickable..!!");
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }
}


