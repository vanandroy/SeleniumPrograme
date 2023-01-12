package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingMultipleDataExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet st = wb.getSheet("StudentDetails");
		int countRow = st.getLastRowNum();
		short countCell = st.getRow(1).getLastCellNum();
		System.out.println("Number Of Rows: "+countRow);
		System.out.println("Number Of Cells: "+countCell);
		for(int i=1;i<=countRow;i++)
		{
			Row cRow = st.getRow(i);
			for(int j=0;j<countCell;j++)
			{
				String data = cRow.getCell(j).getStringCellValue();
				System.out.print(data+"          ");
			}
			System.out.println();
		}
		wb.close();
		fis.close();
	}

}
