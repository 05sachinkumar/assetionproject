package excelutility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutility {
	public String getReadData(String path, int sheetno, int colno, int rowno)
	{
		String val="";
		try {
			FileInputStream file = new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(file);
			XSSFSheet sheet = wb.getSheetAt(sheetno);
			val = sheet.getRow(rowno).getCell(colno).getStringCellValue();
		}
		catch(Exception e)
		{
			System.out.println("error for reading file:"+e);
		}
		return val;
	}
}

