package module_6;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class Array {

    @Disabled
    @Test
    public void arrayString() {

        int index = generateRandomNumber();

        String[] array = {"привет", "ПОКА", "гипербола"};

        System.out.println(array[0].toUpperCase());

        System.out.println(array[1].toLowerCase());

        for (String str : array) {
            if (str.charAt(1) == 'О') {
                StringBuilder formattedString = new StringBuilder();
                formattedString
                        .append(str.charAt(0))
                        .append(" ")
                        .append(str.charAt(1))
                        .append(" ")
                        .append(str.charAt(2))
                        .append(str.charAt(3));
                System.out.println(formattedString);
            }
        }

        System.out.println("Рандом значение: " + array[index]);
    }

    private int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(3) + 1;
    }

}
