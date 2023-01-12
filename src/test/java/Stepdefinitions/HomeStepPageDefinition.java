package Stepdefinitions;

import java.util.List;
import java.util.Map;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomeStepPageDefinition {
	
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    private HomePage homePage;
	
	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable credTable) throws InterruptedException {
	    
		System.out.println("user has already logged ");

        List<Map<String, String>> credList = credTable.asMaps();
        String userName = credList.get(0).get("username");
        String password = credList.get(0).get("password");
        
         DriverFactory.getDriver()
         
         .get("https://demo.valorpaytech.com/signin");
         homePage = loginPage.doLogin(userName, password);
		
	}

	@When("user is on Home Page")
	public void user_is_on_home_page() {
		String title = homePage.getHomePageTitle();
        System.out.println("Accounts Page title is: " + title);
		
		
	}

	@When("user click user button")
	public void user_click_user_button() throws InterruptedException {
		Thread.sleep(3000);
        homePage.umclick();
		
	}

	@When("user cli user button")
	public void user_cli_user_button() throws InterruptedException {
		Thread.sleep(3000);
        homePage.us();
		
	}

	@When("user clicks user button")
	public void user_clicks_user_button() throws InterruptedException {
		Thread.sleep(3000);
        homePage.unclick();
		
	}
	
	@When("user clic user button")
	public void user_clic_user_button() throws InterruptedException {
		Thread.sleep(3000);
        homePage.uclick();
		
	}
	
	//@When("user uclik user button")
	//public void user_uclik_user_button() throws InterruptedException {
		//Thread.sleep(3000);
      //  homePage.uclik();
		
//	}
	
	@When("user tclick user button")
	public void user_tclick_user_button() throws InterruptedException {
		Thread.sleep(3000);
		homePage.tclick();
		
	}
	
		@When("User mtclick user button")
		public void user_mtclick_user_button() throws InterruptedException {
			homePage.mtclick();
		}






}
