package testNGTest;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import functions.CoursePageFunction;
import functions.HomePageFunction;
import functions.PracticePageFunction;
import mainFunction.UtilPage;

public class VerifyWindows extends UtilPage{
	
	HomePageFunction hpf = new HomePageFunction();
	PracticePageFunction ppf = new PracticePageFunction();
	CoursePageFunction cpf = new CoursePageFunction();
	
	
	@Test
	public void testWindows() {
		
	openBrowser("chrome");
	hpf.clickPracticeButton();
	String windowHandle = driver.getWindowHandle();
	System.out.println(windowHandle);
	ppf.clickNewWindow();
	Set<String> windowHandles = driver.getWindowHandles();         //grab all window ids
	Iterator<String> it = windowHandles.iterator();
	String w1 = it.next();
	String w2 = it.next();
	
	System.out.println(w1);
	System.out.println(w2);
		
	for (String i:windowHandles) {
		
		System.out.println(i);
		
		if (!i.equals(windowHandle)) {
			
			driver.switchTo().window(i);
			
		}
		
		
	}
	
	
	
	String windowHandle2 = driver.getWindowHandle();
	System.out.println(windowHandle2);
//	
	cpf.clickLogin();
	driver.switchTo().window(windowHandle);
	
	

	}
	
	

}
