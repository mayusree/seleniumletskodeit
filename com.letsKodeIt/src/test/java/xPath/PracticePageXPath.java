package xPath;

public class PracticePageXPath {

	public	String bmwRadioButton = "//input[@id='bmwradio']";
	public  String bmwRadioText = "//div[@id='radio-btn-example']//label[1]";
	public	String benzRadioButton = "//input[@id='benzradio']";
	public  String benzRadioText = "//div[@id='radio-btn-example']//label[2]";
	public	String hondaRadioButton = "//input[@id='hondaradio']"; 
	public  String hondaRadioText = "//div[@id='radio-btn-example']//label[3]";

	public  String carSelectDropDown = "//select[@id = 'carselect']";
	public	String bmwDropDown = "//option[contains(text(),'BMW')]";
	public	String benzDropDown = "//option[contains(text(),'Benz')]";
	public	String hondaDropDown = "//option[contains(text(),'Honda')]";

	public	String colorApple = "//option[contains(text(),'Apple')]";
	public	String colorOrange = "//option[contains(text(),'Orange')]";
	public	String colorPeach = "//option[contains(text(),'Peach')]";

	public	String checkBmw = "//div[@id='checkbox-example']//label[1]";
	public	String checkBenz = "//div[@id='checkbox-example']//label[2]";
	public	String checkHonda = "//input[@id='hondacheck']";

	public String allRadioButtons = "//input[@type='radio' and @name='cars']";

	public String radioAndCheckBoxButton = "//input[@name='cars']";

	public String carSelectButton = "//select[@id='carselect']";
	public String carSelectBmw = "//option[contains(text(),'BMW')]";
	public String carSelectBenz = "//option[contains(text(),'Benz')]";
	public String carSelectHonda = "//option[contains(text(),'Honda')]";

	public String openWindow = "//button[@id='openwindow']";

	public String alertText = "//input[@class = 'inputs']";
	public String alertButton = "//input[@id= 'alertbtn']";
	public String alertConfirmButton = "//input[@id= 'confirmbtn']";

	public String iFrame = "//iframe[@id = 'courses-iframe']";

	public String mouseHoverButton = "//button[@id = 'mousehover']";
	public String mouseHoverTopButton = "//a[text()= 'Top']";
	public String mouseHoverReloadButton = "//a[text()= 'Reload']";





}
