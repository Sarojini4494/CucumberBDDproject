Feature: MerchantManagement Boarding feature 

Background:
	Given FullBoard is on MerchantManagementPage
		|username|password|
		|sarojini+isovl100@valorpaytech.com|Demo@123|
		
	Scenario Outline: MerchantManagementPage scenario with different set of data 

	
	When User clicks add button for merchant
	When user click full board button
	When User fill the contact form from given sheetname "<SheetName>" and rownumber <RowNumber> 
	When User click Timezone button
	And  User click the contact next button 
    When User click Timezone2 button
    When User click MCC CODE button
    When User add store button
    And user click the store detail next button
    When user select the device from the list
    When user select the processor
    When add debitshare
    When user fil the cash discount values from the sheetname "<SheetName>" and rownumber <RowNumber>
    
   
 	
	Examples: 
	
		|SheetName|RowNumber|
		|Contacts|0|