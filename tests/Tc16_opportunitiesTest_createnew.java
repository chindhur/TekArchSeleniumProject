package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import constants.FileConstant;
import pages.LoginPage;
import pages.OpportunitiesPage;
import utils.CommonUtils;
import utils.ReadFile;

public class Tc16_opportunitiesTest_createnew extends BaseTest{
	@Test
	public void createnewopportunity() throws IOException{
	WebDriver driver =BaseTest.getDriver();
	LoginPage lp=new LoginPage(driver);
	driver.get("https://login.salesforce.com");
	
	lp.username.sendKeys(ReadFile.readPropertiesFile(FileConstant.LOGIN_TESTDATA_FILE_PATH2,"username"));
	lp.password.sendKeys(ReadFile.readPropertiesFile(FileConstant.LOGIN_TESTDATA_FILE_PATH2,"password"));
	CommonUtils.waitForElement(driver, lp.loginButton);
	lp.loginButton.click();

	OpportunitiesPage op = new OpportunitiesPage(driver);
	CommonUtils.waitForElement(driver, op.opportunities);
	op.opportunities.click();
	CommonUtils.waitForElement(driver, op.newbutton);
	op.newbutton.click();
	
	op.oppname.sendKeys("kitty");
	op.closedate.sendKeys(op.datetime());
	CommonUtils.waitForElement(driver, op.stage);

	op.stagedropdown();
	//CommonUtils.waitForElement(driver,op.leadsource);
	//op.leadsource.click();
	
	op.selectlesdsource();
	CommonUtils.waitForElement(driver, op.saveButton);
	op.saveButton.click();
	
	}

}
