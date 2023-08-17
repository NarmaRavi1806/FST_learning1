package retryLogic;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Assignment1 extends BaseClass {

	Properties prop;
	Logger log;

	public Assignment1() throws Exception {

		FileInputStream fis = new FileInputStream(".\\testData\\config.properties");

		prop = new Properties();

		prop.load(fis);

	}

	@Test
	public void open_application() throws Exception {
		Thread.sleep(4000);
		log = Logger.getLogger("nopComm Application");

		PropertyConfigurator.configure(".\\testData\\log4j.properties");

		log.info("---------------info-------------");

		log.warn("---------------warn-------------");

		log.error("---------------error-------------");
		
		log.info("login user id");

		WebElement txtEmail = driver.findElement(By.id("Email"));

		txtEmail.clear();

		Thread.sleep(2000);

		System.out.println(prop.getProperty("userid"));

		txtEmail.sendKeys(prop.getProperty("userid"));

		Thread.sleep(6000);
		log.info("send password " + prop.getProperty("password"));

		driver.findElement(By.name("Password")).clear();

		driver.findElement(By.name("Password")).sendKeys(prop.getProperty("password"));
		log.info("click remember me");

		driver.findElement(By.name("RememberMe")).click();

		driver.findElement(By.tagName("button")).click();

		Thread.sleep(4000);
		
		log.info("get title of the page " + driver.getTitle());

		System.out.println("Application Title after login: " + driver.getTitle());

		System.out.println("Application URL after login : " + driver.getCurrentUrl());

		Thread.sleep(4000);
		
		log.info("click logout");

		driver.findElement(By.linkText("Logout")).click();

		Thread.sleep(4000);
		
		log.info("get title after logout " + driver.getTitle());

		System.out.println("Application Title after logout: " + driver.getTitle());

		System.out.println("Application URL after logout : " + driver.getCurrentUrl());

	}

}
