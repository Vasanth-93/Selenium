package System;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hammer {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.homedepot.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		
        driver.findElement(By.xpath(".//*[@id='headerSearch']")).sendKeys("hammer");
		driver.findElement(By.cssSelector("#headerSearchButton")).click();
		String s1 = driver.findElement(By.xpath(".//*[@id='products']/div/div[2]/div/div[4]/a")).getText();
		System.out.println("Brand Name: "+ s1);
		String s2 = driver.findElement(By.xpath(".//*[@id='products']/div/div[2]/div/div[9]/span")).getText();
		System.out.println("Shipment available like - "+ s2);
		boolean s3 = driver.findElement(By.xpath(".//*[@id='products']/div/div[2]/div/div[11]/div/a/span")).isEnabled();
		System.out.println("add to cart is enabled - "+s3);
		
		//driver.switchTo().frame(2);
		
		//Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='topNavRefinements']/ul/li[1]/span")));
	    //dropdown.selectByIndex(2);
		//driver.findElement(By.className("top-refinement-label js-top-refinement-label drop-down__title drop-down__title--alt"));
		//driver.findElement(By.name("Bosch")).click();
		//driver.findElement(By.xpath(".//*[@id='products']/div/div[3]/div/div[11]/div/a/span")).click();
		//driver.findElement(By.xpath("driver.findElement(By.xpath")).click();

	}

}
