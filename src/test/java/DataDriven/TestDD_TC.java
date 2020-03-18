package DataDriven;

import CommonPO.CommonUtilityMethod;
import SetUp.BaseTest;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static org.testng.Assert.assertTrue;

public class TestDD_TC extends BaseTest {


    public TestDD_TC() {
    }

    @Test
    public void TestDD_TC() throws IOException, InterruptedException {

        String src = System.getProperty("user.dir") + "\\src\\test\\java\\DataDriven\\eeAddDataFile.xlsx";

        TestDD_PO TestPO_Obj = new TestDD_PO(driver);

        CommonUtilityMethod CommanMethod_obj = new CommonUtilityMethod(driver);

        Workbook workbook;
        Sheet sheet;
        Cell cell;
        Cell currentRowUser;
        Cell NextRowUser;

        FileInputStream fileInput = new FileInputStream(new File(src)); //load the excel file

        workbook = new XSSFWorkbook(fileInput);
        sheet = workbook.getSheetAt(0);

        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            //read data from Email cell

            test = extent.createTest("Test Passed", "Verify Users tab");
            test.assignCategory("Module 2 - Add Employee's  ");
/*
            if (i==1) {

                currentRowUser = sheet.getRow(i).getCell(0);
                NextRowUser = sheet.getRow(i + 1).getCell(0);

                System.out.println("current Row User: " + i + currentRowUser);
                System.out.println("Next Row User : " + (i + 1) + NextRowUser);*/
                try {

                    WebElement generic_WebL = (new WebDriverWait(driver, 5))
                            .until(ExpectedConditions.visibilityOfElementLocated(TestPO_Obj.Users_xPath));


                    assertTrue(CommanMethod_obj.clickDesiredLink(TestPO_Obj.Users_xPath), "Opps!! unable to click Users");
                    test.log(Status.PASS, "Users on Users");

                    assertTrue(CommanMethod_obj.clickDesiredLink(TestPO_Obj.Employee_xPath), "Opps!! unable to click Employees");
                    test.log(Status.PASS, "Click on Employees");


                    assertTrue(CommanMethod_obj.clickOnLinkOrButton(TestPO_Obj.AddEE_xPath), "Opps!! unable to click Add Employee tab");
                    test.log(Status.PASS, "click on Add Employees ");

                    cell = sheet.getRow(i).getCell(2); //B2
                    System.out.println("FirstName: " + i + cell);
                    assertTrue(CommanMethod_obj.enterTextOnDesiredArea(TestPO_Obj.FName_xPath, cell.getStringCellValue()), "Unable to enter first name ");
                    test.log(Status.PASS, "enter firstname");

                    cell = sheet.getRow(i).getCell(3); //B2
                    System.out.println("LastName: " + i + cell);
                    assertTrue(CommanMethod_obj.enterTextOnDesiredArea(TestPO_Obj.LName_xPath, cell.getStringCellValue()), "Unable to enter first name");
                    test.log(Status.PASS, "enter lastname ");

                    cell = sheet.getRow(i).getCell(4); //B2
                    System.out.println("userName: " + i + cell);
                    assertTrue(CommanMethod_obj.enterTextOnDesiredArea(TestPO_Obj.EEid_xPath, cell.getStringCellValue()), "Unable to enter user name");
                    test.log(Status.PASS, "enter user name ");

                    cell = sheet.getRow(i).getCell(5); //B2
                    System.out.println("Jobzone: " + i + cell);
                    assertTrue(CommanMethod_obj.selectFromDropDown(TestPO_Obj.Jobzone_xPath, cell.getStringCellValue()), "Unable to enter jobzone");
                    test.log(Status.PASS, "enter jobzone ");

                    cell = sheet.getRow(i).getCell(6); //B2
                    System.out.println("Password: " + i + cell);
                    assertTrue(CommanMethod_obj.enterTextOnDesiredArea(TestPO_Obj.Passwd_xPath, cell.getStringCellValue()), "Unable to enter password");
                    test.log(Status.PASS, "enter password ");

                    cell = sheet.getRow(i).getCell(7); //B2
                    System.out.println("ConfirmPassword: " + i + cell);
                    assertTrue(CommanMethod_obj.enterTextOnDesiredArea(TestPO_Obj.ConPassword_xPath, cell.getStringCellValue()), "Unable to enter confirm password");
                    test.log(Status.PASS, "enter confirm password ");

                    cell = sheet.getRow(i).getCell(8); //B2
                    System.out.println("BarCode: " + i + cell);
                    assertTrue(CommanMethod_obj.enterTextOnDesiredArea(TestPO_Obj.Barcode_xPath, cell.getStringCellValue()), "Unable to enter Barcode");
                    test.log(Status.PASS, "enter barcode ");

                    cell = sheet.getRow(i).getCell(9); //B2
                    System.out.println("Locker: " + i + cell);
                    assertTrue(CommanMethod_obj.enterTextOnDesiredArea(TestPO_Obj.LockerNo_xPath, cell.getStringCellValue()), "Unable to enter locker");
                    test.log(Status.PASS, "enter Locker ");

                    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
                    cell = sheet.getRow(i).getCell(10); //B2
                    System.out.println("Dept number: " + i + cell);
                    assertTrue(CommanMethod_obj.clickOnLinkOrButton(TestPO_Obj.Dept_xPath), "Unable to enter Dept number");
                    test.log(Status.PASS, "enter Dept number ");

                    cell = sheet.getRow(i).getCell(11); //B2
                    System.out.println("Location number: " + i + cell);
                    assertTrue(CommanMethod_obj.enterTextOnDesiredArea(TestPO_Obj.location_xPath, cell.getStringCellValue()), "Unable to enter location number");
                    test.log(Status.PASS, "enter location number ");

                    cell = sheet.getRow(i).getCell(12); //B2
                    System.out.println("Combination number: " + i + cell);
                    assertTrue(CommanMethod_obj.enterTextOnDesiredArea(TestPO_Obj.CombNo_xPath, cell.getStringCellValue()), "Unable to enter combination number");
                    test.log(Status.PASS, "enter combination number ");

                    //cell = sheet.getRow(i).getCell(13); //B2
                    //System.out.println("Date of hire number: " + i + cell);
                    assertTrue(CommanMethod_obj.clickOnLinkOrButton(TestPO_Obj.DtofHire_xPath), "Unable to enter location number");
                    test.log(Status.PASS, "enter date number ");


                    System.out.println("image upload: " + i + cell);
                    assertTrue(TestPO_Obj.imageUpLoad(), "Unable to upload image");
                    ExtentTest able_to_upload_image_ = test.log(Status.PASS, "able to upload image ");


                    System.out.println("Save & close: " + i + cell);
                    assertTrue(CommanMethod_obj.clickOnLinkOrButton(TestPO_Obj.SaveClose_xPath), "Unable to save & close");
                    test.log(Status.PASS, "successfully saved ");

                    cell = sheet.getRow(i).createCell(13); //E2 it shd print Pass/Fail
                    System.out.println("Status: " + i + cell);
                    cell.setCellValue("pass");


                } catch (Exception e) {
                    cell = sheet.getRow(i).getCell(0); //A2 row
                    System.out.println("EmailID: " + i + cell);


                    assertTrue(CommanMethod_obj.enterTextOnDesiredArea(TestPO_Obj.EmailName_xPath, cell.getStringCellValue()), "Opps!! unable to enter email info");
                    test.log(Status.PASS, "enter email info");

                    //read data from pwd

                    cell = sheet.getRow(i).getCell(1); //B2
                    System.out.println("Password: " + i + cell);
                    assertTrue(CommanMethod_obj.enterTextOnDesiredArea(TestPO_Obj.Password_xPath, cell.getStringCellValue()), "unable to enter password");
                    test.log(Status.PASS, "enter pwd");


                    assertTrue(CommanMethod_obj.clickOnLinkOrButton(TestPO_Obj.SignBtn_xPath), "Opps!! unable to click Signin button");
                    test.log(Status.PASS, "able to sign in in QA Demo");


                    assertTrue(CommanMethod_obj.clickDesiredLink(TestPO_Obj.Users_xPath), "Opps!! unable to click Users");
                    test.log(Status.PASS, "Users on Users");

                    assertTrue(CommanMethod_obj.clickDesiredLink(TestPO_Obj.Employee_xPath), "Opps!! unable to click Employees");
                    test.log(Status.PASS, "Click on Employees");


                    assertTrue(CommanMethod_obj.clickOnLinkOrButton(TestPO_Obj.AddEE_xPath), "Opps!! unable to click Add Employee tab");
                    test.log(Status.PASS, "click on Add Employees ");

                    cell = sheet.getRow(i).getCell(2); //B2
                    System.out.println("FirstName: " + i + cell);
                    assertTrue(CommanMethod_obj.enterTextOnDesiredArea(TestPO_Obj.FName_xPath, cell.getStringCellValue()), "Unable to enter first name ");
                    test.log(Status.PASS, "enter firstname");

                    cell = sheet.getRow(i).getCell(3); //B2
                    System.out.println("LastName: " + i + cell);
                    assertTrue(CommanMethod_obj.enterTextOnDesiredArea(TestPO_Obj.LName_xPath, cell.getStringCellValue()), "Unable to enter first name");
                    test.log(Status.PASS, "enter lastname ");

                    cell = sheet.getRow(i).getCell(4); //B2
                    System.out.println("userName: " + i + cell);
                    assertTrue(CommanMethod_obj.enterTextOnDesiredArea(TestPO_Obj.EEid_xPath, cell.getStringCellValue()), "Unable to enter user name");
                    test.log(Status.PASS, "enter user name ");

                    cell = sheet.getRow(i).getCell(5); //B2
                    System.out.println("Jobzone: " + i + cell);
                    assertTrue(CommanMethod_obj.selectFromDropDown(TestPO_Obj.Jobzone_xPath, cell.getStringCellValue()), "Unable to enter jobzone");
                    test.log(Status.PASS, "enter jobzone ");

                    cell = sheet.getRow(i).getCell(6); //B2
                    System.out.println("Password: " + i + cell);
                    assertTrue(CommanMethod_obj.enterTextOnDesiredArea(TestPO_Obj.Passwd_xPath, cell.getStringCellValue()), "Unable to enter password");
                    test.log(Status.PASS, "enter password ");

                    cell = sheet.getRow(i).getCell(7); //B2
                    System.out.println("ConfirmPassword: " + i + cell);
                    assertTrue(CommanMethod_obj.enterTextOnDesiredArea(TestPO_Obj.ConPassword_xPath, cell.getStringCellValue()), "Unable to enter confirm password");
                    test.log(Status.PASS, "enter confirm password ");

                    cell = sheet.getRow(i).getCell(8); //B2
                    System.out.println("BarCode: " + i + cell);
                    assertTrue(CommanMethod_obj.enterTextOnDesiredArea(TestPO_Obj.Barcode_xPath, cell.getStringCellValue()), "Unable to enter Barcode");
                    test.log(Status.PASS, "enter barcode ");

                    cell = sheet.getRow(i).getCell(9); //B2
                    System.out.println("Locker: " + i + cell);
                    assertTrue(CommanMethod_obj.enterTextOnDesiredArea(TestPO_Obj.LockerNo_xPath, cell.getStringCellValue()), "Unable to enter locker");
                    test.log(Status.PASS, "enter Locker ");

                    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
                    cell = sheet.getRow(i).getCell(10); //B2
                    System.out.println("Dept number: " + i + cell);
                    assertTrue(CommanMethod_obj.clickOnLinkOrButton(TestPO_Obj.Dept_xPath), "Unable to enter Dept number");
                    test.log(Status.PASS, "enter Dept number ");

                    cell = sheet.getRow(i).getCell(11); //B2
                    System.out.println("Location number: " + i + cell);
                    assertTrue(CommanMethod_obj.enterTextOnDesiredArea(TestPO_Obj.location_xPath, cell.getStringCellValue()), "Unable to enter location number");
                    test.log(Status.PASS, "enter location number ");

                    cell = sheet.getRow(i).getCell(12); //B2
                    System.out.println("Combination number: " + i + cell);
                    assertTrue(CommanMethod_obj.enterTextOnDesiredArea(TestPO_Obj.CombNo_xPath, cell.getStringCellValue()), "Unable to enter combination number");
                    test.log(Status.PASS, "enter combination number ");

                    //cell = sheet.getRow(i).getCell(13); //B2
                    //System.out.println("Date of hire number: " + i + cell);
                    assertTrue(CommanMethod_obj.clickOnLinkOrButton(TestPO_Obj.DtofHire_xPath), "Unable to enter location number");
                    test.log(Status.PASS, "enter date number ");


                    System.out.println("image upload: " + i + cell);
                    assertTrue(TestPO_Obj.imageUpLoad(), "Unable to upload image");
                    ExtentTest able_to_upload_image_ = test.log(Status.PASS, "able to upload image ");


                    System.out.println("Save & close: " + i + cell);
                    assertTrue(CommanMethod_obj.clickOnLinkOrButton(TestPO_Obj.SaveClose_xPath), "Unable to save & close");
                    test.log(Status.PASS, "successfully saved ");

                    Thread.sleep(5000);

                    cell = sheet.getRow(i).createCell(13); //E2 it shd print Pass/Fail
                    System.out.println("Status: " + i + cell);
                    cell.setCellValue("pass"); }

            FileOutputStream fileout = new FileOutputStream(new File(src));
            workbook.write(fileout);
            fileout.flush();
            fileout.close();

                }
            }





/*           System.out.println("Userlogged: " + i + cell);
            assertTrue(CommanMethod_obj.clickDesiredLink(TestPO_Obj.userlogged_xPath), "Unable to click on userlogged");
            test.log(Status.PASS, "successfully click on userlogged ");


            System.out.println("Log out : " + i + cell);
            assertTrue(CommanMethod_obj.clickOnLinkOrButton(TestPO_Obj.Logout_xPath), "Unable to log out");
            test.log(Status.PASS, "log out ");*/

            //write data for Status:



            }





