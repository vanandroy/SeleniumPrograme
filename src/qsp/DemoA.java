package qsp;

import org.openqa.selenium.WebDriver;

public class DemoA {

static void testA(WebDriver driver)	
{
	driver.get("https://www.google.co.in/");
	String title=driver.getTitle();
	System.out.println(title);
	driver.close();
}

}
