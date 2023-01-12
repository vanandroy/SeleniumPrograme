package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpLoad {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/HP/Desktop/Naukari.html");
File f=new File("C:\\Users\\HP\\eclipse-workspace\\Automation\\data\\vkfinalres.pdf");
String path = f.getAbsolutePath();
Thread.sleep(3000);
driver.findElement(By.id("cv")).sendKeys(path);
driver.close();
	}

}
