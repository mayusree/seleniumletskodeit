package mainFunction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainDriver {

	public  static WebDriver driver;
	
	
//	public MainDriver(WebDriver driver) {
//		this.driver = driver;
//	}


	public void openBrowser(String browser) {
		
		if (browser.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\myran\\Documents\\WebDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // to do with loading time for browsers
			driver.get("https://learn.letskodeit.com/");
			//driver.get("https://www.amazon.com/");
			
			
			
		}
		
		else if (browser.equalsIgnoreCase("edge")) {
			
			System.setProperty("webdriver.edge.driver", "C:\\Users\\myran\\Documents\\WebDrivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https:\\www.google.com");
			driver.get("https://learn.letskodeit.com/");
		}
		
		else if (browser.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.firefox.driver", "C:\\Users\\myran\\Documents\\WebDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("http:\\www.google.com");
			driver.get("https://learn.letskodeit.com/");
		}
		
		else {
			
			System.out.println("Incorrect browser");
			
		}
		
	}
	
public void openBrowser2(String browser) {
		
		if (browser.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\myran\\Documents\\WebDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // to do with loading time for browsers
			driver.get("https://www.goibibo.com/");
			
			
			
			
		}
		
		else if (browser.equalsIgnoreCase("edge")) {
			
			System.setProperty("webdriver.edge.driver", "C:\\Users\\myran\\Documents\\WebDrivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https:\\www.google.com");
			driver.get("https://www.goibibo.com/");
		}
		
		else if (browser.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.firefox.driver", "C:\\Users\\myran\\Documents\\WebDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("http:\\www.google.com");
			driver.get("https://www.goibibo.com/");
		}
		
		else {
			
			System.out.println("Incorrect browser");
			
		}
		
	}
	
		public void openBrowser3(String browser) {
			
			if (browser.equalsIgnoreCase("Chrome")) {
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\myran\\Documents\\WebDrivers\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // to do with loading time for browsers
				driver.get("https:\\www.google.com");
				driver.get("https://demoqa.com/");
				
				
				
			}
			
			else if (browser.equalsIgnoreCase("edge")) {
				
				System.setProperty("webdriver.edge.driver", "C:\\Users\\myran\\Documents\\WebDrivers\\msedgedriver.exe");
				driver = new EdgeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.get("https:\\www.google.com");
				driver.get("https://demoqa.com/");
			}
			
			else if (browser.equalsIgnoreCase("firefox")) {
				
				System.setProperty("webdriver.firefox.driver", "C:\\Users\\myran\\Documents\\WebDrivers\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.get("http:\\www.google.com");
				driver.get("https://demoqa.com/");
			}
			
			else {
				
				System.out.println("Incorrect browser");
				
			}
			
		}
				
		public void openBrowser(String browser, String website) {
			
			if (browser.equalsIgnoreCase("Chrome")) {
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\myran\\Documents\\WebDrivers\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // to do with loading time for browsers
				driver.get("http:\\www.google.com");
				driver.get(website);
				//driver.get("https://www.amazon.com/");
				
				
				
			}
			
			else if (browser.equalsIgnoreCase("edge")) {
				
				System.setProperty("webdriver.edge.driver", "C:\\Users\\myran\\Documents\\WebDrivers\\msedgedriver.exe");
				driver = new EdgeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.get("https:\\www.google.com");
				driver.get("https://learn.letskodeit.com/");
			}
			
			else if (browser.equalsIgnoreCase("firefox")) {
				
				System.setProperty("webdriver.firefox.driver", "C:\\Users\\myran\\Documents\\WebDrivers\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.get("http:\\www.google.com");
				driver.get("https://learn.letskodeit.com/");
			}
			
			else {
				
				System.out.println("Incorrect browser");
				
			}
			
		}		
				
	
}
