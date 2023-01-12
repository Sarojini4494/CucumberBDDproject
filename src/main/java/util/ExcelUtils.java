package util;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	public static void main(String[] args) {
		getRowCount();
	}
	

	public static void getRowCount() {
		
		XSSFWorkbook workbook;
		try {
			
			String projectpath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook("C:\\Users\\sarojini\\git\\CucumberProject\\PractiseCucumber\\src\\test\\resources\\AppFeatures\\CucumberBDD\\src\\Excel\\expport.xlsx");
			XSSFSheet sheet = workbook.getSheet("exportcount");
			int rowCount = sheet.getPhysicalNumberOfRows()-1;
			System.out.println("No of rows : "+rowCount);
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
	}
	
}
