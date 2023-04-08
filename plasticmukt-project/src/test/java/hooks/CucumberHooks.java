package hooks;

import java.io.File;

import org.junit.AfterClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.vimalselvam.cucumber.listener.Reporter;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import testRunner.RunTest;

public class CucumberHooks extends RunTest {

	@Before
	public static void header() {
		System.out.println("Running Test Scenario...");
		System.setProperty("webdriver.chrome.driver", "C:/Users/soumitra/Downloads/chromedriver_win32 (3)/chromedriver.exe");
		driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@After
    public static void footer() {
		driver.quit();
//		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
		System.out.println("Testing ended...");
		
    }
	
	@AfterClass
	public static void report() {
			Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
	}
	
	
}
