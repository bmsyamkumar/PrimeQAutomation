package com.web.automation.objectrepository;

import org.openqa.selenium.By;

public class Billing{
	
	
	public static By Tasks = By.xpath("//img[@title='Tasks']");
	public static By CreateCustomer = By.xpath("//li/a[text()='Create Customer']");
	public static By ManageCustomers = By.xpath("//li/a[text()='Manage Customers']");
	
	//Organisation Information
	public static By Name = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:cupanel1:pt_r1:0:inputText123::content");
								   //_FOpt1:_FOr1:1:_FOSritemNode_receivables_billing:0:MAnt2:1:cupanel1:pt_r1:0:inputText123::content
	public static By DUNSNumber = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:cupanel1:pt_r1:0:inputText31::content");
	//public static By RegistryID = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:cupanel1:pt_r1:0:inputText1::content");
	public static By RegistryID = By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:cupanel1:pt_r1:0:inputText1']//td[2]/span");
	
	//Search Results
	//Customer
	//public static By CustomerRegistryID = By.xpath("//div[@id='_FOpt1:_FOr1:1:_FOSritemNode_receivables_billing:0:MAnt2:1:cupt1:CManF:0:AP1:pt_r1:0:AT1:_ATp:table1::db']//td[3]/a");
	public static By CustomerRegistryID = By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:2:AP1:pt_r1:0:AT1:_ATp:table1::db']//td[3]/span/a");
	//public static By CustomerName = By.xpath("//div[@id='_FOpt1:_FOr1:1:_FOSritemNode_receivables_billing:0:MAnt2:1:cupt1:CManF:0:AP1:pt_r1:0:AT1:_ATp:table1::db']//td[4]//a/span");
	public static By CustomerName = By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:2:AP1:pt_r1:0:AT1:_ATp:table1::db']//td[4]//a/span");
	public static By CustomerDUNSNumber = By.xpath("//div[@id='_FOpt1:_FOr1:1:_FOSritemNode_receivables_billing:0:MAnt2:1:cupt1:CManF:0:AP1:pt_r1:0:AT1:_ATp:table1::db']//td[5]/span");
	//Accounts
	//public static By CustomerAccountNumber = By.xpath("//div[@id='_FOpt1:_FOr1:1:_FOSritemNode_receivables_billing:0:MAnt2:1:cupt1:CManF:0:AP1:pt_r3:0:AT1:_ATp:table1::db']//td[3]//a/span");
	public static By CustomerAccountNumber = By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:2:AP1:pt_r3:0:AT1:_ATp:table1::db']//td[3]//a/span");
	public static By CustomerAccountDescription = By.xpath("//div[@id='_FOpt1:_FOr1:1:_FOSritemNode_receivables_billing:0:MAnt2:1:cupt1:CManF:0:AP1:pt_r3:0:AT1:_ATp:table1::db']//td[4]/a");
	//Sites
	//public static By CustomerSiteAddress = By.xpath("//div[@id='_FOpt1:_FOr1:1:_FOSritemNode_receivables_billing:0:MAnt2:1:cupt1:CManF:0:AP1:pt_r4:0:AT1:_ATp:table1::db']//td[4]/span");
	public static By CustomerSiteAddress = By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:2:AP1:pt_r4:0:AT1:_ATp:table1::db']//td[4]/span");
	
	//Account Information
	public static By AccountNumber = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:cupanel1:pt_r2:0:inputText1::content");
	public static By AccountDescription = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:cupanel1:pt_r2:0:inputText2::content");
	public static By AccountType(String AccountType)
	{
		return By.xpath("//select[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:cupanel1:pt_r2:0:selectOneChoice1::content']/option[text()='" + AccountType + "']");
	}
	public static By CustomerClass(String CustomerClass)
	{
		return By.xpath("//select[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:cupanel1:pt_r2:0:selectOneChoice2::content']/option[text()='" + CustomerClass + "']");
	}
	
