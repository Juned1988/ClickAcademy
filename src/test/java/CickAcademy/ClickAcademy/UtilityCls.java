package CickAcademy.ClickAcademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilityCls {
	WebDriver Driver;
	  
	 @BeforeTest
	  public void beforeTest() {
		 WebDriverManager.firefoxdriver().setup();
		 Driver = new FirefoxDriver();
}
}