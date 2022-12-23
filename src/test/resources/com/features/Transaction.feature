Feature: Transactions feature for portal

 


Background: 
    Given user is on TransactionsPage 
        |username|password|
        |sarojini123|Uat@123|

 


Scenario: to verify the transactions details from the portal
    When User check the today's transactions
    When User check transaction with multpleoptions
    When User performs the export on transactions
    When To Verify the count 
    When To show the approved tax
   # And User clicks vt btn
   
   When User clicks vt txn button
   When User clicks process button
   When User clicks processtwo button
   When User clicks close button