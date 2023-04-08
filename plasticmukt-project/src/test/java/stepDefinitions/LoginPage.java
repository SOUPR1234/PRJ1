package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testRunner.RunTest;
import utility.CucumberHelper;
import utility.DatatableHelper;

public class LoginPage extends RunTest {
	
	DatatableHelper dataHelper = new DatatableHelper();
	CucumberHelper helper = new CucumberHelper();
		
	@Given("Have the Credentials for {string} website")
	public void have_the_credentials_for_website(String webUrl) {
		driver.get(webUrl);
		System.out.println("Website opened");
	}
	
	@Then("Go to Addresses in My account section")
	public void go_to_addresses_in_my_account_section() throws Exception {
	    helper.proceedToAddress();
	    System.out.println("Proceeded to Address section");
	}
	
	@When("Input incorrect email address and password and try to login")
	public void input_incorrect_email_address_and_password_and_try_to_login(DataTable incorrectCredentials) throws Exception {
	    String email_password = dataHelper.loginCredential(incorrectCredentials);
	    helper.performLogin(email_password);
	    System.out.println("Performed Login");
	}
	
	@Then("Assert an error text {string} appears")
	public void assert_an_error_text_appears(String loginErrorText) throws Exception {
	    helper.assertLoginError(loginErrorText);
	    System.out.println("Asserted Login error text!");
	}
	
	@Then("Input correct credentials and login")
	public void input_correct_credentials_and_login(DataTable loginCredentials) throws Exception {
		String email_password = dataHelper.loginCredential(loginCredentials);
	    helper.performLogin(email_password);
	    System.out.println("Logged in!");
	}
	
	@Then("Assert alert text {string} appears")
	public void assert_alert_text_appears(String alertText) {
		helper.assertAlertText(alertText);
		System.out.println("Asserted alert text for address save!");
	}

}
