package com.sgtestingBrowserDemo.Jva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class ChromeBrowserDemo
{
	public static WebDriver oBrowser=null;
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\AutomationJavaExamples\\Automation\\WebAutomation\\library\\chromedriver.exe");
			oBrowser=new ChromeDriver();
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
	static void modifyuser()
	{
		try
		{
			
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
	
public class BrowserDemo1
{
	public static void main(String args[])
	{
		ChromeBrowserDemo.launchBrowser();
		ChromeBrowserDemo.navigate();
		ChromeBrowserDemo.modifyuser();
		ChromeBrowserDemo.closeApplication();
	}

}
