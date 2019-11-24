package stepdefs;

import com.facebook.automation.FacebookAutomation.pageObjects.SearchPageObject;

import cucumber.api.java.en.And;

public class SearchTestStepDefs {
    
    SearchPageObject search = new SearchPageObject();

    @And("^my search is displayed$")
    public void verifySearchDisplayed() throws Throwable {
        search.verifySearchDisplayed();
    }

    @And("^user enters (.*) in search form$")
    public void enterSearchText(String searchText) throws Throwable {
        search.enterSearchText(searchText);
    }
}
