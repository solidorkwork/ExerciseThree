Feature: Test Login Functionality

  Scenario Outline: Check login works with valid credentials
    Given User is on login page
    When User enters <username> and <password>
    And Clicks Login Button
    Then User is Navigated to Home Page

    Examples:
    |username|password|
    |user1|Password123|