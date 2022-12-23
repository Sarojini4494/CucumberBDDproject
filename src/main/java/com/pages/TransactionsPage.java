package com.pages;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TransactionsPage {

    private WebDriver driver;
    File folder;

 

    private By tfilter = By.xpath("//span[contains(text(),'Recent')]");
    private By muifilter = By.xpath("//button[@type='button']//span//span//i");
    private By list = By.xpath("//ul[@role='menu']/li");
    private By transtype = By.xpath("(//span[contains(text(),'ALL')])[1]");
    private By trnstaus = By.xpath(
            "//body/div[@role='presentation']/div[@role='none presentation']/div[@role='dialog']/div/div/button[@name='Transaction_Status']/span[1]");
   // private By countfirmtile = By.xpath("//div[@class='_loading_overlay_overlay css-1oig5ex']");
    //private By bottomcount = By.xpath("");
    private By Action = By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-4 MuiGrid-grid-md-2']//span[@class='MuiButton-label']");
    private By Export = By.xpath("//span[contains(text(),'Export')]");
    private By Atax = By.xpath("//input[@name='approvedBox']");
    
    private By VT = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[2]/div/div/div[2]/div[1]/ul/li[4]/a/span/span");
    private By Amount = By.name("amount");
    private By PhoneNo = By.name("phoneNo");
    private By Email = By.name("email");
    private By Cardnumber = By.name("number");
    private By CVV = By.name("cvc");
    private By MMYY = By.name("expiry");
    private By Cardholder = By.name("_chn");
    private By InvoiceNumber = By.name("invoiceNumber");
    
    private By Process = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div/div/div/div/div/div/div[2]/div/div[8]/div/button/span[1]/span");
    private By Processtwo = By.xpath("//*[@id=\"body\"]/div[2]/div[3]/div/div[3]/button[2]/span[1]/span");
    private By close = By.xpath("//*[@id=\"removeArea\"]/div[3]/div/div/div[2]/button[2]/span[1]/span");
    
    
    
    public TransactionsPage(WebDriver driver) {
        this.driver = driver;

    }

    public void transactionsfilterclick() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(tfilter).click();
        List<WebElement> filter = driver.findElements(list);
        for (WebElement ftype : filter) {
            if (ftype.getText().equals("Today")) {
                ftype.click();
                break;
            }

        }
}
    
    public void transactionsfilteringoptinclick() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(muifilter).click();
        List<WebElement> fil = driver.findElements(list);

        for (WebElement ftyp : fil) {
            if (ftyp.getText().equals("Today")) {
                ftyp.click();
                break;
            }
        }
        driver.findElement(transtype).click();

 

        List<WebElement> fill = driver.findElements(list);
        for (WebElement fty : fill) {
            if (fty.getText().equals("SALE")) {
                fty.click();
                break;
            }
        }
        
        driver.findElement(trnstaus).click();
        Thread.sleep(3000);
        List<WebElement> filstatus = driver.findElements(list);
        for (WebElement fty : filstatus) {
            if (fty.getText().equals("Approved")) {
                fty.click();
                break;
            }
            
        }
        driver.findElement(By.xpath("//span[normalize-space()='Search']")).click();
        Thread.sleep(3000);
        boolean b1= driver.findElement(By.xpath("//span[normalize-space()='TransType']")).isDisplayed();
        System.out.println(b1);//true
        boolean b2= driver.findElement(By.xpath("//span[normalize-space()='TransStatus']")).isDisplayed();
        System.out.println(b2);//true
    }
    
    /*if(countfirmtile==bottomcount) {
        System.out.println("count matched");
    }
        else {
            System.out.println("count mismatch");

        }
    }*/ 
    public void ExportValidation() throws InterruptedException {

        folder = new File(UUID.randomUUID().toString());
        folder.mkdir();

        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_cntent_settings.popups", 0);
        prefs.put("download.default_directory", folder.getAbsolutePath());

        Thread.sleep(3000);
        driver.findElement(Action).click();
        driver.findElement(Export).click();

        File listOfFiles[] = folder.listFiles();
        
        for(File file : folder.listFiles())
        {
            file.delete();
        }

        folder.delete();
        
    }
    public void countcheck() {
        /*WebElement tcount =driver.findElement(By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div[1]/div[1]/div/div/div[3]/div/div"));
        String text = tcount.getAttribute("innerHTML");
        System.out.println(text);



        WebElement vcountt =driver.findElement(By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div[1]/div[1]/div/div[2]/div[2]/div/div/span"));
        String textt = vcountt.getAttribute("innerHTML");
        System.out.println(textt);*/

    }
    public void getRowCount() throws FileNotFoundException, IOException {

       // WebElement btc = driver.findElement(By.xpath("(//p[@class='MuiTypography-root MuiTablePagination-caption MuiTypography-body2 MuiTypography-colorInherit'])[2]"));
        //String pnation=btc.getAttribute("innerHTML");
        //System.out.println(pnation);
        
        /*// String user = System.getProperty("user home"); // user if data in your user profile
        // String filePath = user + "/Downloads/Test/test.xlsx";
        String filePath = "C:\\Users\\rajkumar\\Downloads\\TRANSACTION_12_22_2022_5_23_13_.xlsx"; // If download is in IDE project folder
        FileInputStream fis = new FileInputStream(filePath);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("TRANSACTION_12_22_2022_5_23_13_");

 

        int rowCount = sheet.getLastRowNum();
        String rowCountString = Integer.toString(rowCount);
        workbook.close();
        return rowCountString;*/
    }

    public void toshowapprovedtax() {
        boolean at=driver.findElement(Atax).isDisplayed();
        System.out.println(at);
        driver.findElement(Atax).click();
        
    }

    public void filterwitthallTransactiontype() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(muifilter).click();

        List<WebElement> fil = driver.findElements(list);

        for (WebElement ftyp : fil) {
            if (ftyp.getText().equals("Today")) {
                ftyp.click();
                break;
            }
        }
        driver.findElement(transtype).click();
        Thread.sleep(3000);
        List<WebElement> fill = driver.findElements(list);
        for (WebElement fty : fill) {
            if (fty.getText().equals("ALL")) {
                fty.click();
                break;
            }
        }
        
        driver.findElement(trnstaus).click();
        Thread.sleep(3000);
        List<WebElement> filstatus = driver.findElements(list);
        for (WebElement fty : filstatus) {
            if (fty.getText().equals("ALL")) {
                fty.click();
                break;
            }         
    }
        driver.findElement(By.xpath("//span[normalize-space()='Search']")).click();

    }
    
    public void Vt() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(VT).click();
        driver.findElement(Amount).sendKeys("2500");
        driver.findElement(PhoneNo).sendKeys("7305632694");
        driver.findElement(Email).sendKeys("sarojiniu32@gmail.com");
        driver.findElement(Cardnumber).sendKeys("4111 1111 1111 1111");
        driver.findElement(CVV).sendKeys("999");
        driver.findElement(MMYY).sendKeys("12/25");
        driver.findElement(Cardholder).sendKeys("Platinum");
        driver.findElement(InvoiceNumber).sendKeys("12345");
    }
    
    public void process() throws InterruptedException{
		Thread.sleep(3000);
        driver.findElement(Process).click();
	}
	
	public void processtwo() throws InterruptedException{
		Thread.sleep(3000);
        driver.findElement(Processtwo).click();
	}
        
        public void Close() throws InterruptedException{
    		Thread.sleep(3000);
       driver.findElement(close).click();
	}
}

 
