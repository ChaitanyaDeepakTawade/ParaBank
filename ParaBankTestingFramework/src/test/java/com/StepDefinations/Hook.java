package StepDefinations;

import Utils.HelperClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {
	 @Before
	    public static void setup() {
	    	HelperClass.setUpDriver();
	    }
	 @After(order=0)
	    public static void afterOpertation() {
	        HelperClass.tearDown();
	    }
	 
}
