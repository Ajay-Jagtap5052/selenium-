package include_Exclude;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Home {
	@Test
	public void HomeApp() {
		Reporter.log("Home page of App is working ",true);
		
	}
	
		@Test
		public void Homeverify() {
			Reporter.log("Home page verify ",true);
			
		}


}
