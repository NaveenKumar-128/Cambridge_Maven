package Fotor;
import java.io.FileInputStream;
import java.time.Duration;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Test_Data
{
            String driverPath = "C:\\Users\\NaveenKumarKollimarl\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium  Web\\Drivers\\chromedriver_win32\\chromedriver.exe";
            WebDriver driver;
            SignUp_Page objSignUp_Page;
            Signin_Page objSignin_Page;
            EditImage_Page objEditImage_Page;
            
                   
            @BeforeTest
            public void setup(){
               System.setProperty("webdriver.chrome.driver", driverPath);
                 driver = new ChromeDriver();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        // driver.get("https://www.fotor.com/");
         driver.get("https://www.fotor.com/photo-editor-app/editor/cloud");
            driver.manage().window().maximize();

      }
        @Test()
      public void login() throws Exception {
            
           FileInputStream file = new FileInputStream("C:\\Users\\NaveenKumarKollimarl\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium Project\\TestData\\TestData.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(file);
//            //SignUp
//            XSSFSheet wbst = workbook.getSheetAt(0);
//            int rownum= wbst.getLastRowNum();
//            int colnum = wbst.getRow(0).getPhysicalNumberOfCells();
//            XSSFCell EmailAddress;
//            XSSFCell Password;
//            EmailAddress =wbst.getRow(1).getCell(0);
//            Password =wbst.getRow(1).getCell(1);
//            objSignUp_Page = new SignUp_Page(driver);
//            objSignUp_Page.signin();   
//            objSignUp_Page.createaccount();
//            objSignUp_Page.signupwithemail();
//            objSignUp_Page.emailaddress(EmailAddress.toString());
//            objSignUp_Page.password(Password.toString());
//            objSignUp_Page.agreeterms();
//            objSignUp_Page.SignUp();
//            objSignin_Page.next();
//            objSignin_Page.CLOSE();
  ///Login Negative
//            XSSFSheet wbst1 = workbook.getSheetAt(1);
//            int rownum1= wbst1.getLastRowNum();
//            int colnum1 = wbst1.getRow(0).getPhysicalNumberOfCells();
//            XSSFCell EmailAdd ;
//            XSSFCell Passwd ;
//            EmailAdd =wbst1.getRow(1).getCell(0);
//            Passwd =wbst1.getRow(1).getCell(1);
//            objSignin_Page = new Signin_Page(driver);
//            objSignin_Page.signin();
//            objSignin_Page.emailaddress(EmailAdd.toString());
//            objSignin_Page.password(Passwd.toString());
//            objSignin_Page.SignIn();
//            objSignin_Page.message();
//            objSignin_Page.close();
//         //Login Positive   
//            XSSFCell EmailAdd1 ;
//            XSSFCell Passwd1 ;
//            EmailAdd1 =wbst1.getRow(2).getCell(0);
//            Passwd1 =wbst1.getRow(2).getCell(1);
//            objSignin_Page.signin();
//            objSignin_Page.emailaddress(EmailAdd1.toString());
//            objSignin_Page.password(Passwd1.toString());
//            objSignin_Page.SignIn();
//            objSignin_Page.next();
//            objSignin_Page.CLOSE();
            
            ///Edit Image
            objEditImage_Page = new EditImage_Page(driver);
            objEditImage_Page.Editphoto();
            objEditImage_Page.Next();
            objEditImage_Page.CLOSE();
            objEditImage_Page.Expand();
            objEditImage_Page.OpenImage();
            objEditImage_Page.NewIMg();
            XSSFSheet wbst2 = workbook.getSheetAt(2);
          int rownum2= wbst2.getLastRowNum();
          int colnum2 = wbst2.getRow(0).getPhysicalNumberOfCells();
          XSSFCell BrightNess;
          XSSFCell Contract ;
          XSSFCell Saturation;
          XSSFCell Sharpness ;
          BrightNess =wbst2.getRow(1).getCell(0);
          Contract =wbst2.getRow(1).getCell(1);
          Saturation =wbst2.getRow(1).getCell(2);
          Sharpness =wbst2.getRow(1).getCell(3);
          objEditImage_Page.BasicAdjust();
          objEditImage_Page.Brightn(BrightNess.toString());
          objEditImage_Page.Brightn(Contract.toString());
          objEditImage_Page.Brightn(Saturation.toString());
          objEditImage_Page.Brightn(Sharpness.toString());
          objEditImage_Page.BasicAdjust();  
       }
        }
