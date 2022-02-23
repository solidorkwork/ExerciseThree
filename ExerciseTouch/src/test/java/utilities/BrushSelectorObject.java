package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class BrushSelectorObject {
	private AndroidDriver driver;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.GridLayout/android.widget.ImageView[4]")
	private WebElement technicalPen;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ImageView")
	private WebElement goBack;
	
public BrushSelectorObject(AndroidDriver passeddriver) {
		
		driver = passeddriver;
		PageFactory.initElements(driver, this);
		
	}

public void clickTechPen() {
	technicalPen.click();
}

public void clickBack() {
	goBack.click();
}

}
