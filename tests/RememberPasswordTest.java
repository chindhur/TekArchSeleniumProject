package tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

import constants.FileConstant;
import constants.WaitConstants;
import pages.LoginPage;
import pages.UserMenuPage;
import utils.CommonUtils;
import utils.ExcelUtils;
import utils.ReadFile;

public class RememberPasswordTest extends BaseTest {
	
	@Test
	public void rememberPasswordtest() throws InvalidFormatException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, InterruptedException {
		WebDriver driver = BaseTest.getDriver();
		BaseTest.test.info("Driver configured");

		LoginPage lp = new LoginPage(driver);
		
		driver.get("https://login.salesforce.com");

		//String[] creds = ExcelUtils.readLoginTestData(1);
		
		lp.username.sendKeys(ReadFile.readPropertiesFile(FileConstant.LOGIN_TESTDATA_FILE_PATH2,"username"));
		lp.password.sendKeys(ReadFile.readPropertiesFile(FileConstant.LOGIN_TESTDATA_FILE_PATH2,"password"));
		lp.rememberMe.click();	
		lp.loginButton.click();
		
		UserMenuPage ump=new UserMenuPage(driver);
		
		
		ump.userMenu.click();
		BaseTest.test.info("Username element is visible");
		CommonUtils.waitForElement(driver, ump.userMenu);
		//WebElement logoutbutton=driver.findElement(By.xpath("//a[@title='Logout']"));
		//logoutbutton.click();
		//Thread.sleep(2000);
		
		ump.Logout.click();
		CommonUtils.waitForElement(driver,ump.Logout);
		Assert.assertEquals(lp.savedUsername,"chin@abc.com");
		BaseTest.test.info("saved Username is displayed after logout");
		Assert.assertTrue(lp.rememberMe.isSelected(), "");
		BaseTest.test.info("Rememberme is selected after logout");
		
	}

}
