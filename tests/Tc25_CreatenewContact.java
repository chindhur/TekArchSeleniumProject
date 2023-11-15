package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import constants.FileConstant;
import listeners.SFDCListeners;
import pages.ContactsPage;
import pages.LoginPage;
import utils.CommonUtils;
import utils.ReadFile;
@Listeners(SFDCListeners.class)

public class Tc25_CreatenewContact extends BaseTest{
		
		@BeforeClass
		public void navigateToHome() throws IOException {
			WebDriver driver = BaseTest.getDriver();
			LoginPage lp = new LoginPage(driver);
			lp.loginToApp(driver);
		}

	
	@Test
	public void createnewContact() throws IOException {
		System.out.println("Tc25_createnewContact");
		SoftAssert softAssert = new SoftAssert();
		WebDriver driver = BaseTest.getDriver();
		BaseTest.test.info("Driver configured");
		
		ContactsPage cp=new ContactsPage(driver);
		cp.contactTab.click();
		cp.newButton.click();
		CommonUtils.waitForElement(driver, cp.newButton);
		cp.lastname.sendKeys("TeddyBear");
	//	cp.accountName.sendKeys("TeddyBear");
		CommonUtils.waitForElement(driver, cp.accountName);
		cp.savecontactButton.click();
		CommonUtils.waitForElement(driver,cp.savecontactButton);
}
	

	@Test
	public void createnewview() throws IOException {
		System.out.println("Tc26_createnewView");

		SoftAssert softAssert = new SoftAssert();
		WebDriver driver = BaseTest.getDriver();
		BaseTest.test.info("Driver configured");
		
			ContactsPage cp=new ContactsPage(driver);
			cp.contactTab.click();
		
			cp.createnewview.click();
			cp.viewname.sendKeys("Rose");
			cp.viewUniquename.sendKeys("Roseflower");
			cp.savenewview.click();
			CommonUtils.waitForElement(driver, cp.savenewview);
			
	}
	
	@Test
	public void recentlycreated() throws IOException{
		System.out.println("Tc27_recentlycreated");

		SoftAssert softAssert = new SoftAssert();
		WebDriver driver = BaseTest.getDriver();
		BaseTest.test.info("Driver configured");
		
		ContactsPage cp=new ContactsPage(driver);
		cp.contactTab.click();
		CommonUtils.waitForElement(driver, cp.contactTab);
		 cp.dropdown.click();
		 cp.selectdropdown();

	}
	
	@Test
	public void mycontactsview() throws IOException{
		System.out.println("Tc28_createnewContact");

		SoftAssert softAssert = new SoftAssert();
		WebDriver driver = BaseTest.getDriver();
		BaseTest.test.info("Driver configured");
		
		ContactsPage cp=new ContactsPage(driver);
		cp.contactTab.click();
		CommonUtils.waitForElement(driver, cp.contactTab);
		cp.viewdropdown.click();
		cp.selectviewdropdown();
		
	}

	@Test
	public void createviewerrormessage() throws IOException{
		System.out.println("Tc29_createnewContact");

		SoftAssert softAssert = new SoftAssert();
		WebDriver driver = BaseTest.getDriver();
		BaseTest.test.info("Driver configured");
		
		ContactsPage cp=new ContactsPage(driver);
		cp.contactTab.click();
		cp.createnewview.click();
		CommonUtils.waitForElement(driver, cp.createnewview);
		cp.viewUniquename.sendKeys("EFGH");
		cp.savenewview.click();
		CommonUtils.waitForElement(driver, cp.savenewview);
		
	}
	
	@Test
	public void checkCancelButton() throws IOException{
		System.out.println("Tc30_createnewContact");

		SoftAssert softAssert = new SoftAssert();
		WebDriver driver = BaseTest.getDriver();
		BaseTest.test.info("Driver configured");
		
		ContactsPage cp=new ContactsPage(driver);
		cp.contactTab.click();
		cp.createnewview.click();
		CommonUtils.waitForElement(driver, cp.createnewview);
		cp.viewUniquename.sendKeys("EFGH");
		cp.cancelViewButton.click();
		Assert.assertTrue(true);
		
	}
}
