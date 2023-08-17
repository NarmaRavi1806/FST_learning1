package SeleniumDay7;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTest {

	@BeforeTest

	public void launchApp() {

		System.out.println("launching application");

	}

	@AfterTest

	public void closeApp() {

		System.out.println("closing application");

	}

	@Test

	public void searchItem() {

		System.out.println("test case searchItem ---using testNG");

	}

}
