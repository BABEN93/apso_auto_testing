package module_4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Tansport {

    @BeforeEach
    void resultMetod() {
        System.out.println("RESULT_METOD:");
    }

    Car car = new Car("VAZ", "1991");
    Car car2 = new Car("UAZ", "1988");
    Car car3 = new Car("GAZ", "2000", "black");
    Car car4 = new Car("", "", "");

    @Test
    public void getCar1() {
        car.getCarModelAndYear();
    }

    @Test
    public void getCar2() {
        car2.getCarModelAndYear();
    }

    @Test
    public void getCar3() {
        car3.getCarModelAndYearAndColour("GAZ");
    }

    @Test
    public void getCar4() {
        car4.getCarModelAndYearAndColour("VAZ");
    }


}
