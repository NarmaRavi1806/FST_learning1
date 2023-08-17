package SeleniumDay14;

import org.testng.annotations.Test;

public class LoginTest extends TestBase {

	@Test

	public void verifyLoginFeature() throws Exception {

		// lp.login("admin@yourstore.com", "admin");

		lp.login(Constants.username, Constants.password);

		lp.verifyApplicationTitle("Dashboard / nopCommerce administration");

		lp.clickLogoutButton();

		lp.verifyApplicationTitle("Your store. Login");

	}

}
