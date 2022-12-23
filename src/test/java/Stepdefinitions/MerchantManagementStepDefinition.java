package Stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.MerchantManagementPage;
import com.qa.factory.DriverFactory;
import com.qa.util.ExcelReader;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class MerchantManagementStepDefinition {
	
	private LoginPage  loginPage = new LoginPage(DriverFactory.getDriver());
    private MerchantManagementPage merchantmanagementpage;
    private HomePage homePage;
	
	@Given("FullBoard is on MerchantManagementPage")
	public void full_board_is_on_merchant_management_page(DataTable credTable) throws InterruptedException {
	    
		List<Map<String, String>> credList = credTable.asMaps();
        String userName = credList.get(0).get("username");
        String password = credList.get(0).get("password");
        
        
         DriverFactory.getDriver()
         .get("https://demo.valorpaytech.com/signin");
         homePage = loginPage.doLogin(userName, password);
         
         merchantmanagementpage =homePage.unclick();
 
		
	}
	

	@When("User clicks add button for merchant")
	public void User_clicks_add_button_for_merchant() throws InterruptedException {
		merchantmanagementpage.addmer();
	
}
		
	@When("user click full board button")
	public void user_click_full_board_button() throws InterruptedException {
		merchantmanagementpage.fulboar();
	}

	@When("User fill the contact form from given sheetname {string} and rownumber {int}")
	public void User_fill_the_contact_form_from_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException { 
	    
		ExcelReader reader = new ExcelReader();
        List<Map<String,String>> testData=
                reader.getData("C:\\Users\\sarojini\\Downloads\\Merchant Testing.xlsx", SheetName);
		
        String DBAName = testData.get(rowNumber).get("DBA");
        String LegalName = testData.get(rowNumber).get("LegalNa");
        String firstName = testData.get(rowNumber).get("firstna");
        String lastName = testData.get(rowNumber).get("lastna");
        String email = testData.get(rowNumber).get("mails");
        String UserName = testData.get(rowNumber).get("userna");
        String Phone = testData.get(rowNumber).get("phon");
        String address = testData.get(rowNumber).get("addre");
        String zipcode = testData.get(rowNumber).get("zipc");
        String city = testData.get(rowNumber).get("ci");
       
        
        //String Timezone = testData.get(rowNumber).get("Timez");
        
        
        merchantmanagementpage.createISO(DBAName, LegalName, firstName, lastName, email, UserName, Phone, address, zipcode, city);
       
	}
	
	@When("User click Timezone button")
	public void user_click_timezone_button() throws InterruptedException {
		merchantmanagementpage.tz2();
		
	}
	
	@When("User click the contact next button")
	public void user_click_the_contact_next_button() throws InterruptedException {
		merchantmanagementpage.clickNextButton();
		
	}
	
	@When("User click Timezone2 button")
	public void user_click_timezone2_button() throws InterruptedException {
		merchantmanagementpage.tz3();
	}
	
@When("User click MCC CODE button")
public void user_click_mcc_code_button() throws InterruptedException {
	merchantmanagementpage.mccBtn();
}

@When("User add store button")
public void user_add_store_button() throws InterruptedException {
	merchantmanagementpage.addstoress();
}

@When("user click the store detail next button")
public void user_click_the_store_detail_next_button() throws InterruptedException {
	merchantmanagementpage.stonxtbtn();
}

@When("user select the device from the list")
public void user_select_the_device_from_the_list() {
	merchantmanagementpage.choicetoSelectDevice();
}

@When("user select the processor")
public void user_select_the_processor() {
	merchantmanagementpage.choicetoSelectProcessor();
}


@When("add debitshare")
public void add_debitshare() {
	merchantmanagementpage.adDebitshare();
    
}

@When("user fil the cash discount values from the sheetname {string} and rownumber {int}")
public void user_fil_the_cash_discount_values_from_the_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException {
     ExcelReader reader = new ExcelReader();
     List<Map<String,String>> testData=
             reader.getData("C:\\Users\\sarojini\\Downloads\\Merchant Testing.xlsx", SheetName);

     String mid = testData.get(rowNumber).get("merchantID");
     String vNum = testData.get(rowNumber).get("vNumb");
     String Stroeno = testData.get(rowNumber).get("stroeNum");
     String TermNo = testData.get(rowNumber).get("termNoo");
     String agenBankNo = testData.get(rowNumber).get("agenBnum");
     String chain = testData.get(rowNumber).get("chainNum");
     String agent = testData.get(rowNumber).get("Agentdetail");
    
     
     merchantmanagementpage.cashDiscountDetails(mid, vNum, Stroeno, TermNo, agenBankNo, chain, agent);
}

}