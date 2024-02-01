package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/*
 * locators file for login feature
 * @Author chaitanya tawade (expleo pune) 
 * @sign 31/01/2024 jdk-1.7
 */
public class LoginPageLocators 
{
	
	@FindBy(name="username")
	public WebElement username;
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(xpath="//input[@value=\"Log In\"]")
	public WebElement loginBtn;
	
	@FindBy(linkText ="Log Out")
	public WebElement logoutBtn;
	
	@FindBy(xpath="//*[@class=\"title\"]") // after login successful welcome message
	public WebElement WelcomeMsg;
	
	@FindBy(xpath="//p[@class=\"error\"]") // after incorrect login credentials generate error message
	public WebElement errorMsg;

}
