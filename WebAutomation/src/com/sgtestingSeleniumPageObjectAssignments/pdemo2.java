package com.sgtestingSeleniumPageObjectAssignments;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Cproj
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
			oPage.getCustomerName().sendKeys("Chethann");
			Thread.sleep(2000);
			oPage.getCustomerDescription().sendKeys("Hi im chethan");
			Thread.sleep(2000);
			oPage.getclickCreateCustomButton().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

 static void project()
 {
	try
	{
		 oPage.getclickonADDnewforCustomandProj().click();
		 Thread.sleep(2000);
		 oPage.getclickOnNewProject().click();
		 Thread.sleep(2000);
		 oPage.getNewProjectName().sendKeys("manohara nn");
		 Thread.sleep(2000);
		 oPage.getclickCreateProjToCreate().click();
		Thread.sleep(5000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
 
 static void deletProj()
	{
		try
		{
			oPage.getclickToEditForProj().click();
			 Thread.sleep(2000);
			oPage.getclickActionForProg().click();
			 Thread.sleep(2000);
			oPage.getclickToDeleteProj().click();
			Thread.sleep(2000);
			oPage.getClickOnDeletePermaForCustom().click();
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
public class pdemo2
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cproj.launch();
		Cproj.navigate();
		Cproj.login();
		Cproj.minimize();
		Cproj.Createcustomer();
		Cproj.project();
		Cproj.deletProj();
		Cproj.deleteustomer();
		Cproj.logout();
		Cproj.close();

	}

}

