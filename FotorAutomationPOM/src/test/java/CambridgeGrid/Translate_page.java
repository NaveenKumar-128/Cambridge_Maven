package CambridgeGrid;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Translate_page {
	WebDriver driver;
	By trans = By.xpath("//*[@id='main-nav']/ul/li[2]/a/span");
	By drop = By.xpath("//div[@class='translate-tool__to']//div[@class='dropdown dropdown--pad-a']");
	By jap = By.xpath("//div[@id='languageTo_ddl']//ul[@class='unstyled']//li//a[@data-value='japanese']");
	By text =By.xpath("//*[@id='txtTrans']");
	By tran =By.id("button-submit");
	By Data = By.xpath("//*[@id='translate-tool__result']");
//	By poup = By.xpath("/html/body/div[8]/div[1]/div[1]");
//	By Poup1 = By.xpath("//*[@id=\"recaptcha-verify-button\"]");
	
	public Translate_page(WebDriver driver) {
		this.driver=driver;
	}
	public void Transicon() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(trans).click();
		System.out.println(driver.getTitle());
	}
	public void Dropdown() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(drop).click();
		driver.findElement(jap).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void EnterText(String TEXT) throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(text).sendKeys(TEXT);
		driver.findElement(tran).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		try {
		      //Convert web driver object to TakeScreenshot
		      //Call getScreenshotAs method to create image file
		            File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		            //FileUtils.copyFile(src, new File(".screenshots.jpeg"));
		            FileHandler.copy(src, new File("C:\\Users\\NaveenKumarKollimarl\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium Project\\screengrid.jpg"));
		        }
		        
		        catch(Exception e){
		            //if it fails to take screenshot then this block will execute
		            System.out.println("Failure to take screenshot "+e);
		        }
		
	}
	public void ResultTEXT() {
		
		if(driver.findElement(Data).isDisplayed()) {
			System.out.println(driver.findElement(Data).getText());
		}
		
	}

}
