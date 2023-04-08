package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testRunner.RunTest;
import utility.DatatableHelper;

public class PageObjectBilling extends RunTest {
	
	DatatableHelper data = new DatatableHelper();
	
	public PageObjectBilling() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h3[contains(text(),'Billing address')]//following-sibling::a[contains(text(),'Edit')]")
	public
	WebElement editBillingAddress;
	
	@FindBy(id = "billing_first_name")
	public
	WebElement billingFirstName;
	
	@FindBy(id = "billing_last_name")
	public
	WebElement billingLastName;
	
	@FindBy(id = "billing_address_1")
	public
	WebElement billingAddress1;
	
	@FindBy(id = "billing_address_2")
	public
	WebElement billingAddress2;
	
	@FindBy(id = "select2-billing_state-container")
	public
	WebElement billingStateContainer;
	
	@FindBy(id = "billing_city")
	public
	WebElement billingCity;
	
	@FindBy(id = "billing_state")
	public
	WebElement billingState;
	
	@FindBy(id = "billing_postcode")
	public
	WebElement billingPostcode;
	
	@FindBy(id = "billing_phone")
	public
	WebElement billingPhone;
	
	@FindBy(id = "billing_email")
	public
	WebElement billingEmail;
	
	@FindBy(name = "save_address")
	public
	WebElement saveBillingAddress;
	
	@FindBy(xpath = "//ul[@role='alert']//li")
	public
	WebElement billingIncorrectDataAlert;
	
	

}
