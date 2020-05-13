package testNGTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import functions.SignUpPageFunction;
import mainFunction.UtilPage;
import xPath.HomePageXPath;
import xPath.PracticePageXPath;

public class Test5 extends UtilPage{
	PracticePageXPath pp = new PracticePageXPath();
	HomePageXPath hp = new HomePageXPath();
	SignUpPageFunction spf = new SignUpPageFunction();
	
	
	//@Test
	public void test() {
		
		openBrowser("chrome");
		System.out.println(driver.findElement(By.xpath(hp.practiceButton)).isDisplayed());
		System.out.println(driver.findElement(By.xpath(hp.practiceButton)).isEnabled());
		System.out.println(driver.findElement(By.xpath(hp.practiceButton)).isSelected());
		
	}
	
	
	@Test
	public void testVerify() {
		
		openBrowser("chrome");
		clickElement(hp.signUpButton);
		spf.completeSignUp("Mayu Sree", "1234567@email.com", "123456", "123456");
		clickElement(hp.userAvatarbutton);
		System.out.println(getText("//span[@class='navbar-current-user']"));
		
	}
	
	
	
	
}
