package Stepdefinitions;

import java.util.List;
import java.util.Map;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.MyTicketsPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class MyTicketsStepdefinitions {
	
	private LoginPage  loginPage = new LoginPage(DriverFactory.getDriver());
    private MyTicketsPage myticketspage;
    private HomePage homePage;

	@Given("user is on MyTicketsPage")
	public void user_is_on_my_tickets_page(DataTable credTable) throws InterruptedException {
	   
		List<Map<String, String>> credList = credTable.asMaps();
        String userName = credList.get(0).get("username");
        String password = credList.get(0).get("password");
        
         DriverFactory.getDriver()
         .get("https://uat.valorpaytech.com/signin");
         homePage = loginPage.doLogin(userName, password);  
         
         myticketspage =homePage.mtclick();
		
	}

	@Given("Create ticket in portal")
	public void create_ticket_in_portal() throws InterruptedException {
		myticketspage.createTicket();
		
	}

	@Given("Check notification in ISO")
	public void check_notification_in_iso() throws InterruptedException {
		myticketspage.notifyISO();
		myticketspage.ticketstatus();
		
	}

	@Given("Check notification in SUBISO")
	public void check_notification_in_subiso() {
	    
	}

	@Given("Check Email arrival of ISO")
	public void check_email_arrival_of_iso() {
	    
	}

	@Given("Check Email arrival of SUBISO")
	public void check_email_arrival_of_subiso() {
	   
	}

}
