package firefoxScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class firefoxBrowser_ex7 {

    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        //Get Method to open URL in specified browser
        driver.get("https://www.engprod-charter.net");

        Set<String> handler = driver.getWindowHandles();

        Iterator<String> it = handler.iterator();

        String parentWindowID = it.next();
        System.out.println("parent window id" + parentWindowID);

        String childWindowID = it.next();
        System.out.println("CHild window id" + childWindowID);

        driver.switchTo().window(childWindowID);

        WebElement userName = (new WebDriverWait(driver, 30))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name= 'emailid']")));
        userName.sendKeys("admin");

        WebElement password = (new WebDriverWait(driver, 30))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name= 'emailid']")));
        password.sendKeys("admin");


        driver.close();;

        driver.switchTo().window(parentWindowID);

        System.out.println("Parent window pop up title" + driver.getTitle());

        driver.close();
        driver.quit();
        driver.close();
        driver.quit();




        driver.get("https://qa.izhips.com/admin/login");
        driver.findElement(By.name("email")).sendKeys("company@admin.com");
        driver.findElement(By.name("password")).sendKeys("admin");

        try{
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[@class= 'btn']")).click();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }catch (Exception e)
        {
            System.out.println(e);
        }

        WebElement users = (new WebDriverWait(driver, 30))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@title='Users']")));
        users.getAttribute("title");
        users.click();
    }
}
