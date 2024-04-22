package Selenium1;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aert {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vivek\\Downloads\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://demoqa.com/alerts");
	Thread.sleep(5000);
		driver.manage().window().maximize();
		
		WebElement click = driver.findElement(By.xpath("//button[@id='alertButton']"));
		click.click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		
//		WebElement click2 = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
//		click2.click();
//		Alert alert1 = driver.switchTo().alert();
		//Thread.sleep(2000);
//		alert1.accept();
		
//		WebElement click3 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
//		click3.click();
//		Alert alert2 = driver.switchTo().alert();
//		Thread.sleep(3000);
//		alert2.accept();

		
//		WebElement click4 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
//		click4.click();
				
//		Alert alert3 = driver.switchTo().alert();
//		alert3.sendKeys("Neha");
//
//		Thread.sleep(3000);
//		alert3.accept();
		
	}

}
