package Fotor;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditImage_Page {
WebDriver driver;
By btneditphoto = By.xpath("//*[@id=\"recommendation_nav\"]/div/a[1]/p");
By editphoto =By.xpath("//*[@class='_1E2Aw']");
By next1 = By.xpath("//button[text()='Start free trial']");
By close = By.xpath("//*[@id=\"rootPayment\"]/div/div/div[1]");
By expand = By.xpath("//*[@id=\"main\"]/div[1]/div[1]/div[3]/div[1]/svg[2]");
By OpenImg =By.xpath("//*[@id=\"leftSiderBar\"]/div[2]/span/div[2]/button/span[1]");
By newimg = By.xpath("//*[@id=\"el-popover-4226\"]/div/div[1]/div[2]");
By Adjust = By.xpath("//*[@id=\"el-collapse-head-6297\"]/button/span[2]");
By Bright = By.xpath("//*[@id=\"el-collapse-content-7716\"]/div/div/div[1]/div[1]/div[2]/input");
By Contract = By.xpath("//*[@id=\"el-collapse-content-7716\"]/div/div/div[2]/div[1]/div[2]/input");
By Saturation = By.xpath("//*[@id=\"el-collapse-content-7716\"]/div/div/div[3]/div[1]/div[2]/input");
By Sharpness = By.xpath("//*[@id=\"el-collapse-content-7716\"]/div/div/div[4]/div[1]/div[2]/input");

public EditImage_Page(WebDriver driver) {
	this.driver=driver;
}
public void Editphoto() throws Exception {
	driver.findElement(btneditphoto).click();
	Thread.sleep(2000);
	driver.switchTo().window("Fotor Editor ｜ Fotor - Online Fotor Editor");
	//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	System.out.println(driver.getTitle());

	
}
public void Next() throws Exception
{
	Thread.sleep(2000);
    driver.findElement(next1).click();
}
public void CLOSE() throws Exception
{
	Thread.sleep(6000);
	driver.findElement(close).click();
	Thread.sleep(4000);
	String Title = driver.getTitle();
	System.out.println(Title);
}
public void Expand() {
	driver.findElement(expand).click();
}
public void OpenImage() {
	driver.findElement(OpenImg).click();
}
public void NewIMg() {
	WebElement pic = driver.findElement(newimg);
	pic.click();
	pic.sendKeys("Downloads\\h.jpg");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
}
public void BasicAdjust() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(Adjust).click();
	
}
public void Brightn(String valBrt) {
	driver.findElement(Bright).clear();
	driver.findElement(Bright).sendKeys(valBrt);
}
public void contract(String valcontract) {
	driver.findElement(Contract).clear();
	driver.findElement(Contract).sendKeys(valcontract);
}
public void sharp(String valsharp) {
	driver.findElement(Saturation).clear();
	driver.findElement(Saturation).sendKeys(valsharp);
}
public void saturation(String valsaturation) {
	driver.findElement(Sharpness).clear();
	driver.findElement(Sharpness).sendKeys(valsaturation);
}


}
