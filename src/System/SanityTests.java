package System;

import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.taskdefs.WaitFor.Unit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SanityTests {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		System.out.println("Enter url");
		driver.get("https://www.google.com/");
		
		System.out.println("The page title is - "+driver.getTitle());
		boolean s= driver.findElement(By.linkText("Gmail")).isEnabled();
		System.out.println("the Gmail link is enabled - "+s);
		driver.findElement(By.linkText("Gmail")).click();
		boolean s1 =driver.findElement(By.cssSelector(".gmail-nav__nav-link.gmail-nav__nav-link__sign-in")).isEnabled();
		System.out.println("Sign in button is enabled -"+ s1);
		driver.findElement(By.cssSelector(".gmail-nav__nav-link.gmail-nav__nav-link__sign-in")).click();
		//hai vasanth
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("vasanthb868@gmail.com");
		boolean s2 =driver.findElement(By.cssSelector(".RveJvd.snByac")).isEnabled();
		System.out.println("next button at mail Id entry is enabled -"+ s2);
		driver.findElement(By.cssSelector(".RveJvd.snByac")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector(".whsOnd.zHQkBf")).sendKeys("9177536124");
		boolean s3 = driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).isEnabled();
		System.out.println("Next button at password entry is enabled -"+s3);
		driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
		Thread.sleep(10000);
		boolean s4 = driver.findElement(By.xpath(".//*[@id=':if']/div/div")).isEnabled();
		System.out.println("The Gmail compose button is enabled - "+ s4);
		driver.findElement(By.xpath(".//*[@id=':if']/div/div")).click();
		Thread.sleep(10000);
		boolean s5 = driver.findElement(By.id(":pl")).isEnabled();
		System.out.println("the upload button is available and enabled - " + s5);
		driver.findElement(By.id(":pl")).click();
		System.out.println("the files uploading window is displayed");
		
		//driver.findElement(By.xpath(".//*[@id='gb24']/span[1]")).click();
		
		//driver.findElement(By.xpath(".//*[@id='tgOver0']/div/div/dl")).click();
	}
	
}
