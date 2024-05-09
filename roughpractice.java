package Selenium_Practise;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
public class roughpractice {

	WebDriver wd;
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String bname, urlname,title;
		Scanner sc= new Scanner(System.in);
		
		BrowserUtilities bu  = new BrowserUtilities();
		
		//@initalization Driver
		
		System.out.println("Please Enter the broswer name which is to be open: ");
		bname=sc.nextLine();
		bu.initDriver(bname);
		
		//@Launching URL
		System.out.println("Enter the Url Name: ");
		urlname=sc.nextLine();
		bu.urlLaunch(urlname);
		
		//@getTitle
		title = bu.getPageTitle();
		System.out.println("The Title of Launched URL is : "+ title);
	
		//@getMaximize, FullScreen
		bu.getMax();
		bu.getFullscreen();
		
	}
	

}
