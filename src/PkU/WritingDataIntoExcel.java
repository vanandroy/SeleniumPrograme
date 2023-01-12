package PkU;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileOutputStream fos=new FileOutputStream("./data/test.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet st = wb.createSheet();

		/*
		 //creating rows,cellsand update data without loop

		XSSFRow row1 = st.createRow(0);
		row1.createCell(0).setCellValue("country");
		row1.createCell(1).setCellValue("state");
		row1.createCell(2).setCellValue("district");
		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("name");
		row2.createCell(1).setCellValue("state");
		row2.createCell(2).setCellValue("block");

		 */


		//creating rows,cells and update data with loop

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		for(int r=0;r<=n;r++) {
			XSSFRow crow = st.createRow(r);
			for(int c=0;c<n;c++)
			{
				System.out.println("enter value");
				String dt=sc.next();
				crow.createCell(c).setCellValue(dt);
			}
		}
		System.out.println("writing is done");
		wb.write(fos);
		fos.close();

	}

}
