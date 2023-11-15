package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import constants.FileConstant;
import pages.ContactsPage;
import pages.LoginPage;
import utils.CommonUtils;
import utils.ReadFile;

public class Tc27_recentlyCreated {
	@Test
	public void recentlycreated() throws IOException {
		
			WebDriver driver =BaseTest.getDriver();
			LoginPage lp=new LoginPage(driver);
			driver.get("https://login.salesforce.com");
			
			lp.username.sendKeys(ReadFile.readPropertiesFile(FileConstant.LOGIN_TESTDATA_FILE_PATH2,"username"));
			lp.password.sendKeys(ReadFile.readPropertiesFile(FileConstant.LOGIN_TESTDATA_FILE_PATH2,"password"));
			lp.loginButton.click();
			
			CommonUtils.waitForElement(driver, lp.loginButton);
			
			
			ContactsPage cp=new ContactsPage(driver);
			cp.contactTab.click();
			CommonUtils.waitForElement(driver, cp.contactTab);
			 cp.dropdown.click();
			 cp.selectdropdown();
			 
}
}

