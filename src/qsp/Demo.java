package qsp;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;


public class Demo {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String []args) {
		ArrayList<String> al=new ArrayList<String>();
		HashSet<String> hs=new HashSet<String>();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/Notepad/ListBox.html");
		WebElement mtr = driver.findElement(By.id("mtr"));
		Select s=new Select(mtr);
		java.util.List<WebElement> allopt = s.getOptions();
		int count = allopt.size();
		String text="";
		for(int i=0;i<count;i++) {
			text=allopt.get(i).getText();
			al.add(text);
			hs.add(text);
		}
		Collections.sort(al);
		System.out.println(al);
		System.out.println("++++++++++");
		
		System.out.println("====================");
		System.out.println(hs);
		driver.close();
	}

}
