package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptionsWithoutLoop {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/Notepad/ListBox.html");
		WebElement alloption = driver.findElement(By.id("mtr"));
		Select s=new Select(alloption);
		int count = s.getOptions().size();
		System.out.println(count);
		WebElement pAllOp = s.getWrappedElement();
		String text = pAllOp.getText();
		System.out.println(text);
		driver.close();
	}

}
