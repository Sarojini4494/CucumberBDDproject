package com.pages;

import java.io.File;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TransactionsPage {

    private WebDriver driver;
    File folder;
    private By tfilter = By.xpath("//span[contains(text(),'Recent')]");
    private By muifilter = By.xpath("//button[@type='button']//span//span//i");
    private By list = By.xpath("//ul[@role='menu']/li");
    private By transtype = By.xpath("(//span[contains(text(),'ALL')])[1]");
    private By trnstaus = By.xpath(
            "//body/div[@role='presentation']/div[@role='none presentation']/div[@role='dialog']/div/div/button[@name='Transaction_Status']/span[1]");
  private By cardty = By.xpath("(//span[contains(text(),'ALL')])[2]");
    private By Action = By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-4 MuiGrid-grid-md-2']//span[@class='MuiButton-label']");
    private By Export = By.xpath("//span[contains(text(),'Export')]");
    private By Atax = By.xpath("//input[@name='approvedBox']");
    private By episrch = By.xpath("//span[contains(text(),'EPI')]");
    
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
    private By batchout = By.xpath("//span[contains(text(),'Batch Out')]");
    private By yes = By.xpath("//*[@id=\"body\"]/div[2]/div[3]/div/div/div[3]/button[2]/span[1]/span");
    private By ok = By.xpath("//*[@id=\"body\"]/div[2]/div[3]/div/div/div[3]/button/span[1]/span");
    
   private By txn = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[2]/div/div/div[2]/div[1]/ul/li[3]/a");
  // private By Cresale = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div[3]/div[1]/div/div[1]/div/span/div/div[1]/div");
   private By txntype = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div[3]/div[1]/div/div[1]/div/span/div/div[1]/div");
  
  // private By calen = By.xpath("//*[@id=\"simple-menu\"]/div[3]/ul/div[2]/div/div[1]/div[3]/span[3]/span");
   
  /* private By email = By.id("emailtype");
   private By password = By.id("passwordtype");
   private By continueButton = By.xpath("//span[@class='MuiButton-label']");
   private By loginButton = By.xpath("//span[contains(text(),'YES')]");
   
   private By Txnicon = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div[3]/div[1]/div/div[1]/div/div/span[1]/img");*/

   
    
   // private By settreport = By.xpath("//li[@role='menuitem']");
   //private By Actclobat = By.xpath("//button[@title='Options']");
   
   private By txnicon = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div[3]/div[1]/div/div[1]/div/div/span[1]/img");
   private By cardno = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div[3]/div[1]/div/div[1]/div/div/span[2]/img");

   private By proicon = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div[3]/div[1]/div/div[1]/div/div/span[3]/img");
   private By exportclk = By.xpath("//*[@id=\"OpenBatchActionPoper\"]/div[3]/ul/li[1]");
  
   
    public TransactionsPage(WebDriver driver) {
        this.driver = driver;

    }

    public void transactionsfilterclick() throws InterruptedException {
        Thread.sleep(4000);
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
        Thread.sleep(4000);
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
       
    public void ExportValidation() throws InterruptedException {

        folder = new File(UUID.randomUUID().toString());
        folder.mkdir();

        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_cntent_settings.popups", 0);
        prefs.put("download.default_directory", folder.getAbsolutePath());

        Thread.sleep(4000);
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
      /**  WebElement tcount =driver.findElement(By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div[1]/div[1]/div/div/div[3]/div/div"));
        String text = tcount.getAttribute("innerHTML");
        System.out.println(text);



        WebElement vcountt =driver.findElement(By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div[1]/div[1]/div/div[2]/div[2]/div/div/span"));
        String textt = vcountt.getAttribute("innerHTML");
        System.out.println(textt);**/

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
    
    public void Vtsettlement() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(VT).click();
        Thread.sleep(4000);
        driver.findElement(Amount).sendKeys("2500");
        driver.findElement(PhoneNo).sendKeys("7305632694");
        driver.findElement(Email).sendKeys("sarojiniu32@gmail.com");
        driver.findElement(Cardnumber).sendKeys("4111 1111 1111 1111");
        driver.findElement(CVV).sendKeys("999");
        driver.findElement(MMYY).sendKeys("12/25");
        driver.findElement(Cardholder).sendKeys("Platinum");
        driver.findElement(InvoiceNumber).sendKeys("12345");
   
		Thread.sleep(3000);
        driver.findElement(Process).click();
		Thread.sleep(3000);
        driver.findElement(Processtwo).click();
    		Thread.sleep(3000);
       driver.findElement(close).click();
       
	}
   public void txnsettlement() throws InterruptedException {
       Thread.sleep(3000);
       driver.findElement(By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[2]/div/div/div[2]/div[1]/ul/li[3]/a/span/span")).click();
       Thread.sleep(3000);
       driver.findElement(By.id("outlined-name")).sendKeys("1111");
       Thread.sleep(3000);
       driver.findElement(By.xpath("//button[@title='Options']")).click();
       Thread.sleep(3000);
       List<WebElement> terminal = driver.findElements(By.xpath("//ul[@role='menu']/li"));
       System.out.println("this open batch size is"+terminal.size());
       terminal.get(1).click();
       
   }
      
       public void closedbatchsett() throws InterruptedException {
       Thread.sleep(5000);
      // Map<String, Object> prefs = new HashMap<String, Object>();
      driver.findElement(Action).click();
      Thread.sleep(5000);
      driver.findElement(batchout).click();
      Thread.sleep(4000);
      driver.findElement(yes).click();
      Thread.sleep(7000);
      driver.findElement(ok).click();
      Thread.sleep(7000);
       }
       
       public void settlementrep() throws InterruptedException {
           Thread.sleep(5000);
           driver.findElement(By.xpath("//button[@title='Options']")).click();
           Thread.sleep(5000);
           List<WebElement> terminal = driver.findElements(By.xpath("//ul[@role='menu']/li"));
           //System.out.println("this settlement report size is"+terminal.size());
           //terminal.get(1).click();
           
           driver.findElement(By.xpath("//span[contains(text(),'Show Details')]")).click();
       }
       
       public void settlecount() throws InterruptedException {
           Thread.sleep(5000);
         WebElement scount =driver.findElement(By.xpath("//div[@role='presentation']//div[@aria-hidden='true']"));
   		String text1 = scount.getAttribute("innerHTML");
   		System.out.println(text1);
   		
   		//WebElement tcount =driver.findElement(By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div[3]/div[1]/div/div[2]/div"));
   		//String text2 = tcount.getAttribute("innerHTML");
   		//System.out.println(text2);
   		driver.findElement(By.xpath("//*[@id=\"body\"]/div[2]/div[3]/div/div[1]/h2/div/span/i")).click();
       }   
       
       
     //sanity yesterday date all filter transactions
       
       public void yestransactionsfilterclick() throws InterruptedException {
           Thread.sleep(4000);
           driver.findElement(tfilter).click();
           List<WebElement> filter = driver.findElements(list);
           for (WebElement ftype : filter) {
               if (ftype.getText().equals("Yesterday")) {
                   ftype.click();
                   break;
               }

           }
   }
       
       public void yestransactionsfilteringoptinclick() throws InterruptedException {
           Thread.sleep(4000);
           driver.findElement(muifilter).click();
           List<WebElement> fil = driver.findElements(list);

           for (WebElement ftyp : fil) {
               if (ftyp.getText().equals("Yesterday")) {
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
       
       public void yesExportValidation() throws InterruptedException {

           folder = new File(UUID.randomUUID().toString());
           folder.mkdir();

           Map<String, Object> prefs = new HashMap<String, Object>();
           prefs.put("profile.default_cntent_settings.popups", 0);
           prefs.put("download.default_directory", folder.getAbsolutePath());

           Thread.sleep(4000);
           driver.findElement(Action).click();
           driver.findElement(Export).click();

           File listOfFiles[] = folder.listFiles();
           
           for(File file : folder.listFiles())
           {
               file.delete();
           }

           folder.delete();
           
       }
       public void yestoshowapprovedtax() {
           boolean at=driver.findElement(Atax).isDisplayed();
           System.out.println(at);
           driver.findElement(Atax).click();
           
       }

       public void yesfilterwitthallTransactiontype() throws InterruptedException {
           Thread.sleep(3000);
           driver.findElement(muifilter).click();

           List<WebElement> fil = driver.findElements(list);

           for (WebElement ftyp : fil) {
               if (ftyp.getText().equals("Yesterday")) {
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
       
     //sanity MTD date all filter transactions
       
       public void MTDtransactionsfilterclick() throws InterruptedException {
           Thread.sleep(4000);
           driver.findElement(tfilter).click();
           List<WebElement> filter = driver.findElements(list);
           for (WebElement ftype : filter) {
               if (ftype.getText().equals("MTD")) {
                   ftype.click();
                   break;
               }

           }
   }
       
       public void MTDtransactionsfilteringoptinclick() throws InterruptedException {
           Thread.sleep(4000);
           driver.findElement(muifilter).click();
           List<WebElement> fil = driver.findElements(list);

           for (WebElement ftyp : fil) {
               if (ftyp.getText().equals("MTD")) {
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
       
       public void MTDExportValidation() throws InterruptedException {

           folder = new File(UUID.randomUUID().toString());
           folder.mkdir();

           Map<String, Object> prefs = new HashMap<String, Object>();
           prefs.put("profile.default_cntent_settings.popups", 0);
           prefs.put("download.default_directory", folder.getAbsolutePath());

           Thread.sleep(4000);
           driver.findElement(Action).click();
           driver.findElement(Export).click();

           File listOfFiles[] = folder.listFiles();
           
           for(File file : folder.listFiles())
           {
               file.delete();
           }

           folder.delete();
           
       }
       public void MTDtoshowapprovedtax() {
           boolean at=driver.findElement(Atax).isDisplayed();
           System.out.println(at);
           driver.findElement(Atax).click();
           
       }

       public void MTDfilterwitthallTransactiontype() throws InterruptedException {
           Thread.sleep(3000);
           driver.findElement(muifilter).click();

           List<WebElement> fil = driver.findElements(list);

           for (WebElement ftyp : fil) {
               if (ftyp.getText().equals("MTD")) {
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
       
//sanity last week date all filter transactions
       
       public void LWtransactionsfilterclick() throws InterruptedException {
           Thread.sleep(4000);
           driver.findElement(tfilter).click();
           List<WebElement> filter = driver.findElements(list);
           for (WebElement ftype : filter) {
               if (ftype.getText().equals("Last Week")) {
                   ftype.click();
                   break;
               }

           }
   }
       
       public void LWtransactionsfilteringoptinclick() throws InterruptedException {
           Thread.sleep(4000);
           driver.findElement(muifilter).click();
           List<WebElement> fil = driver.findElements(list);

           for (WebElement ftyp : fil) {
               if (ftyp.getText().equals("Last Week")) {
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
       
       public void LWExportValidation() throws InterruptedException {

           folder = new File(UUID.randomUUID().toString());
           folder.mkdir();

           Map<String, Object> prefs = new HashMap<String, Object>();
           prefs.put("profile.default_cntent_settings.popups", 0);
           prefs.put("download.default_directory", folder.getAbsolutePath());

           Thread.sleep(4000);
           driver.findElement(Action).click();
           driver.findElement(Export).click();

           File listOfFiles[] = folder.listFiles();
           
           for(File file : folder.listFiles())
           {
               file.delete();
           }

           folder.delete();
           
       }
       /**public void LWtoshowapprovedtax() {
           boolean at=driver.findElement(Atax).isDisplayed();
           System.out.println(at);
           driver.findElement(Atax).click();
           
       }*/

       public void LWfilterwitthallTransactiontype() throws InterruptedException {
           Thread.sleep(3000);
           driver.findElement(muifilter).click();

           List<WebElement> fil = driver.findElements(list);

           for (WebElement ftyp : fil) {
               if (ftyp.getText().equals("Last Week")) {
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

//sanity CURRENT week date all filter transactions
       
       public void CWtransactionsfilterclick() throws InterruptedException {
           Thread.sleep(4000);
           driver.findElement(tfilter).click();
           List<WebElement> filter = driver.findElements(list);
           for (WebElement ftype : filter) {
               if (ftype.getText().equals("Current Week")) {
                   ftype.click();
                   break;
               }

           }
   }
       
       public void CWtransactionsfilteringoptinclick() throws InterruptedException {
           Thread.sleep(4000);
           driver.findElement(muifilter).click();
           List<WebElement> fil = driver.findElements(list);

           for (WebElement ftyp : fil) {
               if (ftyp.getText().equals("Current Week")) {
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
       
       public void CWExportValidation() throws InterruptedException {

           folder = new File(UUID.randomUUID().toString());
           folder.mkdir();

           Map<String, Object> prefs = new HashMap<String, Object>();
           prefs.put("profile.default_cntent_settings.popups", 0);
           prefs.put("download.default_directory", folder.getAbsolutePath());

           Thread.sleep(4000);
           driver.findElement(Action).click();
           driver.findElement(Export).click();

           File listOfFiles[] = folder.listFiles();
           
           for(File file : folder.listFiles())
           {
               file.delete();
           }

           folder.delete();
           
       }
       /**public void LWtoshowapprovedtax() {
           boolean at=driver.findElement(Atax).isDisplayed();
           System.out.println(at);
           driver.findElement(Atax).click();
           
       }*/

       public void CWfilterwitthallTransactiontype() throws InterruptedException {
           Thread.sleep(3000);
           driver.findElement(muifilter).click();

           List<WebElement> fil = driver.findElements(list);

           for (WebElement ftyp : fil) {
               if (ftyp.getText().equals("Current Week")) {
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
//sanity Last 90 days date all filter transactions
       
//last month
       
//last 90days behind    
       
       //Sanity Check the View receipt and view profile option

       /*public void VTtxn() throws InterruptedException {
           Thread.sleep(3000);
           driver.findElement(VT).click();
           
           Thread.sleep(3000);
           driver.findElement(Amount).sendKeys("50000");
           driver.findElement(PhoneNo).sendKeys("7305632694");
           driver.findElement(Email).sendKeys("sarojiniu32@gmail.com");
           driver.findElement(Cardnumber).sendKeys("4111 1111 1111 1111");
           driver.findElement(CVV).sendKeys("999");
           driver.findElement(MMYY).sendKeys("12/25");
           driver.findElement(Cardholder).sendKeys("Platinum");
           driver.findElement(InvoiceNumber).sendKeys("12345");
      
   		Thread.sleep(3000);
           driver.findElement(Process).click();
   		Thread.sleep(3000);
           driver.findElement(Processtwo).click();
       		Thread.sleep(3000);
          driver.findElement(close).click();
          Thread.sleep(3000);
          
          driver.findElement(By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/div/header/div/ul/li[3]/div/span/button/span[1]/i")).click();
      driver.findElement(By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/div/header/div/ul/li[3]/div/div/div/span[3]")).click();        
       }
       
       public void txnadmin() throws InterruptedException {
           Thread.sleep(3000);
           driver.findElement(email).sendKeys("sarojini+adminvc@valorpaytech.com");
           Thread.sleep(3000);
           driver.findElement(password).sendKeys("Uat@123");
           Thread.sleep(3000);
           driver.findElement(continueButton).click();
           Thread.sleep(3000);
           driver.findElement(loginButton).click();
           Thread.sleep(5000);
           
           driver.findElement(By.xpath("//span[contains(text(),'Transactions')]")).click();
           Thread.sleep(3000);
          driver.findElement(By.id("outlined-name")).sendKeys("1111");
          Thread.sleep(3000);
          driver.findElement(By.xpath("//button[@title='Options']")).click();
          Thread.sleep(3000);
          driver.findElement(By.xpath("//span[contains(text(),'View Receipt')]")).click();
          Thread.sleep(3000);
          driver.findElement(By.xpath("//*[@id=\"body\"]/div[3]/div[3]/div/div/div[1]/h2/div/span[3]/i")).click();
          Thread.sleep(3000);
          driver.findElement(By.xpath("//button[@title='Options']")).click();
          Thread.sleep(3000);
          driver.findElement(By.xpath("//span[contains(text(),'View Profile')]")).click();
          Thread.sleep(3000);
          driver.findElement(By.xpath("//span[contains(text(),'Transactions')]")).click();
          Thread.sleep(3000);

          driver.findElement(By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/div/header/div/ul/li[3]/div/span/button/span[1]/i")).click();
          driver.findElement(By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/div/header/div/ul/li[3]/div/div/div/span[3]")).click();        
          
       }*/
       
       //txn types sale filter all
       public void txntypefilterclick() throws InterruptedException {
           Thread.sleep(4000);
           driver.findElement(tfilter).click();
           List<WebElement> filter = driver.findElements(list);
           for (WebElement ftype : filter) {
               if (ftype.getText().equals("Today")) {
                   ftype.click();
                   break;
               }

           }
   }
       
       public void txntypefilteringoptinclick() throws InterruptedException {
           Thread.sleep(4000);
           driver.findElement(muifilter).click();
           List<WebElement> fil = driver.findElements(list);

           for (WebElement ftyp : fil) {
               if (ftyp.getText().equals("SALE")) {
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
       
       public void txntypeExportValidation() throws InterruptedException {

           folder = new File(UUID.randomUUID().toString());
           folder.mkdir();

           Map<String, Object> prefs = new HashMap<String, Object>();
           prefs.put("profile.default_cntent_settings.popups", 0);
           prefs.put("download.default_directory", folder.getAbsolutePath());

           Thread.sleep(4000);
           driver.findElement(Action).click();
           driver.findElement(Export).click();

           File listOfFiles[] = folder.listFiles();
           
           for(File file : folder.listFiles())
           {
               file.delete();
           }

           folder.delete();
           
       }
       public void txntypeshowapprovedtax() {
           boolean at=driver.findElement(Atax).isDisplayed();
           System.out.println(at);
           driver.findElement(Atax).click();
           
       }

       public void txntypewitthallTransactiontype() throws InterruptedException {
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
       
       //card types filters all
       
       public void visafilterclick() throws InterruptedException {
           Thread.sleep(4000);
           driver.findElement(tfilter).click();
           List<WebElement> filter = driver.findElements(list);
           for (WebElement ftype : filter) {
               if (ftype.getText().equals("Today")) {
                   ftype.click();
                   break;
               }

           }
   }
       
       public void visafilteringoptinclick() throws InterruptedException {
           Thread.sleep(4000);
           driver.findElement(muifilter).click();
           List<WebElement> fil = driver.findElements(list);

           for (WebElement ftyp : fil) {
               if (ftyp.getText().equals("SALE")) {
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
       
       public void visaExportValidation() throws InterruptedException {

           folder = new File(UUID.randomUUID().toString());
           folder.mkdir();

           Map<String, Object> prefs = new HashMap<String, Object>();
           prefs.put("profile.default_cntent_settings.popups", 0);
           prefs.put("download.default_directory", folder.getAbsolutePath());

           Thread.sleep(4000);
           driver.findElement(Action).click();
           driver.findElement(Export).click();

           File listOfFiles[] = folder.listFiles();
           
           for(File file : folder.listFiles())
           {
               file.delete();
           }

           folder.delete();
           
       }
       public void visashowapprovedtax() {
           boolean at=driver.findElement(Atax).isDisplayed();
           System.out.println(at);
           driver.findElement(Atax).click();
           
       }

       public void visawitthallTransactiontype() throws InterruptedException {
           Thread.sleep(3000);
           driver.findElement(muifilter).click();

           List<WebElement> fil = driver.findElements(list);

           for (WebElement ftyp : fil) {
               if (ftyp.getText().equals("TODAY")) {
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

       //Transaction filter -> EPI -> Check the result
       
       public void EPIfilterclick() throws InterruptedException {
           Thread.sleep(4000);
           driver.findElement(tfilter).click();
           List<WebElement> filter = driver.findElements(list);
           for (WebElement ftype : filter) {
               if (ftype.getText().equals("Today")) {
                   ftype.click();
                   break;
               }

           }
   }
       
       public void EPIfilteringoptinclick() throws InterruptedException {
           Thread.sleep(4000);
           driver.findElement(muifilter).click();
           List<WebElement> fil = driver.findElements(list);

           for (WebElement ftyp : fil) {
               if (ftyp.getText().equals("SALE")) {
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
       
       public void EPIExportValidation() throws InterruptedException {

           folder = new File(UUID.randomUUID().toString());
           folder.mkdir();

           Map<String, Object> prefs = new HashMap<String, Object>();
           prefs.put("profile.default_cntent_settings.popups", 0);
           prefs.put("download.default_directory", folder.getAbsolutePath());

           Thread.sleep(4000);
           driver.findElement(Action).click();
           driver.findElement(Export).click();

           File listOfFiles[] = folder.listFiles();
           
           for(File file : folder.listFiles())
           {
               file.delete();
           }

           folder.delete();
           
       }
       public void EPIshowapprovedtax() {
           boolean at=driver.findElement(Atax).isDisplayed();
           System.out.println(at);
           driver.findElement(Atax).click();
           
       }

       public void EPIthallTransactiontype() throws InterruptedException {
           Thread.sleep(3000);
           driver.findElement(muifilter).click();

           List<WebElement> fil = driver.findElements(list);

           for (WebElement ftyp : fil) {
               if (ftyp.getText().equals("VISA")) {
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
       }
           public void episrfilterclick() throws InterruptedException {
        	   Thread.sleep(3000);
        	   driver.findElement(episrch).click();
               Thread.sleep(3000);
               List<WebElement> filstat= driver.findElements(list);
               for (WebElement fty : filstat) {
                   if (fty.getText().equals("EPI")) {
                       fty.click();
                       break;
                       
                   }
                   
               }
           driver.findElement(By.xpath("//span[normalize-space()='Search']")).click();

       }
          //transactions status declined
     
       
       public void saledeclfilterclick() throws InterruptedException {
           Thread.sleep(4000);
           driver.findElement(tfilter).click();
           List<WebElement> filter = driver.findElements(list);
           for (WebElement ftype : filter) {
               if (ftype.getText().equals("Today")) {
                   ftype.click();
                   break;
               }

           }
   }
       
       public void saledeclfilteringoptinclick() throws InterruptedException {
           Thread.sleep(4000);
           driver.findElement(muifilter).click();
           List<WebElement> fil = driver.findElements(list);

           for (WebElement ftyp : fil) {
               if (ftyp.getText().equals("SALE")) {
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
               if (fty.getText().equals("Declined")) {
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
       
       public void saledeclExportValidation() throws InterruptedException {

           folder = new File(UUID.randomUUID().toString());
           folder.mkdir();

           Map<String, Object> prefs = new HashMap<String, Object>();
           prefs.put("profile.default_cntent_settings.popups", 0);
           prefs.put("download.default_directory", folder.getAbsolutePath());

           Thread.sleep(4000);
           driver.findElement(Action).click();
           driver.findElement(Export).click();

           File listOfFiles[] = folder.listFiles();
           
           for(File file : folder.listFiles())
           {
               file.delete();
           }

           folder.delete();
           
       }
       public void saledeclshowapprovedtax() {
           boolean at=driver.findElement(Atax).isDisplayed();
           System.out.println(at);
           driver.findElement(Atax).click();
           
       }

       public void saledeclthallTransactiontype() throws InterruptedException {
           Thread.sleep(3000);
           driver.findElement(muifilter).click();

           List<WebElement> fil = driver.findElements(list);

           for (WebElement ftyp : fil) {
               if (ftyp.getText().equals("VISA")) {
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


       
       //sanity Check the Transaction type , Transaction icon , Card No scheme pop , Processor info icon
       
       public void VTTXN() throws InterruptedException {
           Thread.sleep(3000);
           driver.findElement(VT).click();
           
           Thread.sleep(3000);
           driver.findElement(Amount).sendKeys("50000");
           driver.findElement(PhoneNo).sendKeys("7305632694");
           driver.findElement(Email).sendKeys("sarojiniu32@gmail.com");
           driver.findElement(Cardnumber).sendKeys("4111 1111 1111 1111");
           driver.findElement(CVV).sendKeys("999");
           driver.findElement(MMYY).sendKeys("12/25");
           driver.findElement(Cardholder).sendKeys("Platinum");
           driver.findElement(InvoiceNumber).sendKeys("12345");
      
   		Thread.sleep(3000);
           driver.findElement(Process).click();
   		Thread.sleep(3000);
           driver.findElement(Processtwo).click();
       		Thread.sleep(3000);
          driver.findElement(close).click();
          Thread.sleep(3000);
          
          driver.findElement(By.xpath("//span[contains(text(),'Transactions')]")).click();
          Thread.sleep(3000);
         driver.findElement(By.id("outlined-name")).sendKeys("1111");
         Thread.sleep(3000);
                   
       }
 
       public void txntypetxicocardnschemeproc() throws InterruptedException {
           Thread.sleep(3000);
           driver.findElement(txntype).click();
           driver.findElement(txnicon).click();
           driver.findElement(cardno).click();
           driver.findElement(proicon).click(); 
           
           Thread.sleep(3000);
           driver.findElement(VT).click();

       
       }
       
       //export the open batch and verify the values
       
       public void exportopenbatch() throws InterruptedException {
    	   Thread.sleep(3000);
           driver.findElement(VT).click();
           
           Thread.sleep(3000);
           driver.findElement(Amount).sendKeys("50000");
           driver.findElement(PhoneNo).sendKeys("7305632694");
           driver.findElement(Email).sendKeys("sarojiniu32@gmail.com");
           driver.findElement(Cardnumber).sendKeys("4111 1111 1111 1111");
           driver.findElement(CVV).sendKeys("999");
           driver.findElement(MMYY).sendKeys("12/25");
           driver.findElement(Cardholder).sendKeys("Platinum");
           driver.findElement(InvoiceNumber).sendKeys("12345");
      
   		Thread.sleep(3000);
           driver.findElement(Process).click();
   		Thread.sleep(3000);
           driver.findElement(Processtwo).click();
       		Thread.sleep(3000);
          driver.findElement(close).click();
          Thread.sleep(3000);
          
          driver.findElement(By.xpath("//span[contains(text(),'Transactions')]")).click();
          Thread.sleep(3000);
          driver.findElement(By.id("outlined-name")).sendKeys("1111");
       Thread.sleep(3000);
       driver.findElement(By.xpath("//button[@title='Options']")).click();
       Thread.sleep(5000);
       List<WebElement> terminal = driver.findElements(By.xpath("//ul[@role='menu']/li"));
       System.out.println("this open batch size is"+terminal.size());
       terminal.get(1).click();
       
       Thread.sleep(6000);
       Map<String, Object> prefs = new HashMap<String, Object>();
      driver.findElement(Action).click();
      Thread.sleep(6000);
      driver.findElement(exportclk).click();
      Thread.sleep(3000);
      driver.findElement(By.xpath("(//span[contains(text(),'Export')])[2]")).click();
}
       
      
       //Check the values in OPEN BATCH , All the valid transactions should be there . Count and volume should be tally

       public void VTopen() throws InterruptedException {
           Thread.sleep(3000);
           driver.findElement(VT).click();
           
           Thread.sleep(5000);
           driver.findElement(Amount).sendKeys("1000");
           driver.findElement(PhoneNo).sendKeys("7305632694");
           driver.findElement(Email).sendKeys("sarojiniu32@gmail.com");
           driver.findElement(Cardnumber).sendKeys("4111 1111 1111 1111");
           driver.findElement(CVV).sendKeys("999");
           driver.findElement(MMYY).sendKeys("12/25");
           driver.findElement(Cardholder).sendKeys("Platinum");
           driver.findElement(InvoiceNumber).sendKeys("12345");
      
   		Thread.sleep(3000);
           driver.findElement(Process).click();
   		Thread.sleep(3000);
           driver.findElement(Processtwo).click();
       		Thread.sleep(3000);
          driver.findElement(close).click();
          Thread.sleep(3000);
          
          driver.findElement(By.xpath("//span[contains(text(),'Transactions')]")).click();
          Thread.sleep(3000);
         driver.findElement(By.id("outlined-name")).sendKeys("1111");
         Thread.sleep(3000);
         driver.findElement(By.xpath("//button[@title='Options']")).click();
         Thread.sleep(5000);
         List<WebElement> terminal = driver.findElements(By.xpath("//ul[@role='menu']/li"));
         System.out.println("this open batch size is"+terminal.size());
         terminal.get(1).click();
             }
      
      public void countandvolumetally() throws InterruptedException {
         
           
           Thread.sleep(5000);
           String volume = driver.findElement(By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div[1]/div/div[1]/div/div[2]/div/div/p")).getText();
           Thread.sleep(5000);
           System.out.println("\nVolume count on tile:"+volume);
           Thread.sleep(5000);
           String amount = driver.findElement(By.xpath("(//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[5]/p/span")).getText();
           Thread.sleep(5000);
           System.out.println("\npnation count is:"+ amount);    
           Thread.sleep(5000);
           if(amount.contains(volume)) {
               System.out.println("\nPagination and tile is count matched:" + volume);
           } else {
               System.out.println("Pagination and tile count is not matched");
           }     
  }
           
       
       
      //View the Closed batch of the transactions
       public void closedbatchtxn() throws InterruptedException {
             Thread.sleep(5000);
            driver.findElement(By.id("outlined-name")).sendKeys("1111");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//button[@title='Options']")).click();
            Thread.sleep(5000);
            List<WebElement> terminal = driver.findElements(By.xpath("//ul[@role='menu']/li"));
            System.out.println("this open batch size is"+terminal.size());
            terminal.get(1).click();
            Thread.sleep(6000);
           Map<String, Object> prefs = new HashMap<String, Object>();
           Thread.sleep(6000);
          driver.findElement(Action).click();
          Thread.sleep(6000);
          driver.findElement(batchout).click();
          Thread.sleep(3000);
          driver.findElement(yes).click();
          Thread.sleep(3000);
          driver.findElement(ok).click();
          Thread.sleep(5000);

           
               Thread.sleep(5000);
               driver.findElement(By.xpath("//button[@title='Options']")).click();
               Thread.sleep(5000);
               List<WebElement> terminal1 = driver.findElements(By.xpath("//ul[@role='menu']/li"));
               //System.out.println("this settlement report size is"+terminal.size());
               //terminal.get(1).click();
               Thread.sleep(5000);
               driver.findElement(By.xpath("//span[contains(text(),'Show Details')]")).click();
               Thread.sleep(5000);
 driver.findElement(By.xpath("//*[@id=\"body\"]/div[2]/div[3]/div/div[1]/h2/div/span/i")).click();
           }

           
       //Check whether Isswer refund available after settlement
     public void issuerefaftsett() throws InterruptedException {
    	 Thread.sleep(5000);
         driver.findElement(By.id("outlined-name")).sendKeys("1111");
         Thread.sleep(3000);
         driver.findElement(By.xpath("//button[@title='Options']")).click();
         Thread.sleep(5000);
         List<WebElement> terminal = driver.findElements(By.xpath("//ul[@role='menu']/li"));
         System.out.println("this open batch size is"+terminal.size());
         terminal.get(1).click();
         Thread.sleep(6000);
        Map<String, Object> prefs = new HashMap<String, Object>();
       driver.findElement(Action).click();
       Thread.sleep(6000);
       driver.findElement(batchout).click();
       Thread.sleep(3000);
       driver.findElement(yes).click();
       Thread.sleep(3000);
       driver.findElement(ok).click();
       Thread.sleep(5000);

        
            Thread.sleep(5000);
            driver.findElement(By.xpath("//button[@title='Options']")).click();
            Thread.sleep(5000);
            List<WebElement> terminal1 = driver.findElements(By.xpath("//ul[@role='menu']/li"));
           
            for (WebElement fty : terminal1) {
                if (fty.getText().equals("Issue Refund")) {
                    fty.click();
                    break;
                }         
            }    
            
            //System.out.println("this settlement report size is"+terminal.size());
            //terminal.get(1).click();
            driver.findElement(By.xpath("//span[contains(text(),'Show Details')]")).click();
            Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"body\"]/div[2]/div[3]/div/div[1]/h2/div/span/i")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//span[contains(text(),'Transactions')]")).click();
Thread.sleep(3000);
driver.findElement(By.id("outlined-name")).sendKeys("1111");
Thread.sleep(3000);
driver.findElement(By.xpath("//button[@title='Options']")).click();
Thread.sleep(5000);
List<WebElement> terminal3 = driver.findElements(By.xpath("//ul[@role='menu']/li"));


/*System.out.println("this issue refund is"+terminal3.size());
terminal3.get(1).click();*/
driver.findElement(By.xpath("//span[contains(text(),'Proceed')]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//span[contains(text(),'Close')]")).click();

        }   
     
     //Void the transaction and verify in the open batch -> Check count and Volume
     public void voidtxnopenbtch() throws InterruptedException {
    	 Thread.sleep(5000);
    	 driver.findElement(VT).click();
         
         Thread.sleep(5000);
         driver.findElement(Amount).sendKeys("5000");
         driver.findElement(PhoneNo).sendKeys("7305632694");
         driver.findElement(Email).sendKeys("sarojiniu32@gmail.com");
         driver.findElement(Cardnumber).sendKeys("4111 1111 1111 1111");
         driver.findElement(CVV).sendKeys("999");
         driver.findElement(MMYY).sendKeys("12/25");
         driver.findElement(Cardholder).sendKeys("Platinum");
         driver.findElement(InvoiceNumber).sendKeys("12345");
    
 		Thread.sleep(3000);
         driver.findElement(Process).click();
 		Thread.sleep(3000);
         driver.findElement(Processtwo).click();
     		Thread.sleep(3000);
        driver.findElement(close).click();
        Thread.sleep(3000);
        
        Thread.sleep(5000);
   	 driver.findElement(VT).click();
        
        Thread.sleep(5000);
        driver.findElement(Amount).sendKeys("5000");
        driver.findElement(PhoneNo).sendKeys("7305632694");
        driver.findElement(Email).sendKeys("sarojiniu32@gmail.com");
        driver.findElement(Cardnumber).sendKeys("4111 1111 1111 1111");
        driver.findElement(CVV).sendKeys("999");
        driver.findElement(MMYY).sendKeys("12/25");
        driver.findElement(Cardholder).sendKeys("Platinum");
        driver.findElement(InvoiceNumber).sendKeys("12345");
   
		Thread.sleep(3000);
        driver.findElement(Process).click();
		Thread.sleep(3000);
        driver.findElement(Processtwo).click();
    		Thread.sleep(3000);
       driver.findElement(close).click();
       Thread.sleep(3000);
        
        driver.findElement(By.xpath("//span[contains(text(),'Transactions')]")).click();
        Thread.sleep(3000);
       driver.findElement(By.id("outlined-name")).sendKeys("1111");
       
       Thread.sleep(3000);
       driver.findElement(By.xpath("//button[@title='Options']")).click();
       Thread.sleep(5000);
       List<WebElement> terminal = driver.findElements(By.xpath("//ul[@role='menu']/li"));
       System.out.println("this void txn is"+terminal.size());
       terminal.get(2).click();
       Thread.sleep(3000);

       driver.findElement(By.xpath("//span[contains(text(),'Proceed')]")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//span[contains(text(),'Close')]")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//span[contains(text(),'Transactions')]")).click();
       Thread.sleep(3000);
      driver.findElement(By.id("outlined-name")).sendKeys("1111");
      Thread.sleep(3000);
      driver.findElement(By.xpath("//button[@title='Options']")).click();
      Thread.sleep(5000);
      List<WebElement> ter = driver.findElements(By.xpath("//ul[@role='menu']/li"));
      System.out.println("this closed batch is"+ter.size());
      ter.get(1).click();
      Thread.sleep(3000);

           }
     
     public void countanddvolu() throws InterruptedException {
    	 Thread.sleep(5000);
    	 String aprvTxnCount1 = driver.findElement(By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div[1]/div/div[1]/div/div[2]/div/div/p")).getText();
         Thread.sleep(5000);
         System.out.println("\nVolume count on tile:"+aprvTxnCount1);
         Thread.sleep(5000);
         String pnation1 = driver.findElement(By.xpath("//span[contains(text(),'Swipe Amount: $')]")).getText();
         Thread.sleep(5000);
         System.out.println("\npnation count is:"+ pnation1);    
         Thread.sleep(5000);
         if(pnation1.contains(aprvTxnCount1)) {
             System.out.println("\nPagination1 and tile is count matched:" + aprvTxnCount1);
         } else {
             System.out.println("Pagination1 and tile count is not matched");
         }     
}
    	 
         
     
     //Compare the pagination, export and tile results

     public void pagination() throws InterruptedException {
    	 Thread.sleep(5000);
         String aprvTxnCount = driver.findElement(By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div[1]/div[1]/div/div/div[3]/div/div")).getText();
         Thread.sleep(5000);
         System.out.println("\nVolume count on tile:"+aprvTxnCount);
         Thread.sleep(5000);
         String pnation = driver.findElement(By.xpath("(//p[@class='MuiTypography-root MuiTablePagination-caption MuiTypography-body2 MuiTypography-colorInherit'])[2]")).getText();
         Thread.sleep(5000);
         System.out.println("\npnation count is:"+ pnation);    
         Thread.sleep(5000);
         if(pnation.contains(aprvTxnCount)) {
             System.out.println("\nPagination and tile is count matched:" + aprvTxnCount);
         } else {
             System.out.println("Pagination and tile count is not matched");
         }     
}

}

