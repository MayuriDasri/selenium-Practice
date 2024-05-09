package Selenium_Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


//not working
public class BlockNotification {

	public static void main(String[] args) throws InterruptedException {
		
		
		FirefoxOptions option = new FirefoxOptions();
		option.addArguments("--disable-notification--");
		option.addPreference("geo.enabled", false);
		
		WebDriver  driver = new FirefoxDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.justdial.com/");

		
		
	}

}
