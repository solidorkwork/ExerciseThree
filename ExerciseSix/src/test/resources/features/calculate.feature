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
Feature: Perform calculation

  @tag1
  Scenario Outline: Perform basic arithmetic between two numbers
    Given Calculator is open
    And Results are cleared
    When I calculate <Expression>
    Then The <Result> is displayed

    Examples: 
      | Expression | Result |
      | 10+11      |     21 |
      | .5*55      |   27.5 |
      | 10\0.1      |    100 |
      | 70-1       |     69 |
