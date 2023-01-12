package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompareHeightWidth {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/");
int x1 = driver.findElement(By.name("username")).getSize().getHeight();
int y1 = driver.findElement(By.name("username")).getSize().getWidth();
int x2 = driver.findElement(By.name("pwd")).getSize().getHeight();
int y2 = driver.findElement(By.name("pwd")).getSize().getWidth();
if(x1==x2 && y1==y2) {
	System.out.println("Height's  and width's are equal");
}
else 
{
	System.out.println("Height's  and width's are not equal");
}
driver.close();
	}

}