package com.Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Utils.HelperClass;
/*
 * object repository file of home page
 * @Author chaitanya tawade (expleo pune) 
 * @sign 30/01/2024 jdk-1.7
 */
public class HomePageLocator {
	
	@FindBy(linkText="Register")
	public WebElement Register;

}
