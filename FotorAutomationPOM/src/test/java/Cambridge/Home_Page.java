package Cambridge;



import java.time.Duration;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Home_Page {
WebDriver driver;
By logo = By.xpath("/html/body/div[3]/div[1]/div[2]/div/div/div[1]/div[1]/a/amp-img/img");
By Word = By.xpath("//p[@class='fs12 tcu lmb-0']");

public Home_Page(WebDriver driver) {
	this.driver=driver;
}

	// TODO Auto-generated constructor stub
public void Logo() {
	String Title = driver.getTitle();
	System.out.println(Title);
	System.out.println(Pattern.matches("[A-Z|a-z|\\W]+", Title));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement Log = driver.findElement(logo);
	Assert.assertEquals(Log.isDisplayed(), true);
		
}
	public void wordofd() {
		if(driver.findElement(Word).isDisplayed()) {
			System.out.println(driver.findElement(Word).getText());
		}
	}
	



	

	
	
}

