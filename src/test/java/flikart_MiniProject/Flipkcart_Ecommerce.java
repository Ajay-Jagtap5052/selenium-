package flikart_MiniProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkcart_Ecommerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     WebDriver driver=new FirefoxDriver();
     driver.get("https://www.flipkart.com/");
     driver.findElement(By.className("Pke_EE")).sendKeys("one plus mobiles"
     		+ "++");
     driver.findElement(By.className("_2iLD__")).click();
     
	}

}
