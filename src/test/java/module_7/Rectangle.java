package module_7;

import org.junit.jupiter.api.Test;

public class Rectangle extends Shape {

    @Test
    @Override
    void draw() {
        System.out.println("Рисуется прямоугольник.");
    }
}
