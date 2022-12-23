package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MerchantManagementPage {

	private WebDriver driver;

	
	 private By addmerchant = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div[1]/div[2]/div/div/div/div[1]/div[6]/button/span[1]");
	 private By fulboard= By.xpath("//span[contains(text(),'Full Board')]");
	    private By DBA = By.name("dbaName");
	    private By LegalName = By.name("legalName");
	    private By FirstName = By.name("firstName");
	    private By LastName = By.name("lastName");
	    private By Email = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div/div/div/div[1]/div[3]/div/div[1]/div/div/div[5]/div/div/input");
	    private By UserName = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div/div/div/div[1]/div[3]/div/div[1]/div/div/div[6]/div/div/input");
	    private By Phone = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div/div/div/div[1]/div[3]/div/div[1]/div/div/div[7]/div/div/input");
	    private By Address = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div/div/div/div[1]/div[3]/div/div[1]/div/div/div[8]/div/div/input");
	    private By ZipCode = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div/div/div/div[1]/div[3]/div/div[1]/div/div/div[9]/div/div/input");
	    private By City = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div/div/div/div[1]/div[3]/div/div[1]/div/div/div[10]/div/div/input");
	    
	 // private By state =By.xpath("//div[@class='css-1hwfws3']");
	    private By timezone=By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div/div/div/div[1]/div[3]/div/div[1]/div/div/div[12]/div/div/div");
	private By nextBtn=By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div/div/div/div[1]/div[3]/div/div[2]");
	private By timezone2=By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div/div/div/div[1]/div[2]/div/div[1]/div/div/div[12]/div/div/div");
	private By MCCCODE =By.xpath("//button[@aria-label='Open']");
	private By Addstore =By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div/div/div/div[1]/div[2]/div/div[1]/div/div/div[16]");
	private By storenxtbtn =By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div/div/div/div[1]/div[2]/div/div[2]/div/button[2]");
	
	
    private By device = By.xpath("(//div[@role='button'])[3]");
    private By listofdevice = By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[5]");
    private By processor = By.xpath("(//div[@role='button'])[4]");
    private By listofprocessor = By.xpath("(//li[@role='option'])[1]");
    private By debitshare = By.xpath("//div[@id='mui-component-select-debitShare']");
    private By dbshareValue = By.xpath("(//li[@role='option'])[1]");
    
    
    private By mid = By.xpath("//input[@name='mid']");
    private By vNum = By.xpath("//input[@name='vNumber']");
    private By Stroeno = By.xpath("//input[@name='storeNo']");
    private By TermNo = By.xpath("//input[@name='termNo']");
    private By binNumber = By.xpath("//div[@id='mui-component-select-binnumber']");
    private By binlist = By.xpath("(//li[@role='option'])[1]");
    private By industry = By.xpath("//div[@id='mui-component-select-industry']");
    private By listofIndustry = By.xpath("(//ul[@role=\"listbox\"])/li[1]");
    private By agenBankNo = By.xpath("//input[@name=\"agentBank\"]");
    private By chain = By.xpath("(//input[@name='chain'])[1]");
    private By agent = By.xpath("(//input[@name='agent'])[1]");
    private By flat = By.xpath("(//span[contains(text(),'Flat fee amount $')])[1]");
    private By cusfee = By.xpath("//input[@name=\"surchargePercentage\"]");
    private By cashDiscount = By.xpath("(//span[contains(text(),'Cash Discount')])[2]");
    private By adddev = By.xpath("//span[contains(text(),'Add Device')]");
    private By addnoDevice = By.xpath("//span[contains(text(),'NO')]");
   private By boardmer = By.xpath("//span[contains(text(),'Onboard Merchant')]");
	
	public MerchantManagementPage(WebDriver driver) {
		this.driver = driver;
	}

	public void addmer() throws InterruptedException{
		Thread.sleep(3000);
        driver.findElement(addmerchant).click();
	}
	
	 public void fulboar() throws InterruptedException {
         Thread.sleep(3000);
         driver.findElement(fulboard).click();
         
	 }
	public void createISO(String dba, String LegalNa, String FirstNa, String LastNa, String Ema, String UserNa, String Phon, String Addres, String ZipCod, String Cit) throws InterruptedException {
		Thread.sleep(3000);
		
		driver.findElement(DBA).sendKeys(dba);
		driver.findElement(LegalName).sendKeys(LegalNa);
		driver.findElement(FirstName).sendKeys(FirstNa);
		driver.findElement(LastName).sendKeys(LastNa);
		driver.findElement(Email).sendKeys(Ema);
		driver.findElement(UserName).sendKeys(UserNa);
		driver.findElement(Phone).sendKeys(Phon);
		driver.findElement(Address).sendKeys(Addres);
		driver.findElement(ZipCode).sendKeys(ZipCod);
		driver.findElement(City).sendKeys(Cit);
		
		
	}
		public void tz2() throws InterruptedException {
	        driver.findElement(timezone).click();
	    
	        List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
	           System.out.println("this size is"+allOptions.size());
	            allOptions.get(1).click();
	        
	   }
		
		public void tz3() throws InterruptedException {
	        driver.findElement(timezone2).click();
	    
	        List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
	           System.out.println("this size is"+allOptions.size());
	            allOptions.get(1).click();
	        
	   }
		
		
		 /*
         * Select select = new Select(driver.findElement(state));
         * select.selectByValue("XX - India");
         */

	public void clickNextButton() throws InterruptedException {
		Thread.sleep(3000);
        driver.findElement(nextBtn).click();
        
	}
	
	public void mccBtn() throws InterruptedException {
		Thread.sleep(3000);
	driver.findElement(MCCCODE).click();
    Actions action = new Actions(driver);
  action.sendKeys("0763 - AGRICULTURAL CO-OPERATIVE",Keys.ARROW_DOWN,Keys.ENTER).perform();
        
	}	
	
	public void addstoress() throws InterruptedException {
		Thread.sleep(3000);
        driver.findElement(Addstore).click();
        
	}
	
	public void stonxtbtn() throws InterruptedException {
		Thread.sleep(3000);
        driver.findElement(storenxtbtn).click();
        
	}	
	
	public void choicetoSelectDevice() {
        driver.findElement(device).click();
        driver.findElement(listofdevice).click();
        
    }
    
    public void choicetoSelectProcessor() {
        driver.findElement(processor).click();
        driver.findElement(listofprocessor).click();
    }
    
    public void adDebitshare() {
        
        driver.findElement(debitshare).click();
        driver.findElement(dbshareValue).click();
        
    }
    
    public void cashDiscountDetails(String Mid, String Vnumber, String Storeno, String Termno, String Abanknum,
            String ChainNum, String Agent) {
        driver.findElement(mid).sendKeys(Mid);
        driver.findElement(vNum).sendKeys(Vnumber);
        driver.findElement(Stroeno).sendKeys(Storeno);
        driver.findElement(TermNo).sendKeys(Termno);
        driver.findElement(binNumber).click();;
        driver.findElement(binlist).click();
        driver.findElement(industry).click();;
        driver.findElement(listofIndustry).click();
        driver.findElement(agenBankNo).sendKeys(Abanknum);
        driver.findElement(chain).sendKeys(ChainNum);
        driver.findElement(agent).sendKeys(Agent);
        driver.findElement(flat).click();
        driver.findElement(cusfee).sendKeys("80.00");
        driver.findElement(cashDiscount).click();
        
        
       driver.findElement(adddev).click();
        driver.findElement(addnoDevice).click();
        driver.findElement(boardmer).click();
        
    }
  	
}