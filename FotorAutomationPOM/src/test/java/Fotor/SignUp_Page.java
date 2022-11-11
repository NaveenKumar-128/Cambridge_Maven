package Fotor;





import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUp_Page {
    
    WebDriver driver;
    
    By signin=By.xpath("//button[contains(text(),'Sign in')]");
    By createaccount=By.xpath("//span[contains(text(),'Create an account')]");
    By signupwithemail=By.xpath("//div[contains(text(),'Sign up with email')]");
    By emailaddress=By.xpath("//body/div[@id='rootLogin']/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/input[1]");
    By password=By.xpath("//body/div[@id='rootLogin']/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/input[1]");
    By agreeterms=By.xpath("//body/div[@id='rootLogin']/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]");
    By SignUP=By.xpath("//div[contains(text(),'Sign Up')]");
    By next=By.xpath("//button[contains(text(),'Next')]");
    By close = By.xpath("//*[@id=\"rootPayment\"]/div/div/div[1]");
    
      
    public SignUp_Page(WebDriver driver) {
        this.driver=driver;
    }
    public void signin()
    {
        driver.findElement(signin).click();
    }
    
    public void createaccount()
    {
        driver.findElement(createaccount).click();
    }
    public void signupwithemail()
    {
        driver.findElement(signupwithemail).click();
    }
    public void emailaddress(String stremail)
    {
        driver.findElement(emailaddress).sendKeys(stremail);
    }
    public void password(String strpasscode)
    {
        driver.findElement(password).sendKeys(strpasscode);
    }
    public void agreeterms()
    {
        driver.findElement(agreeterms).click();
    }
    
    public void SignUp()
    {
        driver.findElement(SignUP).click();
    }
    public void next()
    {
        driver.findElement(next).click();
}
    public void CLOSE() throws Exception
    {
    	Thread.sleep(4000);
    	driver.findElement(close).click();
     
}
    
        
    }
