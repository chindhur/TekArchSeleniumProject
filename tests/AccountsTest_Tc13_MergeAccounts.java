package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import constants.FileConstant;
import pages.AccountsPage;
import pages.LoginPage;
import utils.CommonUtils;
import utils.ReadFile;

public class AccountsTest_Tc13_MergeAccounts extends BaseTest {
	@Test
	public void mergeaccounts() throws IOException {
		WebDriver driver =BaseTest.getDriver();
		LoginPage lp=new LoginPage(driver);
		driver.get("https://login.salesforce.com");
		
		lp.username.sendKeys(ReadFile.readPropertiesFile(FileConstant.LOGIN_TESTDATA_FILE_PATH2,"username"));
		lp.password.sendKeys(ReadFile.readPropertiesFile(FileConstant.LOGIN_TESTDATA_FILE_PATH2,"password"));
		lp.loginButton.click();
		CommonUtils.waitForElement(driver, lp.loginButton);
		AccountsPage ap = new AccountsPage(driver);
		ap.accountsTab.click();
		
		CommonUtils.waitForElement(driver,ap.accountsTab);
		ap.mergeaccount.click();
		ap.findaccountsearchbox.sendKeys("teddybear");
		ap.findaccountbutton.click();
		CommonUtils.waitForElement(driver,ap.findaccountbutton);
	//	ap.selectcheckbox();
		ap.nextButton.click();
		CommonUtils.waitForElement(driver, ap.nextButton);

		ap.selectmasterrecord();
		
		ap.mergeButton.click();
		CommonUtils.waitForElement(driver, ap.mergeButton);
	
	}
}
