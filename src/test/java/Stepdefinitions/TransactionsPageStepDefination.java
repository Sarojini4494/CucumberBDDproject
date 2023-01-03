package Stepdefinitions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

 

import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.TransactionsPage;
import com.qa.factory.DriverFactory;

 

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class TransactionsPageStepDefination {
    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    private TransactionsPage transactionsPage;
    private HomePage homePage;

 

    @Given("user is on TransactionsPage")
    public void user_is_on_transactions_page(DataTable credTable) throws InterruptedException {
        List<Map<String, String>> credList = credTable.asMaps();
        String userName = credList.get(0).get("username");
        String password = credList.get(0).get("password");
        DriverFactory.getDriver().get("https://uat.valorpaytech.com/app/userManager/user");
        homePage = loginPage.doLogin(userName, password);
        transactionsPage = homePage.tclick();

    }
    
    @When("User check the today's transactions")
    public void user_check_the_today_s_transactions() throws InterruptedException {
        transactionsPage.transactionsfilterclick();
    }

    @When("User check transaction with multpleoptions")
    public void user_check_transaction_with_multpleoptions() throws InterruptedException {
        transactionsPage.transactionsfilteringoptinclick();
    }

    @When("User performs the export on transactions")
    public void user_performs_the_export_on_transactions() throws InterruptedException {
        transactionsPage.toshowapprovedtax();
        transactionsPage.ExportValidation();
    }

    @When("To Verify the count")
    public void to_verify_the_count() throws FileNotFoundException, IOException {
        transactionsPage.countcheck();
        transactionsPage.getRowCount();

    }

    @When("To show the approved tax")
    public void to_show_the_approved_tax() throws InterruptedException, FileNotFoundException, IOException {
        transactionsPage.filterwitthallTransactiontype();
        transactionsPage.ExportValidation();
    }
    
    @When("User clicks vt txn button for settlement")
    public void user_clicks_vt_txn_button_for_settlement() throws InterruptedException {
    	transactionsPage.Vtsettlement();
    }

    @When("User clicks Txn button for settlement")
    public void user_clicks_txn_button_for_settlement() throws InterruptedException {
    	transactionsPage.txnsettlement();
       
    }

    @Given("User clicks closed batch for settlement")
    public void user_clicks_closed_batch_for_settlement() throws InterruptedException {
    	transactionsPage.closedbatchsett();
    }

    @Given("User click settlement report")
    public void user_click_settlement_report() throws InterruptedException {
    	transactionsPage.settlementrep();
    }

    @Given("to verify settlement count with txn")
    public void to_verify_settlement_count_with_txn() throws InterruptedException {
    	transactionsPage.settlecount();
    }
    
    @Given("User check the yesterday transactions")
    public void user_check_the_yesterday_transactions() throws InterruptedException {
    	transactionsPage.yestransactionsfilterclick();
    }

    @When("User check yesterday transaction with multpleoptions")
    public void user_check_yesterday_transaction_with_multpleoptions() throws InterruptedException {
    	transactionsPage.yestransactionsfilteringoptinclick();
    }

    @When("User yesterday performs the export on transactions")
    public void user_yesterday_performs_the_export_on_transactions() throws InterruptedException {
    	transactionsPage.yesExportValidation();
    	transactionsPage.yestoshowapprovedtax();
    }

    @When("To yesterday Verify the count")
    public void to_yesterday_verify_the_count() throws FileNotFoundException, IOException {
    	transactionsPage.countcheck();
    	transactionsPage.getRowCount();
    }

    @When("To yesterday show the approved tax")
    public void to_yesterday_show_the_approved_tax() throws InterruptedException {
    	transactionsPage.yesfilterwitthallTransactiontype();
    	transactionsPage.yesExportValidation();
    }
    
    @Given("User check the MTD transactions")
    public void user_check_the_mtd_transactions() throws InterruptedException {
    	transactionsPage.MTDtransactionsfilterclick();
    }

    @Given("User check MTD transaction with multpleoptions")
    public void user_check_mtd_transaction_with_multpleoptions() throws InterruptedException {
    	transactionsPage.MTDtransactionsfilteringoptinclick();
    }

    @Given("User MTD performs the export on transactions")
    public void user_mtd_performs_the_export_on_transactions() throws InterruptedException {
    	transactionsPage.MTDtoshowapprovedtax();
    	transactionsPage.MTDExportValidation();
    }

    @Given("To MTD Verify the count")
    public void to_mtd_verify_the_count() throws FileNotFoundException, IOException {
    	transactionsPage.countcheck();
    	transactionsPage.getRowCount();
    }

    @Given("To MTD show the approved tax")
    public void to_mtd_show_the_approved_tax() throws InterruptedException {
    	transactionsPage.filterwitthallTransactiontype();
    	transactionsPage.ExportValidation();
    	
    }
    
    @Given("User check the LW transactions")
    public void user_check_the_lw_transactions() throws InterruptedException {
    	//transactionsPage.LWtoshowapprovedtax();
    	transactionsPage.LWExportValidation();
    	
    }

    @Given("User check LW transaction with multpleoptions")
    public void user_check_lw_transaction_with_multpleoptions() throws InterruptedException {
    	transactionsPage.LWtransactionsfilterclick();
    	
    }

    @Given("User LW performs the export on transactions")
    public void user_lw_performs_the_export_on_transactions() throws InterruptedException {
    	transactionsPage.LWtransactionsfilteringoptinclick();
    	
    }

    @Given("To LW Verify the count")
    public void to_lw_verify_the_count() throws FileNotFoundException, IOException {
    	transactionsPage.countcheck();
    	transactionsPage.getRowCount();
    	
    }

    @Given("To LW show the approved tax")
    public void to_lw_show_the_approved_tax() throws InterruptedException {
    	transactionsPage.LWfilterwitthallTransactiontype();
    	transactionsPage.LWExportValidation();

    } 
    
    @Given("User check the CW transactions")
    public void user_check_the_cw_transactions() throws InterruptedException {
    	//transactionsPage.LWtoshowapprovedtax();
    	transactionsPage.CWExportValidation();
    	
    }

    @Given("User check CW transaction with multpleoptions")
    public void user_check_cw_transaction_with_multpleoptions() throws InterruptedException {
    	transactionsPage.CWtransactionsfilterclick();
    	
    }

    @Given("User CW performs the export on transactions")
    public void user_cw_performs_the_export_on_transactions() throws InterruptedException {
    	transactionsPage.CWtransactionsfilteringoptinclick();
    	
    }

    @Given("To CW Verify the count")
    public void to_cw_verify_the_count() throws FileNotFoundException, IOException {
    	transactionsPage.countcheck();
    	transactionsPage.getRowCount();
    	
    }

    @Given("To CW show the approved tax")
    public void to_cw_show_the_approved_tax() throws InterruptedException {
    	transactionsPage.CWfilterwitthallTransactiontype();
    	transactionsPage.CWExportValidation();

    } 
    
    /*@Given("User do txn")
    public void user_do_txn() throws InterruptedException {
    	transactionsPage.VTtxn();
    	
    }
    @Given("User open admin txn")
    public void user_open_admin_txn() throws InterruptedException {
    	transactionsPage.txnadmin();
    	
    }*/
 
    @Given("User do vt txn")
    public void user_do_vt_txn() throws InterruptedException {
    	transactionsPage.VTTXN();
    }

    @Given("User checks txn type and txn icon card no scheme pop and processor info icon")
    public void user_checks_txn_type_and_txn_icon_card_no_scheme_pop_and_processor_info_icon() throws InterruptedException {
    	transactionsPage.txntypetxicocardnschemeproc();
    }
    @Given("Check the values in OPEN BATCH , All the valid transactions should be there . Count and volume should be tally")
    public void check_the_values_in_open_batch_all_the_valid_transactions_should_be_there_count_and_volume_should_be_tally() throws InterruptedException {
    	transactionsPage.VTopen();
    }
    /**@Given("Count and volume should be tally")
    public void count_and_volume_should_be_tally() throws InterruptedException {
    	transactionsPage.countandvolumetally();
    }**/
    
    @Given("View the Closed batch of the transactions")
    public void view_the_closed_batch_of_the_transactions() throws InterruptedException {
    	transactionsPage.closedbatchtxn();
    }
    
    @Given("View the Closed batch of the txn for issue refund after settlement")
    public void view_the_closed_batch_of_the_txn_for_issue_refund_after_settlement() throws InterruptedException {
    	transactionsPage.issuerefaftsett();
    }
    
    @Given("Void the transaction and verify in the open batch -> Check count and Volume")
    public void void_the_transaction_and_verify_in_the_open_batch_check_count_and_volume() throws InterruptedException {
    	transactionsPage.voidtxnopenbtch();
    }
    

@Given("Compare the pagination, export and tile results")
public void compare_the_pagination_export_and_tile_results() throws InterruptedException {
	transactionsPage.pagination();
}

    

}
