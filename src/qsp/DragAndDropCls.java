package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropCls {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		WebElement src = driver.findElement(By.xpath("//h1[.='Block 1']"));
		WebElement dest = driver.findElement(By.xpath("//h1[.='Block 4']"));
		Actions a=new Actions(driver);
		a.dragAndDrop(src, dest).perform();
		System.out.println("ok");
		Thread.sleep(4000);
		driver.close();
	}

}
