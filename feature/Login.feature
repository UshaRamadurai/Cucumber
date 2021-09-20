Feature: Login functionality of Leaftaps application

@functional
Scenario Outline: TC001_login with positive test case
Given Enter the Login username as <uname>
And Enter the Login password as <pwd>
When Click on the Login button
Then Login Homepage should be displayed

Examples:
|uname|pwd|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

@regression
Scenario: TC002_login with negative credential
Given Enter the Login username as 'Demo1234'
And Enter the Login password as 'crmsfa'
When Click on the Login button
But Error message should be displayed