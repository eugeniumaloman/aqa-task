package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GoogleSearchResultPage {
    private final SelenideElement resultHeader = $x("//h3");
    private final SelenideElement googleUpperLogo = $x("//a[@id='logo']");
    private String searchInputText = "";

    public GoogleSearchResultPage(String searchInputText) {
        this.searchInputText = searchInputText;
    }

    public GoogleSearchResultPage validateSearchResult() {
        resultHeader.shouldHave(text(searchInputText));
        return this;
    }

    public GoogleMainPage returnToMainPage() {
        googleUpperLogo.shouldBe(Condition.visible).click();
        return new GoogleMainPage();
    }
}
