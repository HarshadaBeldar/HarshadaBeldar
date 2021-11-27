package utility;
import java.util.Hashtable;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations
{
public static WebDriver driver=null;
public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();
//browser launch
public static Hashtable<String, Object> browserLaunch(Object[]inputParameters)//passing 2 parameters as browser name chrome or ff
{
	try {
	String strBrowserName=(String) inputParameters[0];
	String webDriverExePath=(String) inputParameters[1];
	
	if(strBrowserName.equalsIgnoreCase("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver",webDriverExePath);
		driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	else if(strBrowserName.equalsIgnoreCase("Firefox"))
	{
		System.setProperty("webdriver.gecko.driver",webDriverExePath);
		driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	outputParameters.put("STATUS", "PASS");
    outputParameters.put("MESSAGE",  "methodUsed:browserLaunch, Input_Data : " + inputParameters[1].toString());
	}catch(Exception e)
	{
		outputParameters.put("STATUS", "FAIL");
        outputParameters.put("MESSAGE",  "methodUsed:browserLaunch, Input_Data : " + inputParameters[1].toString());	
	}
	return outputParameters;
}
	//open application
	public static Hashtable<String, Object> openApplication(Object[]inputParameters)	
	{
		try {
	
		String strUrl=(String) inputParameters[0];
		driver.get(strUrl);
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 outputParameters.put("STATUS", "PASS");
         outputParameters.put("MESSAGE",  "methodUsed:openApplication, Input_Data : " + inputParameters[0].toString());
	}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
	         outputParameters.put("MESSAGE",  "methodUsed:openApplication, Input_Data : " + inputParameters[0].toString());
		}
		return outputParameters;
	}
	//click method
	public static Hashtable<String,Object> clickOnElement(Object[]inputParameters) throws InterruptedException
	{
		try {
		String xpath=(String) inputParameters[0];
		driver.findElement(By.xpath(xpath)).click();
		Thread.sleep(3000);
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 outputParameters.put("STATUS", "PASS");
	        outputParameters.put("MESSAGE",  "methodUsed:clickOnElement, Input_Data : " + inputParameters[0].toString());	
	}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
	         outputParameters.put("MESSAGE",  "methodUsed:clickOnElement, Input_Data : " + inputParameters[0].toString());	
		}
		return outputParameters;
	}
	//navigate MoveToElement
	public static Hashtable<String, Object> navigateToElement(Object[]inputParameters) throws InterruptedException	
		{
		    try {
			String Xpath=(String) inputParameters[0];
			Actions act=new Actions(driver);
			WebElement ele=driver.findElement(By.xpath(Xpath));
			act.moveToElement(ele).build().perform();
			 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			 outputParameters.put("STATUS", "PASS");
		        outputParameters.put("MESSAGE",  "methodUsed:moveToElement, Input_Data : " + inputParameters[0].toString());	
			 }
		   catch(Exception e)
		   {
				outputParameters.put("STATUS", "FAIL");
		         outputParameters.put("MESSAGE",  "methodUsed:moveToElement, Input_Data : " + inputParameters[0].toString());	
	     	}
		    return outputParameters;
		    
	}
	
	//sendkeys method
		public static Hashtable<String, Object> sendKeys(Object[]inputParameters) throws InterruptedException	
		{
			try {
			String Xpath=(String) inputParameters[0];
			String elevalue=  (String) inputParameters[1];
			driver.findElement(By.xpath(Xpath)).sendKeys( elevalue);
			 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			 outputParameters.put("STATUS", "PASS");
	         outputParameters.put("MESSAGE",  "methodUsed:sendKeys, Input_Data : " + inputParameters[1].toString());	
		       }
			catch(Exception e)
		     {
				outputParameters.put("STATUS", "FAIL");
		         outputParameters.put("MESSAGE",  "methodUsed:sendKeys, Input_Data : " + inputParameters[1].toString());	
		    }
			return outputParameters;
	       }
		
		//validate Login
				public static Hashtable<String,Object> validationLogin(Object[] inputParameters)
				{
					try {
						String givenText=(String) inputParameters[0];//after clicking on button login can user see his own profile with username that username we using here
						String xpath= (String) inputParameters[1];//xpath for that username text on logged page
						String nameText=driver.findElement(By.xpath(xpath)).getText();
						driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
						if(givenText.equalsIgnoreCase(nameText))
						{
							System.out.println("Test case pass");
						}
						else
						{
							System.out.println("Test case Fail");
							
						}
						outputParameters.put("STATUS","PASS");
				         outputParameters.put("MESSAGE",  "methodUsed:validationLogin, Input_Data : " + inputParameters[0].toString());	
					}
					catch(Exception e)
					{
						outputParameters.put("STATUS", "FAIL");
				         outputParameters.put("MESSAGE",  "methodUsed:validationLogin, Input_Data : " + inputParameters[0].toString());	
					}
					return outputParameters;
					
				}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
