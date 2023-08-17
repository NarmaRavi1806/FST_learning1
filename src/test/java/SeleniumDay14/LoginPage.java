package SeleniumDay14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver rdriver) {

		// this.driver = driver;

		driver = rdriver;

		PageFactory.initElements(rdriver, this);

	}

	// identification

	// By txtEmail = By.cssSelector("input#Email");

	// By txtPass = By.cssSelector("input#Password");

	// By chkRem = By.cssSelector("input#Password");

	// By btnLogin = By.tagName("button");

	//

	// By btnLogout = By.partialLinkText("ogou");

	// PageFactory ---- designing page object model

	@FindBy(css = "input#Email")

	WebElement txt_email;

	@FindBy(css = "input#Password")

	WebElement txt_Pass;

	@FindBy(xpath = "//input[@name='RememberMe']")

	WebElement chk_Rem;

	@FindBy(tagName = "button")

	WebElement btn_Login;

	@FindBy(partialLinkText = "ogou")

	WebElement btn_Logout;

	// Methods/Actions

	public void enterEmail(String email) {

		// // driver is null

		txt_email.clear();

		txt_email.sendKeys(email);

	}

	// public void enterEmailCypress(String email) {

	//

	// // driver is null

	// cy.get(txtEmail).type(email);

	//

	// }

	public void enterPass(String pwd) {

		txt_Pass.clear();

		txt_Pass.sendKeys(pwd);

	}

	public void clickRemCheckbox() {

		chk_Rem.click();

	}

	public void clickLoginButton() {

		btn_Login.click();

	}

	public void clickLogoutButton() {

		btn_Logout.click();

	}

	public void verifyApplicationTitle(String expTitle) throws InterruptedException {

		Thread.sleep(3000);

		Assert.assertEquals(driver.getTitle(), expTitle);

	}

	public void login(String email, String pass) {

		enterEmail(email);

		enterPass(pass);

		clickRemCheckbox();

		clickLoginButton();

	}

	public boolean verifyEmailDisplayed() {

		return txt_email.isDisplayed();

	}

}
