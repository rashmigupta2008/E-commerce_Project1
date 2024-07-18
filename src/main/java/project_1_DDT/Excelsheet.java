package project_1_DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet {
	public static String username;
	public static String password;
	
	public static void excel_fetching_data() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1=new FileInputStream("C:\\Users\\H P\\eclipse-workspace\\selenium_new\\ExcelSheet\\DDTExcelSheet.xlsx");
		Workbook w1=WorkbookFactory.create(f1);   
		Sheet sh1=w1.getSheet("login"); 
		Row r1=sh1.getRow(1); 
		Cell c1=r1.getCell(0);
		username=c1.getStringCellValue();  
		System.out.println(username);
				Row r2=sh1.getRow(1);
				Cell c2=r2.getCell(1);
				password=c2.getStringCellValue();
				System.out.println(password);
	}

}
