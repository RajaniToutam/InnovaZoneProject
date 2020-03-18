package innovaHomePage;
import SetUp.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HomePagePO extends BasePage {
    public HomePagePO(WebDriver driver) {

        super(driver);
    }
    ////////////////////Locator Start/////////////////////////////////

    public By prodManagementLink_xPath = By.xpath("//span[@title = 'Product Management']");
    public By jobZoneLabel_xPath = By.xpath("//a[text()= 'Jobzone']");
    public By usersLink_xPath = By.xpath("//span[text()= 'Users']");
    public By managers_xPath = By.xpath("//span[text()='Managers']");
    public By Search_xPath = By.xpath("//input[@type = 'search']");
    public By StatusBtn_xpath = By.xpath("//div[@class='checkbox-bird green  list-status-icon manager-status-update']");

    //////////////////////////////  Method Start/////////////////////


        // Click Prod Mang tab

    public boolean clickprodManagementLink() {
        try {

            WebElement clickprodManagementLink = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(prodManagementLink_xPath));
            clickprodManagementLink.click();
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            Thread.sleep(2000);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
// Click JobZone tab

    public boolean clickjobZoneLabel() {
        try {

            WebElement clickjobZoneLabel = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(jobZoneLabel_xPath));
            clickjobZoneLabel.click();
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            Thread.sleep(2000);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
// Click Users Tab

    public boolean clickusersLink() {
        try {

            WebElement clickusersLink = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(usersLink_xPath));
            clickusersLink.click();
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
            Thread.sleep(2000);
            WebElement manager = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(managers_xPath));
            manager.getAttribute("title");
            manager.click();
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);

            return true;
        } catch (Exception e) {
            return false;
        }
    }
// enter Search Button

    public boolean enterSearchName(String search) {
        try {

            WebElement enterSearchName = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(Search_xPath));
            enterSearchName.sendKeys(search);
            Thread.sleep(3000);
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
            //  return true;
            //statusBtn.click();

            // ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",checkboxTicketlinkWebL);
            //isDisplay method to check whether element is displaying or not
            if (statusBtn.isDisplayed()) {
                statusBtn.click();
                Thread.sleep(2000);
                WebDriverWait wait = new WebDriverWait(driver, 90);
                wait.until(ExpectedConditions.alertIsPresent());
                Alert okAlert = driver.switchTo().alert();
                okAlert.accept();
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

