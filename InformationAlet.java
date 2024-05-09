package Selenium_Practise;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InformationAlet {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		WebElement infoAlert = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		infoAlert.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert = driver.switchTo().alert();
		String alertText1 = alert.getText();
		System.out.println("Text on the Alert"+alertText1);
		
		
		Thread.sleep(100);
		alert.accept();
		driver.switchTo().defaultContent();
		
		WebElement message = driver.findElement(By.id("result"));
		System.out.println("Message after clicking the alert : "+ message.getText()); 
		
		
		
		
		
		
		
		
		
	}

}
