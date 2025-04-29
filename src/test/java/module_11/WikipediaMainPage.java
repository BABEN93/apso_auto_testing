package module_11;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class WikipediaMainPage {

    private String baseUrl = "https://ru.wikipedia.org";
    private SelenideElement searchInput = $x("//*[@id='searchInput']");
    private SelenideElement wikiLogo = $x("/html/body/div[4]/div[2]/div/a");
    private final Button buttonCreateArticle = new Button
            ("Создать статью", $x("//*[text()='Создать статью']"));

    @Step("Открыть wikipedia")
    public WikipediaMainPage openWikipedia() {
        open(baseUrl);
        return this;
    }

    @Step("Перейти в 'Создать статью'")
    public WikipediaMainPage createArticle() {
        buttonCreateArticle.buttonClick();
        return this;
    }

    ;

    @Step("Ввести значение в строку поиска и нажать 'Найти'")
    public WikipediaMainPage search(String query) {
        $(searchInput).shouldBe(Condition.visible).setValue(query).pressEnter();
        return this;
    }

    @Step("Проверить, логотип Википедии отображается")
    public WikipediaMainPage verifyWikiIconDisplayed() {
        wikiLogo.shouldBe(Condition.visible);
        Allure.addAttachment("Результат теста", "Логотип отображается!");
        return this;
    }
}
