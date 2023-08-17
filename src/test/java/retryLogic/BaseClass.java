package retryLogic;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import readConfigFile.ReadConfig;

public class BaseClass {

	WebDriver driver;

	ReadConfig conf;

	@BeforeTest

	public void launchApp() throws Exception {

		System.out.println("launching application");

		conf = new ReadConfig();

		System.out.println("*********" + conf.getApp());

		// app1

		// driverpath

		// System.setProperty("webdriver.chrome.driver",
		// ".\\drivers\\chromedriver.exe");

		String browser = conf.getBrowserDetails();

		if (browser.equalsIgnoreCase("chrome")) {

			System.out.println("execution on chrome browser");

			ChromeOptions option = new ChromeOptions();
	        option.addArguments("--headless");
	        
	        
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver(option);

		}

		else if (browser.equalsIgnoreCase("edge")) {

			System.out.println("execution on edge browser");

			WebDriverManager.edgedriver().setup();

			driver = new EdgeDriver();

		}

		else if (browser.equalsIgnoreCase("edge")) {

			System.out.println("execution on firefox browser");

			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();

		}

		else {

			System.out.println("execution on default : chrome browser");

//			WebDriverManager.chromedriver().setup();
//
//			driver = new ChromeDriver();
			ChromeOptions option = new ChromeOptions();
	        option.addArguments("--headless");
	        
	        
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver(option);

		}

		// System.out.println("execution on chrome browser");

		// WebDriverManager.chromedriver().setup();

		// driver = new ChromeDriver();

		// System.out.println("execution on edge browser");

		// WebDriverManager.edgedriver().setup();

		// driver = new EdgeDriver();

		driver.manage().window().maximize();

		driver.get(conf.getApp());

		Thread.sleep(5000);

	}

	@AfterTest

	public void closingApp() throws Exception {

		System.out.println("closing application");

		Thread.sleep(5000);

		driver.close();

	}
}
