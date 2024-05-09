package Selenium_Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webBroswerMethods {

	public static void main(String[] args) {
		
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://www.amazon.com");
		wd.manage().window().maximize();
		wd.manage().deleteAllCookies();
		String url = wd.getCurrentUrl();
		System.out.println("URL Is  : "+url);
		
		//wd.close();
		
		String pagesource = wd.getPageSource();
		System.out.println(pagesource);
		
		

	}

}
