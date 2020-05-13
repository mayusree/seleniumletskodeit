package mainFunction;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UtilPage extends MainDriver {

	//	public UtilPage(WebDriver driver) {
	//		super(driver);
	//		
	//	}

	public void TakeScreenShot(String pictureName) {

		File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screen, new File ("C:\\Users\\myran\\Documents\\Screenshots\\"+pictureName+".jpg"));


		}

		catch (Exception R){

			System.out.println("Error Screenshot not taken");
		}

	}

	public void sleep(int mls) {

		try {
			Thread.sleep(mls);    // thread.sleep has no relation to driver or code, it will pause the runtime 
		} catch (InterruptedException e) {

			System.out.println("Ugly wait not working");
			e.printStackTrace(); // java gives random error msg
		}

	}

	public void clickElement(String xpath) {

		driver.findElement(By.xpath(xpath)).click();


	}

	public void sendText(String xpath1, String values) {

		driver.findElement(By.xpath(xpath1)).sendKeys(values);

	}

	public String getText(String xpath) {

		return driver.findElement(By.xpath(xpath)).getText();

	}

	public boolean verifyText(String expectedText, String xpath) {

		String actualtext = driver.findElement(By.xpath(xpath)).getText();

		if (actualtext.equalsIgnoreCase(expectedText)) {

			System.out.println("Text matches");
			return true;
		}

		else {

			System.out.println("Text does not match");
			return false;

		}
	}

	public boolean notVerify(String expectedText, String xpath) {

		String actualtext = driver.findElement(By.xpath(xpath)).getText();

		if (actualtext.equalsIgnoreCase(expectedText)) {

			System.out.println("Text matches, test failed");
			return false;
		}

		else {

			System.out.println("Text does not match");
			return true;
		}


	}

	public WebElement getWebElement(String xpath) {

		return driver.findElement(By.xpath(xpath));

	}
	public void tearDown() {

		driver.quit();
	}







}
