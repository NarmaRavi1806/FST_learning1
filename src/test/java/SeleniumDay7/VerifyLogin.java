package SeleniumDay7;

import org.junit.Test;
import org.openqa.selenium.By;

public class VerifyLogin extends BaseClass {
	
	@Test

    public void verifyLoginTest() throws Exception {

        

        

        Thread.sleep(5000);

        System.out.println("login test case");

        

        driver.findElement(By.cssSelector("[name='Email']")).clear();

        driver.findElement(By.cssSelector("[name='Email']")).sendKeys("admin@yourstore.com");

        

        

        driver.findElement(By.cssSelector("input[type=\"password\"]")).clear();

        driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("admin");

        

        

        driver.findElement(By.cssSelector("[type=\"checkbox\"]")).click();

        

        

        driver.findElement(By.cssSelector("[type=\"submit\"]")).click();

        Thread.sleep(5000);

        

        driver.findElement(By.cssSelector("[href=\"/logout\"")).click();

        

    }

}
