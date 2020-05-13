package testNGTest;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import functions.HomePageFunction;
import functions.PracticePageFunction;
import mainFunction.UtilPage;
import xPath.HomePageXPath;
import xPath.PracticePageXPath;

public class VerifyAllTopButton extends UtilPage{

	PracticePageXPath pp = new PracticePageXPath();
	HomePageXPath hp = new HomePageXPath();
	HomePageFunction hpf = new HomePageFunction();
	PracticePageFunction ppf = new PracticePageFunction();
			
	//public VerifyRadioButton(WebDriver driver) {
		//super(driver);
		
	//}
	//@Test
	public void verifyBmwRadioButton() {
		
		openBrowser("chrome");
		hpf.clickPracticeButton();
		ppf.clickBmwRadioButton();
		System.out.println(ppf.getBmwRadioText());
		assertEquals(verifyText("bmw", pp.bmwRadioText), true);
		
				
	}
	
	//@Test
	public void verifyAllRadioButtons() {
		
		openBrowser("chrome");
		hpf.clickPracticeButton();
		sleep(2000);
		
		List<WebElement> allRadioButton = driver.findElements(By.xpath(pp.allRadioButtons));
		
		for(int i=0; i<allRadioButton.size(); i++) {
			
			allRadioButton.get(i).click();
			
		}
		
//		ppf.clickBmwRadioButton();
//		sleep(2000);
//		ppf.clickBenzRadioButton();
//		sleep(2000);
//		ppf.clickHondaRadioButton();
		}
	
	//@Test
	public void verifyRadioAndCheckBoxButton() {
		
		
		openBrowser("chrome");
		hpf.clickPracticeButton();
		sleep(2000);
//		ppf.clickBmwRadioButton();
//		sleep(2000);
//		ppf.clickBenzRadioButton();
//		sleep(2000);
//    	ppf.clickHondaRadioButton();
		List<WebElement> radioAndCheckBoxButton = driver.findElements(By.xpath(pp.radioAndCheckBoxButton));
		
		for(int i=0; i<radioAndCheckBoxButton.size(); i++) {
			
		    boolean isSelected = radioAndCheckBoxButton.get(i).isSelected();
			if (isSelected == false) {
				
				radioAndCheckBoxButton.get(i).click();
				sleep(2000);
			}
		
	}
	

	}
	
	//@Test
	public void verifyCarSelectButton() {
		
		openBrowser("chrome");
		hpf.clickPracticeButton();
		sleep(2000);
		driver.findElement(By.xpath(pp.carSelectButton)).click();
		driver.findElement(By.xpath(pp.carSelectBmw)).click();
		sleep(2000);
		driver.findElement(By.xpath(pp.carSelectButton)).click();
		driver.findElement(By.xpath(pp.carSelectBenz)).click();
		sleep(2000);
		driver.findElement(By.xpath(pp.carSelectButton)).click();
		driver.findElement(By.xpath(pp.carSelectHonda)).click();
				
	}
	
	@Test
	public void verifyDropDownButton() {
		
		openBrowser("chrome");
		hpf.clickPracticeButton();
		sleep(2000);
		
		Select se = new Select(driver.findElement(By.xpath(pp.carSelectDropDown)));
		se.selectByValue("honda");
		List<WebElement> ls = se.getOptions();

		
		for (int i = 0; i<ls.size(); i++) {
			
			//System.out.println(ls.get(i).getText());
			ls.get(i).click();
			sleep(2000);
		}
		
		
	}
	
	
	
	
	
}
