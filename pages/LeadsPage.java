package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LeadsPage extends BasePage {
	public LeadsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
@FindBy(xpath="//li[@id='Lead_Tab']")
public WebElement leadsTab;

@FindBy(xpath="//select[@id='fcf']")
public WebElement leadsDropdown;

public void selectleadsdropdown() {
	Select l=new Select(leadsDropdown);
	l.selectByIndex(3);
	
	}


@FindBy(xpath="//div[@id='userNav']")
public WebElement userMenu;

@FindBy (xpath="//a[@title='Logout']")
public WebElement logoutButton;

@FindBy(name="new")
public WebElement newLeadsButton;

@FindBy (id="name_lastlea2")
public WebElement lastname;

@FindBy(id="lea3")
public WebElement companyname;


@FindBy(name="save")
public WebElement saveButton;







}
