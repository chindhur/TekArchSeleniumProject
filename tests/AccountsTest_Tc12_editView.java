package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import constants.FileConstant;
import pages.AccountsPage;
import pages.LoginPage;
import utils.CommonUtils;
import utils.ReadFile;

public class AccountsTest_Tc12_editView extends BaseTest{
	@Test
	public void createNewView() throws IOException {
		WebDriver driver =BaseTest.getDriver();
		LoginPage lp=new LoginPage(driver);
		driver.get("https://login.salesforce.com");
		
		lp.username.sendKeys(ReadFile.readPropertiesFile(FileConstant.LOGIN_TESTDATA_FILE_PATH2,"username"));
		lp.password.sendKeys(ReadFile.readPropertiesFile(FileConstant.LOGIN_TESTDATA_FILE_PATH2,"password"));
		lp.loginButton.click();
	
		AccountsPage ap = new AccountsPage(driver);
		ap.accountsTab.click();

		CommonUtils.waitForElement(driver, ap.accountsTab);
	//	ap.selectViewDropdown("reddy");
		ap.editButton.click();
		CommonUtils.waitForElement(driver, ap.editButton);
		
		//ap.editButton.click();
		//CommonUtils.waitForElement(driver, ap.editButton);
		
		ap.viewName.clear();
		ap.viewName.sendKeys("Angel");
		ap.viewUniqueName.clear();
		ap.viewUniqueName.sendKeys("Angel");
		CommonUtils.waitForElement(driver, ap.viewUniqueName);
		
		ap.fielddropdown();
		ap.operatordropdown();
		ap.valuefield.sendKeys("a");
		
		CommonUtils.waitForElement(driver, ap.valuefield);
		
		ap.saveEditViewButton.click();
		CommonUtils.waitForElement(driver, ap.saveEditViewButton);
		
	}

}
