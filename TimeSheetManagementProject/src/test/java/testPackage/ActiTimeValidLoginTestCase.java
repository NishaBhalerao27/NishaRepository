package testPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.LoginPage;

public class ActiTimeValidLoginTestCase extends BaseTest {

	private static final String PROP_PATH1 = null;

	@Test
	public void validLoginTestScript() throws IOException
	{
	   LoginPage lp = new LoginPage(driver);
	   Flib flib = new Flib();
	   lp.validLogin(flib.readPropertyData(PROP_PATH1,"Username"),flib.readPropertyData(PROP_PATH1,"Password"));
		
	}
	
}
