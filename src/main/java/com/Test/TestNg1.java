package com.Test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNg1 {
	@Test
	public void CreateAccount() {
		Reporter.log("Create account method executed",true);
		
	}
	@Test(priority = 2)
	public void Edit() {
		Reporter.log("Create Edit method executed",true);
		
		
	}
	@Test(priority = 1)
	public void Delete() {
		Reporter.log("Create delet method executed",true);
		

}
}