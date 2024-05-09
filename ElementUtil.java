package Selenium_Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementUtil {
	
	private WebDriver driver;
	
	public WebDriver initDriver(String browserName) {
		System.out.println("Browser Name : "+browserName);
		
		String bn = browserName.toLowerCase().trim();

		
		switch(bn)
		{
		case "chrome" :
			driver = new ChromeDriver();
		break;
		
		case "firefox" :
			driver  = new FirefoxDriver();
		break;
		
		}
	
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		return driver;
	}
	
	public void launchURL(String url)
	{
		System.out.println("Launch URL name : "+url);
		if(url == null)
			System.out.println("Please Pass the Correct URL");
		if(url.lastIndexOf("com")==0)
		{
			driver.get(url);
		}
	}
	
	public String getPageTitle() {
		String title = driver.getTitle();
		System.out.println("Browser Title Name :"+title);
		return title;
		}
	
	public String currentPageUrl()
	{
		String url = driver.getCurrentUrl();
		System.out.println("Current Page Url = "+url);
		return url;
	}
	
	public void closeBrowser() {
		if (driver != null) {
			driver.close();
		}
	}

	public void quitBrowser() {
		if (driver != null) {
			driver.quit();
		}
	}
}
