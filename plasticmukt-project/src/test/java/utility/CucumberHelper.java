package utility;

import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import pageFactory.PageObjectBilling;
import pageFactory.PageObjectLogin;
import pageFactory.PageObjectShipping;
import testRunner.RunTest;

public class CucumberHelper extends RunTest {
	
	PageObjectLogin pageObjectLogin = new PageObjectLogin();
	PageObjectShipping pageObjectShipping = new PageObjectShipping();
	PageObjectBilling pageObjectBilling = new PageObjectBilling();
	
	public void proceedToAddress() throws Exception {
		Thread.sleep(4000);
		Actions action = new Actions(driver);
		action.moveToElement(pageObjectLogin.myAccountMenu).perform();
		Thread.sleep(1000);
		pageObjectLogin.addresses.click();
	}

	public void performLogin(String email_password) throws Exception {
		Thread.sleep(5000);
		String email = email_password.split("_")[0];
		String password = email_password.split("_")[1];
		
		pageObjectLogin.userName.click();
		pageObjectLogin.userName.sendKeys(email);
		
		pageObjectLogin.password.click();
		pageObjectLogin.password.sendKeys(password);
		
		pageObjectLogin.login.click();
	}

	public void assertLoginError(String loginErrorText) throws Exception {
		Thread.sleep(5000);
		String actualErrorText = pageObjectLogin.loginErrorText.getText();
		Assert.assertEquals(loginErrorText, actualErrorText);
		System.out.println("Login error text verified");
	}

	public void editShippingAddress() throws Exception {
		Thread.sleep(5000);
		pageObjectShipping.editShippingAddress.click();
	}

	public void enterShippingAddress(ArrayList<String> getShippingAddress) throws Exception {
		
		String First_Name = getShippingAddress.get(0);
		String Last_Name = getShippingAddress.get(1);
		String Address1 = getShippingAddress.get(2);
		String Address2 = getShippingAddress.get(3);
		String City = getShippingAddress.get(4);
		String State = getShippingAddress.get(5);
		String Postcode = getShippingAddress.get(6);
		
		pageObjectShipping.shippingFirstName.click();
		pageObjectShipping.shippingFirstName.clear();
		pageObjectShipping.shippingFirstName.sendKeys(First_Name);
		
		pageObjectShipping.shippingLastName.click();
		pageObjectShipping.shippingLastName.clear();
		pageObjectShipping.shippingLastName.sendKeys(Last_Name);
		
		pageObjectShipping.shippingAddress1.click();
		pageObjectShipping.shippingAddress1.clear();
		pageObjectShipping.shippingAddress1.sendKeys(Address1);
		
		pageObjectShipping.shippingAddress2.click();
		pageObjectShipping.shippingAddress2.clear();
		pageObjectShipping.shippingAddress2.sendKeys(Address2);
		
		pageObjectShipping.shippingCity.click();
		pageObjectShipping.shippingCity.clear();
		pageObjectShipping.shippingCity.sendKeys(City);
		
		pageObjectShipping.shippingStateContainer.click();
		Select stateDropdown = new Select(pageObjectShipping.shippingState);
		stateDropdown.selectByVisibleText(State);
		
		pageObjectShipping.shippingPostcode.click();
		pageObjectShipping.shippingPostcode.clear();
		pageObjectShipping.shippingPostcode.sendKeys(Postcode);
		
		Thread.sleep(2000);
		
	}

	public void saveAddress() throws Exception {
		pageObjectShipping.saveShippingAddress.click();
		Thread.sleep(5000);
	}

	public void assertAlertText(String alertText) {
		String saveShippingAddress = pageObjectLogin.saveAddressAlert.getText();
		Assert.assertEquals(alertText, saveShippingAddress);
	}
	
	public void editBillingAddress() throws Exception {
		Thread.sleep(5000);
		pageObjectBilling.editBillingAddress.click();
	}

	public void modifyBillingFirstName() throws Exception {
		Thread.sleep(2000);
		pageObjectBilling.billingFirstName.click();
		pageObjectBilling.billingFirstName.clear();
	}

	public void assertBillingErrorText(String expectedErrorText) throws Exception {
		Thread.sleep(4000);
		String actualErrorText = pageObjectBilling.billingIncorrectDataAlert.getText();
		Assert.assertEquals(expectedErrorText, actualErrorText);
	}
	
	public void modifyBillingEmail(String Email) throws Exception {
		Thread.sleep(2000);
		pageObjectBilling.billingEmail.click();
		pageObjectBilling.billingEmail.clear();
		pageObjectBilling.billingEmail.sendKeys(Email);
	}

	public void modifyBillingPhone(String phone) throws Exception {
		Thread.sleep(2000);
		pageObjectBilling.billingPhone.click();
		pageObjectBilling.billingPhone.clear();
		pageObjectBilling.billingPhone.sendKeys(phone);
	}

	public void enterBillingAddress(ArrayList<String> getBillingAddress) throws Exception {
		
		String First_Name = getBillingAddress.get(0);
		String Last_Name = getBillingAddress.get(1);
		String Address1 = getBillingAddress.get(2);
		String Address2 = getBillingAddress.get(3);
		String City = getBillingAddress.get(4);
		String State = getBillingAddress.get(5);
		String Postcode = getBillingAddress.get(6);
		String Phone = getBillingAddress.get(7);
		String Email = getBillingAddress.get(8);
		
		pageObjectBilling.billingFirstName.click();
		pageObjectBilling.billingFirstName.clear();
		pageObjectBilling.billingFirstName.sendKeys(First_Name);
		
		pageObjectBilling.billingLastName.click();
		pageObjectBilling.billingLastName.clear();
		pageObjectBilling.billingLastName.sendKeys(Last_Name);
		
		pageObjectBilling.billingAddress1.click();
		pageObjectBilling.billingAddress1.clear();
		pageObjectBilling.billingAddress1.sendKeys(Address1);
		
		pageObjectBilling.billingAddress2.click();
		pageObjectBilling.billingAddress2.clear();
		pageObjectBilling.billingAddress2.sendKeys(Address2);
		
		pageObjectBilling.billingCity.click();
		pageObjectBilling.billingCity.clear();
		pageObjectBilling.billingCity.sendKeys(City);
		
		pageObjectBilling.billingStateContainer.click();
		Select stateDropdown = new Select(pageObjectBilling.billingState);
		stateDropdown.selectByVisibleText(State);
		
		pageObjectBilling.billingPostcode.click();
		pageObjectBilling.billingPostcode.clear();
		pageObjectBilling.billingPostcode.sendKeys(Postcode);
		
		pageObjectBilling.billingPhone.click();
		pageObjectBilling.billingPhone.clear();
		pageObjectBilling.billingPhone.sendKeys(Phone);
		
		pageObjectBilling.billingEmail.click();
		pageObjectBilling.billingEmail.clear();
		pageObjectBilling.billingEmail.sendKeys(Email);
		
		Thread.sleep(2000);
		
	}
		

}
