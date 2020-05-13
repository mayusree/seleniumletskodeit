package testNGTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import functions.HomePageFunction;
import mainFunction.UtilPage;
import xPath.PracticePageXPath;

public class MouseHoverTest extends UtilPage {
	
	HomePageFunction hpf = new HomePageFunction();
	PracticePageXPath ppx = new PracticePageXPath();
	
	@Test
	public void testMouseHover() {
		
		openBrowser("chrome");
		//hpf.clickPracticeButton();
		sleep(2000);

		Actions ac = new Actions(driver);
	
		
		
		
		ac.moveToElement(getWebElement(ppx.mouseHoverButton)).build().perform();
		sleep(2000);
		clickElement(ppx.mouseHoverTopButton);clickElement(ppx.mouseHoverReloadButton);
		
		
	}
	

}
