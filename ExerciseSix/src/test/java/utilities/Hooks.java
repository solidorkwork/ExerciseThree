package utilities;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.Before;

public class Hooks {

	static AndroidDriver<WebElement> driver;
	static CalculatorElements elements;
	
	
	@Before
	public void initialize() throws MalformedURLException{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		//caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\sageo\\Downloads\\Calculator_v8.1 (403424005)_apkpure.com");
		caps.setCapability("appPackage", "com.android.calculator2");
		caps.setCapability("appActivity", "com.android.calculator2.Calculator");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<WebElement>(url, caps);
		elements = new CalculatorElements(driver);
		System.out.println("ASDF");
	}


	public static AndroidDriver getDriver() {
		return driver;
	}
	
	public static CalculatorElements getElements() {
		return elements;
	}

}
