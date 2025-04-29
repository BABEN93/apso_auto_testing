package module_11;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Getter;

import java.time.Duration;

public class Button {

    private Integer waitForElement = 10;

    @Getter
    private String name;
    private SelenideElement selector;

    public Button(String name, SelenideElement selector) {
        this.name = name;
        this.selector = selector;
    }

    @Step("Кликаем на кнопку")
    public Button buttonClick() {
        selector.shouldBe(Condition.enabled, Duration.ofSeconds(waitForElement))
                .click();
        return this;
    }
}
