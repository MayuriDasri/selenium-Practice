package Selenium_Practise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoAlertPresentExceptionDemo {
	    public static void main(String[] args) throws InterruptedException {
	    

	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.example.com");
	        Thread.sleep(1000);

	        try {
	            // Attempting to switch to an alert that does not exist
	            Alert alert = driver.switchTo().alert();
	            System.out.println("Alert text: " + alert.getText());
	            alert.accept();
	        } catch (NoAlertPresentException e) {
	            System.out.println("No alert present.");
	        }

	        driver.quit();
	    }
}
