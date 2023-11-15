package pages;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.apache.poi.hpsf.Date;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.ReadFile;

public class OpportunitiesPage extends BasePage{
	public OpportunitiesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
      }

	@FindBy(xpath="//*[@id=\"Opportunity_Tab\"]")
	public WebElement opportunities;

	@FindBy(id="fcf")
	public WebElement dropdownelement;
	
	
	@FindBy(xpath="//input[@name='new']")
	public WebElement newbutton;
	
	@FindBy(id="opp3")
	public WebElement oppname;
	
	@FindBy(id="opp9")
	public WebElement closedate;
	
	@FindBy(name="save")
	public WebElement saveButton;
	
	@FindBy (linkText="Opportunity Pipeline")
	public WebElement opportunityPipeline;
	
	
	
	
	@FindBy (linkText="Stuck Opportunities")
	public WebElement stuckOpportunities;
	
	@FindBy(xpath="//select[@id='quarter_q']")
	public WebElement intervalDropdown;
	public void selectinervaldropdown() {
		if (intervalDropdown.isDisplayed()) {
			Select i = new Select (intervalDropdown);
			i.selectByVisibleText("Next FQ");
			
		}
	}
	
	@FindBy(xpath="//select[@id='open']")
	public WebElement includeDropdown;
	
	public void selectincludeDropdown() {
		if(includeDropdown.isDisplayed()) {
			Select in = new Select(includeDropdown);
			in.selectByVisibleText("Open Opportunities");
		}
	}
	
	@FindBy(xpath="//input[@title='Run Report']")
	public WebElement runReport;
	
	@FindBy(xpath="//select[@id='opp11']")
	public WebElement stage;
	public void stagedropdown() {
		if(stage.isDisplayed()) {
			
		Select s= new Select(stage);
		s.selectByVisibleText("Qualification");
		}
	}
	
	@FindBy(xpath="//select[@id='opp6']")
	public WebElement leadsource;
	public void selectlesdsource() {
		if (leadsource.isDisplayed()){
			Select l = new Select(leadsource);
			l.selectByValue("Web");
		}
	}
	
	
	@FindBy(xpath="//img[@title='Account Name Lookup (New Window)']")
	public WebElement LookupWindow;
	
	public void selectdropdown() {
	Select dropdown = new Select(dropdownelement);
	
    java.util.List<WebElement> options = dropdown.getOptions();
	}
    
    public String datetime() {
    	LocalDate currentDate = LocalDate.now();
    	DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy"); // You can change the date format as needed
    	String formattedDate = currentDate.format(dateFormatter);
    	return formattedDate;
}
    

//	public void printoptions() {
	//	for (WebElement option : options) {
		//	System.out.println(option.getText());



}
	/*
	public boolean verifyUserMenuItems() throws IOException {
		logger.info("UserMenuPage : verifyUserMenuItems : started");
		boolean isOptionsVerified = true;
		String[] expectedUserMenuItems = ReadFile.readUserMenuTestData("usermenu.items").split(",");
		for (int i = 0; i < expectedUserMenuItems.length; i++) {
			String actualOption = userMenuOptions.get(i).getText();
			if (expectedUserMenuItems[i].equals(actualOption)) {
				System.out.println("Expected Option " + expectedUserMenuItems[i] + " Actual Option" + actualOption);
			} else {
				logger.warn("UserMenuPage : verifyUserMenuItems : Failed to match the order of usermenu");
				System.out.println("Expected Option " + expectedUserMenuItems[i] + "failed to match with Actual Option"
						+ actualOption);
				isOptionsVerified = false;
			}
		}
		return isOptionsVerified;
	}

	/*
	public boolean opportunityItems() throws IOException {
		logger.info("opportunity : verifyopportunityMenuItems : started");
		boolean isOptionsVerified = true;
		String[] expectedopportunityMenuItems = ReadFile.opportunityUserMenuTestData("opportunity.items").split(",");
		for (int i = 0; i < expectedopportunityMenuItems.length; i++) {
			String actualOption = opportunities.get(i).getText();
			if (expectedopportunityMenuItems[i].equals(actualOption)) {
				System.out.println("Expected Option " + expectedopportunityMenuItems[i] + " Actual Option" + actualOption);
			} else {
				logger.warn("OpportunityPage : verifyOpportunityMenuItems : Failed to match the order of usermenu");
				System.out.println("Expected Option " + expectedopportunityMenuItems[i] + "failed to match with Actual Option"
						+ actualOption);
				isOptionsVerified = false;
			}
		}
		return isOptionsVerified;
	}
*/
