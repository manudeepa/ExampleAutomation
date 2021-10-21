//launchBrowser-->navigate-->login --> ImportTasks --> DeleteTasks -->logout -->closeApplication
package com.sgtestingSeleniumAssignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class BrowserDemo8
{
	public static WebDriver oBrowser=null;
		static void LaunchBrowser()
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
		static void login()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("admin");
				oBrowser.findElement(By.name("pwd")).sendKeys("manager");
				oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void minimizeFlyOutWindow()
		{
			try
			{
				oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void CreateTask()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("/html/body/div[13]/div[1]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")).sendKeys("f");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[2]/td[1]/input")).sendKeys("Z");
				Thread.sleep(2000);
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[3]/td[1]/input")).sendKeys("W");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[4]/td[1]/input")).sendKeys("x");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[5]/td[1]/input")).sendKeys("Q");
				Thread.sleep(2000);
				
				oBrowser.findElement(By.xpath("//*[@id=\'createTasksPopup_commitBtn\']/div/span")).click();

			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void ImportTask()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[1]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("/html/body/div[13]/div[2]")).click();
				oBrowser.findElement(By.xpath("//*[@id=\"closeLoadTasksFromCSVPopupButton\"]")).click();
				Thread.sleep(2000);
			
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void DeleteTask()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/table/tbody/tr/td[1]/div")).click();
				Thread.sleep(2000);
				
				oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/div[3]/div/div/div[4]/span")).click();
				Thread.sleep(2000);
				
				oBrowser.findElement(By.xpath("//*[@id=\'deleteTaskPopup_deleteConfirm_submitBtn\']")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void logout()
		{
			try
			{

				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void closeapplication()
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
public class sdemo8 
{
	public static void main (String args[])
	{
		BrowserDemo8.LaunchBrowser();
		BrowserDemo8.navigate();
		BrowserDemo8.login();
		BrowserDemo8.minimizeFlyOutWindow();
		BrowserDemo8.CreateTask();
		BrowserDemo8.ImportTask();
		BrowserDemo8.DeleteTask();
		BrowserDemo8.logout();
		BrowserDemo8.closeapplication();
	}

}
