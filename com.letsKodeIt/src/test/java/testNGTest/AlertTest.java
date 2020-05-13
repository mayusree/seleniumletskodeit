package testNGTest;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import functions.HomePageFunction;
import mainFunction.UtilPage;
import xPath.PracticePageXPath;

public class AlertTest extends UtilPage{
	
	HomePageFunction hpf = new HomePageFunction();
	PracticePageXPath ppx = new PracticePageXPath();
	
	@Test
	public void testAlert() {
		
		openBrowser("chrome");
		hpf.clickPracticeButton();
		sleep(2000);
		
		sendText(ppx.alertText, "Mayo");
		clickElement(ppx.alertConfirmButton);
		sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
	}

}
