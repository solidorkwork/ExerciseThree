package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utilities.BrushSelectorObject;
import utilities.ColorPickerObject;
import utilities.Hooks;
import utilities.SketchBookObject;

public class DrawingSteps {
	AndroidDriver<WebElement> drawDriver = Hooks.getDriver();
	SketchBookObject sketchPage = Hooks.getPage();
	BrushSelectorObject brushPage;
	ColorPickerObject colorPage;
	
	
	@Given("The sketch page is open")
	public void checkOpen() {
		Assert.assertEquals(sketchPage.isSketchVisible(), true);
	}
	
	
    @When("I switch to technical pen")
    public void switchToTechPen() {
    	brushPage = sketchPage.openBrushMenu();
    	System.out.println("Brush menu opened.");
    	brushPage.clickTechPen();
    	brushPage.clickBack();
    }

    
    @And("I draw the following lines:")
    
    public void drawSquare(DataTable table) {
    	
    	List<List> rows = table.asList(List.class);
    	
    	for(List<String> row : rows) {
    		int x1 = Integer.parseInt(row.get(0));
    		int y1 = Integer.parseInt(row.get(1));
    		int x2 = Integer.parseInt(row.get(2));
    		int y2 = Integer.parseInt(row.get(3));
    		sketchPage.drawLine(x1, y1, x2, y2);
    	}
    	
    }
    
    /*
      | xpoint | ypoint |
      |    100 |    400 |
      |    600 |    400 |
      |    100 |   1000 |
      |    600 |   1000 |
    And I fill the center with black
    Then Only the inside is black
    */

}
