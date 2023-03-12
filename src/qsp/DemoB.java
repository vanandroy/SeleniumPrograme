package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DemoB {

	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testScript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		int count = wb.getSheet("StudentDetails").getLastRowNum();
		for(int i=1;i<=count;i++) {
			String dt = wb.getSheet("StudentDetails").getRow(i).getCell(0).getStringCellValue();
			String va = wb.getSheet("StudentDetails").getRow(i).getCell(1).getStringCellValue();
			System.out.println(dt+"     "+va);
		}
		
		
		
	}
}
