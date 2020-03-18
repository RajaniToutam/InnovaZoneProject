package LoginPO;

import SetUp.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class SignInPO_test extends BasePage {

        public SignInPO_test(WebDriver driver) {

            super(driver);
        }

        //////////////////////////////////////////////////////Locator Start
        public By EmailName_xPath=By.xpath("//input[@name='email']");
        public By Password_xPath=By.xpath("//input[@name='password']");
        public By SignBtn_xPath=By.xpath("//BUTTON[@class='btn'][text()='Sign In']");
        public By WelCome_xPath=By.xpath("//button[contains(text(),'Welcome')]");

        public By Users_xPath = By.xpath("//span[@title='Users']");
        public By managers_xPath = By.xpath("//span[@title='Managers']");
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

        //////////////////////////////////////////////////////// Locator End


        //////////////////////////////  Method Start//////////////////////////////////////////////////////////
        // enter UserName

        public boolean enterEmailName(String TestEmail){
            try {

                WebElement UserName = (new WebDriverWait(driver,90))
                        .until(ExpectedConditions.visibilityOfElementLocated(EmailName_xPath));
                UserName.sendKeys(TestEmail);
                return true;
            }
            catch (Exception e)
            {
                return false;
            }
        }

        // enter Password

        public boolean enterPassword(String TestPassword){
            try {

                WebElement Password = (new WebDriverWait(driver,90))
                        .until(ExpectedConditions.visibilityOfElementLocated(Password_xPath));
                Password.sendKeys(TestPassword);
                return true;
            }
            catch (Exception e)
            {
                return false;
            }
        }

        //click on Sign In button

        public boolean verifyClickOnSign(){
            try {
                Thread.sleep(4000);
                WebElement SignBtn = (new WebDriverWait(driver,90))
                        .until(ExpectedConditions.visibilityOfElementLocated(SignBtn_xPath));
                SignBtn.click();
                WebElement WelCome = (new WebDriverWait(driver,90))
                        .until(ExpectedConditions.visibilityOfElementLocated(WelCome_xPath));
                if (WelCome.isDisplayed()) {
                    return true;
                }
                else {return false;}
            }
            catch (Exception e)
            {
                return false;
            }
        }


        // enter Users

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

        // enter Managers
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

        // enter AddManager
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

                WebElement firstname = (new WebDriverWait(driver,90))
                        .until(ExpectedConditions.visibilityOfElementLocated(firstName_xPath));
                firstname.sendKeys(testname);
                return true;
            }
            catch (Exception e)
            {
                return false;
            }
        }
        // enter lastname
        public boolean enterlasttName(String LastName){
            try {

                WebElement lastname = (new WebDriverWait(driver,90))
                        .until(ExpectedConditions.visibilityOfElementLocated(lastName_xPath));
                lastname.sendKeys(LastName);
                return true;
            }
            catch (Exception e)
            {
                return false;
            }
        }
        // enter username
        public boolean enterUserName(String UserName){
            try {

                WebElement userName = (new WebDriverWait(driver,90))
                        .until(ExpectedConditions.visibilityOfElementLocated(userName_xPath));
                userName.sendKeys(UserName);
                return true;
            }
            catch (Exception e)
            {
                return false;
            }
        }
        // enter email
        public boolean enterEmail(String email){
            try {

                WebElement userName = (new WebDriverWait(driver,90))
                        .until(ExpectedConditions.visibilityOfElementLocated(email_xPath));
                userName.sendKeys(email);
                return true;
            }
            catch (Exception e)
            {
                return false;
            }
        }
        // enter MgrType
        public boolean enterMgrType(String Mgr){
            try {

                WebElement mgrType = (new WebDriverWait(driver,90))
                        .until(ExpectedConditions.visibilityOfElementLocated(mgrType_xPath));
                mgrType.sendKeys(Mgr);
                return true;
            }
            catch (Exception e)
            {
                return false;
            }
        }

        // enter Password
        public boolean enterPwd (String pwd){
            try {

                WebElement enterPwd = (new WebDriverWait(driver,90))
                        .until(ExpectedConditions.visibilityOfElementLocated(password_xPath));
                enterPwd.sendKeys(pwd);
                return true;
            }
            catch (Exception e)
            {
                return false;
            }
        }
        // enter Confirm Password
        public boolean enterConfirmPassword (String ConfirmPwd){
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
        public boolean enterPhone (String Phone){
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
        // enter Cell Phone
        public boolean enterCellPhone (String CellPhone){
            try {

                WebElement enterCellPhone = (new WebDriverWait(driver,90))
                        .until(ExpectedConditions.visibilityOfElementLocated(cellNumber_xPath));
                enterCellPhone.sendKeys(CellPhone);
                return true;
            }
            catch (Exception e)
            {
                return false;
            }
        }

        // enter Address
        public boolean enteraddress (String address){
            try {

                WebElement enteraddress = (new WebDriverWait(driver,90))
                        .until(ExpectedConditions.visibilityOfElementLocated(address_xPath));
                enteraddress.sendKeys(address);
                return true;
            }
            catch (Exception e)
            {
                return false;
            }
        }
        // enter City
        public boolean enterCity (String City){
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
        public boolean enterState (String State){
            try {

                WebElement enterState = (new WebDriverWait(driver,90))
                        .until(ExpectedConditions.visibilityOfElementLocated(state_xPath));
                enterState.sendKeys(State);
                return true;
            }
            catch (Exception e)
            {
                return false;
            }
        }
        // enter ZipCode
        public boolean enterZip (String zip){
            try {

                WebElement enterZip = (new WebDriverWait(driver,90))
                        .until(ExpectedConditions.visibilityOfElementLocated(zip_xPath));
                enterZip.sendKeys(zip);
                return true;
            }
            catch (Exception e)
            {
                return false;
            }
        }
    }



