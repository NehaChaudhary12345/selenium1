package Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\vivek\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		LoginFunctionality d= new LoginFunctionality();
		d.login_navigate();
		Thread.sleep(3000);
		d.Buzz();
		Thread.sleep(5000);
	}

}
