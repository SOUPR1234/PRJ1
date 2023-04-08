package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testRunner.RunTest;

public class PageObjectLogin extends RunTest {
	
	
	public PageObjectLogin() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'My account')]")
	public
	WebElement myAccountMenu;
	
	@FindBy(xpath = "//a[contains(text(),'Addresses')]")
	public
	WebElement addresses;
	
	@FindBy(id = "username")
	public
	WebElement userName;
	
	@FindBy(id = "password")
	public
	WebElement password;
	
	@FindBy(name = "login")
	public
	WebElement login;
	
	@FindBy(xpath = "//ul[@role='alert']//li")
	public
	WebElement loginErrorText;
	
	@FindBy(xpath = "//div[@role='alert']")
	public
	WebElement saveAddressAlert;
	
}
