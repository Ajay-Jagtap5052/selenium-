package com.Test;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Verification_Test03 {
	@Test
	public void Test01() {
		SoftAssert s=new SoftAssert();
		Reporter.log("Test01 method execution started",true);
		String str1="PAashik";
		String str2="Prashik";
		Reporter.log("verifaction 01 started",true);
		s.assertEquals(str1,str2);
		Reporter.log("verification 02 started",true);
		String str3="Prashik";
		s.assertEquals(str1, str3);
		Reporter.log("Test 01 method execution end",true);
		s.assertAll();
	}
	@Test
	public void Test02() {
		Reporter.log("test02",true);
	}
	

}
