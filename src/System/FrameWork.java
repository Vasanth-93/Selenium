package System;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class FrameWork {
@Test
public void openingBrowser()
{
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com/");
	String s = driver.getTitle();
     System.out.println(s);

}
}
