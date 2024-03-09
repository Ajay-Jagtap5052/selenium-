package com.Test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_Script {
	@Test(priority =5)
	public void CreateAccount() {
		Reporter.log("Create Account method Executed",true);
	}
	@Test(priority =3)
	public void updateAccount() {
		Reporter.log("Updated Account Method Executed",true);;
		
	}
	@Test(priority =1)
	public void EditAccount() {
		Reporter.log("Edit Account Method Executed",true);
	}
	@Test(priority =4)
	public void deleteAccount() {
		Reporter.log("delete Account Method Executed",true);
	}
	@Test(priority =3)
	public void readAccount() {
		Reporter.log("Read Account Method Executed",true);
		
		
	}	

}
