package module_3;

import org.junit.jupiter.api.Test;

public class Aclass {

    public String a;
    public int b;
    static String c;

    @Test
    public void staticVariables() {
        c = "Новое значение переменной";
        System.out.println("Статическая переменная c: " + c);
    }
}
