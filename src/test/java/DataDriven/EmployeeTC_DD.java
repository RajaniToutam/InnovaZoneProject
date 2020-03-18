
package DataDriven;

import EmployeePO.EmployeeAddPO;
import SetUp.BaseTest;
import com.aventstack.extentreports.Status;
import innovaSignInTestCases.innovaSignInTC;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class EmployeeTC_DD extends BaseTest {
    public EmployeeTC_DD() {
    }

    public EmployeeTC_DD(WebDriver passDriver) {
        driver = passDriver;
    }

    @Test
    public void EmployeeAddTC() throws IOException, InterruptedException {

        innovaSignInTC SignIn = new innovaSignInTC(driver);
        SignIn.innovaSignInTest();

        Employee_DD EmpDD_Obj = new Employee_DD(driver);


        test = extent.createTest("Test Passed", "Verify Users tab");
        test.assignCategory("Module 2 - Add Employee's  ");
        assertTrue(EmpDD_Obj.clickUsers(), "Opps!! unable to click Users");
        test.log(Status.PASS, "Users link available");


        assertTrue(EmpDD_Obj.clickEmployees(), "Opps!! unable to click Employees");
        test.log(Status.PASS, "Employees link available");


        //Step 3: Click On AddEE

        assertTrue(EmpDD_Obj.clickAddEmployees(), "Opps!! unable to click Add Employee");
        test.log(Status.PASS, "Employees button available");
        test.log(Status.INFO, "Test case ended");

        String src = System.getProperty("user.dir") + "\\src\\test\\java\\DataDriven\\eeAddDataFile.xlsx";
        Workbook workbook;
        Sheet sheet;
        Cell cell;

        FileInputStream fileInput = new FileInputStream(new File(src)); //load the excel file

        workbook = new XSSFWorkbook(fileInput);
        sheet = workbook.getSheetAt(0);

        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            //read data from Firstname cell
            cell = sheet.getRow(i).getCell(0);
            System.out.println("FirstName: " + i + cell);
            driver.findElement(By.xpath("//input[@name='first_name']")).clear();
            driver.findElement(By.xpath("//input[@name='first_name")).sendKeys(cell.getStringCellValue());
            Thread.sleep(3000);

            cell = sheet.getRow(i).getCell(0);
            System.out.println("FirstName: " + i + cell);

            String firstname = cell.getStringCellValue(); //"TestFirstName";

            //assertTrue(EmpDD_Obj.enterTextInInputField(firstname, EmpDD_Obj.FName_xPath, 30), "Opps!! unable to enter first name");
            test.log(Status.PASS, "Employees First Name able to enter");


            //read data from Lastname
            cell = sheet.getRow(i).getCell(1);
            System.out.println("LastName: " + i + cell);
            driver.findElement(By.xpath("//input[@name='last_name']")).clear();
            driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(cell.getStringCellValue());

            //read data from Employee ID
            cell = sheet.getRow(i).getCell(2);
            System.out.println("LastName: " + i + cell);
            driver.findElement(By.xpath("//input[@name='last_name']")).clear();
            driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(cell.getStringCellValue());

            //write data for Status:
            cell = sheet.getRow(i).createCell(3);
            System.out.println("Status: " + i + cell);
            cell.setCellValue("pass");

            FileOutputStream fileout = new FileOutputStream(new File(src));
            workbook.write(fileout);
            fileout.flush();
            fileout.close();


        }
    }
}

