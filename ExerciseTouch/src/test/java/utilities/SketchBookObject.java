package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class SketchBookObject {
	private AndroidDriver driver;
	
	private WebElement sketch;
	
	@FindBy(id = "com.adsk.sketchbook:id/top_bar_brush")
	private WebElement brushMenu;
	
	@FindBy(id = "com.adsk.sketchbook:id/top_bar_color")
	private WebElement colorMenu;
	
	
	
public SketchBookObject(AndroidDriver passeddriver) {
		
		driver = passeddriver;
		PageFactory.initElements(driver, this);
		sketch = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout");
		
	}

	

	public BrushSelectorObject openBrushMenu() {
		
		BrushSelectorObject newBrushMenu;
		
		brushMenu.click();
		
		try{
		
		Thread.sleep(1000);		
		}
		catch(Exception e) {
			
		}
		
		newBrushMenu = new BrushSelectorObject(driver);
		return newBrushMenu;
	}
	
	public ColorPickerObject openColorSelect() {
		colorMenu.click();
		ColorPickerObject newColorPicker = new ColorPickerObject(driver);
		return newColorPicker;
	}
	
	public boolean isSketchVisible() {
		try {
			return sketch.isDisplayed();
		}
		catch(Exception e) {
			System.out.println("The sketch page is not displayed");
			return false;
		}
	}
	
	public WebElement getPage() {
		return sketch;
	}
	
	public void drawLine(int x1, int y1, int x2, int y2) {
		System.out.println("Drawing line from "+x1+" "+y1+" "+x2+" "+y2);
		TouchAction actionOne = new TouchAction(driver);
		PointOption start = PointOption.point(x1,y1);
		PointOption end = PointOption.point(x2,y2);
		actionOne.press(start);
		actionOne.moveTo(end);
		actionOne.release();
		actionOne.perform();
	
	}
	
}
