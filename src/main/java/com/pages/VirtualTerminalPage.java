
package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class VirtualTerminalPage {
	
	private WebDriver driver;

	//sale txn
	    private By Amount = By.name("amount");
	    private By PhoneNo = By.name("phoneNo");
	    private By Email = By.name("email");
	    private By Cardnumber = By.name("number");
	    private By CVV = By.name("cvc");
	    private By MMYY = By.name("expiry");
	    private By Cardholder = By.name("_chn");
	    private By InvoiceNumber = By.name("invoiceNumber");
	   // private By StreetNo = By.name("streetNo");
	    //private By StreetName = By.name("streetName");
	    //private By Unit = By.name("streetUnit");
	    //private By Zipcode = By.name("zipCode");
	    //private By City = By.name("city");
        private By Process = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div/div/div/div/div/div/div[2]/div/div[8]/div/button/span[1]/span");
	    private By Processtwo = By.xpath("//*[@id=\"body\"]/div[2]/div[3]/div/div[3]/button[2]/span[1]/span");
	    private By close = By.xpath("//*[@id=\"removeArea\"]/div[3]/div/div/div[2]/button[2]/span[1]/span");
	    
	    //Authorization
	    private By Authoriz = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div/div/div/div/div/div/div[1]/div[1]/div/div[1]/label[2]/span[1]/span[1]/input");
	    private By Processa = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div/div/div/div/div/div/div[2]/div/div[7]/div/button/span[1]/span");
	    private By processat = By.xpath("//*[@id=\"body\"]/div[2]/div[3]/div/div[3]/button[2]/span[1]/span");
	    private By closea = By.xpath("//*[@id=\"removeArea\"]/div[3]/div/div/div[2]/button[2]/span[1]/span");
	    
	    //completion
	    
	    private By txn = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[2]/div/div/div[2]/div[1]/ul/li[3]/a/span/span");
	    private By proceedcap = By.xpath("//span[contains(text(),'Proceed')]");
	    
	    //refund
	    private By vt = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[2]/div/div/div[2]/div[1]/ul/li[4]/a/span/span");
	    private By refund = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div/div/div/div/div/div/div[1]/div[1]/div/div[1]/label[3]/span[1]/span[1]/input");
	    private By processref = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div/div/div/div/div/div/div[2]/div/div[7]/div/button/span[1]");
	    
	    private By gmail = By.id("identifierId");
	    private By pwd = By.name("Passwd");
	    
	    private By cmo = By.xpath("//span[@class='y2']");
		//private By cmo = By.xpath("//tr[@class='zA zE x7']//span[@class='y2']");
		//private By aprs=By.xpath("//span[contains(text(),'Proceed')]");
	    private By prcref = By.xpath("//*[@id=\"body\"]/div[2]/div[3]/div/div[3]/button[2]/span[1]/span");
	    private By closeref = By.xpath("//*[@id=\"removeArea\"]/div[3]/div/div/div[2]/button[2]/span[1]/span");
	    
	    //Einvoice
	    private By Einvoice = By.xpath("//input[@value='3']");
	    private By Expirydate = By.id("date-picker-inline");
	    private By sendeinvoice = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div/div/div/div/div/div/div[2]/div/div/div[4]/button");
	    private By inprs = By.xpath("//*[@id=\"body\"]/div[2]/div[3]/div/div[3]/button[2]");
	    
	    //cash
	    
	    private By cash = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div/div/div/div/div/div/div[1]/div[1]/div/div/label[5]/span[1]/span[1]/input");
	  
	    
	    
	    //paynow
	    
	   // private By payNL = By.xpath("//span[@title='PayNowLink']//input[@type='checkbox']");
		//private By flex = By.xpath("//div[@class='col-4']//span[@title='PayNowLink']//input[@type='checkbox']");
		//private By nVE = By.xpath("//span[contains(@title,'Never Expire')]//input[contains(@type,'checkbox')]");
		//private By custName	= By.name("customerName");
		//private By invcn	= By.name("invoiceNumber");
		//private By sendPay = By.xpath("//span[normalize-space()='Send PayNow']");
		//private By decrpt = By.xpath("//input[contains(@name,'description')]");
		//private By ok = By.xpath("//span[contains(text(),'OK')]");
	    
	    		 
	public VirtualTerminalPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void createVt(String amt, String Phno, String mail, String cardno, String cvv, String mmyy, String cardhold, String invoiceno) throws InterruptedException{
		Thread.sleep(3000);
		
		
        driver.findElement(Amount).sendKeys(amt);
        driver.findElement(PhoneNo).sendKeys(Phno);
        driver.findElement(Email).sendKeys(mail);
        driver.findElement(Cardnumber).sendKeys(cardno);
        driver.findElement(CVV).sendKeys(cvv);
        driver.findElement(MMYY).sendKeys(mmyy);
        driver.findElement(Cardholder).sendKeys(cardhold);
        driver.findElement(InvoiceNumber).sendKeys(invoiceno);
       // driver.findElement(StreetNo).sendKeys(strno);
        //driver.findElement(StreetName).sendKeys(strname);
        //driver.findElement(Unit).sendKeys(unit);
        //driver.findElement(Zipcode).sendKeys(zipc);
        //driver.findElement(City).sendKeys(invoicn);
	
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
	
        public void authoriz() throws InterruptedException{
    		Thread.sleep(3000);
       driver.findElement(Authoriz).click();
       driver.findElement(Amount).sendKeys("5200");
       driver.findElement(Cardnumber).sendKeys("6011000993026909");
       driver.findElement(MMYY).sendKeys("12/26");
        }
        
        
        public void procesA() throws InterruptedException{
       driver.findElement(Processa).click();
       driver.findElement(processat).click();
	}   
        public void Closea() throws InterruptedException{
        	driver.findElement(closea).click();
        }
        
        public void Txn() throws InterruptedException{
    		Thread.sleep(3000);
       driver.findElement(txn).click();
      Thread.sleep(3000);
       driver.findElement(By.id("outlined-name")).sendKeys("6909");
       Thread.sleep(3000);
       driver.findElement(By.xpath("//button[@title='Options']")).click();
       Thread.sleep(3000);
       List<WebElement> terminal = driver.findElements(By.xpath("//ul[@role='menu']/li"));
        System.out.println("this capture auth size is"+terminal.size());
        terminal.get(2).click();
        Thread.sleep(3000);
        driver.findElement(proceedcap).click();
        Thread.sleep(3000);
        driver.findElement(closea).click(); 
        Thread.sleep(3000);
        driver.findElement(vt).click();
        }   
        
        
        public void Refund() throws InterruptedException{
    		Thread.sleep(3000);
       driver.findElement(refund).click();
       Thread.sleep(3000);
       driver.findElement(Amount).sendKeys("8000");
       Thread.sleep(3000);
       driver.findElement(PhoneNo).sendKeys("7305632694");
       Thread.sleep(3000);
       driver.findElement(Email).sendKeys("sarojinic867@gmail.com");
       Thread.sleep(3000);
       driver.findElement(Cardnumber).sendKeys("4111 1111 1111 1111");
       Thread.sleep(3000);
       driver.findElement(CVV).sendKeys("999");
       Thread.sleep(3000);
       driver.findElement(MMYY).sendKeys("12/25");
       Thread.sleep(3000);
       driver.findElement(processref).click();
       Thread.sleep(3000);
       String yesWindow= driver.getWindowHandle();
	    Thread.sleep(30000);
	    
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.open()");
	  //  driver.get("https://accounts.google.com/");
	    
	    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(30000);
         driver.get("https://mail.google.com/mail/u/0/#inbox");
       
		driver.findElement(gmail).sendKeys("sarojiniu32@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		Thread.sleep(3000);
		driver.findElement(pwd).sendKeys("Welcome1#");
		Thread.sleep(3000);
		driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]")).click();
		Thread.sleep(25000);
        
        driver.findElement(cmo).click();
        Thread.sleep(6000);
		WebElement txt =driver.findElement(By.xpath("//tbody/tr/td[@bgcolor='transparent']/p[1]"));
		String text=txt.getAttribute("innerHTML");
		System.out.println(text);
		
	driver.switchTo().window(yesWindow);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"alert-dialog-description\"]/div/div[2]/div[4]/div/div/input")).sendKeys(text);
	driver.findElement(prcref).click();
	Thread.sleep(6000);
	driver.findElement(closeref).click();
		
		}
        public void einvoice() throws InterruptedException{
        	Thread.sleep(3000);
        	driver.findElement(Einvoice).click();
        	driver.findElement(Amount).sendKeys("7500");
        	driver.findElement(PhoneNo).sendKeys("7305632694");
        	driver.findElement(Email).sendKeys("sarojiniu32@gmail.com");
        	driver.findElement(Expirydate).sendKeys("12/20/2022");
        	driver.findElement(sendeinvoice).click();
        	driver.findElement(inprs).click();
        	Thread.sleep(3000);
        	driver.navigate().refresh();
        	Thread.sleep(3000);	
        	Thread.sleep(20000);
		    JavascriptExecutor jse = (JavascriptExecutor)driver;
		    jse.executeScript("window.open()");
		  //  driver.get("https://accounts.google.com/");
		    
		    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	        driver.switchTo().window(tabs.get(1));
	        Thread.sleep(3000);	
	         driver.get("https://mail.google.com/mail/u/0/#inbox");
		    
	         Thread.sleep(3000);	
			for(int i = 0; i<20; i++) {
				Thread.sleep(3000);	
				
			driver.findElement(By.xpath("//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]")).click();
			}
			Thread.sleep(3000);
			driver.findElement(By.xpath("//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]")).click();
			//for(int i = 0; i<5; i++) {
			Thread.sleep(40000);
			driver.findElement(By.xpath("//body[1]/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/span[1]")).click();
			//}
			//driver.switchTo().window(null);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[normalize-space()='Pay Now']")).click();
			Thread.sleep(6000);
			
			ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
			  driver.switchTo().window(tabs1.get(3));
			  driver.findElement(By.name("cardnumber")).sendKeys("4111111111111111");
			 // List<WebElement> toAct =driver.findElements(By.id("expiry_month"));
			  Select my = new Select(driver.findElement(By.id("expiry_month")));
			  my.selectByIndex(5);
			  Select yyyy = new Select(driver.findElement(By.id("expiry_year")));
			  yyyy.selectByIndex(5);
			  driver.findElement(By.name("cvv")).sendKeys("999");
			  Thread.sleep(3000);
			  driver.findElement(By.name("cardholdername")).sendKeys("Platinum");
			  Thread.sleep(3000);
			  driver.findElement(By.id("phone")).sendKeys("7305632694");
			  Thread.sleep(3000);
			// driver.findElement(By.id("tipManual")).sendKeys("1000");
			driver.findElement(By.name("submit")).click();
			}
        
        //public void paynow() throws Exception { 
    		//ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
    		 // driver.switchTo().window(tabs1.get(0));
    		//driver.findElement(payNL).click();
    		//driver.findElement(Amount).sendKeys("1020");
    		//driver.findElement(PhoneNo).sendKeys("7305632694");
    		//driver.findElement(Email).sendKeys("sarojiniu32@gmail.com");
    		//driver.findElement(custName).sendKeys("paysaro");
    		//driver.findElement(invcn).sendKeys("123456789");
    		//driver.findElement(decrpt).sendKeys("paytxn");
    		//driver.findElement(sendPay).click();
    		//driver.findElement(By.xpath("//span[contains(text(),'Process')]")).click();
    		//driver.findElement(ok).click();
    		//driver.findElement(By.xpath("//span[normalize-space()='copy link']")).click();
    	//}
        
        public void Cash() throws InterruptedException{
        	driver.findElement(cash).click();
        	driver.findElement(Amount).sendKeys("40000");
        	driver.findElement(PhoneNo).sendKeys("7305632694");
        	driver.findElement(Email).sendKeys("sarojiniu32@gmail.com");
        	driver.findElement(By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div/div/div/div/div/div/div[2]/div/div/div/div[3]/button/span[1]/span")).click();
        	
        }
        
        }
        
	
		
		
       
     
	
      