Feature: ISO Boarding Feature 

Background: 

	Given User is on UserManagement Page 
		|username|password|
		|sarojini+adminvl100@valorpaytech.com|Demo@123|
		
		
Scenario Outline: UseraddPage scenario with different set of data 

	When User click add button 
	When user click add customer 
	When User fill the form from given sheetname "<SheetName>" and rownumber <RowNumber> 
	And User Click the next button 
	When user files the processor details from given sheetname "<SheetName>" and rownumber <RowNumber>
    And user click the next button
    When user select all the modules
	
	Examples: 
	
		|SheetName|RowNumber|
		|User|0|