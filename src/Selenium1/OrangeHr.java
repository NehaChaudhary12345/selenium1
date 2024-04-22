package Selenium1;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class OrangeHr {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vivek\\Downloads\\chromedriver-win64\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(2000);
	
	
	dr.manage().window().maximize();
	//System.out.println(dr.getTitle());
	//System.out.println(dr.getCurrentUrl());
	
	WebElement username= dr.findElement(By.xpath("//input[@name='username']"));
	username.sendKeys("Admin");
	WebElement password= dr.findElement(By.xpath("//input[@type='password']"));
	password.sendKeys("admin123");
	
	WebElement login= dr.findElement(By.xpath("//button[@type='submit']"));
	login.click();
	Thread.sleep(5000);
	
	//WebElement buzz= dr.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[12]/a/span"));
    //buzz.click();
    WebElement buzz= dr.findElement(By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[12]"));
    buzz.click();
    Thread.sleep(5000);
//	dr.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/buzz/viewBuzz");
	WebElement textarea= dr.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]"));
	textarea.sendKeys("Neha");
	
	
	WebElement post= dr.findElement(By.xpath("//bustton[@type=\"submit\"]"));
	post.click();
	
	//Thread.sleep(5000);
	
	dr.navigate().back();
	Thread.sleep(5000);
	dr.navigate().forward();
	}

}
