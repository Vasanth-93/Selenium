package System;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class Disney {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://disneyworld.disney.go.com/resorts/");
		driver.findElement(By.className("facetGroupHeader")).click();
		driver.findElement(By.xpath(".//*[@id='priceRangeResorts']/div/ol/li[2]/label/span[1]")).click();
	    String s = driver.findElement(By.xpath(".//*[@id='activityFilters']")).getText();
	System.out.println("the price range is filtered between "+s);
	}

}
