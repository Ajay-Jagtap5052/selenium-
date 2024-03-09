package iListner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Base_Script {
	private WebElement forgetpwd;
	private WebElement findYourAccount;
	private WebElement SearchButton;
	//
	 public Base_Script(WebDriver driver)  {
		 forgetpwd=driver.findElement(By.partialLinkText("Forgotten password"));
		 findYourAccount=driver.findElement(By.id("identify_email"));
		 SearchButton=driver.findElement(By.id("did_submit"));
	 }
	 
	 public void clickonforgetpwd() {
		 forgetpwd.click();
	 }
	 public void setSearch(String emailid) {
		 findYourAccount.sendKeys(emailid);
	 }
	 public void clickonSearch() {
		 SearchButton.click();
	 }
	 
		
	}
	
	


