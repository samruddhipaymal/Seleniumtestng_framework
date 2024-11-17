package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

	public WebDriver driver; // This driver don't have any scope

	private By eMail = By.xpath("//input[@name='email']");
	private By loginPassword = By.xpath("//input[@name='password']");
	private By submit = By.xpath("//input[@value='Login']");

	public By accountLoginSuccess = By.xpath("//h2[text()='My Account']");

	private By emailInvalid = By.xpath("//input[@name='email']");
	private By loginPasswordInvalid = By.xpath("//input[@name='password']");
	private By submitInvalid = By.xpath("//input[@value='Login']");

	private By Warning = By.xpath("//div[text()=' Warning: No match for E-Mail Address and/or Password.']");

	public LoginPageObjects(WebDriver driver) {
		this.driver = driver;// We have assigned the scope

	}

	public WebElement enterEmail() {
		return driver.findElement(eMail);
	}

	public WebElement enterLoginPassword() {
		return driver.findElement(loginPassword);
	}

	public WebElement clickOnSubmit() {
		return driver.findElement(submit);
	}

	public WebElement AccountLoggedin() {
		return driver.findElement(accountLoginSuccess);
	}

	public WebElement enterEmailInvalid() {
		return driver.findElement(emailInvalid);
	}

	public WebElement enterLoginPasswordInvalid() {
		return driver.findElement(loginPasswordInvalid);
	}

	public WebElement clickOnSubmitInvalid() {
		return driver.findElement(submitInvalid);
	}

	public WebElement Warning() {
		return driver.findElement(Warning);
	}

}