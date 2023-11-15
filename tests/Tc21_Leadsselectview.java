package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import constants.FileConstant;
import pages.LeadsPage;
import pages.LoginPage;
import utils.CommonUtils;
import utils.ReadFile;

public class Tc21_Leadsselectview {
@Test
	public void leadselectview() throws IOException {
	WebDriver driver =BaseTest.getDriver();
	LoginPage lp=new LoginPage(driver);
	driver.get("https://login.salesforce.com");
	
	lp.username.sendKeys(ReadFile.readPropertiesFile(FileConstant.LOGIN_TESTDATA_FILE_PATH2,"username"));
	lp.password.sendKeys(ReadFile.readPropertiesFile(FileConstant.LOGIN_TESTDATA_FILE_PATH2,"password"));
	lp.loginButton.click();
	
	CommonUtils.waitForElement(driver, lp.loginButton);
	LeadsPage l=new LeadsPage(driver);
	 l.leadsTab.click();
	 CommonUtils.moveToElement(driver, l.leadsTab);
	 
	 l.leadsDropdown.click();
	 CommonUtils.moveToElement(driver, l.leadsDropdown);
	 
	
	
		
	}

}
