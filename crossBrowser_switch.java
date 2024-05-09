package Selenium_Practise;
import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
public class crossBrowser_switch {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browser;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the nrowser name which to be open");
		browser =sc.nextLine();
		
		WebDriver wd = null; 
		
		switch(browser)
		{
		case "chrome" : 
				wd = new ChromeDriver();
				wd.get("https://www.meesho.com");
		break;
		
		case "firefox" : 
			wd = new FirefoxDriver();
			wd.get("https://www.amazon.in");
		break;	
		
		case "edge" : 
			wd = new EdgeDriver();
			wd.get("https://www.flipkart.com");
		break;	
				
		case "safari" : 
			wd = new SafariDriver();
			wd.get("https://www.youtube.com");
		break;	
		}
		wd.quit();

	}

}
