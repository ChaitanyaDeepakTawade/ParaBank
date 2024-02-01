package com.Actions;


import org.apache.logging.log4j.LogManager;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Locators.HomePageLocator;
import com.Locators.RegisterPageLocators;
import com.Utils.HelperClass;

import org.apache.logging.log4j.Logger;

/*
 * Action methos for register page
 * @Author chaitanya tawade (expleo pune) 
 * @sign 30/01/2024 jdk-1.7
 */
public class RegisterPageAction {
	
	RegisterPageLocators objRegisterPageLTR;
	HomePageLocator objHomePageLocator;
	Logger log;
	
	public RegisterPageAction() {
		
		log = LogManager.getLogger(RegisterPageAction.class);
		this.objRegisterPageLTR = new RegisterPageLocators();
		objHomePageLocator= new HomePageLocator();
		
		PageFactory.initElements(HelperClass.getDriver(), objRegisterPageLTR);
	    PageFactory.initElements(HelperClass.getDriver(), objHomePageLocator);
	    
	}
	
	public void clickOnRegisterLink() {
		
		objHomePageLocator.Register.click();
		log.info("click Register link");
		
	}
	
	public void RegisterFormFill(String fName,String lName, String address,String city,String state,String zipCode,String phone,String ssn,String username,String password,String confPassword) 
	{
		
		objRegisterPageLTR.firstName.sendKeys(fName);
		objRegisterPageLTR.lastName.sendKeys(lName);
		objRegisterPageLTR.address.sendKeys(address);
		objRegisterPageLTR.city.sendKeys(city);
		objRegisterPageLTR.state.sendKeys(state);
		objRegisterPageLTR.zipCode.sendKeys(zipCode);
		objRegisterPageLTR.phoneNumber.sendKeys(phone);
		objRegisterPageLTR.ssn.sendKeys(ssn);
		objRegisterPageLTR.username.sendKeys(username);
		objRegisterPageLTR.password.sendKeys(password);
		objRegisterPageLTR.repeatedPassword.sendKeys(confPassword);
	
	}
	
	public void registerBtnClick() 
	{
		
		objRegisterPageLTR.RegisterBtn.click();
		
	}

	public void verifyRegisaterSucessfullMsg() {
	     try {
		   Assert.assertEquals( objRegisterPageLTR.WelcomeMessage.getText(),"Your account was created successfully. You are now logged in.");
	     }catch(Exception e) {
	    	 log.error("User is not able to register");
	     }
	}

	public void verifyErrorMsg() {
	    
		try {
			
			 Assert.assertNotEquals( objRegisterPageLTR.WelcomeMessage.getText(),"Your account was created successfully. You are now logged in.");
			
		}catch(Exception e) {
	    	 log.error("Invalid Mobile number is accepted");
	     }
		
	}



}
