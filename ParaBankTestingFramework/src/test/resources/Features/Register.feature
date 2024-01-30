#Author: chaitanya.tawade@expleogroup.com
#sign 30/01/2023 jdk-1.7
Feature: New user registration page . 
  
  @TC1.1
  Scenario: Validate that the registration form accepts all valid data .
    Given User Should be on home page 
    When click on register link
    And Enter all data 
    When click register button
    Then verify register sucessfully or not
  
  @TC1.2
  Scenario: Validate that the registration form accepts valid mobile number.
    Given User Should be on home page 
    When click on register link
    And Enter all data with wrong mobile number
    When click register button
    Then verify error message occured or not 