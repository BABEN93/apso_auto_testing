package module_11;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Page {

    private String baseUrl = "https://ru.wikipedia.org";
    private By searchInput = By.xpath("//*[@id=\"searchInput\"]");
    private By wikiLogo = By.xpath("/html/body/div[4]/div[2]/div/a");

    WebDriver driver = new FirefoxDriver();

    @Step("Открыть wikipedia")
    public void openWikipedia() {
        driver.get(baseUrl);
    }

    @Step("Ввести значение в строку поиска и нажать 'Найти'")
    public void search(String query) {
        driver.findElement(searchInput).sendKeys(query + Keys.ENTER);

    }

    @Step("Проверить, логотип википедия")
    public void verifyWikiIconDisplayed() {
        WebElement wikiIcon = driver.findElement(wikiLogo);
        assertTrue(wikiIcon.isDisplayed(), "wiki лого не отображается");
        if (wikiIcon != null) {
            Allure.addAttachment("Результат теста", "Логотип Отображается!");
        } else {
            Allure.addAttachment("Результат теста", "Логотип НЕ отображается!");
            new RuntimeException("Ошибка");
        }
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
