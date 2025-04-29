package module_11;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

public class TestPage {

    Page page = new Page();

    @Test
    @Step("Тест Логотипа Википедии")
    public void testWikiSearch() {
        try {
            page.openWikipedia();
            page.search("тест");
            page.verifyWikiIconDisplayed();
        } finally {
            page.tearDown();
        }
    }
}
