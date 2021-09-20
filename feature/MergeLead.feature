Feature: Merge Lead functionality of Leaftaps application

Scenario: TC001_positive test case 
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed
When Click the 'CRM/SFA' link
Then 'My Home' page should be displayed
When Click the 'Leads' link
Then 'My Leads' page should be displayed
When Click the 'Merge Leads' link
Then 'Merge Leads' page should be displayed

When Click the Lookup '1'
Then Search and select for the first name 'test'
When Click the Lookup '2'
Then Search and select for the first name 'usha'
Then Click the Merge button
When Click the 'Find Leads' link
Then Verify the merge 
