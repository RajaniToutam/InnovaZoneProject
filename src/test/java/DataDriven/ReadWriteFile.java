package DataDriven;

import SetUp.BaseTest;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ReadWriteFile{

    public WebDriver driver;

    @BeforeTest
    public void TestSetup() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe"); //C:\\driver\\chromedriver.exe"
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://qa.izhips.com/admin/login");
    }


/*
public class ReadWriteFile extends BaseTest {
    public ReadWriteFile() { }

    public ReadWriteFile(WebDriver passDriver) {
        driver = passDriver;
    }
*/
    @Test
    public void ReadWriteFile() throws IOException, InterruptedException {
        String src = System.getProperty("user.dir") + "\\src\\test\\java\\DataDriven\\dataFile.xlsx";

        Workbook workbook;
        Sheet sheet;
        Cell cell;
        driver.findElement(By.xpath("//input[@name='email']")).click();

        FileInputStream fileInput = new FileInputStream(new File(src)); //load the excel file

        workbook = new XSSFWorkbook(fileInput);
        sheet = workbook.getSheetAt(0);

        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            //read data from email cell
            cell = sheet.getRow(i).getCell(0);
            System.out.println("EmailID: " + i + cell);
            driver.findElement(By.xpath("//input[@name='email']")).clear();
            driver.findElement(By.xpath("//input[@name='email']")).sendKeys(cell.getStringCellValue());
            Thread.sleep(3000);

            //read data from pwd
            cell = sheet.getRow(i).getCell(1);
            System.out.println("Password: " + i + cell);
            driver.findElement(By.xpath("//input[@name='password']")).clear();
            driver.findElement(By.xpath("//input[@name='password']")).sendKeys(cell.getStringCellValue());

            //write data for Status:
            cell = sheet.getRow(i).createCell(2);
            System.out.println("Status: " + i + cell);
            cell.setCellValue("pass");

            FileOutputStream fileout = new FileOutputStream(new File(src));
            workbook.write(fileout);
            fileout.flush();
            fileout.close();

        }
    }
}