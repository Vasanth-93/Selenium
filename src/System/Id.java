package System;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Id {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath(".//*[@id='gbwa']/div[1]/a")).click();

		//WebElement email =driver.findElement(By.id("Email"));
		
	}

}
