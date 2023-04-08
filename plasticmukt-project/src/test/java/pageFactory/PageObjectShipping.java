package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testRunner.RunTest;
import utility.DatatableHelper;

public class PageObjectShipping extends RunTest {
	
	DatatableHelper data = new DatatableHelper();
	
	public PageObjectShipping() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h3[contains(text(),'Shipping address')]//following-sibling::a[contains(text(),'Edit')]")
	public
	WebElement editShippingAddress;
	
	@FindBy(id = "shipping_first_name")
	public
	WebElement shippingFirstName;
	
	@FindBy(id = "shipping_last_name")
	public
	WebElement shippingLastName;
	
	@FindBy(id = "shipping_address_1")
	public
	WebElement shippingAddress1;
	
	@FindBy(id = "shipping_address_2")
	public
	WebElement shippingAddress2;
	
	@FindBy(id = "shipping_city")
	public
	WebElement shippingCity;
	
	@FindBy(id = "select2-shipping_state-container")
	public
	WebElement shippingStateContainer;
	
	@FindBy(id = "shipping_state")
	public
	WebElement shippingState;
	
	@FindBy(id = "shipping_postcode")
	public
	WebElement shippingPostcode;
	
	@FindBy(id = "shipping_phone")
	public
	WebElement shippingPhone;
	
	@FindBy(name = "save_address")
	public
	WebElement saveShippingAddress;
	
}
