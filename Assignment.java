package Selenium_Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		WebElement checkThisButton = driver.findElement(By.xpath("//button[text()='Check this']"));
		checkThisButton.click();

		//Thread.sleep(10000);
		/*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement checkBox = wait.until(ExpectedConditions.elementToBeClickable(By.id("dte")));*/
		WebElement checkBox = driver.findElement(By.id("dte"));
		checkBox.click();
		//driver.quit();

	}
}
