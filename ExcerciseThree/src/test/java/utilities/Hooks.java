package utilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	static WebDriver driver = null;
	DesiredCapabilities cap = new DesiredCapabilities();
	public static final String AUTOMATE_USERNAME = "jackzimmermann_WazBKX";
	public static final String AUTOMATE_ACCESS_KEY = "x8Tzbv52uEyxL2CuKU4b";
	public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	@Before
	public void initialize() throws MalformedURLException {
		System.out.println("Before Hook");
		cap.setCapability("os", "Windows");
		cap.setCapability("os_version", "11");
		cap.setCapability("browser", "Firefox");
		cap.setCapability("browser_version", "latest-beta");
		cap.setCapability("project", "ExerciseFive");
		cap.setCapability("build", "Build 1.0");
		cap.setCapability("name", "Login Test");
		cap.setCapability("browserstack.local", "false");
		cap.setCapability("browserstack.selenium_version", "3.5.2"); 
		String projectPath = System.getProperty("user.dir");
	    System.setProperty("webdriver.chrome.driver",  projectPath+"/src/test/resources/drivers/chromedriver.exe");
	    driver = new RemoteWebDriver(new URL(URL), cap);
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() {
		System.out.println("After Hook");
		driver.quit();
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
}