	//Account Address
	public static By AccountAddressSet = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:cupanel1:pt_r3:0:setIdLovId::content");
	
	//Address
	public static By SiteName = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:cupanel1:pt_r3:0:dynam1:0:inputText13::content");
	public static By AddressLine1 = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:cupanel1:pt_r3:0:dynam1:0:dynam1:0:s2:i1:0:inputText2::content");
	public static By City = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:cupanel1:pt_r3:0:dynam1:0:dynam1:0:s2:i1:3:inputText6::content");
	
	//Address Purposes
	public static By Add = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:cupanel1:pt_r3:0:AT1:_ATp:create::icon");
	public static By Purpose1(String Purpose)
	{
		return By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:cupanel1:pt_r3:0:AT1:_ATp:table1:0:SiteUseCode::content']/option[text()='" + Purpose + "']");
	}
	public static By Purpose2(String Purpose)
	{
		return By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:cupanel1:pt_r3:0:AT1:_ATp:table1:1:SiteUseCode::content']/option[text()='" + Purpose + "']");
	}
	
	//Search
	public static By SearchRegistryID = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:2:AP1:q1:value00::content");
	public static By OrganisationName = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:2:AP1:q1:value10::content");
	public static By Search = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:2:AP1:q1::search");
	
	//Sites
	public static By SiteNumberLink = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:2:AP1:pt_r4:0:AT1:_ATp:table1:0:outputText61");
	
	//public static By SiteDetails = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:5:cupanel1:cusdi1::disAcr");
	public static By SiteDetails = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:3:cupanel1:cusdi1::disAcr");
	
	//Reference Accounts
	public static By AddReference = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:3:cupanel1:r4:0:cil1::icon");
	public static By BusinessUnit = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:3:cupanel1:r4:0:r1:1:businessUnitNameId::content");
	public static By AddReferenceOK = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:3:cupanel1:r4:0:cb1");
	
	//Communication
	public static By Communication = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:3:cupanel1:cushowDetailItem1::disAcr");
	public static By EditContacts = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:3:cupanel1:cb2");
	public static By AddContact = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:4:AP1:r1:0:AT1:_ATp:ctb2::icon");
	public static By Prefix(String OptionText)
	{
		return By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:4:AP1:r1:0:AT1:r1:1:selectOneChoice4::content']/option[text()='" + OptionText + "']");
	}
	public static By FirstName = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:4:AP1:r1:0:AT1:r1:1:inputText3::content");
	public static By LastName = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:4:AP1:r1:0:AT1:r1:1:inputText4::content");
	public static By RoleType(String Role)
	{
		return By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:4:AP1:r1:0:AT1:r1:1:selectOneChoice1::content']/option[text()='" + Role + "']");
	}
	public static By CreateContactOK = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:4:AP1:r1:0:AT1:commandButton1");
	public static By MakeContactPrimary = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:4:AP1:r1:0:AT1:_ATp:SetPrimaryContactToolbar::icon");
	public static By IsPrimaryContact = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:4:AP1:r1:0:AT1:_ATp:table1:0:image1");
	//Contact Points
	public static By CreateContactPoint = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:4:AP1:region1:0:AT1:_ATp:create::icon");
	public static By ContactPointType(String Type)
	{
		return By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:4:AP1:region1:0:AT1:pt_r1:1:ContactPointType::content']/option[text()='" + Type + "']");		
	}
	public static By ContactPointPurpose(String Purpose)
	{
		return By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:4:AP1:region1:0:AT1:pt_r1:1:selectOneChoice4::content']/option[text()='" + Purpose + "']");		
	}
	public static By EmailFormat(String Format)
	{
		return By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:4:AP1:region1:0:AT1:pt_r1:1:selectOneChoice5::content']/option[text()='" + Format + "']");		
	}
	public static By Email = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:4:AP1:region1:0:AT1:pt_r1:1:inputText5::content");
	public static By CreateContactPointOK = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:4:AP1:region1:0:AT1:dialogOKbtn");
	public static By MakeContactPointPrimary = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:4:AP1:region1:0:AT1:_ATp:ctb1::icon");
	//Add Contact Responsibilities
	public static By AddContactResponsibility = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:4:AP1:region2:0:AT1:_ATp:create::icon");
	public static By ResposibilityType1(String Responsibility)
	{
		return By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:4:AP1:region2:0:AT1:_ATp:table1:0:selectOneChoice3::content']/option[text()='" + Responsibility + "']");		
	}
	public static By ResposibilityType2(String Responsibility)
	{
		return By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:4:AP1:region2:0:AT1:_ATp:table1:1:selectOneChoice3::content']/option[text()='" + Responsibility + "']");		
	}
	//Addresses
	public static By CreateAddress = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:4:AP1:r3:0:AT1:_ATp:create::icon");
	public static By CreateAddressLine1 = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:4:AP1:r3:0:AT1:pt_r1:1:dynam1:0:s2:i1:0:inputText2::content");
	public static By CreateAddressCity = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:4:AP1:r3:0:AT1:pt_r1:1:dynam1:0:s2:i1:3:inputText6::content");
	public static By CreateAddressAddPurpose = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:4:AP1:r3:0:AT1:pt_r1:1:AT1:_ATp:create::icon");
	public static By CreateAddressPurpose(String Purpose)
	{
		return By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:4:AP1:r3:0:AT1:pt_r1:1:AT1:_ATp:table1:0:selectOneChoice9::content']/option[text()='" + Purpose + "']");		
	}
	public static By CreateAddressOK = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:4:AP1:r3:0:AT1:Create");
	public static By MakeAddressPrimary = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:4:AP1:r3:0:AT1:_ATp:SetPrimaryFlagToolbar::icon");
	public static By IsPrimaryAddress = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:4:AP1:r3:0:AT1:_ATp:table1:0:image1");
	public static By EditContactsSaveAndClose1 = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:4:AP1:cb2");
	public static By EditContactsSaveAndClose2 = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:5:cupanel1:cucommandButton2");
	
