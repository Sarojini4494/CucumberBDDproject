package chromedownload;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class chromedownload {

	 static WebDriver driver = new ChromeDriver();
	
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarojini\\Downloads\\chromedriver105\\chromedriver.exe");
		
		String downloadFilePath = "C:\\Users\\sarojini\\git\\CucumberProject\\PractiseCucumber\\src\\test\\resources\\AppFeatures\\CucumberBDD\\src\\Excel.xlsx";
		
		HashMap<String, Object> chromePref = new HashMap<String, Object>();
		chromePref.put("profile.default_content_settings.popups", 0);
		chromePref.put("download.default_directory", downloadFilePath);
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePref);
	 
		driver = new ChromeDriver(options);
		driver.get("https://uat.valorpaytech.com/app/transactionManager/openBatch");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Export')]")).click();
		}
	
}
