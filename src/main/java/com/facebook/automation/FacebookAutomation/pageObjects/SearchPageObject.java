package com.facebook.automation.FacebookAutomation.pageObjects;

import com.facebook.automation.FacebookAutomation.environment.BaseTest;
import com.facebook.automation.FacebookAutomation.logger.Log;
import static com.facebook.automation.FacebookAutomation.methods.SelectorType.CSS;

import com.facebook.automation.FacebookAutomation.methods.TestCaseFailed;

public class SearchPageObject implements BaseTest {
    
    // elements
    String searchFormCSS = "div.searching";

    public void verifySearchDisplayed() throws TestCaseFailed {
        Log.INFO("Verify search is displayed");
        browser.checkElementPresence(CSS, searchFormCSS);
    }

    public void enterSearchText(String searchText) throws TestCaseFailed {
        Log.INFO("Enter search text: "+searchText);
        browser.click(CSS, searchFormCSS);
        browser.enterTextByActions(CSS, searchText, searchFormCSS);
    }
}