	public static By SaveAndClose1 = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:cupanel1:cucommandButton2");
	public static By SaveAndClose2 = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:4:AP1:cb2");
	public static By SaveAndClose3 = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:3:cupanel1:cucommandButton2");
	public static By Done = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:2:AP1:cb1");
	
	//public static By SearchHeader = By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:2:AP1:q1::_afrTtxt']/div/h1");
	public static By SearchHeader = By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:2:AP1:q1::_afrDscl");
	public static By CreatedCustomerRegistryID(String RegistryID)
	{
		return By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:2:AP1:pt_r1:0:AT1:_ATp:table1::db']//td/a[text()='" + RegistryID + "']");		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static By BatchName = By.xpath("//input[contains(@name,'BatchName')]");
	public static By BatchDescription = By.xpath("//textarea[contains(@name,'BatchDescription')]");
	
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
	//public static By SaveAndClose = By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:cmi4']/td[2]");
	
	public static By ConfirmationOK = By.xpath("//button[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:userResponsePopupDialogButtonOk']");
	
	public static By ShowMore = By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:showMore");
	public static By AddAttachment_ShowLess = By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:a1:clLAdds");
	public static By AddAttachment = By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:a2:clLAdds");
	public static By ChooseFile = By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:a2:popApplicationsTable:_ATp:popAttachmentTable:0:ifPopup::content");
	public static By Title = By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:a2:popApplicationsTable:_ATp:popAttachmentTable:0:popTitleInputText::content");
	public static By TitleDescription = By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:a2:popApplicationsTable:_ATp:popAttachmentTable:0:popDescriptionInputText::content");
	public static By OK = By.xpath("//button[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:a2:dc_cb1']");
	
	public static By Refresh = By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:cil2::icon");
	
	
	public static By Profile = By.id("_FOpt1:_UIScmil2u::icon");
	public static By SignOut = By.id("_FOpt1:_UISlg1");
	public static By Confirm = By.id("Confirm");
	
}
	
