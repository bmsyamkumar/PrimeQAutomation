package com.web.automation.objectrepository;

import org.openqa.selenium.By;

public class Journals{
	
	
	public static By Tasks = By.xpath("//img[@title='Tasks']");
	public static By CreateJournal = By.xpath("//li/a[text()='Create Journal']");
		
	public static By BatchName = By.xpath("//input[contains(@name,'BatchName')]");
	public static By BatchDescription = By.xpath("//textarea[contains(@name,'BatchDescription')]");
	public static By CompletionStatus = By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:plam5']/td[2]");
	public static By BatchStatus = By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:plam4']/td[2]/span");
	
	public static By JournalName = By.xpath("//input[contains(@name,'JournalName')]");
	public static By JournalDescription = By.xpath("//textarea[contains(@name,'JournalDescription')]");
	
	public static By Category = By.xpath("//input[contains(@name,'userJeCategoryNameId1')]");
	public static By SelectAccount = By.xpath("//a[@title='Select: Account']");
	public static By JournalLinesTable = By.xpath("//table[@summary='Journal Lines']");
	
	public static By AccountNumberJournalLine1= By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:accountCS::content");
	
	public static By AccountSearchCompany1= By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:accountSPOP_query:value00::content");
	public static By AccountSearchBusinessLine1= By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:accountSPOP_query:value10::content");
	public static By AccountSearchAccount1= By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:accountSPOP_query:value20::content");
	public static By AccountSearch1= By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:accountQRBT");
	public static By AccountOK1= By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:accountSEl");
	
	public static By Line1Debit= By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:EnteredDr::content");
	public static By Line1Credit= By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:EnteredCr::content");
	public static By Line1Description= By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:it4::content");
	
	//public static By AccountNumberJournalLine2= By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:1:accountCS::content");
	public static By AccountNumberJournalLine2= By.id("pt1:_FOr1:1:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:1:accountCS::content");
	
	public static By AccountSearchCompany2= By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:1:accountSPOP_query:value00::content");
	public static By AccountSearchBusinessLine2= By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:1:accountSPOP_query:value10::content");
	public static By AccountSearchAccount2= By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:1:accountSPOP_query:value20::content");
	public static By AccountSearch2= By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:1:accountQRBT");
	public static By AccountOK2= By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:1:accountSEl");
	
	
	public static By Line2Debit= By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:1:EnteredDr::content");
	public static By Line2Credit= By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:1:EnteredCr::content");
	public static By Line2Description= By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:1:it4::content");
	
	public static By Save = By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:saveBatch']/table/tbody/tr/td[1]/a/span");
	public static By SaveArrow = By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:saveBatch::popEl");
	public static By Complete = By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:completeButton']/table/tbody/tr/td[1]/a/span");
	public static By Post = By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:postBatch']/table/tbody/tr/td[1]/a/span");
	public static By SaveAndClose = By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:cmi4']/td[2]");
	
	
	public static By ConfirmationOK = By.xpath("//button[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:userResponsePopupDialogButtonOk']");
	
	public static By ShowMore = By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:showMore");
	public static By AddAttachment_ShowLess = By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:a1:clLAdds");
	public static By AddAttachment = By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:a1:clLAdds");
	public static By ChooseFile = By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:a1:popApplicationsTable:_ATp:popAttachmentTable:0:ifPopup::content");
	public static By Title = By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:a1:popApplicationsTable:_ATp:popAttachmentTable:0:popTitleInputText::content");
	public static By TitleDescription = By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:a1:popApplicationsTable:_ATp:popAttachmentTable:0:popDescriptionInputText::content");
	public static By OK = By.xpath("//button[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:a1:dc_cb1']");
	public static By Attachment = By.xpath("//a[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:a1:iLstAtt:0:lastAttachedFile']");
	
	
	public static By Refresh = By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:cil2::icon");
	public static By ConfirmationYes = By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:userResponsePopupDialogButtonYes");
	
	
	public static By Profile = By.id("_FOpt1:_UIScmil2u::icon");
	public static By SignOut = By.id("_FOpt1:_UISlg1");
	public static By Confirm = By.id("Confirm");
	
}
	
