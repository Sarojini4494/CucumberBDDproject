package chromedownload;

import java.io.File;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Export {

	public static void main(String[] args) throws Exception {
	
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet();
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("helo");
		sheet.getRow(0).createCell(1).setCellValue("world");
		
		File file =  new File("C:\\Users\\sarojini\\git\\CucumberProject\\PractiseCucumber\\src\\test\\resources\\AppFeatures\\CucumberBDD\\src\\Excel\\exportdetal2.xlsx");
		
		workbook.write(file);
	}
}
