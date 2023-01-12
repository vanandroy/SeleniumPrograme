package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllSelected {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/Notepad/ListBox.html");
		WebElement cpListBox = driver.findElement(By.id("cp"));
		Select s=new Select(cpListBox);
		List<WebElement> allOptions = s.getAllSelectedOptions();
		Thread.sleep(4000);
		int count = allOptions.size();
		System.out.println(count);
		for(WebElement all:allOptions) {
			String text = all.getText();
			System.out.println(text);
		}
	/*	for(int i=0;i<count;i++)
		{
			String text = allOptions.get(i).getText();
			Thread.sleep(4000);
			System.out.println(text);
		}*/
		driver.close();
	}

}
