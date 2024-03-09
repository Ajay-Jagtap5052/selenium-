package com.Test;

import static org.testng.Assert.fail;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_Script5 {
	@Test
	public void signup() {
		Reporter.log("signup method is Executed",true);
		fail();
	}
	@Test(dependsOnMethods = "signup",alwaysRun = true)
	public void loginopage() {
		Reporter.log("loginpage method is Executed",true);
			
}
}
		
