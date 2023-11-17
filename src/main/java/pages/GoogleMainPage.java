package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import configuration.Config;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class GoogleMainPage {
    private final SelenideElement searchInputField = $x("//textarea[@type='search']");
    private final SelenideElement resultHeader = $x("//h3");

    public GoogleMainPage accessGoogleMainPage() {
        Selenide.open(Config.BASE_URL);
        getWebDriver().manage().window().maximize();
        return this;
    }

    public GoogleMainPage checkInputFieldTooltipText() {
        String expectedTooltipText = "Search";
        String assertFailureMessage = "Tooltip text does not match the expected one";

        String actualTooltipText = searchInputField.getAttribute("title");
        if (!expectedTooltipText.equals(actualTooltipText)) Assert.fail(assertFailureMessage);
        return this;
    }

    public GoogleSearchResultPage searchByName(String firstName, String lastName) {
        String inputText = firstName + " " + lastName;

        searchInputField.shouldBe(Condition.visible).sendKeys(inputText);
        searchInputField.pressEnter();
        return new GoogleSearchResultPage(inputText);
    }

    public GoogleMainPage checkEmptyResultPage() {
        resultHeader.shouldNot(Condition.visible);
        return this;
    }
}
