package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import constants.FileConstant;
import pages.LoginPage;
import pages.OpportunitiesPage;
import utils.CommonUtils;
import utils.ReadFile;

public class Tc17_Opportunities_testopportunity {
	@Test
	public void createnewopportunity() throws IOException{
	WebDriver driver =BaseTest.getDriver();
	LoginPage lp=new LoginPage(driver);
	driver.get("https://login.salesforce.com");
	
	lp.username.sendKeys(ReadFile.readPropertiesFile(FileConstant.LOGIN_TESTDATA_FILE_PATH2,"username"));
	lp.password.sendKeys(ReadFile.readPropertiesFile(FileConstant.LOGIN_TESTDATA_FILE_PATH2,"password"));
	lp.loginButton.click();
	CommonUtils.waitForElement(driver, lp.loginButton);

	OpportunitiesPage op = new OpportunitiesPage(driver);
	op.opportunities.click();
	
	CommonUtils.waitForElement(driver,op.opportunities);
	op.opportunityPipeline.click();
	CommonUtils.waitForElement(driver,op.opportunityPipeline);
	

	
		
}
}