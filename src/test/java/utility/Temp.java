package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Temp 
{

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Automation Support\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
		 //openApplications
	    driver.get("https://www.flipkart.com/");
	    driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();//close login window
	    Thread.sleep(5000);
	    WebElement log=driver.findElement(By.xpath("//*[@class='_1_3w1N']"));//login button
	    Actions act=new Actions(driver);
	    act.moveToElement(log).build().perform();//navigate to login button
	    //log.click;
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("(//*[@class='_3vhnxf'])[1]")).click();//click on my profile
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']")).sendKeys("9665023244");//enter mobno
	      Thread.sleep(6000);
	   driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Harshu@9696");//enter password
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click();//click on login
	    Thread.sleep(6000);
	    driver.findElement(By.xpath("(//*[@class='NS64GK'])[1]")).click();//click on manage address
	    Thread.sleep(6000);
	    WebElement add=driver.findElement(By.xpath("//*[@class='_2KpZ6l _3lI646 _3dESVI']"));//click on add address
	    act.click(add).build().perform();
	    Thread.sleep(6000);
	    driver.findElement(By.xpath("(//*[@type='text'])[2]")).sendKeys("Harshada Beldar");//filling name
	    driver.findElement(By.xpath("(//*[@type='text'])[3]")).sendKeys("9665023244");//enter mobno
	    driver.findElement(By.xpath("(//*[@type='text'])[4]")).sendKeys("414005");//enter pincode
	    driver.findElement(By.xpath("(//*[@type='text'])[5]")).sendKeys("Ambika Niwas,Kedgaon");//enter locality
	    driver.findElement(By.xpath("//*[@class='_1sQQBU _1w3ZZo _1TO48q']")).sendKeys("Ahmednagar");//enter address
	   driver.findElement(By.xpath("(//*[@class='_1XFPmK'])[1]")).click();//click on radio button
	   driver.findElement(By.xpath("(//*[@type='button'])[2]")).click();
	}

}
