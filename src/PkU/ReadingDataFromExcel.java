package PkU;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadingDataFromExcel {

	public static void main(String []args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet st = wb.getSheet("StudentDetails");
		int countrow = st.getLastRowNum();
		short countcell = st.getRow(4).getLastCellNum();
		//dataformatter used to read all types of data
		DataFormatter df=new DataFormatter();
		String value=null;
		for(int r=0;r<=countrow;r++) 
		{
			Row currentrow = st.getRow(r);	
			for(int c=0;c<countcell;c++) 
			{
				 value = df.formatCellValue(currentrow.getCell(c));	
			}
			System.out.println(value+"  ");
		}
		System.out.print(" ");
		wb.close();
		fis.close();

	}

}
