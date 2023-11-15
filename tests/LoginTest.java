package tests;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import constants.FileConstant;
import pages.LoginPage;
import utils.ExcelUtils;
import utils.ReadFile;

public class LoginTest extends BaseTest {
			
		
		@Test
		public void loginTest1() throws InvalidFormatException, IOException {
			WebDriver driver =BaseTest.getDriver();
			LoginPage lp=new LoginPage(driver);

			driver.get("https://login.salesforce.com");
			//String[] creds = ExcelUtils.readLoginTestData(1);
			
			lp.username.sendKeys(ReadFile.readPropertiesFile(FileConstant.LOGIN_TESTDATA_FILE_PATH2,"username"));
			lp.password.sendKeys(ReadFile.readPropertiesFile(FileConstant.LOGIN_TESTDATA_FILE_PATH2,"password"));
			lp.loginButton.click();
		}
		@Test
		public void loginTest2() {
			WebDriver driver =BaseTest.getDriver();
			LoginPage lp=new LoginPage(driver);

			driver.get("https://login.salesforce.com");
			lp.username.sendKeys("chin@abc.com");
			lp.password.clear();
			lp.loginButton.click();
	}
		

}
