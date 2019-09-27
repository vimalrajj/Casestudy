Feature: Register file
Scenario: User Login

Given User is in the Signup Page
When User enters "vimal976" as username
And User enters "vimal" as firstname
And User enters "raj" as lastname
And User enters "vimal1998" as password 
And User enters "vimal1998" as confirm password
And User selects "Male" as radio
And User enters "vimal@gmail.com" as e-mail
And User enters "9941638870" as Mobile number
And User enters "04/03/1998" as DOB
And User enters "Chennai-600123" as address
And User enters "411010" as Security question
And User enters "Chennai" as Answer
Then User must be navigated to the Home Page

