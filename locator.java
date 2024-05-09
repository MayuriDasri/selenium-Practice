package Selenium_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get(" https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();
		
		//id
//		driver.findElement(By.id("input-email")).sendKeys("dasri@yahoo.com");
//		driver.findElement(By.id("input-password")).sendKeys("123");
//		
		WebElement email = driver.findElement(By.id("input-email"));
		WebElement password = driver.findElement(By.id("input-password"));
		
		email.sendKeys("Mayuri@gamil.com");
		password.sendKeys("123");
		
		
		
		
		

	}

}
