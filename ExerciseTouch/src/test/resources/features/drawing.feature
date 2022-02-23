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
Feature: Drawing Shapes

  Scenario: Drawing a box
    Given The sketch page is open
    When I switch to technical pen
    And I draw the following lines:
      | 100 |  400 | 600 |  400 |
      | 600 |  400 | 600 | 1000 |
      | 600 | 1000 | 100 | 1000 |
      | 100 | 1000 | 100 |  400 |
    And I fill the center with black
    Then Only the inside is black
