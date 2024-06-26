package Selenium_Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class checkboxbtn {

	public static void main(String[] args) throws InterruptedException { 
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com");
		
		WebElement checkbox1 = driver.findElement(By.xpath("//button[text()='Check this']"));
		checkbox1.click();
		
		WebDriverWait exwait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		WebElement chbox = exwait.until(ExpectedConditions.elementToBeClickable(By.id("dte")));
		chbox.click();
	}
}