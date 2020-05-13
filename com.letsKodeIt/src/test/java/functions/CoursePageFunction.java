package functions;

import mainFunction.UtilPage;
import xPath.CoursesPageXPath;

public class CoursePageFunction extends UtilPage{
	
	CoursesPageXPath cp = new CoursesPageXPath();
	
	public void clickLogin() {
		
		clickElement(cp.loginButton);
			
	}
	
	public void clickSearchButton() {
		
		clickElement(cp.clickSearch);
	}
	

}
