package module_3;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Bclass {

    Aclass aclass = new Aclass();

    @Disabled
    @Test
    public void redefineVariables (){
        aclass.a = "Новое значение переменной";
        aclass.b = 1234567890;

        System.out.println("Публичная переменная а: " + aclass.a);
        System.out.println("Публичная переменная b: " + aclass.b);
    }

}
