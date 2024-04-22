package Selenium1;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFunctionality {
	WebDriver driver = new ChromeDriver();
@Test
	     void login_navigate() throws InterruptedException {
	    	driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       // Thread.sleep(2000);
	    	driver.manage().window().maximize();
	    	 driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");	    	
		    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");	
		    driver.findElement(By.xpath("//button[@type='submit']")).click();	     
	     
		    Thread.sleep(3000);
	     }
      void Buzz() throws InterruptedException{
    	    WebElement buzz= driver.findElement(By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[12]"));
    	    buzz.click();
    	    Thread.sleep(5000);
//    		dr.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/buzz/viewBuzz");
    		WebElement textarea= driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]"));
    		textarea.sendKeys("Neha");
    		
    		
    		WebElement post= driver.findElement(By.xpath("//bustton[@type=\"submit\"]"));
    		post.click();
    	  
    	  
      }

}



