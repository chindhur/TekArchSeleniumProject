package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import constants.FileConstant;
import pages.LoginPage;
import utils.ReadFile;

public class ForgotPassword extends BaseTest {
	
	@Test
	public void rememberPassword() throws IOException {
	
	WebDriver driver = BaseTest.getDriver();
	BaseTest.test.info("Driver configured");

	LoginPage lp = new LoginPage(driver);
	
	driver.get("https://login.salesforce.com");
	
	lp.forgotPassword.click();
	lp.forgotUsername.sendKeys(ReadFile.readPropertiesFile(FileConstant.LOGIN_TESTDATA_FILE_PATH2,"username"));
	
	lp.forgotContinueButton.click();
	
	
	
	}	

}
