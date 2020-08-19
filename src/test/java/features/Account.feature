Feature: Portal Login
	
	Background:
	Given Validate the browser
	When Browser is triggered
	Then Check if browser is displayed

	@PortalTest
	Scenario: Home page default login 1
	Given User is on NetNabking landing page
	When User login into application with username "Jin" and password "1234"
	Then Home page is populated
	And Cards displayed are "true"
	
	@PortalTest
	Scenario: Home page default login 2
	Given User is on NetNabking landing page
	When User login into application with username "John" and password "4321"
	Then Home page is populated
	And Cards displayed are "false"
	
	@PortalTest
	Scenario: Home page default login 2
	Given User is on NetNabking landing page
	When User login into application with username "John" and password "4321"
	Then Home page is populated
	And Cards displayed are "false"
	
	@PortalTest
	Scenario: Home page default login 3
	Given User is on NetNabking landing page
	When User signs up with following details 
	| tymzon | Password1 | tym.zon@gmail.com | Australia | 0406993453 |
	Then Home page is populated
	And Cards displayed are "false"
	
	@PortalTest
	Scenario Outline: Home page default login with 10 passwords
	Given User is on NetNabking landing page
	When User login in to application with username <username> and password <password>
	Then Home page is populated
	And Cards displayed are "false"
	
	Examples:
	| username | password |
	| user1	   | pass1    |
	| user2	   | pass2    |
	| user3	   | pass3    |
	| user4	   | pass4    |
	| user5	   | pass5    |
	
	
	