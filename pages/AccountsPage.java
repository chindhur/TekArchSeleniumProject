package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountsPage extends BasePage {
	public AccountsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(css= "#Account_Tab")
	public WebElement accountsTab;

	@FindBy(xpath="//input[@title='Go!']")
	public WebElement goButton;

	@FindBy(xpath="//input[@title='New']")
	public WebElement newButton;
	
	@FindBy(id="acc2")
	public WebElement accountName;
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
	@FindBy(xpath="//input[@title='Save']")
	public WebElement saveButton;
	
	@FindBy(linkText="Create New View")
	public WebElement createNewView;
	
	@FindBy(id="fname")
	public WebElement viewName;
	
	@FindBy (id="devname")
	public WebElement viewUniqueName;
	
	@FindBy(xpath="//input[@title='Save']")
	public WebElement saveNewViewButton;	
	
	@FindBy(xpath="//input[@title='Save']")
	public WebElement saveEditViewButton;
	
	
	@FindBy(id="srch")
	public WebElement findaccountsearchbox;
	
	
	@FindBy(xpath="//input[@name='srchbutton']")
	public WebElement findaccountbutton;
	
	@FindBy(partialLinkText="Merge")
	public WebElement mergeaccount;

	
	@FindBy(xpath="//input[@id='cid0']")
	public WebElement selectbox1;
	
	@FindBy(xpath="//input[@id='cid1']")
	public WebElement selectbox2;
	
	@FindBy(xpath="//input[@id='p2001Hu00002xcblT']")
	public WebElement masterrecord;
	
	
	public void selectmasterrecord() {
		if(!masterrecord.isSelected()) {
			masterrecord.click();
		}
	}
	
	@FindBy(xpath="//input[@name='save']")
	public WebElement mergeButton;
	
	public void selectcheckbox() {
	 if(!selectbox1.isSelected()) {
         selectbox1.click();
     }

     if (!selectbox2.isSelected()) {
         selectbox2.click();
     }
	}
	@FindBy(xpath="//input[@name='goNext']")
	public WebElement nextButton;
	
	@FindBy(xpath="//select[@id='fcf']")
	public WebElement viewDropdown;
	
	public void selectViewDropdown(String sType) {
		if(viewDropdown.isDisplayed()) {
			Select v=new Select(viewDropdown);
			v.selectByVisibleText("reddy");
		}
	}
	
	@FindBy(linkText="Edit")
	public WebElement editButton;
	
	
	@FindBy(id="acc6")
	public WebElement type;
	
	public void selectType(String sType) {
		if(type.isDisplayed()) {
			Select s = new Select(type);
			s.selectByValue(sType);
		}
		else {
			System.out.println("Type is not displayed");
		}
	}
	
	@FindBy(xpath="//select[@id='00NHu00000PENBv']")
	public WebElement customerPriority;
	
	public void selectCustomerPriority(String sType) {
		if(customerPriority.isDisplayed()) {
			Select p=new Select(customerPriority);
			p.selectByValue(sType);
			}
		else {
			System.out.println("Customer priority is not displayed");
		}
	}
	
	
	@FindBy(xpath="//select[@id='fcol1']")
	public WebElement FieldDropdown;
	public void fielddropdown() {
	if(FieldDropdown.isDisplayed()) {
		Select f=new Select(FieldDropdown);
		f.selectByVisibleText("Account Name");
	}
	else {
		System.out.println("Field dropdown is not displayed");
	}
	}

	@FindBy(xpath="//select[@id='fop1']")
	public WebElement OperatorDropdown;
	public void operatordropdown() {
	if(OperatorDropdown.isDisplayed()) {
		Select o=new Select(OperatorDropdown);
		o.selectByVisibleText("contains");
	}
	else {
		System.out.println("operator dropdown is not displayed");
	}
			}
	
	@FindBy(id="fval1")
	public WebElement valuefield;
	
	
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
	}

	


