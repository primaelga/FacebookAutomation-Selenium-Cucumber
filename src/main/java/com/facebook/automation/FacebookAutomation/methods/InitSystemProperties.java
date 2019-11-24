package com.facebook.automation.FacebookAutomation.methods;

import com.facebook.automation.FacebookAutomation.environment.BaseTest;
import com.facebook.automation.FacebookAutomation.environment.WebDriverSetup;

public class InitSystemProperties implements BaseTest {

	WebDriverSetup chromeDriverSetup = new WebDriverSetup();

	public void setWebdriverSystemProperty() {
		System.setProperty("webdriver.chrome.driver", chromeDriverSetup.getChromeDriverPath());
		System.setProperty("webdriver.gecko.driver", chromeDriverSetup.getfirefoxDriverPath());
	}
}