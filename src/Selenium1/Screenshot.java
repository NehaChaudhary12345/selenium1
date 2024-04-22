package Selenium1;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Screenshot {
	



		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\vivek\\Downloads\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	        driver.navigate().to("https://demoqa.com/alerts");

	        WebElement screenshot= driver.findElement(By.xpath("https://demoqa.com/alerts"));
	     
	        TakesScreenshot ts = (TakesScreenshot)driver;
		    File src = ts.getScreenshotAs(OutputType.FILE);
		    File file = new File("E:\\screenshot1.png");
		    FileUtils.copyFile(src, file);
		    System.out.println("Screenshot is captured");
		    
	        		
	        		
	        		
	        
	        
		}
}
