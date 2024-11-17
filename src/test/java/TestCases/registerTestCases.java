package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Resources.baseClass;
import Resources.commonMethods;
import Resources.constants;
import pageObjectModel.HomePageObjects;
import pageObjectModel.RegisterPageObjects;

public class registerTestCases extends baseClass {

	@Test
	public void verifyRegsiterationWithValidData() throws IOException, InterruptedException {

		HomePageObjects hpo = new HomePageObjects(driver);
		hpo.clickOnMyAccount().click();
		hpo.clickOnregsiter().click();

		RegisterPageObjects rpo = new RegisterPageObjects(driver);

		commonMethods.handleExplictWait(driver, 2, rpo.getfirstName());

		rpo.getfirstName().sendKeys(constants.firstName);
		rpo.getLastName().sendKeys(constants.lastName);
		rpo.geteMail().sendKeys(Gmail);
		rpo.getTelephone().sendKeys(constants.telephone);
		rpo.getPassword().sendKeys(constants.password);
		rpo.getPasswordConfirm().sendKeys(constants.password);
		rpo.getSubscribe().click();
		rpo.getPrivacyPolicy().click();
		rpo.getContinue().click();

		commonMethods.handleAssertion(rpo.getAccountCreationSuccess().getText(), constants.suucefullActCreation);
	}

	@Test(enabled = false)
	public void verifyRegsiterationWithInvalidData() {

	}

	@Test//(enabled = false)
	public void verifyRegsiterationWithBlankData() throws IOException {

		HomePageObjects hpo = new HomePageObjects(driver);
		hpo.clickOnMyAccount().click();
		hpo.clickOnregsiter().click();

		RegisterPageObjects rpo = new RegisterPageObjects(driver);
		rpo.getContinue().click();

		commonMethods.handleAssertion(rpo.getfirstNameWarnig().getText(), constants.firstNameWarnig);
		commonMethods.handleAssertion(rpo.getLastNameWarnig().getText(), constants.LastNameWarnig);
		commonMethods.handleAssertion(rpo.geteMailWarnig().getText(), constants.MailWarnig);
		commonMethods.handleAssertion(rpo.getTelephoneWarnig().getText(), constants.TelephoneWarnig);
		commonMethods.handleAssertion(rpo.getPasswordWarnig().getText(), constants.PasswordWarnig);
		commonMethods.handleAssertion(rpo.getprivacypolicyWarning().getText(), constants.privacypolicyWarning);

	}

}