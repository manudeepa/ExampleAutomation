package com.sgtestingSeleniumPageObjectAssignments;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Task
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
			oPage.getCustomerName().sendKeys("ravi");
			Thread.sleep(2000);
			oPage.getCustomerDescription().sendKeys("hi im ravi");
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
		 oPage.getNewProjectName().sendKeys("ravi team");
		 Thread.sleep(2000);
		 oPage.getclickCreateProjToCreate().click();
		Thread.sleep(5000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
   
 static void CreateTask()
 {
	try
	{
		oPage.getclickToAddNEwTASK().click();
		Thread.sleep(2000);
		oPage.getclickToCreateNewTask().click();
		Thread.sleep(2000);
		oPage.getNewNAmeOfTask().sendKeys("548");
		Thread.sleep(2000);
		oPage.getclickonCreateTaskButtonFinally().click();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
 
 static void DeleteTask()
 {
	try
	{
		oPage.getclickToDeleteTaskCheckBok().click();
		Thread.sleep(2000);
		oPage.getclickToDeleteTask().click();
		Thread.sleep(2000);
		oPage.getDeleTeTaskPERMA();
		Thread.sleep(4000);
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
public class pdemo3
{

	public static void main(String[] args) {
	
		Task.launch();
		Task.navigate();
		Task.login();
		Task.minimize();
		Task.Createcustomer();
		Task.project();
		Task.CreateTask();
		Task.DeleteTask();
		Task.deletProj();
		Task.deleteustomer();
		Task.logout();
		Task.close();

	}

}
