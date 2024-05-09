package Selenium_Practise;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dyanamicxpath {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		for(int i =4;i<=7;i++)
		{
			String XpathText = "//a[@id='ui-id-"+i+"']";
			WebElement element = driver.findElement(By.xpath(XpathText));
			element.click();
			
			String header = driver.findElement(By.xpath( "//h1[@id='page-title-heading']/span")).getText();;
			System.out.println(header);
		}
		driver.quit();
		
	}

}
