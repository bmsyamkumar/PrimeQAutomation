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
import com.web.automation.pages.CreateCustomerPage;
import com.web.automation.pages.HomePage;
import com.web.automation.pages.JournalsPage;
import com.web.automation.pages.ReadTestData;
import com.web.automation.pages.SignInPage;
import com.web.automation.utilities.CommonVariables;

public class CreateCustomer extends TestEngineWeb {
	
	private String testCaseFailureReason = "";
	private boolean testCaseStatus = true;	
	private ExtentLogs extentLogs = new ExtentLogs();
	private SignInPage SignIn;
	private HomePage Home;
	private CreateCustomerPage CreateCustomer;
	boolean isLoginSuccessfull,isLogOutSuccessfull;
	
	public void TestCaseStatus(Boolean status, String reason) {
		if (status == false) {
			Assert.fail("Test Case Failed because - " + reason);
		}
	}	
	

	@DataProvider(name="DataSets")
    public Object[][] getDataFromDataprovider() throws IOException{
    Object[][] DataObject = null;
    ReadTestData file = new ReadTestData();
    
    
    Sheet DataSheet = file.readExcel(System.getProperty("user.dir").replace("\\", "/") + "/testdata","PrimeQTestData.xlsx" , "CreateCustomer");
    int rowCount = DataSheet.getLastRowNum()-DataSheet.getFirstRowNum();
    
    DataObject = new Object[rowCount][28];
    for (int i = 0; i < rowCount; i++) {
    	Row row = DataSheet.getRow(i+1);
        for (int j = 0; j < row.getLastCellNum(); j++) {
        	DataObject[i][j] = row.getCell(j).toString();
        }
    }    
     return DataObject;    
    }
	
	
	
	@Test(dataProvider="DataSets",description = "Create Customer", groups = { "smoke", "regression" })
	public void CreateCustomer(String UserID, String Password, String Name, String DUNSNumber, String AccountNumber, String AccountDescription, String AccountType, String CustomerClass, String AccountAddressSet, String SiteName, String AddressLine1, String City, String AddressPurposes1, String AddressPurposes2, String BusinessUnit, String Prefix, String FirstName, String LastName, String RoleType, String ContactPointType, String ContactPointPurpose, String EmailFormat, String Email, String ResponsibilityType1, String ResponsibilityType2, String CreateAddressLine1, String CreateAddressCity, String CreateAddressPurpose) throws Throwable {
		try {	
			
			SignIn = new SignInPage(CommonVariables.CommonDriver.get());
			Home = new HomePage(CommonVariables.CommonDriver.get());
			CreateCustomer = new CreateCustomerPage(CommonVariables.CommonDriver.get());
			
			//Sign In
			SignIn.fnSignIn(UserID, Password);
			
			//Navigate to Journal
			Home.fnNavigateToBilling();
			
			//Create JOurnal
			CreateCustomer.fnCreateCustomer(Name, DUNSNumber, AccountNumber, AccountDescription, AccountType, CustomerClass, AccountAddressSet, SiteName, AddressLine1, City, AddressPurposes1, AddressPurposes2, BusinessUnit, Prefix, FirstName, LastName, RoleType, ContactPointType, ContactPointPurpose, EmailFormat, Email, ResponsibilityType1, ResponsibilityType2, CreateAddressLine1, CreateAddressCity, CreateAddressPurpose);
			
			}
		catch (Exception e) {
			testCaseFailureReason = "Failed to complete Customer Creation";
			String stackTrace = extentLogs.getStackTraceAsString("Test", testCaseFailureReason, e);
			extentLogs.fail("Customer Creation ", testCaseFailureReason + "Failed Reason : " + stackTrace);
			testCaseStatus = false;
		}
		TestCaseStatus(testCaseStatus, testCaseFailureReason);
	}
	

}
