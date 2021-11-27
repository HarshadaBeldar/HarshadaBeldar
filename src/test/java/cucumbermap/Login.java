package cucumbermap;

import java.util.Hashtable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Login 
{

	@Given ("^User open \"(.*)\" browser with exe \"(.*)\"$")
	public void BrowserL(String bname,String exe)
	{
		Object[] input1=new Object[2];
		input1[0]="Chrome";
		input1[1]="D:\\Automation Support\\chromedriver.exe";
		SeleniumOperations.browserLaunch(input1);
	}
	@Given ("^User enter url as \"(.*)\"$")
	public void openURL(String url)
	{
		Object[] input2=new Object[1];
		input2[0]=url;
		SeleniumOperations.openApplication(input2);
	}
	
	@Given ("^User cancle initial Login window$")
	public void cancleLogin () throws InterruptedException
	{
		Object[] input3=new Object[1];
		input3[0]="//*[@class='_2KpZ6l _2doB4z']";
        SeleniumOperations.clickOnElement(input3);
	}
	
	@Given ("^User move on Login button$")
	public void move() throws InterruptedException
	{
		Object[] input4=new Object[1];
		input4[0]="//*[@class='_1_3w1N']";
		SeleniumOperations.navigateToElement(input4);
	}
	
	@When ("^User click on my profile$")
	public void myProfileClick() throws InterruptedException
	{
		Object[] input5=new Object[1];
		input5[0]="(//*[@class='_3vhnxf'])[1]";
		 Hashtable<String, Object> output5=SeleniumOperations.clickOnElement(input5);
		 HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "^User click on my profile$", output5.get("MESSAGE").toString());
	}
	
	@When ("^User enter \"(.*)\" as username$")
	public void enterUsername(String uname) throws InterruptedException
	{
		Object[] input6=new Object[2];
		input6[0]="//*[@class='_2IX_2- VJZDxU']";
		input6[1]=uname;
		 Hashtable<String, Object> output6=SeleniumOperations.sendKeys(input6);
		 HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "^User enter \"(.*)\" as username$", output6.get("MESSAGE").toString());
	}
	
	@When ("^User enter \"(.*)\" as password$")
	public void enterPassword(String password) throws InterruptedException
	{
		Object[] input7=new Object[2];
		input7[0]="//*[@type='password']";
		input7[1]=password;
		Hashtable<String, Object> output7=SeleniumOperations.sendKeys(input7);
		 HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "^User enter \"(.*)\" as password$", output7.get("MESSAGE").toString());
	}
	
	@When ("^User click on Login button$")
	public void LoginbuttonClick() throws InterruptedException
	{
		Object[] input8=new Object[1];
		input8[0]="(//*[@type='submit'])[2]";
		Hashtable<String, Object> output8=SeleniumOperations.clickOnElement(input8);
		 HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "^User click on Login button$", output8.get("MESSAGE").toString());
		
	}
	@Then ("^Application shows profile to user$")
	public void userProfile() throws InterruptedException
	{
		Object[] input10= new Object[2];
		input10[0]="Harshada Beldar";
		input10[1]="(//*[@type='text'])[2]";
		Hashtable<String, Object> output10=SeleniumOperations.validationLogin(input10);
		 HTMLReportGenerator.StepDetails(output10.get("STATUS").toString(), "^Application shows profile to user$", output10.get("MESSAGE").toString());
	}
	
	
	
}
