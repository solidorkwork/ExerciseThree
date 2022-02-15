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
Feature: Adding two numbers in the Calculator App

  @tag1
  Scenario Outline: Adding two numbers
    Given Calculator is open
    And Results are cleared
    When I add <Number1> and <Number2>
    Then <Result> is shown

    Examples: 
      | Number1 | Number2 | Result |
      |       5 |       7 |     12 |
      |     5.5 |    90.1 |   95.6 |
      |      .5 |      68 |   68.5 |
