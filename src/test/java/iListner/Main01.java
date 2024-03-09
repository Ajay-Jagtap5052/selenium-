package iListner;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main01 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		Base_Script page=new Base_Script(driver);
		page.clickonforgetpwd();
		page.setSearch("Akanksha@gmail.com");
		page.clickonforgetpwd();

	}

}
