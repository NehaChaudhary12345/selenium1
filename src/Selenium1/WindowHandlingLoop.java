package Selenium1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingLoop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vivek\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		String mainWinID = driver.getWindowHandle();
		System.out.println("Main WindowID is = "+mainWinID);  //parent id
		
		WebElement insta = driver.findElement(By.xpath("//a[@title='Take a look at Instagram']"));
        insta.click();
        
		
		Set<String> allWinID = driver.getWindowHandles();
		System.out.println("All WindowID is = "+allWinID); //second window id 
		
		for(String wn: allWinID) {
			if (!mainWinID.equals(wn)) {
				driver.switchTo().window(wn);
			}
				
		}
		
		Thread.sleep(3000);
		         WebElement instaname = driver.findElement(By.xpath("//input[@name='username']"));
         instaname.sendKeys("neha");
	}

}
