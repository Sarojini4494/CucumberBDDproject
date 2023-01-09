package Stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.UseraddPage;
import com.qa.factory.DriverFactory;
import com.qa.util.ExcelReader;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class UseraddPageStepDefination {
	
	private LoginPage  loginPage = new LoginPage(DriverFactory.getDriver());
    private UseraddPage usermanagementPage;
    private HomePage homePage;
	
	
	@Given("User is on UserManagement Page")
	public void user_is_on_user_management_page(DataTable credTable) throws InterruptedException {
	    
		List<Map<String, String>> credList = credTable.asMaps();
        String userName = credList.get(0).get("username");
        String password = credList.get(0).get("password");
        
         DriverFactory.getDriver()
         .get("https://demo.valorpaytech.com/signin");
         homePage = loginPage.doLogin(userName, password);  
         
         usermanagementPage =homePage.umclick();
		
	}
	
	
	@When("User click add button")
	public void user_click_add_button() throws InterruptedException {
	    
		usermanagementPage.addISO();
	}
	

	@When("user click add customer")
	public void user_click_add_customer() throws InterruptedException {
	   
		usermanagementPage.addcust();
	}

	
	@When("User fill the form from given sheetname {string} and rownumber {int}")
	public void user_fill_the_form_from_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException{ {
	   
		ExcelReader reader = new ExcelReader();
        List<Map<String,String>> testData=
                reader.getData("C:\\Users\\sarojini\\Downloads\\Automation Testing.xlsx", SheetName);
		
        String custName = testData.get(rowNumber).get("cust");
        
        String email = testData.get(rowNumber).get("mail");
        String Usern = testData.get(rowNumber).get("username");
        String Phone = testData.get(rowNumber).get("phone");
        String firstName = testData.get(rowNumber).get("firstname");
        String lastName = testData.get(rowNumber).get("lastname");
        String address = testData.get(rowNumber).get("addres");
        String zipcode = testData.get(rowNumber).get("zipco");
        String city = testData.get(rowNumber).get("cit");
       
        usermanagementPage.createISO(custName, email, Usern, Phone, firstName, lastName, address, zipcode, city);
        
	}
}

	@When("User Click the next button")
	public void User_Click_the_next_button() {
		usermanagementPage.clickNextButton();
	}
	
	@When("user files the processor details from given sheetname {string} and rownumber {int}")
	public void user_files_the_processor_details_from_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws InvalidFormatException, IOException {
	     ExcelReader reader = new ExcelReader();
	     List<Map<String,String>> testData=
	             reader.getData("C:\\Users\\sarojini\\Downloads\\Automation Testing.xlsx", SheetName);
	     
	     String bin = testData.get(rowNumber).get("BinNumber");
	     String agent = testData.get(rowNumber).get("AgentBankNo");
	     String agentcode = testData.get(rowNumber).get("AgentCode");
	     String chainNumber = testData.get(rowNumber).get("ChainNumber");
	     String label = testData.get(rowNumber).get("Label");
	     String debitsharing = testData.get(rowNumber).get("DebitSharing");
	     String abaNumber = testData.get(rowNumber).get("AbaNumber");
	     
	     usermanagementPage.Processordetails(bin, agent, agentcode, chainNumber, label, debitsharing, abaNumber);
	     usermanagementPage.clickNextButton();
	
}

	@When("user click the next button")
	public void user_click_the_next_button() {
	    usermanagementPage.clickNextButton();
	    
	}


	@When("user select all the modules")
	public void user_select_all_the_modules() {
	    usermanagementPage.selectallmodule();
	    
	}
	}
