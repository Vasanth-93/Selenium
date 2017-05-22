package System;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.Select;

public class DisneyWorld {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://disneyworld.disney.go.com/tickets/water-parks/");
	Thread.sleep(5000);
	Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='adultTotal']")));
	dropdown.selectByVisibleText("2");

	Select dropdown1 = new Select(driver.findElement(By.xpath(".//*[@id='childTotal']")));
	dropdown1.selectByVisibleText("2");
	String s = driver.findElement(By.xpath(".//*[@id='ticketBuilderSubTotalContainer']/div[2]")).getText();
	System.out.println("The bill is - "+ s);
     driver.findElement(By.xpath(".//*[@id='addToCart']")).isEnabled();
     driver.findElement(By.xpath(".//*[@id='addToCart']")).click();
     
	//Select s = new Select(driver.findElement(By.xpath(".//*[@id='adultTotal']")));
	//s.selectByValue("3");
	//Actions Builder = new Actions(driver);
	//WebElement menuElement = driver.findElement(By.xpath(".//*[@id='adultTotal']"));
	//Builder.moveToElement(menuElement).build().perform();
	

	}

}
