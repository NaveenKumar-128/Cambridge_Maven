package Fotor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Signin_Page {
    WebDriver driver;
    
    By signin=By.xpath("//button[contains(text(),'Sign in')]");
    By emailaddress=By.xpath("//*[@id=\"rootLogin\"]/div/div/div[2]/div[1]/div/div[5]/input");
    By password=By.xpath("//*[@id=\"rootLogin\"]/div/div/div[2]/div[1]/div/div[6]/input");
    By signIn =By.xpath("//*[@id=\"rootLogin\"]/div/div/div[2]/div[1]/div/div[8]/div");
    By mesage = By.xpath("//*[@id=\"rootLogin\"]/div/div/div[2]/div[1]/div/div[6]/div/p");
    By Clear = By.xpath("//*[@id=\"rootLogin\"]/div/div/div[1]/img");
    By next=By.xpath("//button[contains(text(),'Next')]");
    By close = By.xpath("//*[@id=\"rootPayment\"]/div/div/div[1]");
    public Signin_Page(WebDriver driver) {
    	this.driver=driver;
    }
    public void signin()
    {
        driver.findElement(signin).click();
    }
    public void emailaddress(String stremail)
    {
        driver.findElement(emailaddress).sendKeys(stremail);
    }
    public void password(String strpasscode)
    {
        driver.findElement(password).sendKeys(strpasscode);
    }
    public void SignIn()
    {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(signIn).click();
    }
    public void message() {
    	if(driver.findElement(mesage).isDisplayed()) {
    		System.out.println(driver.findElement(mesage).getText());
    	}
    
  
    }
    public void close() throws Exception
    {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.findElement(Clear).click();
    }
    public void next()
    {
        driver.findElement(next).click();
}
    public void CLOSE() throws Exception
    {
    	Thread.sleep(6000);
    	driver.findElement(close).click();
    	Thread.sleep(4000);
    	String Title = driver.getTitle();
    	System.out.println(Title);
    	System.out.println(driver.getPageSource());
     
}
}
