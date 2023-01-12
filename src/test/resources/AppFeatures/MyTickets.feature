Feature: MyTickets feature for portal


Background: 
    Given user is on MyTicketsPage 
        |username|password|
        |sarojini+mervl110@valorpaytech.com|Uat@123|
   
   @Mytickets    
  Scenario: To verify the MyTickets from portal
  Given Create ticket in portal
  Given Check notification in ISO
  Given Check notification in SUBISO
  Given Check Email arrival of ISO
  Given Check Email arrival of SUBISO