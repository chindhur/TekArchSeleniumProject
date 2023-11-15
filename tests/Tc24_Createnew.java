package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import constants.FileConstant;
import pages.LeadsPage;
import pages.LoginPage;
import utils.CommonUtils;
import utils.ReadFile;

public class Tc24_Createnew extends BaseTest{
@Test
public void createnewlead() throws IOException {
	WebDriver driver =BaseTest.getDriver();
	LoginPage lp=new LoginPage(driver);
	driver.get("https://login.salesforce.com");
	
	lp.username.sendKeys(ReadFile.readPropertiesFile(FileConstant.LOGIN_TESTDATA_FILE_PATH2,"username"));
	lp.password.sendKeys(ReadFile.readPropertiesFile(FileConstant.LOGIN_TESTDATA_FILE_PATH2,"password"));
	lp.loginButton.click();
	
	CommonUtils.waitForElement(driver, lp.loginButton);
	LeadsPage l=new LeadsPage(driver);
	 l.leadsTab.click();
	CommonUtils.waitForElement(driver,l.leadsTab);
	l.newLeadsButton.click();
	CommonUtils.waitForElement(driver, l.newLeadsButton);
	l.lastname.sendKeys("ABCD");
	l.companyname.sendKeys("ABCD");
	l.saveButton.click();
	CommonUtils.waitForElement(driver, l.saveButton);
}

}
