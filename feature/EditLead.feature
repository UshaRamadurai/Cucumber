Feature: Edit Lead functionality of Leaftaps application

@smoke @regression
Scenario Outline: TC001_positive test case 
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
When Click the 'Phone' link
Given Enter the Phone number as <phNo>
When Click Find Leads button
Then Click on the first result
When Click the 'Edit' link
Then Edit the Company name as <comName>
When Click 'Update' button
Then Verify the update

Examples:
|phNo|comName|
|'99'|'Feathers'|
|'1'|'Feathers'|