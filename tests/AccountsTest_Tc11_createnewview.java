package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import constants.FileConstant;
import pages.AccountsPage;
import pages.LoginPage;
import utils.CommonUtils;
import utils.ReadFile;

public class AccountsTest_Tc11_createnewview extends BaseTest{
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
		BaseTest.test.info("Accounts tab is clicked");
		CommonUtils.waitForElement(driver, ap.accountsTab);
		ap.createNewView.click();
		ap.viewName.sendKeys("chindhunew");
		ap.viewUniqueName.sendKeys("chindhunew");
		ap.saveNewViewButton.click();	
		
	}

}
