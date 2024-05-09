package Selenium_Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		String tittle = driver.getTitle();
		System.out.println(tittle);
	    driver.manage().window().maximize();
	    driver.manage().window().fullscreen();
	    driver.manage().deleteAllCookies();
	    String url = driver.getCurrentUrl();
	    
	    System.out.println("Current URL = "+url);
	   String pgSrc= driver.getPageSource();
	   System.out.println("PageSource == " + pgSrc);
	  //  driver.close();
	    
	}

}
