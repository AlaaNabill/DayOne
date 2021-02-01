package tests;

import org.testng.annotations.Test;

import pages.Home;
import pages.Register;
import utilities.TestBase;

public class SecondTest extends Register{
	
	@Test
	public void SecondTestCase(){
		
		Home.Register();
		Register.FirstName();
		Register.LastName();
		Register.Email();
		Register.Password();
		Register.ConfirmPassword();
	}

}
