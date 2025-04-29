package module_7;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Circle extends Shape {

    @Disabled
    @Test
    @Override
    void draw() {
        System.out.println("Рисуется круг.");
    }
}
