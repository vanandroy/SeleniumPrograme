package qsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpecificOptionMtr {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter item name :");
		String item = sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/Notepad/ListBox.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s= new Select(mtrListBox);
		List<WebElement> option = s.getOptions();
		int count=option.size();
		for(int i=0;i<count;i++) {
			String text = option.get(i).getText();
			if(item.equals(text)) {
				System.out.println(true);
			}
			else {
				System.out.println(false);
			}
		}
		driver.close();

	}

}
