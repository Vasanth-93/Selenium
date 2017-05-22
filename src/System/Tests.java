package System;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tests {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
/*driver.get("https://accounts.google.com/ServiceLogin/identifier?service=cl&passive=1209600&osid=1&continue=https%3A%2F%2Fcalendar.google.com%2Fcalendar%2Frender&followup=https%3A%2F%2Fcalendar.google.com%2Fcalendar&scc=1&flowName=GlifWebSignIn&flowEntry=AddSession");
driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("vasanthb868@gmail.com");
driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
Thread.sleep(3000);
driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("9177536124");
driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
driver.findElement(By.xpath(".//*[@id='topRightNavigation']/div[1]/div[2]/div/div/div/div[2]")).click();
driver.findElement(By.xpath(".//*[@id='tgOver0']/div[2]/div/dl")).click();*/

driver.get("http://www.gcrit.com/build3/admin/login.php");
driver.findElement(By.name("username")).sendKeys("admin");
driver.findElement(By.name("password")).sendKeys("admin@123");
driver.findElement(By.id("tdb1")).click();
String ur1 = driver.getCurrentUrl();
if(ur1.equals("http://www.gcrit.com/build3/admin/index.php")) {
	System.out.println("success");
}
else {
	System.out.println("fail");
}
//driver.close();
	}

}
