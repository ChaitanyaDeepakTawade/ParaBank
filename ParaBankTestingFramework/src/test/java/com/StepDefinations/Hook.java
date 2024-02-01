package com.StepDefinations;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Utils.HelperClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook {
	 @Before
	    public static void setup() {
	    	HelperClass.setUpDriver();
	    }
	 @After(order=0)
	    public static void afterOpertation() {
	        HelperClass.tearDown();
	    }
	 @After(order = 1)
		public void takeScreenshot(Scenario scenario) throws IOException{
			if(scenario.isFailed()) {
				TakesScreenshot ts = (TakesScreenshot) HelperClass.getDriver();
				byte[] scr = ts.getScreenshotAs(OutputType.BYTES);
				scenario.attach(scr,"image/png","Screenshot");
	 
			}
		}
}
