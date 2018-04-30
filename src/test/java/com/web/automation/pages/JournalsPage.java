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


public class JournalsPage extends BasePage {	
	public WebDriver driver=ActionsLibrary.driver;
	public ExtentLogs extentLogs = new ExtentLogs();
	Optional<Long> timeoutInSecond = Optional.of(Long.parseLong("5"));

	public JournalsPage(WebDriver driver) {
		super(driver);		
	}
	
	
	//public void fnCreateJournal(String BatchName, String BatchDescription, String JournalName, String JournalDescription, String Category, String Company1, String BussLine1, String AccountNo1, String Future1, String Debit, String DebitDesc, String Company2, String BussLine2, String AccountNo2, String Future2, String Credit, String CreditDesc) throws Throwable
	public void fnCreateJournal(String BatchName, String BatchDescription, String JournalName, String JournalDescription, String Category, String Company1, String BusinessLine1, String Account1, String Future1, String Debit, String DebitDescription, String Company2, String BusinessLine2, String Account2, String Future2, String Credit, String CreditDescription, String AttachmentTitle, String AttachmentTitleDescription) throws Throwable
	{		
		try
		{	
			if(actionLib.waitForElementPresent(Journals.Tasks, 15))
			{	
				extentLogs.pass("Journals page","Journals page displayed");
				
				//Navigate to Create Journal page from Tasks bar
				actionLib.Click(Journals.Tasks, "Tasks");
				actionLib.Click(Journals.CreateJournal, "CreateJournal");
				if (actionLib.isElementPresent(Journals.BatchName, "BatchName"))
					extentLogs.pass("Manage Journals Page","Manage Journals page is displayed");
				else
					extentLogs.pass("Manage Journals Page","Manage Journals Page is not displayed");
				
				//Fill in Journal Batch details
				if (!BatchName.isEmpty())
					actionLib.type(Journals.BatchName, BatchName, "BatchName");
				if (!BatchDescription.isEmpty())
					actionLib.type(Journals.BatchDescription, BatchDescription, "BatchDescription");
				
				//Add attachment
				actionLib.Click(Journals.AddAttachment, "AddAttachment");
				actionLib.Click(Journals.ChooseFile, "ChooseFile");
				
				Robot robot = new Robot();
	            StringSelection front = new StringSelection("C:\\Users\\e001207\\Desktop\\PrimeQ-Attachment.xlsx");
	            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(front, null);
	            robot.keyPress(KeyEvent.VK_CONTROL);
	            robot.keyPress(KeyEvent.VK_V);
	            robot.keyRelease(KeyEvent.VK_V);
	            robot.keyRelease(KeyEvent.VK_CONTROL);
	            robot.keyPress(KeyEvent.VK_ENTER);
	            robot.keyRelease(KeyEvent.VK_ENTER);
	            
				
				if (!AttachmentTitle.isEmpty())
					Thread.sleep(2000);
					actionLib.type(Journals.Title, AttachmentTitle, "AttachmentTitle" );
				if (!AttachmentTitleDescription.isEmpty())
					actionLib.type(Journals.TitleDescription, AttachmentTitleDescription, "AttachmentTitleDescription" );
				actionLib.Click(Journals.OK, "OK");
				Thread.sleep(3000);
				
				if (actionLib.isElementPresent(Journals.Attachment, "Attachment"))
					extentLogs.pass("Attachment on Journals Page","Attachment displayed on Journals page");
				else
					extentLogs.fail("Attachment on Journals Page","Attachment not displayed on Journals page");
				
				//Fill in Journal details
				if (!JournalName.isEmpty())
					Thread.sleep(2000);
					actionLib.type(Journals.JournalName, JournalName, "JournalName");
				if (!JournalDescription.isEmpty())
					actionLib.type(Journals.JournalDescription, JournalDescription, "JournalDescription");
				
				if (!Category.isEmpty())
					actionLib.type(Journals.Category, Category, "Category");
					Thread.sleep(3000);
				
				//Fill in Journal Line-1 details
				actionLib.Click(Journals.AccountNumberJournalLine1, "Line1");
				actionLib.Click(Journals.SelectAccount, "SelectAccount");
				
				if (!Company1.isEmpty())
					actionLib.typee(Journals.AccountSearchCompany1, Company1 + Keys.TAB, "Company");
				if (!BusinessLine1.isEmpty())
					actionLib.typee(Journals.AccountSearchBusinessLine1, BusinessLine1 + Keys.TAB, "BusinessLine");
				if (!Account1.isEmpty())
					actionLib.typee(Journals.AccountSearchAccount1, Account1 + Keys.TAB, "Account");
				
				actionLib.Click(Journals.AccountOK1, "OK");
				Thread.sleep(3000);
				if (!Debit.isEmpty())
					actionLib.type(Journals.Line1Debit, Debit, "Debit");
				if (!DebitDescription.isEmpty())
					actionLib.type(Journals.Line1Description, DebitDescription + Keys.TAB, "DebitDescription");
					Thread.sleep(5000);
					
				actionLib.Click(Journals.SelectAccount, "SelectAccount");
				
				if (!Company2.isEmpty())
					actionLib.typee(Journals.AccountSearchCompany2, Company2 + Keys.TAB, "Company");
				if (!BusinessLine2.isEmpty())
					actionLib.typee(Journals.AccountSearchBusinessLine2, BusinessLine2 + Keys.TAB, "BusinessLine");
				if (!Account2.isEmpty())
					actionLib.typee(Journals.AccountSearchAccount2, Account2 + Keys.TAB, "Account");
				
				
				actionLib.Click(Journals.AccountOK2, "OK");
				Thread.sleep(3000);
				if (!Credit.isEmpty())
					actionLib.type(Journals.Line2Credit, Credit, "Credit");
				if (!CreditDescription.isEmpty())
					actionLib.type(Journals.Line2Description, CreditDescription, "CreditDescription" );
				
				//Save and Complete
				actionLib.Click(Journals.Save, "Save");
				actionLib.Click(Journals.Complete, "Complete");
				Thread.sleep(5000);
				//Verify the completion status
				String JournalStatus= actionLib.getElementText(Journals.CompletionStatus, "Journal Status");
				if (JournalStatus.toString().toUpperCase().equals("COMPLETE"))
					extentLogs.pass("Completion Status update","Status changed to 'Complete'");
				else
					extentLogs.fail("Completion Status update","Status not changed to 'Complete'");
				
				actionLib.Click(Journals.Post, "Post");
				Thread.sleep(5000);
				String BatchStatus= actionLib.getElementText(Journals.BatchStatus, "Batch Status");
				if (BatchStatus.toString().toUpperCase().equals("SELECTED FOR POSTING"))
					extentLogs.pass("Status update","Status changed to 'Selected for posting'");
				else if (BatchStatus.toString().toUpperCase().equals("POSTED"))
					extentLogs.pass("Batch Status update","Status changed to 'Posted'");
				else
					extentLogs.fail("Batch Status update","Status not changed to 'Selected for posting' or 'Posted'");
				actionLib.Click(Journals.ConfirmationOK, "ConfirmationOK");
				Thread.sleep(3000);
				
				actionLib.Click(Journals.Profile, "Profile");
				actionLib.Click(Journals.SignOut, "SignOut");
				actionLib.Click(Journals.Confirm, "Confirm");				
				extentLogs.pass("Signout","Signout successful");
				
				extentLogs.pass("Create Journal","Create Journal Successfull");					
			}
		}
		catch(Exception e)
		{	
			extentLogs.fail("Create Journal","Not able to Create Journal");
			e.printStackTrace();			
		}
	}
		
}




