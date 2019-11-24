package com.facebook.automation.FacebookAutomation.environment;

import com.facebook.automation.FacebookAutomation.methods.BrowserUtils;
import com.facebook.automation.FacebookAutomation.methods.PropertiesManagementMethods;

public interface BaseTest {
	PropertiesManagementMethods props = new PropertiesManagementMethods();
	BrowserUtils browser = new BrowserUtils();
}
