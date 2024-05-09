package Selenium_Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class crossBroswer_3 {
	public static void main(String args[]){
		
		String title ="chrome";
		WebDriver wd = null;
		
		if (title.equals("chrome")) {
			wd= new ChromeDriver();
			wd.get("https://www.google.com");
		}
		else if(title.equals("firfox")) {
			wd=new FirefoxDriver();
			wd.get("https://www.firefox.com");
		}
	}

}
