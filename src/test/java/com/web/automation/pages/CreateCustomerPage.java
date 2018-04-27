package com.web.automation.pages;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Optional;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.pages.BasePage;
import com.web.automation.utilities.CommonVariables;
import com.web.automation.utilities.ConfigManager;

import com.web.automation.objectrepository.SignIn;
import com.web.automation.objectrepository.Billing;
import com.web.automation.objectrepository.Home;
import com.web.automation.objectrepository.Journals;


public class CreateCustomerPage extends BasePage {	
	public WebDriver driver=ActionsLibrary.driver;
	public ExtentLogs extentLogs = new ExtentLogs();
	Optional<Long> timeoutInSecond = Optional.of(Long.parseLong("5"));

	public CreateCustomerPage(WebDriver driver) {
		super(driver);		
	}
	
	
	
	public void fnCreateCustomer(String Name, String DUNSNumber, String AccountNumber, String AccountDescription, String AccountType, String CustomerClass, String AccountAddressSet, String SiteName, String AddressLine1, String City, String AddressPurposes1, String AddressPurposes2, String BusinessUnit, String Prefix, String FirstName, String LastName, String RoleType, String ContactPointType, String ContactPointPurpose, String EmailFormat, String Email, String ResponsibilityType1, String ResponsibilityType2, String CreateAddressLine1, String CreateAddressCity, String CreateAddressPurpose) throws Throwable
	{		
		try
		{	
			if(actionLib.waitForElementPresent(Billing.Tasks, 15))
			{	
				extentLogs.pass("Create Customer page","Create Customer page displayed");
				
				actionLib.Click(Billing.Tasks, "Tasks");
				//Thread.sleep(1000);
				actionLib.Click(Billing.CreateCustomer, "CreateCustomer");
				//Thread.sleep(3000);
				if (actionLib.isElementPresent(Billing.Name, "Name"))
					extentLogs.pass("Create Organisation Customer Page","Create Organisation Customer page is displayed");
				else
					extentLogs.pass("Create Organisation Customer Page","Create Organisation Customer Page is not displayed");
				
				
				//Read and store Customer Registry ID
				String SearchRegistryID= actionLib.getElementText(Billing.RegistryID, "Rgistry ID");
				
				
				//Organisational Information
				if (!Name.isEmpty())
					actionLib.type(Billing.Name, Name, "Name");
				
				if (!DUNSNumber.isEmpty())
					actionLib.type(Billing.DUNSNumber, DUNSNumber, "DUNS Number");
				extentLogs.pass("Organisation information","Successfully enterd Organisation data");
				
				//Account Information
				if (!AccountNumber.isEmpty())
					actionLib.type(Billing.AccountNumber, AccountNumber, "Account Number");
				if (!AccountDescription.isEmpty())
					actionLib.type(Billing.AccountDescription, AccountDescription, "Account Description");
				actionLib.Click(Billing.AccountType(AccountType), "Account Type");
				Thread.sleep(3000);
				actionLib.Click(Billing.CustomerClass(CustomerClass), "Customer Class");
				Thread.sleep(3000);
				extentLogs.pass("Customer Account information","Successfully enterd Customer Account data");
				
				//Account Address
				if (!AccountAddressSet.isEmpty())
					actionLib.type(Billing.AccountAddressSet, AccountAddressSet, "Account Address Set");
				Thread.sleep(3000);
				if (!SiteName.isEmpty())
					actionLib.type(Billing.SiteName, SiteName, "SiteName");
				Thread.sleep(1000);
				if (!AddressLine1.isEmpty())
					actionLib.type(Billing.AddressLine1, AddressLine1, "Address Line1");
				Thread.sleep(1000);
				if (!City.isEmpty())
					actionLib.type(Billing.City, City, "City");
				Thread.sleep(1000);
				extentLogs.pass("Customer Address information","Successfully enterd Customer Address data");
				
				//Address Purposes
				actionLib.Click(Billing.Add, "Add Address Purposes");
				//Thread.sleep(3000);
				actionLib.Click(Billing.Purpose1(AddressPurposes1), "Address Purposes");
				//Thread.sleep(3000);
				actionLib.Click(Billing.Add, "Add Address Purposes");
				//Thread.sleep(3000);
				actionLib.Click(Billing.Purpose2(AddressPurposes2), "Address Purposes");
				//Thread.sleep(3000);
				actionLib.Click(Billing.SaveAndClose1, "Save and Close");
				//Thread.sleep(5000);
				extentLogs.pass("Address Purpose information","Successfully enterd Address Purpose data");
				
				//Search Customer
				if (!SearchRegistryID.isEmpty())
					actionLib.type(Billing.SearchRegistryID, SearchRegistryID, "Registry ID");
				actionLib.Click(Billing.Search, "Search");
				//Thread.sleep(3000);
				
				//Load Customer
				actionLib.Click(Billing.SiteNumberLink, "Site Number");
				//Thread.sleep(3000);
				
				actionLib.Click(Billing.AddReference, "Add Reference");
				//Thread.sleep(3000);
				if (!BusinessUnit.isEmpty())
					actionLib.type(Billing.BusinessUnit, BusinessUnit + Keys.TAB, "City");
				//Thread.sleep(1000);
				actionLib.Click(Billing.AddReferenceOK, "Add Reference OK");
				//Thread.sleep(3000);
				extentLogs.pass("Add Reference Account information","Successfully added Reference Account");
				
				//Communications
				actionLib.Click(Billing.Communication, "Communication");
				//Thread.sleep(3000);
				
				actionLib.Click(Billing.EditContacts, "EditContacts");
				//Thread.sleep(3000);
				
				//Create Contact point
				actionLib.Click(Billing.AddContact, "AddContact");
				//Thread.sleep(3000);
				actionLib.Click(Billing.Prefix(Prefix), "Prefix");
				//Thread.sleep(1000);
				if (!FirstName.isEmpty())
					actionLib.type(Billing.FirstName, FirstName, "FirstName");
				if (!LastName.isEmpty())
					actionLib.type(Billing.LastName, LastName, "LastName");
				actionLib.Click(Billing.RoleType(RoleType), "RoleType");
				//Thread.sleep(1000);
				actionLib.Click(Billing.CreateContactOK, "CreateContact OK");
				//Thread.sleep(3000);
				actionLib.Click(Billing.MakeContactPrimary, "Make Contact Primary");
				//Thread.sleep(3000);
				if (actionLib.isElementPresent(Billing.IsPrimaryContact, "IsPrimaryContact"))
					extentLogs.pass("Make Contact as Primary","Successfully made Contact as primary");
				else
					extentLogs.pass("Make Contact as Primary","Not able to make Contact as primary");
				extentLogs.pass("Create Conatact","Successfully created Contact");
				
				//Create Contact point
				actionLib.Click(Billing.CreateContactPoint, "Create ContactPoint");
				//Thread.sleep(3000);
				actionLib.Click(Billing.ContactPointType(ContactPointType), "Create ContactPoint Type");
				//Thread.sleep(2000);
				actionLib.Click(Billing.ContactPointPurpose(ContactPointPurpose), "Create ContactPoint Purpose");
				//Thread.sleep(1000);
				actionLib.Click(Billing.EmailFormat(EmailFormat), "Create ContactPoint Email");
				//Thread.sleep(1000);
				if (!Email.isEmpty())
					actionLib.type(Billing.Email, Email, "Email");	
				//Thread.sleep(1000);
				actionLib.Click(Billing.CreateContactPointOK, "Create ContactPoint OK");
				//Thread.sleep(3000);
				extentLogs.pass("Create Conatact Point","Successfully created Contact Point");
				
				//actionLib.Click(Billing.MakeContactPointPrimary, "MakeContactPointPrimary");
				//Thread.sleep(3000);
				
				//Account contact responsibilities
				actionLib.Click(Billing.AddContactResponsibility, "Add Contact Responsibility");
				//Thread.sleep(2000);
				actionLib.Click(Billing.ResposibilityType1(ResponsibilityType1), "Contact Responsibility Type");
				//Thread.sleep(1000);
				actionLib.Click(Billing.AddContactResponsibility, "Add Contact Responsibility");
				//Thread.sleep(2000);
				actionLib.Click(Billing.ResposibilityType2(ResponsibilityType2), "Contact Responsibility Type");
				//Thread.sleep(1000);
				extentLogs.pass("Create Conatact Resposibilities","Successfully created Contact Responsibilities");
				
				//Addresses
				actionLib.Click(Billing.CreateAddress, "Create Address");
				//Thread.sleep(3000);
				if (!CreateAddressLine1.isEmpty())
					actionLib.type(Billing.CreateAddressLine1, CreateAddressLine1, "CreateAddress Line1");	
				if (!CreateAddressCity.isEmpty())
					actionLib.type(Billing.CreateAddressCity, CreateAddressCity, "CreateAddressC ity");	
				actionLib.Click(Billing.CreateAddressAddPurpose, "CreateAddress AddPurpose");
				Thread.sleep(3000);
				actionLib.Click(Billing.CreateAddressPurpose(CreateAddressPurpose), "Create Address Purpose");
				//Thread.sleep(1000);
				actionLib.Click(Billing.CreateAddressOK, "CreateAddress OK");
				//Thread.sleep(3000);
				actionLib.Click(Billing.MakeAddressPrimary, "Make Address Primary");
				//Thread.sleep(3000);
				if (actionLib.isElementPresent(Billing.IsPrimaryAddress, "IsPrimaryAddress"))
					extentLogs.pass("Make Address as Primary","Successfully made Address as primary");
				else
					extentLogs.pass("Make Address as Primary","Not able to make Address as primary");
				extentLogs.pass("Create Conatact Addresses","Successfully created Contact Addresses");
				
				actionLib.Click(Billing.SaveAndClose2, "Save And Close");
				//Thread.sleep(3000);
				actionLib.Click(Billing.SaveAndClose3, "Save And Close");
				//Thread.sleep(3000);
				actionLib.Click(Billing.Done, "Done");
				//Thread.sleep(3000);
				actionLib.Click(Billing.SearchHeader, "SearchHeader");
				//Thread.sleep(3000);
				
				
				
				/*//Search Customer
				if (!SearchRegistryID.isEmpty())
					actionLib.type(Billing.SearchRegistryID, SearchRegistryID, "Registry ID");
				actionLib.Click(Billing.Search, "Search");
				//Thread.sleep(3000);
				*/
				
				//Verify Customer, Account and Site details
				//1. Customer
				String RegistryID= actionLib.getElementText(Billing.CustomerRegistryID, "Registry ID");				
				if (RegistryID.toString().equals(SearchRegistryID.toString()))
					extentLogs.pass("Customer data validation","Successfully verified Customer Registry ID");
				else
					extentLogs.fail("Customer data validation","Customer Registry ID verification failed");
				
				String CustName= actionLib.getElementText(Billing.CustomerName, "Customer Name");				
				if (CustName.toString().equals(Name.toString()))
					extentLogs.pass("Customer data validation","Successfully verified Customer Name");
				else
					extentLogs.fail("Customer data validation","Customer Name verification failed");
				
				//2. Account
				String AccNo= actionLib.getElementText(Billing.CustomerAccountNumber, "Customer AccountNumber");				
				if (AccNo.toString().equals(AccountNumber.toString()))
					extentLogs.pass("Customer data validation","Successfully verified Customer AccountNumber");
				else
					extentLogs.fail("Customer data validation","Customer AccountNumber verification failed");
				
				//3. Sites
				String SiteAddress= actionLib.getElementText(Billing.CustomerSiteAddress, "Customer SiteAddress");				
				if (SiteAddress.trim().toString().equals(AddressLine1.toString() + "," + City.toString()))
					extentLogs.pass("Customer data validation","Successfully verified Customer AccountNumber");
				else
					extentLogs.fail("Customer data validation","Customer AccountNumber verification failed");
				
				extentLogs.pass("Create Customer","Create Customer Successfull");					
			}
		}
		catch(Exception e)
		{	
			extentLogs.fail("Create Customer","Not able to Create Customer");
			e.printStackTrace();			
		}
	}
		
}



