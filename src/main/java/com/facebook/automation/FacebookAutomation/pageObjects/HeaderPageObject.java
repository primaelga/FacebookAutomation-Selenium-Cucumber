package com.facebook.automation.FacebookAutomation.pageObjects;

import com.facebook.automation.FacebookAutomation.environment.BaseTest;
import com.facebook.automation.FacebookAutomation.logger.Log;
import static com.facebook.automation.FacebookAutomation.methods.SelectorType.CSS;
import com.facebook.automation.FacebookAutomation.methods.TestCaseFailed;


public class HeaderPageObject implements BaseTest {
    
    // elements
    String headerCss = "div.header";

    public void verifyHeaderDisplayed() throws TestCaseFailed {
        Log.INFO("Verify header is displayed");
        browser.checkElementPresence(CSS, headerCss);
    }
}
