package testRunner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "@LoginTest or @ShippingAddressTest or @BillingAddressTest",
		features = "src/test/resources/features", 
		glue = {"stepDefinitions", "testRunner", "utility", "hooks"},
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
	)

public class RunTest {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	
}
