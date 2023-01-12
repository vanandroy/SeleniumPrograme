package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingDataToExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream fis=new FileInputStream("./data/testScript.xlsx");
Workbook wb=WorkbookFactory.create(fis);
wb.getSheet("Create Customer").getRow(2).getCell(3).setCellValue("skipped12");
FileOutputStream fos=new FileOutputStream("./data/testScript.xlsx");
wb.write(fos);
wb.close();
	}
}
