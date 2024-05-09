package Selenium_Practise;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
		WebElement frameAdd = driver.findElement(By.xpath("//div[@id ='webengage-notification-container']"));
		//WebElement frameAdd = driver.findElement(By.xpath("//img[contains(@class,'slide')])"));
		driver.switchTo().frame(frameAdd);
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement closeFrame = (WebElement) wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("close")));
		closeFrame.click();
		
		
	}

}
