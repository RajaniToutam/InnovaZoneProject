package LoginPO;

import SetUp.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


    public class SignInPagePO extends BasePage {

        public SignInPagePO(WebDriver driver) {

            super(driver);
        }

        //////////////////////////////////////////////////////Locator Start

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

        //////////////////////////////////////////////////////// Locator End


        //////////////////////////////  Method Start//////////////////////////////////////////////////////////

        // enter Users

        public boolean clickUsers() {
            try {

                WebElement UserName = (new WebDriverWait(driver, 90))
                        .until(ExpectedConditions.visibilityOfElementLocated(Users_xPath));
                UserName.getAttribute("title");
                UserName.click();
                Thread.sleep(3000);
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
                Thread.sleep(3000);
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
        // enter UserName
        public boolean enterUserName(String Username){
            try {

                WebElement username = (new WebDriverWait(driver,90))
                        .until(ExpectedConditions.visibilityOfElementLocated(userName_xPath));
                username.sendKeys(Username);
                return true;
            }
            catch (Exception e)
            {
                return false;
            }

        }
        // enter lastname
        public boolean enterEmail(String LastName){
            try {

                WebElement email = (new WebDriverWait(driver,90))
                        .until(ExpectedConditions.visibilityOfElementLocated(email_xPath));
                email.sendKeys(LastName);
                return true;
            }
            catch (Exception e)
            {
                return false;
            }

        }
    }

