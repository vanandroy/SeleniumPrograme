package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenderRdoBtnFb {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
Thread.sleep(1000);
driver.findElement(By.xpath("//a[@rel='async']")).click();
Thread.sleep(1000);
int x = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).getLocation().getY();
Thread.sleep(1000);
int y = driver.findElement(By.xpath("(//input[@type='radio'])[2]")).getLocation().getY();
Thread.sleep(1000);
int z = driver.findElement(By.xpath("(//input[@type='radio'])[3]")).getLocation().getY();
if(x==y && y==z)
{
	System.out.println("properly allign");
}
else {
	System.out.println("properly not allign");
}

driver.close();
	}

}
