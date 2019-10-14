Feature: Validating the phptravels registration and login page
Background: User landing on the phptravels page

Given User launch the phptravels website

And User clicked on the MyAccount  dropdown menu

Scenario Outline: Registering the User for PHPTRAVELS

Given User able to view the Sign Up Page

When User Click on the Sign UP option

Then User should see the Signup page with validations

And User can enter the first name as <First Name>

And User can enter the last name as <Last Name>

And User can enter the mobile number <Mobile Number>

And User can enter the email id as <Email>

And User can enter the password as "<Password>"

And User can enter the confirm password as "<Confirm Password>"

And User can click on the signup button

And User can see my accounts page

Examples:

|First Name|Last Name|Mobile Number|Email|Password|Confirm Password|

|Isaq|Syed|07575757575|Syed.Isaq@testmail.com|SI@756|SI@756|

Scenario Outline: Logging into My Account

Given User able to view the Login Page

When User Click on the Login option

Then User should see the Login page with validations

And User can enter the email as "<Email>"

And User can enter the password as "<Password>"

And User can click on the Login button

And User can see my accounts page
Examples:
|Email                 |Password|
|Syed.Isaq@testmail.com|SI@756  |
|                      |        |

