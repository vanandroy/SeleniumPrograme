package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleDataExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet bs = wb.getSheet("InvalidLogin");
		int count = bs.getLastRowNum();
		for(int i=0;i<=count;i++)
		{
			String un = bs.getRow(i).getCell(0).getStringCellValue();
			String pw = bs.getRow(i).getCell(1).getStringCellValue();
			System.out.println(un+"   "+pw);
		}
	}
}
