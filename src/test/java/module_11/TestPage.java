package module_11;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TestPage {

    WikipediaMainPage wikipediaMainPage = new WikipediaMainPage();
    WikipediaArticleWizardPage wikipediaArticleWizardPage = new WikipediaArticleWizardPage();

    @Disabled
    @Test
    @Step("Тест Логотипа Википедии")
    public void testWikiSearch() {
        wikipediaMainPage.openWikipedia();
        wikipediaMainPage.search("тест");
        wikipediaMainPage.verifyWikiIconDisplayed();
    }

    @Disabled
    @Test
    @Step("Перейти в создать статью")
    public void testGoCreateArticle() {
        wikipediaMainPage.openWikipedia();
        wikipediaMainPage.createArticle();
        wikipediaArticleWizardPage.nextStepButton();
    }
}
