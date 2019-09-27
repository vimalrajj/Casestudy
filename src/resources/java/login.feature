Feature: login file
Scenario Outline: User Login
Given user not logged in
When User logins with "<username>" 
And User logins with as "<password>" 
Then Loggin successfull

Examples:
|username|password|
|lalitha|password123|
