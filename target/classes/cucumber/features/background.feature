#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Test the background feature in AUT
  
 Background: 
  Given User is on EDU Teller Login Page 
  Scenario: 
    When User checks for Add Money
    Then Enter Account number details and Search
    And Closes 
  Scenario: User checks for My Customers
    When The user checks for My Customers link 
    Then All Customer details displayed
    And Closes The Browser

