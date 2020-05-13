package functions;

import mainFunction.UtilPage;
import xPath.SignUpPageXPath;

public class SignUpPageFunction extends UtilPage{
	
	SignUpPageXPath spx = new SignUpPageXPath();
	
	
	public void completeSignUp(String firstName, String emailAddress, String password, String confirmPassword) {
		
		sendText(spx.clickFirstName, firstName);
		sendText(spx.clickEmailAddress, emailAddress);
		sendText(spx.password, password);
		sendText(spx.confirmPassword, confirmPassword);
		clickElement(spx.agreeToPromos);
		clickElement(spx.agreeToTerms);
		clickElement(spx.clickSignUp);
		
	}
	
	

}
