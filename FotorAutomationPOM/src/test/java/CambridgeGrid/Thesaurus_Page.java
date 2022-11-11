package CambridgeGrid;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Thesaurus_Page {
    WebDriver driver;
    By thesaurus = By.xpath("//span[@class='hdib lpt-2'][contains(text(),'Thesaurus')]");
    By English = By.xpath("//*[@id=\"searchForm\"]/div[2]/div/div/div/span[1]/span");
    By search=By.name("q");
   By click = By.xpath("//*[@id=\"searchForm\"]/div[1]/div[1]/span/button[3]/i");
   By sousaudio = By.xpath("//span[contains(@class,'us dpron-i')]//span[@class='daud']");
   By debriaudio = By.xpath("//*[@id=\"page-content\"]/div[2]/div[1]/div[2]/div/div[3]/div/div/div/div[2]/span[3]/span[2]/div");
    public Thesaurus_Page(WebDriver driver) {
        this.driver=driver;
    }
    public void Thesa()
    {
        driver.findElement(thesaurus).click();
    }
    public void ENGLISH()
    {
        driver.findElement(English).click();
    }
    public void searchclick()
    {
    	
        driver.findElement(search).click();
    }
    public void enterwords(String word)
    {
        driver.findElement(search).sendKeys(word);  
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
    public void Search()
    {
        driver.findElement(click).click();  
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
    public void AUDIO1() throws Exception
    {
        driver.findElement(sousaudio).click();  
        Thread.sleep(4000);
        }
    public void AUDIO2() throws Exception
    {
        driver.findElement(debriaudio).click();  
        Thread.sleep(4000);
        }
    
    
}
