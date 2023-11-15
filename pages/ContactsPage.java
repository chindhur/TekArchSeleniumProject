package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import tests.BaseTest;

public class ContactsPage extends BaseTest{
	public ContactsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

}
@FindBy(xpath="//li[@id='Contact_Tab']")
public WebElement contactTab;

@FindBy(name="new")
public WebElement newButton;

@FindBy(id="name_lastcon2")
public WebElement lastname;

@FindBy(id="con4")
public WebElement accountName;

@FindBy(name="save")
public WebElement savecontactButton;

@FindBy(id="fname")
public WebElement viewname;

@FindBy(id="devname")
public WebElement viewUniquename;


@FindBy(name="save")
public WebElement savenewview;


@FindBy(linkText="Create New View")
public WebElement createnewview;

@FindBy(name="cancel")
public WebElement cancelViewButton;

@FindBy(xpath="//select[@id='hotlist_mode']")
public WebElement dropdown;

public void selectdropdown() {
	Select s=new Select(dropdown);
	s.selectByVisibleText("Recently Created");
}

@FindBy(linkText="//select[@name='fcf']")
public WebElement viewdropdown;
public void selectviewdropdown() {
	Select v=new Select(viewdropdown);
			v.selectByVisibleText("My Contacts");
	
}
	
}	

