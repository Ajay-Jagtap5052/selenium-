package maven_MiniProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Flipkcart_Ecommerce {
	private WebElement SearchField;
	private WebElement Searchicon;
	\private WebElement ClickonLink;
	
		
	
	//private WebElement SelectProduct;
	 public  Flipkcart_Ecommerce(WebDriver driver) {
		 SearchField=driver.findElement(By.className("Pke_EE"));
		 Searchicon=driver.findElement(By.className("_2iLD__"));
	   WebElement ClickonLink = driver.findElement(By.className("_4rR01T"));
	 }
	  public void EnterProductName(String mobileName) {
		 SearchField.sendKeys(mobileName);
	 }
	 public void clickicon() {
		Searchicon.click();
	 }
	public void clickmobilelink() {
			ClickonLink.click();
		 
}
	 	
	}
