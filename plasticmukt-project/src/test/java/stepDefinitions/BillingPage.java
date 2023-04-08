package stepDefinitions;

import java.util.ArrayList;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testRunner.RunTest;
import utility.CucumberHelper;
import utility.DatatableHelper;

public class BillingPage extends RunTest {
	
	DatatableHelper dataHelper = new DatatableHelper();
	CucumberHelper helper = new CucumberHelper();
	
	@Then("Go to Edit Billing address to modify existing Address")
	public void go_to_edit_billing_address_to_modify_existing_address() throws Exception {
	    helper.editBillingAddress();
	    System.out.println("Clicked on Edit to modify billing address");
	}
	
	@When("Clear First Name")
	public void clear_first_name() throws Exception {
		helper.modifyBillingFirstName();
		System.out.println("First Name for billing address is cleared");
	}
	
	@Then("Assert error text {string} appears")
	public void assert_error_text_appears(String errorText) throws Exception {
		helper.assertBillingErrorText(errorText);
		System.out.println("Asserted blank First Name in Billing Address error text");
	}
	
	@When("Clear Email and input incorrect Email {string}")
	public void clear_email_and_input_incorrect_email(String email) throws Exception {
	    helper.modifyBillingEmail(email);
	    System.out.println("Asserted incorrect email in Billing Address error text");
	}
	
	@When("Clear Email and input incorrect Phone {string}")
	public void clear_email_and_input_incorrect_phone(String phone) throws Exception {
		helper.modifyBillingPhone(phone);
		System.out.println("Asserted incorrect phone in Billing Address error text");
	}
	
	@Then("Enter billing address details")
	public void enter_billing_address_details(DataTable billingDetails) throws Exception {
		ArrayList<String> getBillingAddress = new ArrayList<String>();
		getBillingAddress = dataHelper.billingDetails(billingDetails);
		helper.enterBillingAddress(getBillingAddress);
		System.out.println("Billing Address modified!");
	}
	
}
