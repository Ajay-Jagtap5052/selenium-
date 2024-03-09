package com.Testng;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Date_Provider {
	@Test
	@DataProvider
	public Object[][]data(){
		Object[][]obj=new Object[2][2];
		obj[0][0]="ADMIN1";
		obj[0][1]="MANAGER1";
		obj[1][0]="ADMIN2";
		obj[1][1]="MANAGER2";
		
		return obj;
	}
	@Test(dataProvider = "data")
	public void signup(String un,String pwd)
	{
		Reporter.log(un,true);
		Reporter.log(pwd,true);


		
		
	}
	

}
