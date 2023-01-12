package com.pages;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyTicketsPage {
	
	private WebDriver driver;
	
    private By Action = By.xpath("//span[contains(text(),'Action')]");
    private By newticket = By.xpath("//span[contains(text(),'New Ticket')]");
	private By selectsub = By.xpath("//*[@id=\"body\"]/div[2]/div[3]/div/div/div[2]/button/span[1]");
	private By Hardware = By.xpath("//*[@id=\"body\"]/div[3]/div[3]/ul/li[1]");
	private By Descr = By.xpath("//*[@id=\"body\"]/div[2]/div[3]/div/div/div[2]/div[1]/textarea[1]");
	private By submit = By.xpath("//span[contains(text(),'SUBMIT')]");
	private By logout = By.xpath("//span[contains(text(),'Logout')]");
	private By userniso = By.xpath("//input[@id='emailtype']");
	private By pwdiso = By.xpath("//input[@id='passwordtype']");
	private By notify = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/div/header/div/ul/li[2]/div/span/button/span[1]/span");
    private By loginButton = By.xpath("//span[contains(text(),'YES')]");
    private By newtic = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/div/header/div/ul/li[2]/div/div/div[2]/div[1]/ul/li[1]/div[2]/p");
    private By open = By.xpath("//span[contains(text(),'OPEN')]");
    private By update = By.xpath("//span[contains(text(),'UPDATE')]");
    
	
	//Create the ticket from Portal -> Check the notification - > Check Email arrival to ISO and SUB ISO

	public MyTicketsPage(WebDriver driver) {
		this.driver = driver; 
	}
	
	 public void createTicket() throws InterruptedException {
         Thread.sleep(3000);
        
         driver.findElement(Action).click();
         driver.findElement(newticket).click();
         Thread.sleep(3000);
         
        
         driver.findElement(selectsub).click();
         driver.findElement(Hardware).click();
         Thread.sleep(3000);
         driver.findElement(Descr).sendKeys("Hardware Issue");
         driver.findElement(submit).click();
         Thread.sleep(3000);
        
         driver.findElement(By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/div/header/div/ul/li[3]/div/span")).click();
         driver.findElement(logout).click();
	 }
	  
	 //check notification of ISO, login iso for resolved
	
	 public void notifyISO() throws InterruptedException {
         Thread.sleep(3000);
         driver.findElement(userniso).sendKeys("sarojini+isovl110@valorpaytech.com");
         driver.findElement(pwdiso).sendKeys("Uat@123");
         driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
         Thread.sleep(3000);
         driver.findElement(loginButton).click();
         Thread.sleep(3000);
          driver.findElement(notify).click();
          driver.findElement(newtic).click();
          Thread.sleep(3000);
          driver.findElement(By.xpath("//button[@title='Options']")).click();
         List<WebElement> terminal = driver.findElements(By.xpath("//ul[@role='menu']/li"));
         driver.findElement(By.xpath("(//span[contains(text(),'Edit')])[2]")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//*[@id=\"body\"]/div[2]/div[3]/div/div/div[2]/div[2]/textarea[1]")).sendKeys("Hardware Issue Resolved");
         Thread.sleep(3000);
         
        // driver.findElement(newtic).click();
         
         //list - open ticket
	 }
	 
	 public void ticketstatus() throws InterruptedException {
		 Thread.sleep(3000);
         driver.findElement(open).click();
         
         List<WebElement> ter = driver.findElements(By.xpath("//ul[@role='menu']/li"));
               for(WebElement t : ter) {
            	   if(t.getText().equals("OPEN")) {
            		   t.click();
            		   break;
            	   }
            	   driver.findElement(update).click();
               }
               
               
              /* driver.findElement(open).click();
               List<WebElement> teri = driver.findElements(By.xpath("//ul[@role='menu']/li"));
               for(WebElement t : teri) {
            	   if(t.getText().equals("OPEN")) {
            		   t.click();
            		   break;*/
            	   
             
        
      
	 }
		


}