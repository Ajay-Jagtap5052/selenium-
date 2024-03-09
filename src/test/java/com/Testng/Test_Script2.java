package com.Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_Script2 {
	@Test(invocationCount = 3)
	public void updateAccount() {
		Reporter.log("Updated Account Method Executed",true);
	}	

}
