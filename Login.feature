Feature: Login functionality of Leaftaps application

Background:
Given Open the Chrome Browser
And Load the application url 'http://leaftaps.com/opentaps'

Scenario Outline: TC001_login with positive test case
Given Enter the username as <uname>
And Enter the password as <pwd>
When Click on Login button
Then Homepage should be displayed

Examples:
|uname|pwd|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

Scenario: TC002_login with negative credential
Given Enter the username as 'Demo1234'
And Enter the password as 'crmsfa'
When Click on Login button
But Error message should be displayed