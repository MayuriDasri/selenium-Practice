package Selenium_Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 {

	public static void main(String[] args) {
		
		String cururl;

		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().window().fullscreen();
		
		wd.get("https://naveenautomationlabs.com/opencart/");
		cururl =wd.getCurrentUrl();
		System.out.println("Current Url is : "+ cururl);
		if(cururl.contains("navin"))
		{
			System.out.println("Test PAss");
		}
		else
		{
			System.out.println("Test Fail");
		}
		wd.quit();
	}

}
