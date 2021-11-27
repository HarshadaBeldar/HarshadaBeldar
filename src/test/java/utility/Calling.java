package utility;

public class Calling {
public static void main(String[] args) throws InterruptedException
{
	//launch browser
	Object[] input1=new Object[2];
	input1[0]="Chrome";
	input1[1]="D:\\Automation Support\\chromedriver.exe";
	SeleniumOperations.browserLaunch(input1);
	
	//open application
	Object[] input2=new Object[1];
	input2[0]="https://www.flipkart.com/";
	SeleniumOperations.openApplication(input2);
	
	//click on cancel
	Object[] input3=new Object[1];
	input3[0]="//*[@class='_2KpZ6l _2doB4z']";
	SeleniumOperations.clickOnElement(input3);
	
	//navigate moveToElement Login
	Object[] input4=new Object[1];
	input4[0]="//*[@class='_1_3w1N']";
	SeleniumOperations.navigateToElement(input4);
	
	//click on MyProfile
	Object[] input5=new Object[1];
	input5[0]="(//*[@class='_3vhnxf'])[1]";
	SeleniumOperations.clickOnElement(input5);
	
	//send keys method for username
	Object[] input6=new Object[2];
	input6[0]="//*[@class='_2IX_2- VJZDxU']";
	input6[1]="9665023244";
	SeleniumOperations.sendKeys(input6);
	
	//sendkeys method for password
	Object[] input7=new Object[2];
	input7[0]="//*[@type='password']";
	input7[1]="Harshu@9696";
	SeleniumOperations.sendKeys(input7);
	
	//click on login button
	Object[] input8=new Object[1];
	input8[0]="(//*[@type='submit'])[2]";
	SeleniumOperations.clickOnElement(input8);
	
	/*//click on manage address
	Object[] input9=new Object[1];
	input9[0]="(//*[@class='NS64GK'])[1]";
	SeleniumOperations.clickOnElement(input9);
	
	//click on add address
	Object[] input=new Object[1];
	input[0]="//*[@class='_2KpZ6l _3lI646 _3dESVI']";
	SeleniumOperations.clickOnElement(input);*/
	
	//sendkeys method for name
	Object[] input10=new Object[2];
	input10[0]="(//*[@type='text'])[2]";
	input10[1]="Harshada Beldar";
	SeleniumOperations.sendKeys(input10);
	
	/*//sendkeys method for mobno
	Object[] input11=new Object[2];
	input11[0]="(//*[@type='text'])[3]";
	input11[1]="9665023244";
	SeleniumOperations.sendKeys(input11);
	
	//sendkeys method for pincode
		Object[] input12=new Object[2];
		input12[0]="(//*[@type='text'])[4]";
		input12[1]="414005";
		SeleniumOperations.sendKeys(input12);

		//sendkeys method for locality
		Object[] input13=new Object[2];
		input13[0]="(//*[@type='text'])[5]";
		input13[1]="Ambika Niwas,Kedgaon";
		SeleniumOperations.sendKeys(input13);
		
		//sendkeys method for locality
		Object[] input14=new Object[2];
		input14[0]="//*[@class='_1sQQBU _1w3ZZo _1TO48q']";
		input14[1]="Ahmednagar";
		SeleniumOperations.sendKeys(input14);
		
		//click or select Radio Button
		Object[] input15=new Object[1];
		input15[0]="(//*[@class='_1XFPmK'])[1]";
		SeleniumOperations.clickOnElement(input15);
	
		//click on save button
		Object[] input16=new Object[1];
		input16[0]="(//*[@type='button'])[2]";
		SeleniumOperations.clickOnElement(input16);*/
	//sendkeys method for validate login
	Object[] input11=new Object[2];
	input11[0]="Harshada Beldar";
	input11[1]="(//*[@type='text'])[2]";
	SeleniumOperations.sendKeys(input11);
}
}
