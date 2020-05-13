package testNGTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import functions.CoursePageFunction;
import functions.HomePageFunction;
import mainFunction.UtilPage;
import xPath.CoursesPageXPath;
import xPath.PracticePageXPath;

public class TestIFrames extends UtilPage {

	HomePageFunction hpf = new HomePageFunction();
	PracticePageXPath ppx = new PracticePageXPath();
	CoursesPageXPath cpx = new CoursesPageXPath();
	CoursePageFunction cpf = new CoursePageFunction();
	

	@Test
	public void testFrames() {

		openBrowser("chrome");
		hpf.clickPracticeButton();
	
		driver.switchTo().frame(getWebElement(ppx.iFrame));
		
		sendText(cpx.searchCourseBox, "selenium");
		cpf.clickSearchButton();
		sleep(3000);
		



	}

}

