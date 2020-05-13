package toolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import mainFunction.UtilPage;

public class DragAndDrop extends UtilPage {
	
	
	String droppableXPath = "//a[contains(text(),'Droppable')]";
	String dragMeTo = "//p[contains(text(),'Drag me to my target')]";
	String dropMeTo = "//div[@id='droppable']";
	String draggableXPath = "//a[contains(text(),'Draggable')]";
	String dragAround = "//div[@id='draggable']";
	
	@BeforeMethod
	public void openWindown() {
		
		openBrowser3("chrome");
		
	}
	
	//@Test
	public void dragAndDrop() {
				
		clickElement(droppableXPath);
		WebElement dragMe = getWebElement(dragMeTo);
		WebElement dropMe = getWebElement(dropMeTo);	
		Actions ac = new Actions(driver);
		ac.dragAndDrop(dragMe, dropMe).build().perform();
		
	}
	
	@Test
	public void dragaround() {
		
		clickElement(draggableXPath);
		WebElement drag = getWebElement(dragAround);

		Actions ac = new Actions(driver);
		ac.dragAndDropBy(drag, 25, 30).build().perform();
		sleep(250);
		ac.dragAndDropBy(drag, 30, 40).build().perform();
		sleep(250);
		ac.dragAndDropBy(drag, 40, 50).build().perform();
		sleep(250);
		ac.dragAndDropBy(drag, 60, 70).build().perform();
		
//		drag.sendKeys(Keys.chord(Keys.LEFT_SHIFT, "s"));
//		drag.sendKeys(Keys.ENTER);
		
		
		
	}
		
	@AfterMethod
	public void tearDown2() {
		
		sleep(3000);
		tearDown();
		
	}
		
	
	
	

}
