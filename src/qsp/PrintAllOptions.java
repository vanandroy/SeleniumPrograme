package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptions {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/Notepad/ListBox.html");
		WebElement mtrlistBox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrlistBox);
		List<WebElement> allOptions = s.getOptions();
		int count = allOptions.size();
		System.out.println(count);
		String text=null;
		String text1 = null;
		for(int i=0;i<allOptions.size();i++)
		{
			text = allOptions.get(count-1).getText();
			text1=allOptions.get(4).getText();
		}
		System.out.println(text1);
		System.out.println(text);
		driver.close();
	}

}
