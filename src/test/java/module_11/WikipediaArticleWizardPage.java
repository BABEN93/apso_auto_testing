package module_11;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class WikipediaArticleWizardPage {

    private final Button buttonCreateArticle = new Button
            ("Создать статью", $x("//*[text()='Следующий шаг']"));
    private SelenideElement search = $x("//input[@name='search']");

    @Step
    public WikipediaArticleWizardPage nextStepButton() {
        buttonCreateArticle.buttonClick();
        search.shouldBe(Condition.visible);
        return this;
    }
}
