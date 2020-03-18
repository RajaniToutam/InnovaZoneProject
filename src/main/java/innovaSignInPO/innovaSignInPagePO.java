package innovaSignInPO;

import SetUp.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class innovaSignInPagePO extends BasePage {
    public innovaSignInPagePO(WebDriver driver)  {
        super(driver);
    }

    //Locator Start/////////////////////////////////////////////////////
    public By EmailName_xPath=By.xpath("//input[@name='email']");
    public By Password_xPath=By.xpath("//input[@name='password']");
    public By SignBtn_xPath=By.xpath("//BUTTON[@class='btn'][text()='Sign In']");
    public By WelCome_xPath=By.xpath("//button[contains(text(),'Welcome')]");

    /////////////////////////////// Locator End/////////////////////////////////////////////////////

    //////////////////////////////  Method Start//////////////////////////////
    // enter UserName/email

    public boolean enterUserEmail(String UserEmail){
        try {

            WebElement enterUserEmail = (new WebDriverWait(driver,90))
                    .until(ExpectedConditions.visibilityOfElementLocated(EmailName_xPath));
            enterUserEmail.sendKeys(UserEmail);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    // enter Password

    public boolean enterPassword(String UserPassword){
        try {

            WebElement Password = (new WebDriverWait(driver,90))
                    .until(ExpectedConditions.visibilityOfElementLocated(Password_xPath));
            Password.sendKeys(UserPassword);
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


}
