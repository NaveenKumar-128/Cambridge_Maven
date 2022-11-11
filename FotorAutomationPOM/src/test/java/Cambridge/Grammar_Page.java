package Cambridge;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Grammar_Page {
WebDriver driver;
    
    By grammar=By.xpath("//header/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]");
    By adjectivesadverbs=By.xpath("//a[contains(text(),'Adjectives and adverbs')]");
    By easilyconsufed=By.xpath("//a[contains(text(),'Easily confused words')]");
    By nounpronouns=By.xpath("//a[contains(text(),'Nouns, pronouns and determiners')]");
    By prepositionsparticles=By.xpath("//a[contains(text(),'Prepositions and particles')]");
    By usingenglish=By.xpath("//a[contains(text(),'Using English')]");
    By verbs=By.xpath("//a[contains(text(),'Verbs')]");
    By sentencesclauses=By.xpath("//a[contains(text(),'Words, sentences and clauses')]");
    By facebook=By.xpath("/html[1]/body[1]/footer[1]/div[1]/div[3]/div[1]/a[1]/i[1]");
    
    public Grammar_Page(WebDriver driver)
    {
        this.driver=driver;
    }
    
    public void grammar()
    {
        driver.findElement(grammar).click();
       
    }
    public void adjectivesadverbs() throws InterruptedException
    {
        driver.findElement(adjectivesadverbs).click();
         String Title=driver.getTitle();
         System.out.println(Title);
         System.out.println(Pattern.matches("[A-Z|a-z|\\W]+", Title));
         driver.navigate().back();
         Thread.sleep(2000);
    }
    public void easilyconsufed() throws InterruptedException
    {
        driver.findElement(easilyconsufed).click();
        String Title=driver.getTitle();
        System.out.println(Title);
        System.out.println(Pattern.matches("[A-Z|a-z|\\W]+", Title));
        driver.navigate().back();
        Thread.sleep(2000);
    }
    public void nounpronouns() throws InterruptedException
    {
        driver.findElement(nounpronouns).click();
        String Title=driver.getTitle();
        System.out.println(Title);
        System.out.println(Pattern.matches("[A-Z|a-z|\\W]+", Title));
        driver.navigate().back();
        Thread.sleep(2000);
    }
    public void prepositionsparticles() throws InterruptedException
    {
        driver.findElement(prepositionsparticles).click();
        String Title=driver.getTitle();
        System.out.println(Title);
        System.out.println(Pattern.matches("[A-Z|a-z|\\W]+", Title));
        driver.navigate().back();
        Thread.sleep(2000);
    }
    public void usingenglish() throws InterruptedException
    {
        driver.findElement(usingenglish).click();
        String Title=driver.getTitle();
        System.out.println(Title);
        System.out.println(Pattern.matches("[A-Z|a-z|\\W]+", Title));
        driver.navigate().back();
        Thread.sleep(2000);
    }
    public void verbs() throws InterruptedException
    {
        driver.findElement(verbs).click();
        String Title=driver.getTitle();
        System.out.println(Title);
        System.out.println(Pattern.matches("[A-Z|a-z|\\W]+", Title));
        driver.navigate().back();
        Thread.sleep(2000);
    }
    public void sentencesclauses() throws InterruptedException
    {
        driver.findElement(sentencesclauses).click();
        String Title=driver.getTitle();
        System.out.println(Title);
        System.out.println(Pattern.matches("[A-Z|a-z|\\W]+", Title));
        driver.navigate().back();
        Thread.sleep(2000);  
    }
	public void facebook()
	{
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
    	js1.executeScript("window.scrollBy(0,9500)", "");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(facebook));
	    driver.findElement(facebook).click();
	    Set<String> handles =driver.getWindowHandles();
	    Iterator it =handles.iterator();
	    String parentid = (String) it.next();
	    String Childid = (String) it.next();
	    driver.switchTo().window(Childid);
	    System.out.println(driver.getTitle());
	    driver.switchTo().window(parentid);
	    System.out.println(driver.getTitle());
	   
	}
	public void close() {
		driver.quit();
	}



}

