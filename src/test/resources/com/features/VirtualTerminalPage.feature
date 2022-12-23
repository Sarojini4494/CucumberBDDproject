Feature: Virtual Terminal Boarding feature 

Background:
	Given FullBoard is on VirtualTerminalPage
		|username|password|
		|sarojini123|Uat@123|
	
	Scenario Outline: VirtualTerminalPage scenario with different set of data 

 
   When User fill the VT form from given sheetname "<SheetName>" and rownumber <RowNumber>
    When User click a Process button
    When User click a processtwo button
    When User click close button
    When User click authori button
    When User clicks Txn button
  When User clicks refund button
  When User clicks Einvoice button
 # When User clicks Paynow button
 When User clicks cash button

    
   
   	Examples: 
	
		|SheetName|RowNumber|
		|VT|0|