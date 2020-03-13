package firefoxScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class robotClassBulkUpLoad {
    public static void main(String[] args) throws InterruptedException, AWTException {
        Robot robot = new Robot();
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://qa.izhips.com/admin/login");
        driver.findElement(By.name("email")).sendKeys("company@admin.com");
        driver.findElement(By.name("password")).sendKeys("admin");

        try {
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[@class= 'btn']")).click();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        } catch (Exception e) {
            System.out.println(e);
        }

        WebElement Company = (new WebDriverWait(driver, 30))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@title='Company']")));
        Company.click();

        Thread.sleep(5000);

        WebElement Department = (new WebDriverWait(driver, 30))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Department']")));
        Department.click();

        WebElement bulkUpload = (new WebDriverWait(driver, 30))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class= 'btn btn-inline btn-primary']")));
        bulkUpload.click();

        WebElement browse = (new WebDriverWait(driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.name("csvFile")));

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", browse);

/*        WebElement browse = (new WebDriverWait(driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.name("csvFile")));
        //browse.click();*/


        StringSelection ss = new StringSelection("C:\\Training_Plan.xlsx");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        Thread.sleep(3000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        Thread.sleep(3000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(5000);
        driver.close();
        //driver.quit();


    }
}
