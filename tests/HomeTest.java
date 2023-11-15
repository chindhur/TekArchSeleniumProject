package tests;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import listeners.SFDCListeners;
import pages.HomePage;
import pages.LoginPage;

@Listeners(SFDCListeners.class)

public class HomeTest extends BaseTest{
		
		@BeforeClass
		public void navigateToHome() throws IOException {
			WebDriver driver = BaseTest.getDriver();
			LoginPage lp = new LoginPage(driver);
			lp.loginToApp(driver);
		}
 
@Test
public void hometab() throws IOException {
	System.out.println("Tc33_HomeTab");
	SoftAssert softAssert = new SoftAssert();
	WebDriver driver = BaseTest.getDriver();
	BaseTest.test.info("Driver configured");
	
	HomePage hp=new HomePage(driver);
	hp.homeTab.click();
	hp.namelink.click();
	//Assert.assertTrue("namelink is clicked",hp.namelinkclick());
	
		
}

}
