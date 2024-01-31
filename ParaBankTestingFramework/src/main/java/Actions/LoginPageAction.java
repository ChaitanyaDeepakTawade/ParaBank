package Actions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Locators.LoginPageLocators;
import Utils.HelperClass;

/*
 * Actiona file for login feature
 * @Author chaitanya tawade (expleo pune) 
 * @sign 31/01/2024 jdk-1.7
 */
public class LoginPageAction {

	LoginPageLocators objloginPageLtr;
	Logger log;

	public LoginPageAction() {
		
		objloginPageLtr = new LoginPageLocators();
		log = LogManager.getLogger(LoginPageAction.class);
		PageFactory.initElements(HelperClass.getDriver(), objloginPageLtr);

	}

	public void enterCredentials(String userName, String password) {

		objloginPageLtr.username.sendKeys(userName);
		objloginPageLtr.password.sendKeys(password);

	}

	public void clickLoginBtn() {

		objloginPageLtr.loginBtn.click();
	}

	public void verifyLoginSuccessfull() {

		try {

			Assert.assertEquals(objloginPageLtr.WelcomeMsg.getText(), "Accounts Overview");

		} catch (Exception e) {
			log.info("Error Message not generated after wrong credentials");
		}
	}

	public void verifyErrorMessage() {

		try {

			Assert.assertEquals(objloginPageLtr.errorMsg.getText(),
					"An internal error has occurred and has been logged.");

		} catch (Exception e) {
			log.info("Error Message not generated after wrong credentials");
		}
	}

	public void clickLogoutBtn() {

		objloginPageLtr.logoutBtn.click();

	}
}
