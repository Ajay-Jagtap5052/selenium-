package maven_MiniProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main_ScriptFilpkcart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		 Flipkcart_Ecommerce page= new Flipkcart_Ecommerce(driver);
		 page.EnterProductName("one plus mobile");
		 page.clickicon();
		 page. clickmobilelink();
		

	}

}
