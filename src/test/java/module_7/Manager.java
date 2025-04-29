package module_7;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Manager extends Employee {

    @Disabled
    @Test
    public void work() {
        name = "Вася";
        salary = 10750;
        System.out.println(name + " управляет командой и координирует проекты.");
        System.out.println("ЗП: " + salary);
    }

}
