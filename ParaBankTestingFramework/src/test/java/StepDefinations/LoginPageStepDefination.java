package StepDefinations;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import Actions.LoginPageAction;
import Utils.HelperClass;
import Utils.PropertiesFileReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/*
 * Step defination file for login feature
 * @Author chaitanya tawade (expleo pune) 
 * @sign 30/01/2024 jdk-1.7
 */

public class LoginPageStepDefination {
	LoginPageAction objLoginPageAction;
	@When("If the user is already logged then logout")
	public void if_the_user_is_already_logged_then_logout() {
		Properties prop = PropertiesFileReader.PropertiesFileReader("src/test/resources/Properties/config.properties");
		objLoginPageAction = new LoginPageAction();
		if(HelperClass.getDriver().getCurrentUrl().equals(prop.getProperty("url")) ) {
			
			
		}else {
			objLoginPageAction.clickLogoutBtn();
		}

	}
	
	@When("Enter valid Login Credentials")
	public void enter_valid_login_credentials() {
		
		Properties prop = PropertiesFileReader.PropertiesFileReader("src/test/resources/Properties/LoginData.properties");
		objLoginPageAction.enterCredentials(prop.getProperty("username"), prop.getProperty("password"));

	}
	
	@When("click on login button")
	public void click_on_login_button() {
		objLoginPageAction.clickLoginBtn();

	}

	@Then("verify user is successfully login in the system")
	public void verify_user_is_successfully_login_in_the_system() {
		objLoginPageAction.verifyLoginSuccessfull();
	}

	@When("Enter invalid Login Credentials")
	public void enter_invalid_login_credentials() {
		Properties prop = PropertiesFileReader.PropertiesFileReader("src/test/resources/Properties/LoginData.properties");
		objLoginPageAction.enterCredentials(prop.getProperty("invalidUsername"), prop.getProperty("invalidPassword"));
	}

	@Then("verify wrong credentials error")
	public void verify_wrong_credentials_error() {
		objLoginPageAction.verifyErrorMessage();
	}

}
