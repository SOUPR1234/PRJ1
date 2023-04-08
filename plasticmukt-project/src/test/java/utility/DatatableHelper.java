package utility;

import java.util.ArrayList;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import testRunner.RunTest;

public class DatatableHelper extends RunTest {

	public String loginCredential(DataTable loginCredential) {
		
		String email = "";
		String password = "";
		for (Map<String, String> data : loginCredential.asMaps(String.class, String.class)) {

			email = data.get("User_Name");
			password = data.get("Password");
						
		}
		return email+"_"+password;
		
	}
	
	public ArrayList<String> shippingDetails(DataTable addressDetails) {
		
		ArrayList<String> getShippingAddress= new ArrayList<String>();
		for (Map<String, String> data : addressDetails.asMaps(String.class, String.class)) {

			getShippingAddress.add(data.get("First_Name"));
			getShippingAddress.add(data.get("Last_Name"));
			getShippingAddress.add(data.get("Address1"));
			getShippingAddress.add(data.get("Address2"));
			getShippingAddress.add(data.get("City"));
			getShippingAddress.add(data.get("State"));
			getShippingAddress.add(data.get("Postcode"));
						
		}
		return getShippingAddress;
		
	}
	
	public ArrayList<String> billingDetails(DataTable addressDetails) {
		
		ArrayList<String> getBillingAddress= new ArrayList<String>();
		for (Map<String, String> data : addressDetails.asMaps(String.class, String.class)) {

			getBillingAddress.add(data.get("First_Name"));
			getBillingAddress.add(data.get("Last_Name"));
			getBillingAddress.add(data.get("Address1"));
			getBillingAddress.add(data.get("Address2"));
			getBillingAddress.add(data.get("City"));
			getBillingAddress.add(data.get("State"));
			getBillingAddress.add(data.get("Postcode"));
			getBillingAddress.add(data.get("Phone"));
			getBillingAddress.add(data.get("Email"));
						
		}
		return getBillingAddress;
		
	}
	

}
