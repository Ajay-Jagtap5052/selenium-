package com.Testng;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class Parameterized {
	@Parameters({"un","pwd"})
	@Test
	public void signup(String un,String pwd) {

}
}