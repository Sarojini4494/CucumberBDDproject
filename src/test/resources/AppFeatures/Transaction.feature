Feature: Transactions feature for portal


Background: 
    Given user is on TransactionsPage 
        |username|password|
        |sarojini123|Uat@123|
        
        
# Sanity yesterday date filters

Scenario: to verify the transactions details from the portal
    When User check the today's transactions
    When User check transaction with multpleoptions
    When User performs the export on transactions
    When To Verify the count 
    When To show the approved tax
   # And User clicks vt btn
   
 
 #settlement report  
   
   When User clicks vt txn button for settlement
    When User clicks Txn button for settlement
    Given User clicks closed batch for settlement
    Given User click settlement report
    Given to verify settlement count with txn
    
  #todays filters
   @Sanitydateallfilter     
    Scenario: to verify the transactions details from the portal
     Given User check the yesterday transactions
    Given User check yesterday transaction with multpleoptions
    Given User yesterday performs the export on transactions
    Given To yesterday Verify the count 
    Given To yesterday show the approved tax
    
      #MTD filters
 @Sanitydateallfilter
     Scenario: to verify the transactions details from the portal
     Given User check the MTD transactions
    Given User check MTD transaction with multpleoptions
    Given User MTD performs the export on transactions
    Given To MTD Verify the count 
    Given To MTD show the approved tax
    
    #Last WEEK
 
   @Sanitydateallfilter
   Scenario: to verify the transactions details from the portal
     Given User check the LW transactions
    Given User check LW transaction with multpleoptions
    Given User LW performs the export on transactions
    Given To LW Verify the count 
   Given To LW show the approved tax
   
   #CURRENT WEEK
   
    @Sanitydateallfilter
   Scenario: to verify the transactions details from the portal
     #Given User check the CW transactions
    Given User check CW transaction with multpleoptions
    Given User CW performs the export on transactions
    Given To CW Verify the count 
   Given To CW show the approved tax
   
   #Txn types
   
    @Sanitydateallfilter
   Scenario: to verify the transactions details of txn types
     #Given User check the CW transactions
    Given User check txntype transaction with multpleoptions
    Given User txntype performs the export on transactions
    Given To txntype Verify the count 
   Given To txntype show the approved tax
   
   #Card types
   @Sanitydateallfilter
   Scenario: to verify the transactions details of txn types
     #Given User check the CW transactions
    Given User check cardtype transaction with multpleoptions
    Given User cardtype performs the export on transactions
    Given To cardtype Verify the count 
   Given To cardtype show the approved tax
   
    #trans status declined
@Sanitydateallfilter
   Scenario: to verify the transactions details of txn types
     #Given User check the CW transactions
    Given User check txnstatusdeclined transaction with multpleoptions
    Given User txnstatusdeclined performs the export on transactions
    Given To txnstatusdeclined Verify the count 
   Given To txnstatusdeclined show the approved tax
   
   #Transaction filter -> EPI -> Check the result
   
@Sanitydateallfilter
      Scenario: to verify the transactions details of txn types
 Given User check EPIfilter transaction with multpleoptions
    Given User EPIfilter performs the export on transactions
    Given To EPIfilter Verify the count 
   Given To EPIfilter show the approved tax
   Then EPI search
   
   
   
   #view receipt and view profile option
   
  #@Sanitydateallfilter
  #Scenario: to verify the transactions details from the portal 
   # Given User do txn
    #Given User open admin txn
       
    #Check the Transaction type , Transaction icon , Card No scheme pop , Processor info icon
          
   @Sanitydateall
    Scenario: to verify the transactions details from the portal 
    Given User do vt txn
    Given User checks txn type and txn icon card no scheme pop and processor info icon
    
    #Export the Open Batch and verify the values
     @SanitydateallExport
    Scenario: to verify the transactions details from the portal 
    Given Export open batch and verify values
     
    #Check the values in OPEN BATCH , All the valid transactions should be there . Count and volume should be tally
    
     @Sanitydateallfilter
     Scenario: to verify the transactions details from the open batch txn 
    Given Check the values in OPEN BATCH , All the valid transactions should be there . Count and volume should be tally
    Given Count and volume should be tally
    
    
    
    #View the Closed batch of the transactions

    
    @Sanitydateallfilter
    Scenario: to verify the transactions details from the portal 
    Given View the Closed batch of the transactions
    
    
#Check whether Isswer refund available after settlement

@Sanitydateallfilter
Scenario: to verify the transactions details from the portal 
    Given View the Closed batch of the txn for issue refund after settlement
    
    
#Void the transaction and verify in the open batch -> Check count and Volume

@Sanitydateallfilter
Scenario: to verify the transactions details from the portal 
    Given Void the transaction and verify in the open batch
    Given Check count and Volume in void
    
#Compare the pagination, export and tile results

@Sanitydateallfilter
Scenario: to verify the transactions details from the portal 

Given Compare the pagination, export and tile results




    
  
   
  
   
   

 