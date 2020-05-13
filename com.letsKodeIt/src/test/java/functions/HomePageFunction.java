package functions;

import mainFunction.UtilPage;
import xPath.HomePageXPath;
import xPath.PracticePageXPath;

public class HomePageFunction extends UtilPage{

	HomePageXPath hp = new HomePageXPath();	

	public void clickPracticeButton() {

		clickElement(hp.practiceButton);
	}

	public void clickLoginButton() {

		clickElement(hp.loginButton);

	}

	public void clickSignUpButton() {

		clickElement(hp.signUpButton);

	}
	
	public void clickAvatarButton() {
		
		clickElement(hp.userAvatarbutton);
	}

	public boolean verifyEditProfile ( ) {

		return verifyText( "Edit Profile", hp.editProfileButton);
		

	}

}
