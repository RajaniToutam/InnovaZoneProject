package DataDriven;

import CommonPO.CommonUtilityMethod;
import SetUp.BaseTest;
import com.aventstack.extentreports.Status;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import static org.testng.Assert.assertTrue;

public class DDRegisterNopCommerceTC extends BaseTest {
    DDRegisterNopCommerceTC(){}

    public DDRegisterNopCommerceTC(WebDriver passDriver) {
        driver = passDriver;
    }

    //@Test
    public void DDRegisterNopCommerceTC() throws IOException, InterruptedException{

        String src = System.getProperty("user.dir") + "\\src\\test\\java\\datafile.xlsx";

        DDRegisterNopCommercePO RegNopCommPO_Obj = new DDRegisterNopCommercePO(driver);
        CommonUtilityMethod CommUtiMethod_obj = new CommonUtilityMethod(driver);

        Workbook workbook;
        Sheet sheet;
        Cell cell;

        FileInputStream fileInput = new FileInputStream((new File(src)));
        workbook = new XSSFWorkbook(fileInput);
        sheet = workbook.getSheetAt(0);

        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            //read data from Email cell
            test = extent.createTest("Test Passed", "Verify Books tab");
            test.assignCategory("Buy Books");

            cell = sheet.getRow(i).getCell(0); //A2 row
            System.out.println("LogIn: " + i + cell);
            assertTrue(CommUtiMethod_obj.clickOnLinkOrButton(RegNopCommPO_Obj.LoginBtn_xPath), "Opps! unable to click on regiter button");


            cell = sheet.getRow(i).getCell(0);
            System.out.println("EmailID: " + i + cell);
            assertTrue((CommUtiMethod_obj.enterTextOnDesiredArea(RegNopCommPO_Obj.Email_xPath, cell.getStringCellValue())), "Opps! unable to enter the emailID");
            test.log(Status.PASS, "enter email info");

            cell = sheet.getRow(i).getCell(1);
            System.out.println("Password: " + i + cell);
            assertTrue((CommUtiMethod_obj.enterTextOnDesiredArea(RegNopCommPO_Obj.Password_xPath, cell.getStringCellValue())), "Opps! unable to enter the Password");

           System.out.println("RememberMe: " + i + cell);
            assertTrue(CommUtiMethod_obj.clickOnLinkOrButton(RegNopCommPO_Obj.RememMe_xPath), "Opps! unable to click on remember me checkbox button");

            System.out.println("LogOn: " + i + cell);
            assertTrue(CommUtiMethod_obj.clickOnLinkOrButton(RegNopCommPO_Obj.SubmitBtn_xPath), "Opps! unable to click on Log On button");

            System.out.println("Books: " + i + cell);
            assertTrue(CommUtiMethod_obj.clickOnLinkOrButton(RegNopCommPO_Obj.Books_xPath), "Opps! unable to click on Books tab");

            System.out.println("Product Sort By dropdown: " + i + cell);
            assertTrue(CommUtiMethod_obj.clickOnLinkOrButton(RegNopCommPO_Obj.Prodsorting_xPath), "Opps! unable to click on Sort By dropdown");

            System.out.println("Add to cart: " + i + cell);
            assertTrue(CommUtiMethod_obj.clickOnLinkOrButton(RegNopCommPO_Obj.AddtoCart_xPath), "Opps! unable to click on add to cart");

            System.out.println("Click on shopping cart: " + i + cell);
            assertTrue(CommUtiMethod_obj.clickOnLinkOrButton(RegNopCommPO_Obj.ShoppingCart_xPath), "Opps! unable to click on shopping cart");

            System.out.println("Click on term & services: " + i + cell);
            assertTrue(CommUtiMethod_obj.clickOnLinkOrButton(RegNopCommPO_Obj.TermofServ_xPath), "Opps! unable to click on terms & services");

            System.out.println("Click checkout: " + i + cell);
            assertTrue(CommUtiMethod_obj.clickOnLinkOrButton(RegNopCommPO_Obj.Chkout_xPath), "Opps! unable to click on checkout");

            cell = sheet.getRow(i).getCell(2);
            System.out.println("Password: " + i + cell);
            assertTrue((CommUtiMethod_obj.enterTextOnDesiredArea(RegNopCommPO_Obj.Password_xPath, cell.getStringCellValue())), "Opps! unable to enter the Password");

        }


    }
}