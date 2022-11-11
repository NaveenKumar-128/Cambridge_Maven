package CambridgeGrid;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dictionary_Page {
    
    WebDriver driver;
    By search=By.name("q");
   By click = By.xpath("//button[@type='submit']");
   By Text = By.xpath("//*[@id=\"page-content\"]/div[2]/div[1]/div[2]/div/div[3]/div/div/div/div[3]/div/div[2]/div[1]/div[2]/div[1]/div[1]/div");
    By Text1 = By.xpath("//*[@id=\"page-content\"]/div[2]/div[1]/div[2]/div/div[3]/div/div/div/div[3]/div[1]/div[2]/div[1]/div[2]/div");
    By Text2 = By.xpath("//*[@id=\"page-content\"]/div[2]/div[1]/div[2]/div/div[3]/div/div/div/div[3]/div/div[2]/div/div[2]/div");
    public Dictionary_Page(WebDriver driver) {
        this.driver=driver;
    }
    public void searchclick()
    {
        driver.findElement(search).click();
    }
    public void enterwords(String words)
    {
        driver.findElement(search).sendKeys(words);   
        }
    public void Click()
    {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(click).click(); 
        }
    public void alTEXT()
    {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        if(driver.findElement(Text).isDisplayed()) {
        	System.out.println(driver.findElement(Text).getText());
        }
     
    }  
    public void hyTEXT()
    {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        if(driver.findElement(Text1).isDisplayed()) {
        	System.out.println(driver.findElement(Text1).getText());
        }
    }
    public void trTEXT()
    {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        if(driver.findElement(Text2).isDisplayed()) {
        	System.out.println(driver.findElement(Text2).getText());
        }
    }
    }
	


