package qsp;

import java.io.IOException;

import com.actitime.generic.TestDetailsLib;

public class OperateTestDetailsLib {

	public static void main(String[] args) throws IOException {
		TestDetailsLib t=new TestDetailsLib();
		String pwd = t.getPropertyData("password");
		System.out.println(pwd);
		String data = t.getReadExcelFile("StudentDetails", 3, 3);
		System.out.println(data);
		t.writeDataExcelFile("Create Customer", 3, 3,"ravi");


	}

}
