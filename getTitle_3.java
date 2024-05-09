package Selenium_Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://www.google.com");
		String title = wd.getTitle();
		System.out.println("The Title is : "+title);
		if (title.equals("Google"))
			wd.get("https://www.facebook.com");
		else
			wd.get("https://www.Amazon.com");

			wd.quit();
	}

}
