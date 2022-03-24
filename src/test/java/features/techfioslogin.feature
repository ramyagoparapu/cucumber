Feature: Techfiosloginpage functionality validation

Scenario: login with valid credentials.
Given User is on techfios login page
When User enters username as"demo@techfios.com"
When User enters password as "abc123"
When User clicks on sign in button
Then User should land on dashboard page

