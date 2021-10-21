package com.sgtestingSeleniumPageObjectAssignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class cruser
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
	
	static void Createuser()
	{
		try
		{
			oPage.getclickonuserlist().click();
			Thread.sleep(2000);
			oPage.getadduser().click();
			Thread.sleep(2000);
			oPage.getfirstname().sendKeys("u1");
			Thread.sleep(2000);
			oPage.getlastName().sendKeys("manu");
			Thread.sleep(2000);
			oPage.getemail().sendKeys("manu@gmail.com");
			Thread.sleep(2000);
			oPage.getuserusernameInAdduser().sendKeys("m2");
			Thread.sleep(2000);
			oPage.getpasswordinadduser().sendKeys("2");
			Thread.sleep(2000);
			oPage.getpasswordCopyinAdduser().sendKeys("2");
			Thread.sleep(2000);
			oPage.getclickonCreateuser().click();
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
public class pdemo4
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cruser.launch();
		cruser.navigate();
		cruser.login();
		cruser.minimize();
		cruser.Createuser();
		cruser.deleteustomer();
		cruser.logout();
		cruser.close();

	}

}
