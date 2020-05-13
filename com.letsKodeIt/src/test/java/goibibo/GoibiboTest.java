package goibibo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import mainFunction.UtilPage;

public class GoibiboTest extends UtilPage{
	
	String fromTextXPath = "//input[@id = 'gosuggest_inputSrc']";
	String listResultXPath = "//ul[@id = 'react-autosuggest-1']";
	String listXPath1 = "//li";
	String listXPath2 = "//li[contains(@id,'react-autosuggest')]";
	String listXPath3 = "//li[@class='react-autosuggest__suggestion lh1-3']";
	String listXPath4 = "//li[@role='option']";
	
	
	@Test
	public void partialTextSelect () {
		
		
		openBrowser2("chrome");
		sendText(fromTextXPath, "Jap");	
		sleep(3000);
		WebElement result = driver.findElement(By.xpath(listResultXPath));    
		String innerAttribute = result.getAttribute("innerHTML");
		System.out.println(innerAttribute);
		List<WebElement> destinationList = result.findElements(By.xpath(listXPath4));
		
		for(WebElement singleList: destinationList) {
			String nameDestination = singleList.getText();
			System.out.println(nameDestination);
			
			if (nameDestination.contains("Tokyo")) {
				
				singleList.click();
				break;
			}
			
			
		}
		
		
		
		
		
		
		
	}
//	WebElement list = driver.findElement(By.xpath(fromTextXPath));
//	driver.findElement(By.xpath(fromTextXPath)).click();
//	driver.findElement(By.xpath(fromTextXPath)).sendKeys("japan");
//	driver.findElement(By.xpath(fromTextXPath)).getText();
//	driver.findElement(By.xpath(fromTextXPath)).getAttribute(listResultXPath);
//	list.click();
//	list.sendKeys("japanese");
//	String result = list.getText();
//	list.getAttribute(listXPath4);

}
