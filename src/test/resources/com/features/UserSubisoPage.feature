Feature: SUBISO Boarding Feature 

Background: 

	Given User is on UserManagementPage
		|username|password|
		|sarojini+isovl100@valorpaytech.com|Demo@123|
		
		
Scenario Outline: Subisopage scenario with different set of data 

	When User click the add button
	When user click Add subiso customer button
	When User fill the forms from given sheetname "<SheetName>" and rownumber <RowNumber> 
	And User Click the contact next button 
	And User select the process info module
	And User Click the processor info next button 
    And user select all the subiso modules
    Then user click submit button
	
	Examples: 
	
		|SheetName|RowNumber|
		|Subiso|0|	