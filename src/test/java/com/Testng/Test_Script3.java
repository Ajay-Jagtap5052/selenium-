package com.Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_Script3 {
	@Test
	public void signup() {
		Reporter.log("Signup Method Executed",true);
		
	}
	@Test(dependsOnMethods = "Signup")
	public void LoginPage() {
		Reporter.log("LoginPage method executed",true);
	}
	

}
