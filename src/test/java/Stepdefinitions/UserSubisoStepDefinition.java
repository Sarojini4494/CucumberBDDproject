package Stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.UserSubisoPage;
import com.pages.UseraddPage;
import com.qa.factory.DriverFactory;
import com.qa.util.ExcelReader;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserSubisoStepDefinition {
	
	  private LoginPage  loginPage = new LoginPage(DriverFactory.getDriver());
	    private UserSubisoPage usersubisopage;
	    private HomePage homePage;

	@Given("User is on UserManagementPage")
	public void user_is_on_user_management_page(DataTable credTable) throws InterruptedException {
	    
		 List<Map<String, String>> credList = credTable.asMaps();
	        String userName = credList.get(0).get("username");
	        String password = credList.get(0).get("password");
	        
	        
	         DriverFactory.getDriver()
	         .get("https://demo.valorpaytech.com/signin");
	         homePage = loginPage.doLogin(userName, password);
	         
	         
	         usersubisopage =homePage.us();
		
		
	}

	@When("User click the add button")
	public void user_click_the_add_button() throws InterruptedException {
		usersubisopage.add1();
		
		
	}

	@When("user click Add subiso customer button")
	public void user_click_add_subiso_customer_button() throws InterruptedException {
		usersubisopage.addSubIso();
		
		
	}

	@When("User fill the forms from given sheetname {string} and rownumber {int}")
	public void user_fill_the_forms_from_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException{ {
		
		ExcelReader reader = new ExcelReader();
        List<Map<String,String>> testData=
                reader.getData("C:\\Users\\sarojini\\Downloads\\SubIso Testing.xlsx", SheetName);
   
       
        String DBAName = testData.get(rowNumber).get("DBAn");
       
        String email = testData.get(rowNumber).get("mails");
        String UserName = testData.get(rowNumber).get("userna");
        String Phone = testData.get(rowNumber).get("phonen");
        String firstName = testData.get(rowNumber).get("firstnam");
        String lastName = testData.get(rowNumber).get("lastnam");
        String address = testData.get(rowNumber).get("addre");
        String zipcode = testData.get(rowNumber).get("zipc");
        String city = testData.get(rowNumber).get("ci");
       
        usersubisopage.createISO(DBAName, email, UserName, Phone, firstName, lastName, address, zipcode, city);
		
	}
	}

	@When("User Click the contact next button")
	public void user_click_the_contact_next_button() throws InterruptedException {
		usersubisopage.clickNextButton();
		
		
	}

	@When("User select the process info module")
	public void user_select_the_process_info_module() throws InterruptedException {
		usersubisopage.clickNextButton();
		
		
	}

	@When("User Click the processor info next button")
	public void user_click_the_processor_info_next_button() throws InterruptedException {
		usersubisopage.clickNextButton();
		
		
	}

	@When("user select all the subiso modules")
	public void user_select_all_the_subiso_modules() throws InterruptedException {
		usersubisopage.selectallmodule();
		
		
	}

	@Then("user click submit button")
	public void user_click_submit_button() throws InterruptedException {
		usersubisopage.clickNextButton();
		
	}

	
}