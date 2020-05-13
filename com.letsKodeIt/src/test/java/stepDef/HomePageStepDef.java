package stepDef;

import static org.testng.Assert.assertEquals;

import functions.HomePageFunction;
import functions.SignUpPageFunction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HomePageStepDef extends HomePageFunction{
	
	SignUpPageFunction spf = new SignUpPageFunction();

	@Given("I click signup")
	public void i_click_signup() {
	   clickSignUpButton();
	}

	@When("I complete credentials and click sign up")
	public void i_complete_credentials_and_click_sign_up() {
	    spf.completeSignUp("Tony Start", "bruce@banner3.ca", "123456", "123456");
	}

	@Then("I verify edit profile")
	public void i_verify_edit_profile() {
	    clickAvatarButton();
	    
	 assertEquals(verifyEditProfile(), true); 
	 tearDown();
	 
	}
	
	

}
