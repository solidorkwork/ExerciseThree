package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CalculatorObject {

	private AndroidDriver driver;
	
	
	@FindBy(id = "com.android.calculator2:id/digit_1")
	private WebElement one;
	
	@FindBy(id = "com.android.calculator2:id/digit_2")
	private WebElement two;
	
	@FindBy(id = "com.android.calculator2:id/digit_3")
	private WebElement three;
	
	@FindBy(id = "com.android.calculator2:id/digit_4")
	private WebElement four;
	
	@FindBy(id = "com.android.calculator2:id/digit_5")
	private WebElement five;
	
	@FindBy(id = "com.android.calculator2:id/digit_6")
	private WebElement six;
	
	@FindBy(id = "com.android.calculator2:id/digit_7")
	private WebElement seven;
	
	@FindBy(id = "com.android.calculator2:id/digit_8")
	private WebElement eight;
	
	@FindBy(id = "com.android.calculator2:id/digit_9")
	private WebElement nine;
	
	@FindBy(id = "com.android.calculator2:id/digit_0")
	private WebElement zero;
	
	@FindBy(id = "com.android.calculator2:id/dec_point")
	private WebElement dot;
	
	@FindBy(id = "com.android.calculator2:id/op_add")
	private WebElement plus;
	
	@FindBy(id = "com.android.calculator2:id/op_sub")
	private WebElement minus;
	
	@FindBy(id = "com.android.calculator2:id/op_mul")
	private WebElement times;
	
	@FindBy(id = "com.android.calculator2:id/op_div")
	private WebElement divide;
	
	@FindBy(id = "com.android.calculator2:id/eq")
	private WebElement equals;
	
	@FindBy(id = "com.android.calculator2:id/del")
	private WebElement delete;
	
	@FindBy(id = "com.android.calculator2:id/result")
	private WebElement results;
	
	private WebElement clear;
	
	
	public CalculatorObject() {
		
	}
	
	public CalculatorObject(AndroidDriver passeddriver) {
		
		driver = passeddriver;
		PageFactory.initElements(driver, this);
		/*
		one = driver.findElement(By.id("com.android.calculator2:id/digit_1"));
		two = driver.findElement(By.id("com.android.calculator2:id/digit_2"));
		three = driver.findElement(By.id("com.android.calculator2:id/digit_3"));
		four = driver.findElement(By.id("com.android.calculator2:id/digit_4"));
		five = driver.findElement(By.id("com.android.calculator2:id/digit_5"));
		six = driver.findElement(By.id("com.android.calculator2:id/digit_6"));
		seven = driver.findElement(By.id("com.android.calculator2:id/digit_7"));
		eight = driver.findElement(By.id("com.android.calculator2:id/digit_8"));
		nine = driver.findElement(By.id("com.android.calculator2:id/digit_9"));
		zero = driver.findElement(By.id("com.android.calculator2:id/digit_0"));
		dot = driver.findElement(By.id("com.android.calculator2:id/dec_point"));
		plus = driver.findElement(By.id("com.android.calculator2:id/op_add"));
		minus = driver.findElement(By.id("com.android.calculator2:id/op_sub"));
		times = driver.findElement(By.id("com.android.calculator2:id/op_mul"));
		divide = driver.findElement(By.id("com.android.calculator2:id/op_div"));
		equals = driver.findElement(By.id("com.android.calculator2:id/eq"));
		delete = driver.findElement(By.id("com.android.calculator2:id/del"));
		results = driver.findElement(By.id("com.android.calculator2:id/result"));
		*/
		
	}
	
	public void clickByChar(char digit) {
		switch(digit) {
		case '0':
			zero.click();
			break;
		case '1':
			one.click();
			break;
		case '2':
			two.click();
			break;
		case '3':
			three.click();
			break;
		case '4':
			four.click();
			break;
		case '5':
			five.click();
			break;
		case '6':
			six.click();
			break;
		case '7':
			seven.click();
			break;
		case '8':
			eight.click();
			break;
		case '9':
			nine.click();
			break;		
		case '.':
			dot.click();
			break;
		case '+':
			plus.click();
			break;
		case '-':
			minus.click();
			break;
		case '\\':
			divide.click();
			break;
		case '*':
			times.click();
			break;
		default:
			System.out.println("Invalid Character");
			
		}
		
	}
	
	public void clickPlus() {
		plus.click();
	}
	
	public void clickSub() {
		minus.click();
	}
	
	public void clickTimes() {
		times.click();
	}

	public void clickDiv() {
		divide.click();
	}
	
	public void clickEquals() {
		equals.click();
	}
	
	public boolean equalsDisplayed() {
		return equals.isDisplayed();
	}
	
	public void clickDel() {
		delete.click();
	}
	
	public boolean delDisplayed() {
		try {
		return delete.isDisplayed();
		}
		catch(Exception e){
			return false;
		}
		
	}
	
	public void findClear() {
		try {
		clear = driver.findElement(By.id("com.android.calculator2:id/clr"));
		}
		catch(Exception e) {
			System.out.println("Clear not displayed");
		}
	}
	
	public void clickClr() {
		clear.click();
	}
	
	public boolean clrDisplayed() {
		try {
			return clear.isDisplayed();
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public String getResults() {
		return results.getText();
	}

}
