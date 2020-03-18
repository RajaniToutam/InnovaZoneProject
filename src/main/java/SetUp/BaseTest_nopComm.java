package SetUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

;

public class BaseTest_nopComm {

    public WebDriver driver = null;

    public BaseTest_nopComm() {
    }

    @Parameters({"browserName", "url","localDriverPath"})
    @BeforeMethod(alwaysRun = true)
    public void launchBrowser(@Optional("chrome") String browserName, @Optional("https://demo.nopcommerce.com/") String url, @Optional("C:\\driver\\chromedriver.exe") String localDriverPath) throws IOException, InterruptedException{
        this.getLocalDriver(browserName, localDriverPath);
        this.driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
        this.driver.manage().window().maximize();
        this.driver.get(url);

    }

    @AfterMethod
    public void terminateBrowser(ITestResult result) throws Exception{
        this.driver.quit();

    }

/*
    public WebDriver getLocalDriver(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ankit.Shah\\Documents\\ZIp\\chromedriver.exe");
            this.driver = new ChromeDriver();
            this.driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
        } else if (browserName.equalsIgnoreCase("firefox")) {
*/
/*
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\driver\\geckodriver.exe");
*//*

            WebDriverManager.firefoxdriver().setup();
            this.driver = new FirefoxDriver();
            this.driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
        }
        */
/*      else if (browserName.equalsIgnoreCase("Edge")) {
         *//*
*/
/*
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\driver\\geckodriver.exe");
*//*
*/
/*
            WebDriverManager.edgedriver().setup();
            this.driver = new EdgeDriver();
            this.driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
        }*//*


        return this.driver;
    }
*/


    public WebDriver getLocalDriver(String browserName, String localDriverPath) {
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", localDriverPath);
            this.driver = new ChromeDriver();
            this.driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
        } else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", localDriverPath);
            this.driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("ie")) {
            this.driver = new InternetExplorerDriver();
        }

        return this.driver;
    }
}


