package CambridgeHeadless;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Javascript_Dictionary {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NaveenKumarKollimarl\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium  Web\\Drivers\\chromedriver_win32\\chromedriver.exe");
		 ChromeOptions options = new ChromeOptions();
	       options.setHeadless(true);
	      WebDriver driver = new ChromeDriver(options);
		String url ="https://dictionary.cambridge.org/";
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("document.getElementsByName('q')[0].value='avalanche'");
		driver.findElement(By.xpath("//*[@id=\"searchForm\"]/div[1]/div[1]/span/button[3]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        if(driver.findElement(By.xpath("//*[@id=\"page-content\"]/div[2]/div[1]/div[2]/div/div[3]/div/div/div/div[3]/div/div[2]/div[1]/div[2]/div[1]/div[1]/div")).isDisplayed()) {
        	System.out.println("avalanche :" +driver.findElement(By.xpath("//*[@id=\"page-content\"]/div[2]/div[1]/div[2]/div/div[3]/div/div/div/div[3]/div/div[2]/div[1]/div[2]/div[1]/div[1]/div")).getText());
        }
        driver.navigate().back();
        js.executeScript("document.getElementsByName('q')[0].value='hysterical'");
		driver.findElement(By.xpath("//*[@id=\"searchForm\"]/div[1]/div[1]/span/button[3]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        if(driver.findElement(By.xpath("//*[@id=\"page-content\"]/div[2]/div[1]/div[2]/div/div[3]/div/div/div/div[3]/div[1]/div[2]/div[1]/div[2]/div")).isDisplayed()) {
        	System.out.println("hysterical :" +driver.findElement(By.xpath("//*[@id=\"page-content\"]/div[2]/div[1]/div[2]/div/div[3]/div/div/div/div[3]/div[1]/div[2]/div[1]/div[2]/div")).getText());
        }
        driver.navigate().back();
        js.executeScript("document.getElementsByName('q')[0].value='turncoat'");
		driver.findElement(By.xpath("//*[@id=\"searchForm\"]/div[1]/div[1]/span/button[3]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        if(driver.findElement(By.xpath("//*[@id=\"page-content\"]/div[2]/div[1]/div[2]/div/div[3]/div/div/div/div[3]/div/div[2]/div/div[2]/div")).isDisplayed()) {
        	System.out.println("turncoat :" +driver.findElement(By.xpath("//*[@id=\"page-content\"]/div[2]/div[1]/div[2]/div/div[3]/div/div/div/div[3]/div/div[2]/div/div[2]/div")).getText());
        }
        driver.navigate().back();
    	JavascriptExecutor js1 = (JavascriptExecutor) driver;
    	js1.executeScript("window.scrollBy(0,9500)", "");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/footer[1]/div[1]/div[3]/div[1]/a[1]/i[1]")));
	    driver.findElement(By.xpath("/html[1]/body[1]/footer[1]/div[1]/div[3]/div[1]/a[1]/i[1]")).click();
	    Set<String> handles =driver.getWindowHandles();
	    Iterator it =handles.iterator();
	    String parentid = (String) it.next();
	    String Childid = (String) it.next();
	    driver.switchTo().window(Childid);
	    System.out.println(driver.getTitle());
	    driver.switchTo().window(parentid);
	    System.out.println(driver.getTitle());
	     driver.close();
		
		
}
}
