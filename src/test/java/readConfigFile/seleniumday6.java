package readConfigFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumday6 {
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");



        driver = new ChromeDriver();
        
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
        WebElement userName = driver.findElement(By.id("Email"));
        userName.clear();
        userName.sendKeys("admin@yourstore.com");
        
        WebElement password = driver.findElement(By.id("Password"));
        password.clear();
        
        password.sendKeys("admin");
        
driver.findElement(By.name("RememberMe")).click();

        

        driver.findElement(By.tagName("button")).click();

        

        

        

        Thread.sleep(4000);

        System.out.println("Application Title after login: " + driver.getTitle());

        System.out.println("Application URL after login : " + driver.getCurrentUrl());

        

        Thread.sleep(4000);

        

        driver.findElement(By.linkText("Logout")).click();
        
        
        
        
		

	}

}
