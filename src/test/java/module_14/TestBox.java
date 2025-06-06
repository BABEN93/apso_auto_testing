package module_14;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

public class TestBox {

    BoxFilter boxFilter = new BoxFilter();

    @Test
    @Step("Коробки >30")
    public void testBoxes(){
        boxFilter.wideBoxesLargerThan30cm();
    }
}
