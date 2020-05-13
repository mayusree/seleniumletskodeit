package stepDef;

import io.cucumber.java.en.Given;
import mainFunction.UtilPage;

public class StepDefHooks extends UtilPage {

	@Given("I open the website")
	public void i_open_the_website() {
		openBrowser("chrome", "https://learn.letskodeit.com/");	
		
	}

	
	


}
