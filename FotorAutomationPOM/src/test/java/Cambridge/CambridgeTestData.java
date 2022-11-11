package Cambridge;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CambridgeTestData {
    String driverPath = "C:\\Users\\NaveenKumarKollimarl\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium  Web\\Drivers\\chromedriver_win32\\chromedriver.exe";
    WebDriver driver;
    Home_Page objHome_Page;
    Translate_page objTranslate_page;
    Dictionary_Page objDictionary_Page;
    Thesaurus_Page objThesaurus_Page;
    Grammar_Page objGrammar_Page;
           
    @BeforeTest
    public void setup(){
       System.setProperty("webdriver.chrome.driver", driverPath);
         driver = new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
 driver.get("https://dictionary.cambridge.org/");
    driver.manage().window().maximize();
    }
@Test
public void Cambridge() throws Exception {
	//Home page
	objHome_Page = new Home_Page(driver);
	objHome_Page.Logo();
	objHome_Page.wordofd();
	
	

	
	
	FileInputStream file = new FileInputStream("C:\\Users\\NaveenKumarKollimarl\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium Project\\Testdata (1).xlsx");
    XSSFWorkbook workbook = new XSSFWorkbook(file);
   
    XSSFSheet wbst1 = workbook.getSheetAt(0);
    XSSFCell Dictionarywords1;
   for(int i=1;i<=3;i++) {
    Dictionarywords1=wbst1.getRow(i).getCell(0);
    objDictionary_Page = new Dictionary_Page(driver);
    objDictionary_Page.enterwords(Dictionarywords1.toString());
    objDictionary_Page.Click();
    objDictionary_Page.alTEXT();
    driver.navigate().back();
   }

   
    
    
    ///Translate Page
    XSSFSheet wbst = workbook.getSheetAt(2);
    int rownum= wbst.getLastRowNum();
    int colnum = wbst.getRow(0).getPhysicalNumberOfCells();
    XSSFCell TransWord;
    TransWord =wbst.getRow(1).getCell(0);

	
	objTranslate_page = new Translate_page(driver);
	objTranslate_page.Transicon();
	objTranslate_page.Dropdown();
	objTranslate_page.EnterText(TransWord.toString());
	objTranslate_page.ResultTEXT();
//	objTranslate_page.Nothanks();
	driver.navigate().back();
	
	
	
///Thesaurus page
	 XSSFSheet wbst2 = workbook.getSheetAt(3);
	    int rownum2= wbst2.getLastRowNum();
	    int colnum2 = wbst2.getRow(0).getPhysicalNumberOfCells();
	    XSSFCell Sous;
	    XSSFCell Debri;
	    Sous =wbst2.getRow(1).getCell(0);
	    	Debri =wbst2.getRow(2).getCell(0);
	objThesaurus_Page = new Thesaurus_Page(driver);
	objThesaurus_Page.Thesa();
	objThesaurus_Page.ENGLISH();
	objThesaurus_Page.searchclick();
	objThesaurus_Page.enterwords(Sous.toString());
	objThesaurus_Page.Search();
	objThesaurus_Page.AUDIO1();
	driver.navigate().back();
	objThesaurus_Page.Thesa();
	objThesaurus_Page.ENGLISH();
	objThesaurus_Page.searchclick();
	objThesaurus_Page.enterwords(Debri.toString());
	objThesaurus_Page.Search();
	objThesaurus_Page.AUDIO2();
	driver.navigate().back();
	
	///Grammer Page
	objGrammar_Page=new Grammar_Page(driver);
    
	objGrammar_Page.grammar();
	objGrammar_Page.adjectivesadverbs();
	objGrammar_Page.easilyconsufed();
	objGrammar_Page.nounpronouns();
	objGrammar_Page.prepositionsparticles();
	objGrammar_Page.usingenglish();
	objGrammar_Page.verbs();
	objGrammar_Page.sentencesclauses(); 
	objGrammar_Page.facebook();
	objGrammar_Page.close();
}

}

