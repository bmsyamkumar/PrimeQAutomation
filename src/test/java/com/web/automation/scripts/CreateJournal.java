package com.web.automation.scripts;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.fileutils.ExcelReader;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.pages.HomePage;
import com.web.automation.pages.JournalsPage;
import com.web.automation.pages.ReadTestData;
import com.web.automation.pages.SignInPage;
import com.web.automation.utilities.CommonVariables;

public class CreateJournal extends TestEngineWeb {
	
	private String testCaseFailureReason = "";
	private boolean testCaseStatus = true;	
	private ExtentLogs extentLogs = new ExtentLogs();
	private SignInPage SignIn;
	private HomePage Home;
	private JournalsPage Journals;
	
	
	public void TestCaseStatus(Boolean status, String reason) {
		if (status == false) {
			Assert.fail("Test Case Failed because - " + reason);
		}
	}	
	

	@DataProvider(name="DataSets")
    public Object[][] getDataFromDataprovider() throws IOException{
    Object[][] DataObject = null;
    ReadTestData file = new ReadTestData();
    
    
    Sheet DataSheet = file.readExcel(System.getProperty("user.dir").replace("\\", "/") + "/testdata","PrimeQTestData.xlsx" , "CreateJournal");
    int rowCount = DataSheet.getLastRowNum()-DataSheet.getFirstRowNum();
    
    DataObject = new Object[rowCount][21];
    for (int i = 0; i < rowCount; i++) {
    	Row row = DataSheet.getRow(i+1);
        for (int j = 0; j < row.getLastCellNum(); j++) {
        	DataObject[i][j] = row.getCell(j).toString();
        }
    }    
     return DataObject;    
    }
	
	
	
	@Test(dataProvider="DataSets",description = "Create Journal", groups = { "smoke", "regression" })
	public void CreateJournal(String UserID, String Password, String JournalBatchName, String JournalBatchDescription, String JournalHeader, String JournalHeaderDescription, String Category, String Company1, String BusinessLine1, String Account1, String Future1, String Debit, String DebitDescription, String Company2, String BusinessLine2, String Account2, String Future2, String Credit, String CreditDescription, String AttachmentTitle, String AttachmentTitleDescription) throws Throwable {
		try {	
			
			SignIn = new SignInPage(CommonVariables.CommonDriver.get());
			Home = new HomePage(CommonVariables.CommonDriver.get());
			Journals = new JournalsPage(CommonVariables.CommonDriver.get());
			
			//Sign In
			SignIn.fnSignIn(UserID, Password);
			
			//Navigate to Journal
			Home.fnNavigateToJournal();
			
			//Create Journal
			Journals.fnCreateJournal(JournalBatchName, JournalBatchDescription, JournalHeader, JournalHeaderDescription, Category, Company1, BusinessLine1, Account1, Future1, Debit, DebitDescription, Company2, BusinessLine2, Account2, Future2, Credit, CreditDescription, AttachmentTitle, AttachmentTitleDescription);
			
			}
		catch (Exception e) {
			testCaseFailureReason = "Failed to complete Journal Creation";
			String stackTrace = extentLogs.getStackTraceAsString("Test", testCaseFailureReason, e);
			extentLogs.fail("Journal Creation ", testCaseFailureReason + "Failed Reason : " + stackTrace);
			testCaseStatus = false;
		}
		TestCaseStatus(testCaseStatus, testCaseFailureReason);
	}
	

}
