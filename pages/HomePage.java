package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tests.BaseTest;

public class HomePage extends BaseTest{
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

}
	
@FindBy(xpath="//li[id='home_Tab']")	
public WebElement homeTab;

public WebElement namelinkclick() {
	if(namelink.isDisplayed()) {
		namelink.click();
		return namelink;
	}
	return homeTab;
}

@FindBy(linkText="Chindhu kamalesh")
public WebElement namelink;


	


}
