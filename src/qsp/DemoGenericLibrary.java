package qsp;

import java.io.IOException;

import com.actitime.generic.FileLib;

public class DemoGenericLibrary {

	public static void main(String[] args) throws IOException {
		FileLib f=new FileLib();
		String un = f.getPropertyData("username");
		System.out.println(un);
		String cu = f.getExcelData("Create Customer", 1, 2);
		System.out.println(cu);
		f.setExcelValue("Create Customer", 1, 3, "pass456");
	}

}
