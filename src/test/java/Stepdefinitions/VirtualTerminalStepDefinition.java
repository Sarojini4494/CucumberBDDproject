package Stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.VirtualTerminalPage;
import com.qa.factory.DriverFactory;
import com.qa.util.ExcelReader;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class VirtualTerminalStepDefinition {
	
	private LoginPage  loginPage = new LoginPage(DriverFactory.getDriver());
    private VirtualTerminalPage virtualterminalpage;
    private HomePage homePage;
	
    @Given("FullBoard is on VirtualTerminalPage")
    public void full_board_is_on_virtual_terminal_page(DataTable credTable) throws InterruptedException {
	    
		List<Map<String, String>> credList = credTable.asMaps();
        String userName = credList.get(0).get("username");
        String password = credList.get(0).get("password");
        
        
         DriverFactory.getDriver()
         .get("https://uat.valorpaytech.com/signin");
         homePage = loginPage.doLogin(userName, password);
         
         virtualterminalpage =homePage.uclick();
 
		
	}
	

    @When("User fill the VT form from given sheetname {string} and rownumber {int}")
    public void user_fill_the_vt_form_from_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException {
   
    	ExcelReader reader = new ExcelReader();
        List<Map<String,String>> testData=
                reader.getData("C:\\Users\\sarojini\\Downloads\\VirtualTerminal Testing.xlsx", SheetName);
		
        String Amount = testData.get(rowNumber).get("Amt");
        String PhoneNo = testData.get(rowNumber).get("Phono");
        String Email = testData.get(rowNumber).get("Emails");
        String Cardnumber = testData.get(rowNumber).get("Cardnum");
        String CVV = testData.get(rowNumber).get("Cvv");
        String MMYY = testData.get(rowNumber).get("MmYy");
        String Cardholder = testData.get(rowNumber).get("CardHoldername");
        String InvoiceNumber = testData.get(rowNumber).get("invoicenumber");
        //String StreetNo= testData.get(rowNumber).get("streetno");
        //String StreetName= testData.get(rowNumber).get("streetname");
        //String Unit = testData.get(rowNumber).get("unit");
        //String Zipcode = testData.get(rowNumber).get("zipco");
        //String City = testData.get(rowNumber).get("city");
        
        
      
         
        virtualterminalpage.createVt(Amount, PhoneNo, Email, Cardnumber, CVV, MMYY, Cardholder, InvoiceNumber);
    	
    	
    	
    }

    @When("User click a Process button")
    public void user_click_a_process_button() throws InterruptedException {
    	virtualterminalpage.process();	
    }
    
   @When("User click a processtwo button")
    public void user_click_a_processtwo_button() throws InterruptedException {
    	virtualterminalpage.processtwo();
    }
@When("User click close button")
public void user_click_close_button() throws InterruptedException {
	virtualterminalpage.Close();
}

@When("User click authori button")
public void user_click_authori_button() throws InterruptedException {
	virtualterminalpage.authoriz();
	virtualterminalpage.procesA();
	virtualterminalpage.Close();
}

@When("User clicks Txn button")
public void user_clicks_txn_button() throws InterruptedException {
	virtualterminalpage.Txn();
}

@When("User clicks refund button")
public void user_clicks_refund_button() throws InterruptedException {
	virtualterminalpage.Refund();
}

@When("User clicks Einvoice button")
public void user_clicks_einvoice_button() throws InterruptedException {
	virtualterminalpage.einvoice();
}

//@When("User clicks Paynow button")
//public void user_clicks_paynow_button() throws Exception {
	//virtualterminalpage.paynow();
//}

@When("User clicks cash button")
public void user_clicks_cash_button() throws InterruptedException {
	virtualterminalpage.Cash();
}
		
}
