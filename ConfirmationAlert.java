package Selenium_Practise;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmationAlert {
	
	public static void main(String args[])throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		WebElement informationAlertButton = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		informationAlertButton.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alertclick = driver.switchTo().alert();
		
		String alertBoxText = alertclick.getText();
		System.out.println("AlertText: "+ alertBoxText);
		
		Thread.sleep(1000);
		alertclick.accept();
		
		driver.switchTo().defaultContent();
		
		WebElement alertMessage = driver.findElement(By.id("result"));
		String message = alertMessage.getText();
		
		System.out.println("Message after accepting Alert : "+ message);
		
		
		
		
		
		
	}
	

}
