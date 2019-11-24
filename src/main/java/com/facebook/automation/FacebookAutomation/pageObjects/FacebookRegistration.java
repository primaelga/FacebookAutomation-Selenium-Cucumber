package com.facebook.automation.FacebookAutomation.pageObjects;

import static com.facebook.automation.FacebookAutomation.methods.SelectorType.CSS;
import static com.facebook.automation.FacebookAutomation.methods.SelectorType.NAME;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.facebook.automation.FacebookAutomation.environment.BaseTest;
import com.facebook.automation.FacebookAutomation.logger.Log;
import com.facebook.automation.FacebookAutomation.methods.SelectorType;
import com.facebook.automation.FacebookAutomation.methods.TestCaseFailed;
import com.facebook.automation.FacebookAutomation.utilities.Helper;

import junit.framework.Assert;

import static com.facebook.automation.FacebookAutomation.methods.SelectorType.ID;
import static com.facebook.automation.FacebookAutomation.methods.SelectorType.XPATH;

import java.util.HashMap;

public class FacebookRegistration implements BaseTest {

	private String firstNametxt = "firstname";
	private String lastNametxt = "lastname";
	private String regEmail = "reg_email__";
	private String regEmailConfirm = "reg_email_confirmation__";
	private String regPwd = "reg_passwd__";
	private String birthdayDay = "birthday_day";
	private String birthdayMonth = "birthday_month";
	private String birthdayYear = "birthday_year";
	private String genderOpt = "gender_wrapper";
	private String btnRegis = "websubmit";
	private String confirmStep = "/html/body/div[1]/div[3]/div[1]/div/form/div/div[1]/img";

	Helper helper = new Helper();

	public void setName() {
		HashMap nameUser = helper.generateString();
		// set first name
		browser.click(NAME, firstNametxt);
		browser.enterTextBySendKeys(NAME, nameUser.get("firstName").toString(), firstNametxt);
		browser.click(NAME, lastNametxt);
		browser.enterTextBySendKeys(NAME, nameUser.get("lastName").toString(), lastNametxt);
	}

	public void setEmail() {
		String emailUser = helper.generateEmailRandom();
		// set email
		browser.click(NAME, regEmail);
		browser.enterTextBySendKeys(NAME, emailUser, regEmail);
		browser.click(NAME, regEmailConfirm);
		browser.enterTextBySendKeys(NAME, emailUser, regEmailConfirm);
	}
	
	public void setPwd() {
		String pwdUser = helper.generatePwd();
		browser.click(NAME, regPwd);
		browser.enterTextBySendKeys(NAME, pwdUser, regPwd);
	}
	
	public void setBirthdate(String day,String month, String year) {
		browser.setDropdown(birthdayDay, day);
		browser.setDropdown(birthdayMonth, month);
		browser.setDropdown(birthdayYear, year);
	}
	
	public void selectGender(String gender) {
		int index = 0;
		switch(gender) {
		  case "Perempuan":
		    index = 0;
		    break;
		  case "Laki-laki":
		   index = 1;
		    break;
		  case "Khusus":
			   index = 2;
			    break;
		  default:
		    index = 0;
		}
		browser.getElementByAttribute(genderOpt, index);
	}
	
	public void clickBtnDaftar() {
		browser.click(NAME, btnRegis);
	}
	
	public Boolean isConfirmationDisplay() {
		Boolean result = browser.isElementDisplayed(XPATH, confirmStep);
		return result;
	}

//	 public void assertInvalidCredential() {
//			String textTitle = this.alertInvalidCredential.getAttribute("innerHTML");
//			Assert.assertEquals("invalid_credentials", textTitle);
//		 }
//	 
//	 public void clickTogglePassword() {
//			this.btn_toggle_password.click();
//		 }
//	 
//	 public void assertPassword(String pwd) {
//		 //String txtPwd = this.txtPassword.getAttribute("value");
//		// Assert.assertEquals(pwd, txtPwd);
//	 }
//	 
//	 public void verifyUsernameElementPresent() throws TestCaseFailed {
//	        Log.INFO("Verify text username is displayed");
//	        browser.checkElementPresence(ID,username);
//	    }
//	 
//	 public void verifyPwdElementPresent() throws TestCaseFailed {
//	        Log.INFO("Verify text password is displayed");
//	        browser.checkElementPresence(ID,pwd);
//	    }
//	 
//	  public void enterTextUsername(String searchText) throws TestCaseFailed {
//	        Log.INFO("Enter username: "+searchText);
//	        browser.click(ID, username);
//	        browser.enterTextByActions(ID, searchText, username);
//	    }
//	  
//	  public void enterPwd(String searchText) throws TestCaseFailed {
//	        Log.INFO("Enter password: "+searchText);
//	        browser.click(ID, pwd);
//	        browser.enterTextByActions(ID, searchText, pwd);
//	    }
//	  
//	  public void clickLoginBtn() throws TestCaseFailed {
//	        Log.INFO("Click Login Button");
//	        browser.click(ID, btnLogin);
//	    }
//	  
//	  public void assertDashboardTitle() throws TestCaseFailed {
//		  Log.INFO("Verify Dashboard Title");
//		  browser.checkElementPresence(CSS, titleDashboard);
//	  }
//	  
//	  public void assertLoginPageTitle() throws TestCaseFailed {
//		  Log.INFO("Verify Login Page Title");
//		  browser.checkElementPresence(CSS, titleLogin);
//	  }
//	  
//	  public void clickLogoutBtn() {
//		  Log.INFO("Click Logout Button");
//		  browser.clickBtnJavaScript(CSS,btnLogout);
//	  }

}
