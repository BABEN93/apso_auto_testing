package module_13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionHandling {

    @Test
    void exceptionNullPointer() {
        try {
            System.out.println((char[]) null);
            Assertions.assertTrue(false);
        } catch (NullPointerException e) {
            System.out.println("Поймано исключение NullPointerException: " + e.getMessage());
            Assertions.assertTrue(true);
        }
    }

}