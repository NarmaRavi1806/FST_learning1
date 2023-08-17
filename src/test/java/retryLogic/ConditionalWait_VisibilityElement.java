package retryLogic;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConditionalWait_VisibilityElement {

	public WebDriver driver;
	public WebDriverWait wait;

	@BeforeTest

	public void setUp() throws Exception {

		// set driver path

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		Thread.sleep(5000);

		driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

	}

	@AfterTest

	public void tearDown() throws Exception {

		Thread.sleep(5000);

		driver.quit();

	}

	@Test

	public void loginlogout() {

		 wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("text3")));

		driver.findElement(By.id("text3")).sendKeys("enter value into text3");

	}

}
