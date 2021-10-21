//1)LaunchBrowser-->navigate-->login-->createUser-->modifyUser-->deleteUser-->logout -->closeApplication
package com.sgtestingSeleniumAssignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class BrowserDemo2
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
				oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("firstName")).sendKeys("manu");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("lastName")).sendKeys("deepa");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("email")).sendKeys("manu@gmail.com");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("username")).sendKeys("rajesh");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("password")).sendKeys("11111");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("11111");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
				Thread.sleep(2000);
			}
			catch(Exception e )
			{
				e.printStackTrace();
			}
		}
		static void modifyuser()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
				Thread.sleep(2000);
				
				oBrowser.findElement(By.name("firstName")).sendKeys("anushka shetty");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("lastName")).sendKeys("eadhika");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("email")).sendKeys("akash1@gmail.com");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("username")).sendKeys("akash1");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("password")).sendKeys("2222");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("2222");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
				Thread.sleep(2000);
		
			}catch(Exception e )
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
public class Sdemo2
{
	public static void main(String args[])
	{
		BrowserDemo2.LaunchBrowser();
		BrowserDemo2.navigate();
		BrowserDemo2.login();
		BrowserDemo2.minimizeFlyOutWindow();
		BrowserDemo2.createuser();
		BrowserDemo2.modifyuser();
		BrowserDemo2.deleteuser();
		BrowserDemo2.logout();
		BrowserDemo2.closeapplication();
	}

}
