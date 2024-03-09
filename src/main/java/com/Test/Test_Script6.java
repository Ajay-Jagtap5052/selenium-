package com.Test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_Script6 {
	@Test(invocationTimeOut = 2000)
	public void signup() throws InterruptedException {
		Thread.sleep(4000);
	
		Reporter.log("signup method is Executed",true);
	}
	
		

}
