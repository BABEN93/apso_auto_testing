package module_7;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Developer extends Employee {

    @Disabled
    @Test
    public void work() {
        name = "Аня";
        salary = 14855;
        System.out.println(name + " разработка микросервисов");
        System.out.println("ЗП: " + salary);

        name = "Лена";
        salary = 18877;
        System.out.println(name + " ТимЛид команды");
        System.out.println("ЗП: " + salary);
    }

}
