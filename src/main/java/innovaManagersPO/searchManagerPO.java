
package innovaManagersPO;

import SetUp.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class searchManagerPO extends BasePage {
    public searchManagerPO(WebDriver driver) {

        super(driver);
    }

    //////////////////////////////////////////////////////Locator Start


    public By Users_xPath = By.xpath("//span[@title='Users']");
    public By managers_xPath = By.xpath("//span[text()='Managers']");
    public By Search_xPath = By.xpath("//input[@type = 'search']");
    public By StatusBtn_xpath = By.xpath("//div[@class='checkbox-bird green  list-status-icon manager-status-update']");
/////////////////////////////////////////////////////// Locator End


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
// enter Search Button

    public boolean enterSearchName(String search) {
        try {

            WebElement SearchName = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(Search_xPath));
            SearchName.sendKeys(search);
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




