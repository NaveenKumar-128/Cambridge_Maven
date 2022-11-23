package CambridgeHeadless;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ObjectRepositry {
	WebDriver driver;
	 
	
	           
	    @Test
	    public void setup() throws Exception{
	    	  File src= new File("C:\\Users\\NaveenKumarKollimarl\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\FotorAutomationPOM\\TestResource\\PropertyFile.property");
	  	    FileInputStream fis = new FileInputStream(src);	
	  	 // Load the properties File
	  	  Properties prop = new Properties();
	  	    prop.load(fis);
	  	    
	  	    System.setProperty("webdriver.chrome.driver",prop.getProperty("driverPath"));					
	  	    driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	 driver.get("https://dictionary.cambridge.org/");
	    driver.manage().window().maximize();
	    FileInputStream file = new FileInputStream("C:\\Users\\NaveenKumarKollimarl\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium Project\\Testdata (1).xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        //SignUp
        XSSFSheet wbst1 = workbook.getSheetAt(0);
        XSSFCell Dictionarywords;
        XSSFCell Dictionarywords1;
        XSSFCell Dictionarywords2;
        Dictionarywords=wbst1.getRow(1).getCell(0);
        Dictionarywords1=wbst1.getRow(2).getCell(0);
        Dictionarywords2=wbst1.getRow(3).getCell(0);
        driver.findElement(By.name(prop.getProperty("search"))).click();
        driver.findElement(By.name(prop.getProperty("search"))).sendKeys(Dictionarywords.toString()); 
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath(prop.getProperty("click"))).click();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        if(driver.findElement(By.xpath(prop.getProperty("Text"))).isDisplayed()) {
            System.out.println(driver.findElement(By.xpath(prop.getProperty("Text"))).getText());
        }
        driver.navigate().back();
        driver.findElement(By.name(prop.getProperty("search"))).click();
        driver.findElement(By.name(prop.getProperty("search"))).sendKeys(Dictionarywords1.toString()); 
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath(prop.getProperty("click"))).click();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        	if(driver.findElement(By.xpath(prop.getProperty("Text1"))).isDisplayed()) {
            	System.out.println(driver.findElement(By.xpath(prop.getProperty("Text1"))).getText());
            }
            driver.navigate().back();
        	  driver.findElement(By.name(prop.getProperty("search"))).click();
              driver.findElement(By.name(prop.getProperty("search"))).sendKeys(Dictionarywords2.toString()); 
              driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
              driver.findElement(By.xpath(prop.getProperty("click"))).click();
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
             if(driver.findElement(By.xpath(prop.getProperty("Text2"))).isDisplayed()) {
            	System.out.println(driver.findElement(By.xpath(prop.getProperty("Text2"))).getText());
            	driver.close();
            }
         
    
     
       
	    }
	    
}
	    
	  

