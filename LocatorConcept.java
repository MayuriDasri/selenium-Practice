package Selenium_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		
			WebDriver driver= new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			
			
//			//1st Method 
//			driver.findElement(By.id("input-email")).sendKeys("Mayuri");
//			driver.findElement(By.id("input-password")).sendKeys("123");
			
			//2nd Method
			WebElement email=driver.findElement(By.id("input-email"));
			WebElement password = driver.findElement(By.id("input-password"));
			
			email.sendKeys("Mayuri");
			password.sendKeys("123");
	}
	

}
