package automationTests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.GoogleMainPage;

import static configuration.Config.firstName;
import static configuration.Config.lastName;

public class GoogleTest extends BaseTest {
    @Test
    public void checkGoogleSearchFunctionality() {
        GoogleMainPage googleMainPage = new GoogleMainPage();
        googleMainPage
                .accessGoogleMainPage()
                .checkInputFieldTooltipText()
                .searchByName(firstName, lastName)
                .validateSearchResult()
                .returnToMainPage()
                .checkEmptyResultPage();
    }
}
