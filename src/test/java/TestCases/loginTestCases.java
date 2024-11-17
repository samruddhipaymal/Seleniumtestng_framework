package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Resources.baseClass;
import Resources.commonMethods;
import Resources.constants;
import pageObjectModel.HomePageObjects;
import pageObjectModel.LoginPageObjects;

public class loginTestCases extends baseClass {

	@Test
	public void verifyLoginWithValidData() throws IOException {

		HomePageObjects hpo = new HomePageObjects(driver);
		hpo.clickOnMyAccount().click();
		hpo.clickOnlogin().click();

		LoginPageObjects lpo = new LoginPageObjects(driver);
		lpo.enterEmail().sendKeys(Gmail);
		lpo.enterLoginPassword().sendKeys(constants.password);
		lpo.clickOnSubmit().click();

		commonMethods.handleAssertion(lpo.AccountLoggedin().getText(), constants.LoggedinExpected);
	}

	@Test(enabled = false)
	public void verifyLoginWithInvalidData() throws IOException {

		HomePageObjects hpo = new HomePageObjects(driver);
		hpo.clickOnMyAccount().click();
		hpo.clickOnlogin().click();

		LoginPageObjects lpo = new LoginPageObjects(driver);
		lpo.enterEmailInvalid().sendKeys(constants.enterEmailInvalid);
		lpo.enterLoginPasswordInvalid().sendKeys(constants.enterLoginPasswordInvalid);
		lpo.clickOnSubmitInvalid().click();

		commonMethods.handleAssertion(lpo.Warning().getText(), constants.VerifyLoggedinWarningExpected);

	}

}