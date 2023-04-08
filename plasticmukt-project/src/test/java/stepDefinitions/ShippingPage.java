package stepDefinitions;

import java.util.ArrayList;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import testRunner.RunTest;
import utility.CucumberHelper;
import utility.DatatableHelper;

public class ShippingPage extends RunTest {
	
	DatatableHelper dataHelper = new DatatableHelper();
	CucumberHelper helper = new CucumberHelper();
	
	@Then("Go to Edit Shipping address to modify existing Address")
	public void go_to_edit_shipping_address_to_modify_existing_address() throws Exception {
	    helper.editShippingAddress();
	    System.out.println("Clicked on Edit to modify shipping address");
	}
	
	@Then("Enter shipping address details")
	public void enter_shipping_address_details(DataTable shippingDetails) throws Exception {
		ArrayList<String> getShippingAddress = new ArrayList<String>();
		getShippingAddress = dataHelper.shippingDetails(shippingDetails);
		helper.enterShippingAddress(getShippingAddress);
		System.out.println("Shipping Address modified!");
	}
	
	@Then("Save the address")
	public void save_the_address() throws Exception {
	    helper.saveAddress();
	    System.out.println("Modified address saved!");
	}
	
}
