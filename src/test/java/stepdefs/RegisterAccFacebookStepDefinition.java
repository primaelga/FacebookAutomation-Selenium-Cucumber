package stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.facebook.automation.FacebookAutomation.environment.BaseTest;
import com.facebook.automation.FacebookAutomation.environment.DriverManager;
import com.facebook.automation.FacebookAutomation.environment.DriverManagerFactory;
import com.facebook.automation.FacebookAutomation.methods.BrowserUtils;
import com.facebook.automation.FacebookAutomation.methods.TestCaseFailed;
import com.facebook.automation.FacebookAutomation.pageObjects.HeaderPageObject;
import com.facebook.automation.FacebookAutomation.pageObjects.FacebookRegistration;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class RegisterAccFacebookStepDefinition implements BaseTest{
	FacebookRegistration obj = new FacebookRegistration();
	
	@Given("^I am already on facebook page$")
	public void i_am_already_on_facebook_page() throws Throwable {
		 browser.navigateTo(props.getProperty("baseUrl"));
	}

	@When("^I set first name and last name$")
	public void i_set_first_name_and_last_name() throws Throwable {
	    obj.setName();
	}

	@When("^I set email and confirmation email$")
	public void i_set_email_and_confirmation_email() throws Throwable {
	   obj.setEmail();
	   
	}

	@When("^I enter password for account registered$")
	public void i_enter_password_for_account_registered() throws Throwable {
	   obj.setPwd();
	   
	}

	@When("^I set my birthdate$")
	public void i_set_my_birthdate() throws Throwable {
		obj.setBirthdate("14","Apr","1991");
	}

	@When("^I choose my gender as \"([^\"]*)\"$")
	public void i_choose_my_gender(String gender) throws Throwable {
	   obj.selectGender(gender);
	   Thread.sleep(3000);
	   
	}

	@When("^I click button Daftar$")
	public void i_click_button_Daftar() throws Throwable {
	  obj.clickBtnDaftar();
	}

	@Then("^I see confirmation page$")
	public void i_see_confirmation_page() throws Throwable {
//		Assert.assertTrue(obj.isConfirmationDisplay());
	 
	}
	
	  
//	FacebookRegistration loginObject = new FacebookRegistration();
//	ProfileDashboard profilDashboard = new ProfileDashboard();
//	
//	@When("^user set username with \"([^\"]*)\"$")
//	public void user_set_username(String uname) throws TestCaseFailed {
//		loginObject.verifyUsernameElementPresent();
//		loginObject.enterTextUsername(uname);
//	}
//
//	@When("^user set password with \"([^\"]*)\"$")
//	public void user_set_password(String pwd) throws TestCaseFailed {
//		loginObject.verifyPwdElementPresent();
//		loginObject.enterPwd(pwd);
//	}
//	
//	@When("^click login button$")
//	public void click_login_button() throws TestCaseFailed {
//		loginObject.clickLoginBtn();
//	}
//	
//	@Then("^user could see dashboard title$")
//	public void user_could_see_dashboard_title() throws TestCaseFailed {
//		loginObject.assertDashboardTitle();
//	}
//	
//	@When("^user click toggle button$")
//	public void user_click_toggle_button() {
//		profilDashboard.userClickToggleMenu();
//	}
//	
//	@When("^user click logout$")
//	public void user_click_logout() {
//		loginObject.clickLogoutBtn();
//	}
//	
//	@Then("^user logged out from system$")
//	public void user_logged_out() throws TestCaseFailed {
//		loginObject.assertLoginPageTitle();
//	}
//	
////	@Then("^user will get error message \"([^\"]*)\" on \"([^\"]*)\" field$")
////	public void user_get_error_message(String messageParam, String elem) {
////		String message="";
////		if(elem.contains("username")) {
////			message = loginObject.getTxtUsername().getAttribute("validationMessage"); 
////
////		}else {
////			message = loginObject.getTxtPassword().getAttribute("validationMessage"); 
////
////		}
////				Assert.assertEquals(messageParam, message);
////	}
//	
//	@Then("^user will get error message invalid credential$")
//	public void user_get_error_message_credential() {
//		loginObject.assertInvalidCredential();
//	}
//
//	@When("^click toggle password$")
//	public void user_click_toggle_password() {
//		loginObject.clickTogglePassword();
//	}
//	
//	@Then("^user will see password as \"([^\"]*)\"$")
//	public void user_will_see_password(String pwd) {
//		loginObject.assertPassword(pwd);
//	}
	
}
