//1) LaunchBrowser-->navigate-->login-->createUser-->deleteUser-->logout -->closeApplication
package com.sgtestingSeleniumAssignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class BrowserDemo
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
		static void createuser()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Demo");
				oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("demo1");
				oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("nmanohara55@gmail.com");
				oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("Demo5");
				oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("demo21");
				oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("demo21");
				oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void deleteuser()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
				Thread.sleep(2000);
				Alert oAlert=oBrowser.switchTo().alert();
				String content=oAlert.getText();
				System.out.println(content);
				oAlert.accept();
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
public class Sdemo1
{
	public static void main(String args[])
	{
		BrowserDemo.LaunchBrowser();
		BrowserDemo.navigate();
		BrowserDemo.login();
		BrowserDemo.minimizeFlyOutWindow();
		BrowserDemo.createuser();
		BrowserDemo.deleteuser();
		BrowserDemo.logout();
		BrowserDemo.closeapplication();
	}

}
