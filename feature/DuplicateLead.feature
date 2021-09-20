Feature: Duplicate Lead functionality of Leaftaps application

@regression
Scenario: TC001_positive test case 
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed
When Click the 'CRM/SFA' link
Then 'My Home' page should be displayed
When Click the 'Leads' link
Then 'My Leads' page should be displayed
When Click the 'Find Leads' link
Then 'Find Leads' page should be displayed
Given Click the Email tab
Given Enter the email as 'test'
When Click Find Leads button
Then Click on the first resulting first name
When Click the 'Duplicate Lead' link
When Click 'Create Lead' button
Then Verify the Duplicate