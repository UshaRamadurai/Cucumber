Feature: Create Lead functionality of Leaftaps application

@functional @smoke
Scenario Outline: TC001_positive test case 
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed
When Click the 'CRM/SFA' link
Then 'My Home' page should be displayed
When Click the 'Leads' link
Then 'My Leads' page should be displayed
When Click the 'Create Lead' link
Then 'Create Lead' page should be displayed
Given Enter the 'companyName' as <coName>
And Enter the 'firstName' as <firstName>
And Enter the 'lastName' as <lastName>
When Click 'Create Lead' button
Then 'View Lead' page should be displayed

Examples:
|coName|firstName|lastName|
|'Google'|'Usha'|'Sathish'|
|'Microsoft'|'Sathish'|'Kumar'|
