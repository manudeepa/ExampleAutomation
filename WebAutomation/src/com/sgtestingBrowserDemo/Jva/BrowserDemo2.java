package com.sgtestingBrowserDemo.Jva;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class FireFixDemoTest
{
	public static WebDriver oBrowser=null;
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.gecko.driver","D:\\AutomationJavaExamples\\Automation\\WebAutomation\\library\\geckodriver.exe");
			oBrowser =new FirefoxDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class BrowserDemo2 {
	public static void main(String args[])
	{
		FireFixDemoTest.launchBrowser();
		FireFixDemoTest.navigate();
		FireFixDemoTest.closeApplication();
		
	}

}
