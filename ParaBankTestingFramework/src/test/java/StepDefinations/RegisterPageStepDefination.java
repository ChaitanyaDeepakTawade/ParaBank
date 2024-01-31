package StepDefinations;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import Actions.RegisterPageAction;
import Utils.HelperClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
/*
 * Step defination file for register feature
 * @Author chaitanya tawade (expleo pune) 
 * @sign 30/01/2024 jdk-1.7
 */

public class RegisterPageStepDefination {
	RegisterPageAction objRegisterPageAction;
	@Given("User Should be on home page")
	public void user_should_be_on_home_page() {
		System.out.println("------------ open Url ------------");
		Properties prop = PropertiesFileReader.PropertiesFileReader("src/test/resources/Properties/config.properties");
		HelperClass.openUrl(prop.getProperty("url"));
	}
	
	@When("click on register link")
	public void click_on_register_link() {

		objRegisterPageAction = new RegisterPageAction();
		objRegisterPageAction.clickOnRegisterLink();
	}


	@When("Enter all data")
	public void enter_all_data() {
		
		Properties prop = PropertiesFileReader.PropertiesFileReader("src/test/resources/Properties/RegisterData.properties");
	    objRegisterPageAction.RegisterFormFill(prop.getProperty("FirstName"), prop.getProperty("LastName"), prop.getProperty("Address"), prop.getProperty("City"), prop.getProperty("State"), prop.getProperty("ZipCode"),
	    prop.getProperty("Phone"), prop.getProperty("SSN"), prop.getProperty("Username"), prop.getProperty("Password"),prop.getProperty("cnfPassword"));
	

	}
	
	@When("click register button")
	public void click_register_button() {
		
		objRegisterPageAction.clickOnRegisterLink();
		
	}

	@Then("verify register sucessfully or not")
	public void verify_register_sucessfully_or_not() {
		
		objRegisterPageAction.verifyRegisaterSucessfullMsg();

	}

	@When("Enter all data with wrong mobile number")
	public void enter_all_data_with_wrong_mobile_number() {
		
		Properties prop = PropertiesFileReader.PropertiesFileReader("src/test/resources/Properties/RegisterData.properties");
	    objRegisterPageAction.RegisterFormFill(prop.getProperty("FirstName"), prop.getProperty("LastName"), prop.getProperty("Address"), prop.getProperty("City"), prop.getProperty("State"), prop.getProperty("ZipCode"),
		    		prop.getProperty("PhoneInValid"), prop.getProperty("SSN"), prop.getProperty("Username"), prop.getProperty("Password"),prop.getProperty("cnfPassword"));
			

		}

	@Then("verify error message occured or not")
	public void verify_error_message_occured_or_not() {
		
	    	objRegisterPageAction.verifyErrorMsg();

	}


}
