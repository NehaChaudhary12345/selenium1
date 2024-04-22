package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Uncodemy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vivek\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.navigate().to("https://uncodemy.com/");
		
		
	Thread.sleep(5000);
	WebElement botx= dr.findElement(By.xpath("//i[@class='fa-regular fa-rectangle-xmark chatb']"));
	botx.click();
	WebElement categories= dr.findElement(By.xpath("//span[@id='categoriesBtn']"));
		Actions a = new Actions (dr);
         a.moveToElement(categories).perform();
         WebElement st= dr.findElement(By.xpath("//a[@href='#'][normalize-space()='Software Testing']"));
       a.moveToElement(st).perform();
       Thread.sleep(1000);
      
       WebElement mst= dr.findElement(By.xpath("  //a[normalize-space()='Manual Testing']"));
  // a.click(mst).perform();
	mst.click();
	}

}
