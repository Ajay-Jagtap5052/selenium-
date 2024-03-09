package com.Test;

import org.testng.Reporter;
import org.testng.annotations.Test;
public class Test_Script2 {
	@Test
	public void signup() {
		Reporter.log("Signup Method Executed",true);
		
	}
	@Test(dependsOnMethods = "signup")
	public void LoginPage() {
		Reporter.log("LoginPage method executed",true);
	}
}