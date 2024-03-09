package include_Exlude;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Homepage {
	@Test
	public void HomeApp() {
		Reporter.log("Home page of App is working ",true);
		
	}
	
		@Test
		public void Homeverify() {
			Reporter.log("Home page verify ",true);
			
		}

	}



