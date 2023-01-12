package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver driver;
    
    private By userMgtclick = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[2]/div/div/div[2]/div[1]/ul/li[2]/a/span/span");
    
    private By merchantmanagementclk = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[2]/div/div/div[2]/div[1]/ul/li[3]/a/span/span");
    
    private By virtualterclk = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[2]/div/div/div[2]/div[1]/ul/li[4]/a/span/span");
    
    private By transacclk = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[2]/div/div/div[2]/div[1]/ul/li[3]/a/span/span");
    
    private By Myticketclk = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[2]/div/div/div[2]/div[1]/ul/li[10]/a/span/span");
    
    public HomePage(WebDriver driver) {
        this.driver = driver;
        
    }
    
    public String getHomePageTitle() {
        return driver.getTitle();
    }
    
   
    public UseraddPage umclick() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(userMgtclick).click();
        return new UseraddPage(driver);
        
    }
    public UserSubisoPage us() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(userMgtclick).click();
        return new UserSubisoPage(driver);
        
    }

	public MerchantManagementPage unclick() throws InterruptedException {
		Thread.sleep(3000);
        driver.findElement(merchantmanagementclk).click();
        return new MerchantManagementPage(driver);
	}
	
	public VirtualTerminalPage uclick() throws InterruptedException {
		Thread.sleep(3000);
        driver.findElement(virtualterclk).click();
        return new VirtualTerminalPage(driver);
	}
	
	public TransactionsPage tclick() throws InterruptedException {
	Thread.sleep(3000);
       driver.findElement(transacclk).click();
        return new TransactionsPage(driver);
	}
	
	public MyTicketsPage mtclick() throws InterruptedException {
		Thread.sleep(3000);
	       driver.findElement(Myticketclk).click();
	        return new MyTicketsPage(driver);
		}
	
}