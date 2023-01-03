package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UserSubisoPage {
	
	private WebDriver driver;
	
	private By userMgtadd = By.xpath("//span[contains(text(),'Add')]");
    private By umaddCust = By.xpath("//span[contains(text(),'Add SUB ISO')]");
    private By DBAName = By.xpath("//input[@id='DBA']");
    private By email = By.xpath("//input[@id='email']");
    private By UserName = By.xpath("//input[@id='user_Name']");
    private By Phone = By.xpath("//input[@id='Phone']");
    private By firstName = By.id("firstName");
    private By lastName = By.xpath("//input[@id='lastName']");
    private By address = By.xpath("//input[@id='address']");
    private By zipcode = By.xpath("//input[@name='zipCode']");
    private By city = By.xpath("//input[@id='city']");
    private By state =By.xpath("//div[@class='css-1hwfws3']");
   private By nextBtn = By.xpath("//span[contains(text(),'Next')]");
    private By selectmodule = By.xpath("//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiInputBase-input MuiInput-input']");
    private By module = By.xpath("//input[@value='jason']");
    private By submitbutton  = By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained jr-btn next-btn MuiButton-containedPrimary'][2]");
    
    public UserSubisoPage(WebDriver driver) {
    	this.driver = driver;
    }
    
    public void add1() throws InterruptedException {
    	Thread.sleep(3000);
    	driver.findElement(userMgtadd).click();
    }
    
    public void addSubIso() throws InterruptedException {
    	Thread.sleep(3000);
    	driver.findElement(umaddCust).click();
    	
    }
    
    public void createISO(String DBAnam, String mail, String username, String phoneno, String firstname, String lastname, String addres, String zipco, String cit) throws InterruptedException {
            

       Thread.sleep(3000);
        driver.findElement(DBAName).sendKeys(DBAnam);
        driver.findElement(email).sendKeys(mail);
        driver.findElement(UserName).sendKeys(username);
        driver.findElement(Phone).sendKeys(phoneno);
        driver.findElement(firstName).sendKeys(firstname);
        driver.findElement(lastName).sendKeys(lastname);
        driver.findElement(address).sendKeys(addres);
        driver.findElement(zipcode).sendKeys(zipco);
        driver.findElement(city).sendKeys(cit);
        /*
         * Select select = new Select(driver.findElement(state));
         * select.selectByValue("XX - India");
         */
        
        
   }
    
    public void clickNextButton() throws InterruptedException {
    	Thread.sleep(3000);
    	driver.findElement(nextBtn).click();
    	
    driver.findElement(selectmodule).click();
    Thread.sleep(3000);
   driver.findElement(By.xpath("(//li[@role='option'])[1]")).click();
   Actions act = new Actions(driver);

   act.sendKeys(Keys.TAB).build().perform();
Thread.sleep(3000);
    }
  
    public void selectallmodule() throws InterruptedException {
    	Thread.sleep(3000);
    	driver.findElement(module).click();
    }
    

}