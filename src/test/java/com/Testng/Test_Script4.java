package com.Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_Script4 {@Test(groups = "sample")
public void m1() {
	Reporter.log("M1 method is Executed",true);
}
@Test(groups = "sample")
public void m2() {
	Reporter.log("M2 method is Executed",true);
}
@Test(groups = "sample")
public void m3() {
	Reporter.log("M3 method is Executed",true);
}
@Test(groups = "sample")
public void m4() {
	Reporter.log("M4 method is Executed",true);
}
@Test(dependsOnGroups =  "sample")
public void m5() {
	Reporter.log("M5 method is Executed",true);
	
	
	
	
	
}
	

}
