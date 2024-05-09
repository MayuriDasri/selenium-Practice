package Selenium_Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtilities {
	
	private WebDriver wd;
/**
 * @Browser Initialization 
 */
	public WebDriver initDriver(String browser)
	{
		System.out.println("The Browser Name is : "+browser); 
		
		switch(browser.toLowerCase().trim()) {
		
		case "chrome" :
			wd= new ChromeDriver();
		break;
		
		case "firefox" :
			wd= new FirefoxDriver();
		break;
		
		default : System.out.println("Please Enter the correct Broswer name ");	
		}
		
		return wd;
	}
	
	public void urlLaunch(String url)
	{
		if (url == null)
		{
			System.out.println("The Url Should not be Null");
			
		}
			else if(url.indexOf("https")==0)
		{
			wd.get(url);
		}
		else
		{
			System.out.println("The URL is not Correct");
		}
	}
	
	public void getMax()
	{
		wd.manage().window().maximize();
	}
	
	public void getFullscreen()
	{
		wd.manage().window().fullscreen();
	}
	
	public String getPageTitle()
	{
		String title = wd.getTitle();
		System.out.println("The Title of Url Is : "+title);
		return title;
	}
	
	
}
////////////