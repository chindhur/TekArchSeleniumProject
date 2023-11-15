package tests;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import constants.FileConstant;
import pages.AccountsPage;
import pages.LoginPage;
import utils.CommonUtils;
import utils.ReadFile;

public class AccountsTest_Tc10_CreateAccount extends BaseTest {
	@Test
	public void createAccount() throws InvalidFormatException, IOException, InterruptedException {
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
		
		ap.newButton.click();
		CommonUtils.waitForElement(driver, ap.newButton);
		ap.accountName.sendKeys("teddybear");
		CommonUtils.waitForElement(driver, ap.accountName);
		
		ap.selectType("Technology Partner");
		ap.selectCustomerPriority("High");
		
		ap.saveButton.click();
		
		CommonUtils.waitForElement(driver,ap.saveButton);
	}
		
	}



