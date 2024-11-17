package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPageObjects {

	// Your Account Has Been Created!
	// By.xpath("//h1[text()='Your Account Has Been Created!']"

	public WebDriver driver; // This driver dont have any scope

	public By firstName = By.xpath("//input[@name='firstname']");
	public By lastname = By.xpath("//input[@name='lastname']");
	public By eMail = By.xpath("//input[@name='email']");
	public By Telephone = By.xpath("//input[@name='telephone']");
	public By Password = By.xpath("//input[@name='password']");
	public By PasswordConfirm = By.xpath("//input[@name='confirm']");
	public By SubscribeYes = By.xpath("//input[@name='newsletter']");
	public By PrivacyPolicy = By.xpath("//input[@name='agree']");
	public By Continue = By.xpath("//input[@value='Continue']");
	public By accountCreationSuccess = By.xpath("//h1[text()='Your Account Has Been Created!']");

	public By firstNameWarnig = By.xpath("//div[text()='First Name must be between 1 and 32 characters!']");
	public By lastnameWarnig = By.xpath("//div[text()='Last Name must be between 1 and 32 characters!']");
	public By eMailWarnig = By.xpath("//div[text()='E-Mail Address does not appear to be valid!']");
	public By TelephoneWarnig = By.xpath("//div[text()='Telephone must be between 3 and 32 characters!']");
	public By PasswordWarnig = By.xpath("//div[text()='Password must be between 4 and 20 characters!']");
	public By privacypolicyWarning = By.xpath("//div[text()=' Warning: You must agree to the Privacy Policy!']");

	public RegisterPageObjects(WebDriver driver) { // Constructor
		this.driver = driver;// We have assigned the scope

	}

	public WebElement getfirstName() {
		return driver.findElement(firstName);

	}

	public WebElement getLastName() {
		return driver.findElement(lastname);

	}

	public WebElement geteMail() {
		return driver.findElement(eMail);

	}

	public WebElement getTelephone() {
		return driver.findElement(Telephone);

	}

	public WebElement getPassword() {
		return driver.findElement(Password);

	}

	public WebElement getPasswordConfirm() {
		return driver.findElement(PasswordConfirm);

	}

	public WebElement getSubscribe() {
		return driver.findElement(SubscribeYes);
	}

	public WebElement getPrivacyPolicy() {
		return driver.findElement(PrivacyPolicy);

	}

	public WebElement getContinue() {
		return driver.findElement(Continue);
	}

	public WebElement getAccountCreationSuccess() {
		return driver.findElement(accountCreationSuccess);
	}

	public WebElement getfirstNameWarnig() {
		return driver.findElement(firstNameWarnig);

	}

	public WebElement getLastNameWarnig() {
		return driver.findElement(lastnameWarnig);

	}

	public WebElement geteMailWarnig() {
		return driver.findElement(eMailWarnig);

	}

	public WebElement getTelephoneWarnig() {
		return driver.findElement(TelephoneWarnig);

	}

	public WebElement getPasswordWarnig() {
		return driver.findElement(PasswordWarnig);

	}
	public WebElement getprivacypolicyWarning() {
		return driver.findElement(privacypolicyWarning);

	}

}