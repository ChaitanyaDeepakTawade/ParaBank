package com.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/*
 * object repository file of register page
 * @Author chaitanya tawade (expleo pune) 
 * @sign 30/01/2024 jdk-1.7
 */
public class RegisterPageLocators {

	@FindBy(name="customer.firstName")
	public WebElement firstName;
	
	@FindBy(name="customer.lastName")
	public WebElement lastName;
	
	@FindBy(name="customer.address.street")
    public WebElement address;
	
	@FindBy(name="customer.address.city")
    public WebElement city;
	
	@FindBy(name="customer.address.state")
    public WebElement state;
	
	@FindBy(name="customer.address.zipCode")
    public WebElement zipCode;
	
	@FindBy(name="customer.phoneNumber")
    public WebElement phoneNumber;
	
	@FindBy(name="customer.ssn")
    public WebElement ssn;
	
    @FindBy(name="customer.username")
    public WebElement username;
    
    @FindBy(name="customer.password")
    public WebElement password;  
    
    @FindBy(name="repeatedPassword")
    public WebElement repeatedPassword;
    
    @FindBy(xpath="//input[@value=\"Register\"]")
    public WebElement RegisterBtn;
    
    @FindBy(xpath="//*[@id=\"rightPanel\"]/p")
    public WebElement WelcomeMessage;
}
