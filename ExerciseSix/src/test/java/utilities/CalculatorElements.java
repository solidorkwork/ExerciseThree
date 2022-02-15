package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class CalculatorElements {

	AndroidDriver driver;
	public WebElement one;
	public WebElement two;
	public WebElement three;
	public WebElement four;
	public WebElement five;
	public WebElement six;
	public WebElement seven;
	public WebElement eight;
	public WebElement nine;
	public WebElement zero;
	public WebElement dot;
	public WebElement plus;
	public WebElement minus;
	public WebElement times;
	public WebElement divide;
	public WebElement equals;
	public WebElement delete;
	public WebElement clear;
	public WebElement results;
	
	public CalculatorElements(AndroidDriver passeddriver) {
		
		driver = passeddriver;
		
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
		
	}
	
	public void findClear() {
		clear = driver.findElement(By.id("com.android.calculator2:id/clr"));
	}
	
	public void clickByChar(char digit) {
		if(digit == '0')
			zero.click();
		if(digit == '1')
			one.click();
		if(digit == '2')
			two.click();
		if(digit == '3')
			three.click();
		if(digit == '4')
			four.click();
		if(digit == '5')
			five.click();
		if(digit == '6')
			six.click();
		if(digit == '7')
			seven.click();
		if(digit == '8')
			eight.click();
		if(digit == '9')
			nine.click();
		if(digit == '.')
			dot.click();
	}
	
}
