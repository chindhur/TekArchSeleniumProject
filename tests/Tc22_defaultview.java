package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import constants.FileConstant;
import pages.LeadsPage;
import pages.LoginPage;
import utils.CommonUtils;
import utils.ReadFile;

public class Tc22_defaultview extends BaseTest{
@Test
public void defaultview() throws IOException {
	WebDriver driver =BaseTest.getDriver();
	LoginPage lp=new LoginPage(driver);
	driver.get("https://login.salesforce.com");
	
	lp.username.sendKeys(ReadFile.readPropertiesFile(FileConstant.LOGIN_TESTDATA_FILE_PATH2,"username"));
	lp.password.sendKeys(ReadFile.readPropertiesFile(FileConstant.LOGIN_TESTDATA_FILE_PATH2,"password"));
	lp.loginButton.click();
	
	CommonUtils.waitForElement(driver, lp.loginButton);
	
	LeadsPage l=new LeadsPage(driver);
	 l.leadsTab.click();
	l.leadsDropdown.click();
	CommonUtils.waitForElement(driver, l.leadsDropdown);

	l.selectleadsdropdown();
	BaseTest.test.info("Selected an option from leads dropdown");

	l.userMenu.click();
	BaseTest.test.info("clicked on usermenu");
	CommonUtils.waitForElement(driver,l.userMenu);
	l.logoutButton.click();
	BaseTest.test.info("clicked on logout button");


	lp.username.sendKeys(ReadFile.readPropertiesFile(FileConstant.LOGIN_TESTDATA_FILE_PATH2,"username"));
	lp.password.sendKeys(ReadFile.readPropertiesFile(FileConstant.LOGIN_TESTDATA_FILE_PATH2,"password"));
	lp.loginButton.click();
	BaseTest.test.info("clicked on login button");

	CommonUtils.waitForElement(driver, lp.loginButton);
	
	 l.leadsTab.click();
	 CommonUtils.waitForElement(driver, l.leadsTab);
	 
	 
	
	
	
}


}
