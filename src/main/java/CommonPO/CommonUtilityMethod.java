
package CommonPO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CommonUtilityMethod {

    public WebDriver driver;

    public CommonUtilityMethod(WebDriver driver) {
        this.driver = driver;
    }


    public boolean enterTextOnDesiredArea(By by, String data) {
        try {
            Thread.sleep(3000);
            WebElement generic_WebL = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
            if (generic_WebL.isDisplayed()) {
                generic_WebL.clear();
                generic_WebL.sendKeys(data);
                return true;
            }
            return false;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean clickDesiredLink(By by) {
        try {
            Thread.sleep(2000);
            WebElement generic_WebL = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
            generic_WebL.getAttribute("title");
            generic_WebL.click();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean clickOnLinkOrButton(By by) {
        try {

            WebElement generic_WebL = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
            generic_WebL.click();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean selectFromDropDown(By by, String value) {
        try {
            Thread.sleep(1000);
            Select selectRule = new Select((new WebDriverWait(driver, 60))
                    .until(ExpectedConditions.visibilityOfElementLocated(by)));
            selectRule.selectByVisibleText(value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    public boolean verifyElementIsVisible(By webElement) {
        try {

            Thread.sleep(3000);
            WebElement generic_WebL = (new WebDriverWait(driver, 60))
                    .until(ExpectedConditions.visibilityOfElementLocated(webElement));
            if (generic_WebL.isDisplayed()) {
              //  generic_WebL.click();
                return true;
            } return false;

        } catch (Exception e) {
            return false;
        }

    }


    public boolean clickAction(String text) {
        try {
            Thread.sleep(2000);
            List<WebElement> dressesList = driver.findElements(By.xpath("//ul[@class='submenu-container clearfix first-in-line-xs']//li//li"));
            System.out.println("Total dropdown " + dressesList.size());

            for (WebElement element : dressesList) {
                Actions action = new Actions(driver);
                action.moveToElement(element).build().perform();

                String dressnames = element.getText();
                System.out.println("dress names  " + dressnames);
                if (dressnames.contains(text)) {
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

    public boolean clickOnDropDownDate(String Date, String DropDownLocater) {
        try {

           /* WebElement clickSortByOptions = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated());
            clickSortByOptions.click();*/

            driver.findElement(By.xpath("//select[@id = '"+DropDownLocater+"']")).click();
            Thread.sleep(2000);
            List<WebElement> prodList = driver.findElements(By.xpath("//select[@id='"+DropDownLocater+"']//option"));
            System.out.println("Total dropdown " + prodList.size());
            for (WebElement element : prodList) {
                Actions action = new Actions(driver);
                action.moveToElement(element);

                String prodnames = element.getText();
                if (prodnames.contains(Date)) {
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

    public boolean clickOnWoman(By by) {
        try {
            Thread.sleep(5000);
            Actions actions = new Actions(driver);
            WebElement clickWomen = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
            actions.moveToElement(clickWomen).build().perform();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean clickOnTermCondition(){
        try{
            JavascriptExecutor jse = ((JavascriptExecutor) driver);
            WebElement element = driver.findElement(By.xpath("//div[@id = 'uniform-cgv']//input[@id= 'cgv']"));
            jse.executeScript("arguments[0].click();",element);
            Thread.sleep(2000);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}



