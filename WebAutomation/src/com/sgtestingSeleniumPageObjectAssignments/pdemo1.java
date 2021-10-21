package com.sgtestingSeleniumPageObjectAssignments;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Crcustom
{
	public static WebDriver oBrowser = null;
	public static ActiTimepage oPage= null;
	static void launch()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\AutomationJavaExamples\\Automation\\WebAutomation\\library\\chromedriver.exe");
		oBrowser=new ChromeDriver();
		oPage = new ActiTimepage(oBrowser);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void login()
	{
		try
		{
			oPage.getusername().sendKeys("admin");
			Thread.sleep(3000);
			oPage.getpassword().sendKeys("manager");
			Thread.sleep(3000);
			oPage.getlogin().click();
			Thread.sleep(3000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void minimize()
	{
		try
		{
			oPage.getminiise().click();
			Thread.sleep(3000);

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void Createcustomer()
	
	{
		try
		{
			oPage.getclickonTaskbutton().click();
			Thread.sleep(2000);
			oPage.getclickonADDnewforCustomandProj().click();
			Thread.sleep(2000);
			oPage.getclickonNewCustomer().click();
			Thread.sleep(2000);
			oPage.getCustomerName().sendKeys("Manohara N");
			Thread.sleep(2000);
			oPage.getCustomerDescription().sendKeys("Hi im manohara im from mangalore");
			Thread.sleep(2000);
			oPage.getclickCreateCustomButton().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteustomer()
	{
		try
		{
			oPage.getclickToeditbuttonForCustom().click();
			Thread.sleep(2000);
			oPage.getclickOnActionForCustomer().click();
			Thread.sleep(2000);
			oPage.getclickOnDeleteForCustomer().click();
			Thread.sleep(2000);
			oPage.getClickOnDeletePermaForCustom().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void logout()
	{
		try
		{
			oPage.getlogout().click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void close()
	{
		try
		{
			oBrowser.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class pdemo1
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Crcustom.launch();
		Crcustom.navigate();
		Crcustom.login();
		Crcustom.minimize();
		Crcustom.Createcustomer();
		Crcustom.deleteustomer();
		Crcustom.logout();
		Crcustom.close();

	}

}