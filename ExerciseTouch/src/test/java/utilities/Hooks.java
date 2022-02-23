package utilities;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	static AndroidDriver<WebElement> driver;
	static SketchBookObject page;
	
	
	@Before
	public void initialize() throws MalformedURLException{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		//caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\sageo\\Downloads\\Calculator_v8.1 (403424005)_apkpure.com");
		caps.setCapability("appPackage", "com.adsk.sketchbook");
		caps.setCapability("appActivity", "com.adsk.sketchbook.SketchBook");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<WebElement>(url, caps);
		try {
			Thread.sleep(2500);
			
			WebElement softwareNotif = driver.findElementById("android:id/button1");
			softwareNotif.click();
			
			Thread.sleep(2500);
			
			WebElement brushNotif = driver.findElementById("android:id/button1");
			brushNotif.click();
			
			Thread.sleep(2500);
			
			WebElement permissionNotif = driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
			permissionNotif.click();
			
			Thread.sleep(5000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Notifications not displayed");
			e.printStackTrace();
		}
		

		
		page = new SketchBookObject(driver);
	}

	@After
	public void tearDown() {
		driver.closeApp();
		driver.quit();
	}

	public static AndroidDriver getDriver() {
		return driver;
	}
	
	public static SketchBookObject getPage() {
		return page;
	}

}
