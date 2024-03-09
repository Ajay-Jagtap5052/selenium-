package com.Test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_Script4 {
	
	public void CreateAccount() {
		Reporter.log("Create account method is Executed",true);
	}
	@Test(enabled = false)
	public void updatedAccount() {
		Reporter.log("updated method is Executed",true);
		
	}
	@Test
	public void deletedAccount() {
		Reporter.log("updated method is Executed",true);
		
	
	}
}
