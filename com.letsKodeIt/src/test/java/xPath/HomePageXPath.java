package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import mainFunction.UtilPage;

public class HomePageXPath extends UtilPage {
	
	public String practiceButton = "//a[@class='fedora-navbar-link navbar-link']";
	public String loginButton = "//a[@class='navbar-link fedora-navbar-link']";
	public String signUpButton = "//a[@id='header-sign-up-btn']";
	public String userAvatarbutton = "//img[@class='gravatar']";
	public String editProfileButton = "//a[contains(text(),'Edit Profile')]";

	public WebElement practicebutton = driver.findElement(By.xpath("//a[@class='fedora-navbar-link navbar-link']")) ;
}
