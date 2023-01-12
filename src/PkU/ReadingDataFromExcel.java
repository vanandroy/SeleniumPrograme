package PkU;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet st = wb.getSheet("InvalidLogin");
		int countrow = st.getLastRowNum();
		short countcell = st.getRow(1).getLastCellNum();
		System.out.println(countrow);
		System.out.println(countcell);
		for(int r=0;r<=countrow;r++) 
		{
			Row currentrow = st.getRow(r);	
			for(int c=0;c<countcell;c++) 
			{
				String value = currentrow.getCell(c).getStringCellValue();
				System.out.println(value+"  ");
			}
			System.out.println();
		}
		wb.close();
		fis.close();

	}

}
