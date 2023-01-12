package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//get the java representative object of the physical file
		FileInputStream fis=new FileInputStream("./data/testScript.xlsx");
		//create the workbook or open the file in read mode
		Workbook wb=WorkbookFactory.create(fis);
		//get the control of the sheet,then row,then column or cell and then read the data
		String data = wb.getSheet("Create Customer").getRow(2).getCell(3).getStringCellValue();
		//print the data on the console
		System.out.println(data);
	}

}
