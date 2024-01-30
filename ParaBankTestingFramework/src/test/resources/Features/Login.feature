#Author: chaitanya.tawade@expleogroup.com
#sign : 30/01/2024 jdk-1.7
@LoginPage
Feature: Login Page Testing with valid and invalid credentials

  @TC2.1
  Scenario: login page test with valid credentials
    Given User Should be on home page 
    When Enter valid Login Credentials
    And click on login button
    Then verify user is successfully login in the system

  @TC2.2
   Scenario: login page test with invalid credentials
    Given User Should be on home page 
    When Enter valid Login Credentials
    And click on login button
    Then verify user is successfully login in the system
    