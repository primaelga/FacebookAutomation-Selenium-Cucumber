@Signup
Feature: Register Account Facebook

Scenario: as a user I want to register account on facebook
	Given I am already on facebook page
	When I set first name and last name
	And I set email and confirmation email
	And I enter password for account registered
	And I set my birthdate
	And I choose my gender as "Laki-laki"
	And I click button Daftar
	Then I see confirmation page
	
	
	
	
