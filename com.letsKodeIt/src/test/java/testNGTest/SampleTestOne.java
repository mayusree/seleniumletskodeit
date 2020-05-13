package testNGTest;

import org.testng.annotations.Test;

import functions.HomePageFunction;
import mainFunction.UtilPage;
import xPath.HomePageXPath;

public class SampleTestOne extends UtilPage{
	
	HomePageXPath hpx = new HomePageXPath();
	
	@Test
	public void sampleTest() {
		
		openBrowser("chrome", "https://learn.letskodeit.com/");	

		
	}
	

}
