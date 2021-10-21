package com.sgtestingSeleniumPageObjectAssignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimepage {
	
	public ActiTimepage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	
	//user name text filed
	
	private WebElement username;
	public WebElement getusername()
	{
		return username;
	}
	
	// pasword text filed 
	
	private WebElement pwd;
	public WebElement getpassword()
	{
		return pwd;
	}
	
	// login button in login page
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginbutton;
	public WebElement getlogin()
	{
		return loginbutton;
	}
	
	// Minimise winow
	
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getminiise()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	//user image click
	
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")
	private WebElement userlist;
	public WebElement getclickonuserlist()
	{
		return userlist;
	}
	
	// ADD USER 
	
	@FindBy(xpath="//div[text()='Add User']")
	private WebElement adduser;
	public WebElement getadduser()
	{
		return adduser;
	}
	
	// Firstname text filed
	
	private WebElement firstName;
	public WebElement getfirstname()
	{
		return firstName;
	}
	
	// Lastname text filed
	
	private WebElement lastName;
	public WebElement getlastName()
	{
		return lastName;
	}
	
	//Email text filed
	
		private WebElement email;
		public WebElement getemail()
		{
			return email;
		}
		
		//username text filed
		
			private WebElement userDataLightBox_usernameField;
			public WebElement getuserusernameInAdduser()
			{
				return userDataLightBox_usernameField;
			}	
			
			
			//Passwordinadduser text filed
			
				private WebElement password;
				public WebElement getpasswordinadduser()
				{
					return password;
				}	
				
				
				//ReTypePasswordinadduser text filed
				
				private WebElement passwordCopy;
				public WebElement getpasswordCopyinAdduser()
				{
					return passwordCopy;
				}					
	
	//ReTypePasswordinadduser text filed
				@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div")
				private WebElement createuser ;
				public WebElement getclickonCreateuser()
				{
					return createuser;
					
	 				
				}	
				
		//click on save changes
				@FindBy(xpath="//span[text()='Save Changes']")
				private WebElement savechanges ;
				public WebElement getclicksavechanges()
				{
					return savechanges ;
					
	 				
				}			
	
	// click on user to delete
				@FindBy(xpath="//span[text()='manu, u1']")
				private WebElement userclick;
				public WebElement getclickonusertodelete()
				{
					return userclick;
				}
				
				
				
				
				
	// click on delete button
		
	private WebElement userDataLightBox_deleteBtn1;
	public WebElement getclickonDeletebutton()
	{
		return userDataLightBox_deleteBtn1;
	}
	
	
	
	// click on task
	
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[2]")
	private WebElement taskbutton ;
	public WebElement getclickonTaskbutton()
	{
		return taskbutton ;
		
			
	}			                           
	                                                                               
	// click on add new  to create customer and project 

	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnew ;
	public WebElement getclickonADDnewforCustomandProj()
	{
		return addnew ;
		
	}	
	
	// click on add new customer
	
	@FindBy(xpath="/html/body/div[14]/div[1]")
	private WebElement newcustomer ;
	public WebElement getclickonNewCustomer()
	{
		return newcustomer ;
		
	}	
	
	// Enter customer text field customerLightBox_nameField
	private WebElement customerLightBox_nameField;
	public WebElement getCustomerName()
	{
		return customerLightBox_nameField;
	}
	
	// Enter discription of customer  customerLightBox_descriptionField
	
	private WebElement customerLightBox_descriptionField;
	public WebElement getCustomerDescription()
	{
		return  customerLightBox_descriptionField;
	}
	
	// Enter discription of customer by xpath     //*[@id='taskListBlock']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea
	@FindBy(xpath=" //*[@id='taskListBlock']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
	private WebElement discbyxpath ;
	public WebElement getdiscbyxpath()
	{
		return discbyxpath ;
		
	}	
	
	
	 // Create customer button   //span[text()='Create Customer']
	
	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement createcustombutton ;
	public WebElement getclickCreateCustomButton()
	{
		return createcustombutton ;
		
	}	
	
	
	// Edit customer setting butoon //*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]
	
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement editbuttonForCustom;
	public WebElement getclickToeditbuttonForCustom()
	{
		return editbuttonForCustom ;
		
	}	
	
	// click on Action button to delete      //div[text()='ACTIONS']
	
	@FindBy(xpath="//div[text()='ACTIONS']")
	private WebElement action;
	public WebElement getclickOnActionForCustomer()
	{
		return action ;
		
	}	
	// CLICK ON DELETE TO DELETE CUSTOMER    //div[text()='Delete']
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")
	private WebElement delete;
	public WebElement getclickOnDeleteForCustomer()
	{
		return delete ;
		
	}	
	
	
	// Click on DELETE PERMANAET BUTTON    customerPanel_deleteConfirm_submitTitle
	
	private WebElement customerPanel_deleteConfirm_submitTitle;
	public WebElement getClickOnDeletePermaForCustom()
	{
		return  customerPanel_deleteConfirm_submitTitle;
	}
	
	
	
	
	// close button click for customer   
	
	
	
	@FindBy(xpath=" //*[@id='taskListBlock']/div[2]/div[1]/div[1]")
	private WebElement closex;
	public WebElement getclickOnCloseX()
	{
		return closex ;
		
	}	
	
	
	
	// Add new Project   /html/body/div[14]/div[2]
	
	
	@FindBy(xpath=" /html/body/div[14]/div[2]")
	private WebElement newpro;
	public WebElement getclickOnNewProject()
	{
		return newpro ;
		
	}	
	
	// name for the project     projectPopup_projectNameField
	
	private WebElement projectPopup_projectNameField;
	public WebElement getNewProjectName()
	{
		return projectPopup_projectNameField;
	}
	
	// click on create project     //span[text()='Create Project']
	
	@FindBy(xpath=" //span[text()='Create Project']")
	private WebElement createproj;
	public WebElement getclickCreateProjToCreate()
	{
		return createproj ;
		
	}	
	
	// edit buuton for project setting button //*[@id="cpTreeBlock"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]
	
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement edit;
	public WebElement getclickToEditForProj()
	{
		return edit ;
		
	}	
	
	// Action button for project        //*[@id="taskListBlock"]/div[4]/div[1]/div[2]/div[3]/div/div
	
	@FindBy(xpath="  //*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")
	private WebElement actionforproj;
	public WebElement getclickActionForProg()
	{
		return actionforproj ;
		
	}	
	
	// Delete button for project    //div[text()='Delete']
	

	@FindBy(xpath="//span[text()='Delete']")
	private WebElement deleteproj;
	public WebElement getclickToDeleteProj()
	{
		return deleteproj ;
		
	}	
	
	// Delete project Permanently    projectPanel_deleteConfirm_submitTitle
	
	private WebElement projectPanel_deleteConfirm_submitTitle;
	public WebElement getclickToDeleteProjPermanat()
	{
		return projectPanel_deleteConfirm_submitTitle;
	}
	
	
	
	// create task  ADD NEW TASK BUTTON      //div[text()='Add New Task']
	

	@FindBy(xpath=" //div[text()='Add New Task']")
	private WebElement addnewtask;
	public WebElement getclickToAddNEwTASK()
	{
		return addnewtask ;
		
	}	
	
	//  click on create new task    /html/body/div[13]/div[1]
	@FindBy(xpath="   /html/body/div[13]/div[1]")
	private WebElement createnewtask;
	public WebElement getclickToCreateNewTask()
	{
		return createnewtask ;
		
	}	
	
	
	//  Name field of task   //*[@id="createTasksPopup_createTasksTableContainer"]/table/tbody/tr[1]/td[1]/input
	
	@FindBy(xpath="  //*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")
	private WebElement nameoftask;
	public WebElement getNewNAmeOfTask()
	{
		return nameoftask ;
		
	}	
	
	// button of create task  //span[text()='Create Tasks']
	
	
	@FindBy(xpath=" //span[text()='Create Tasks']")
	private WebElement createtaskbutton;
	public WebElement getclickonCreateTaskButtonFinally()
	{
		return createtaskbutton ;
		
	}	
	
	
	// Delete alll task   check box    //*[@id='taskListBlock']/div[1]/table/tbody/tr/td[1]/div/div
	
	
	@FindBy(xpath="   //*[@id='taskListBlock']/div[1]/table/tbody/tr/td[1]/div/div")
	private WebElement deletetaskbox;
	public WebElement getclickToDeleteTaskCheckBok()
	{
		return deletetaskbox ;
		
	}	
	
	//span[text()='Delete']
	
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/div[3]/div/div/div[4]")
	private WebElement deletetask;
	public WebElement getclickToDeleteTask()
	{
		return deletetask ;
		
	}	
	
	private WebElement deleteTaskPopup_deleteConfirm_submitTitle;
	public WebElement getDeleTeTaskPERMA()
	{
		return deleteTaskPopup_deleteConfirm_submitTitle;
	}
	                               
	
	// Skip afyer login to explore actitime   //span[text()='Start exploring actiTIME']
	
	@FindBy(xpath="//span[text()='Start exploring actiTIME']")
	private WebElement explore;
	public WebElement getclickToExploreACTITIME()
	{
		return explore;
		
	}	
		
	
	//click on user1

	@FindBy(xpath="//span[text()='manu, u1']")
	private WebElement u1;
	public WebElement getclickToU1tomodi()
	{
		return u1;
		
	}	
	
	
	//click on user2

		@FindBy(xpath="//span[text()='manu, u2']")
		private WebElement u2;
		public WebElement getclickToU2tomodi()
		{
			return u2;
			
		}	
		
		//click on user3

				@FindBy(xpath="//span[text()='manu, u3']")
				private WebElement u3;
				public WebElement getclickToU3tomodi()
				{
					return u3;
					
				}	
	
	// user delete button   userDataLightBox_deleteBtn         LINE 150 DUPLICATE COMMENT 
				
				private WebElement userDataLightBox_deleteBtn;
				public WebElement getCLICKONDELETEUSERU1()
				{
					return userDataLightBox_deleteBtn1;
				}
						
				
				
				
	// Logout button 
	
	private WebElement logoutLink;
	public WebElement getlogout()
	{
		return logoutLink;
	}
	
	

}
		
