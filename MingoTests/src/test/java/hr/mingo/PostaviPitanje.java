package hr.mingo;

import org.junit.AfterClass;
import org.junit.Test;

public class PostaviPitanje {
	
	@Test
	public void posPitanje() {
		Naslovnica.posPitanje().goTo();
		Naslovnica.posPitanje().inputFields();
		Naslovnica.posPitanje().validations();
	}
			
	@AfterClass
	public static void cleanUP() {
		Browser.driver.close();
	}
}
