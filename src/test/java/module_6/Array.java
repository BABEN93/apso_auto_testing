package module_6;

public class Array {

    public static void main(String[] args) {

        String[] array = {"привет", "ПОКА", "гипербола"};

        System.out.println(array[0].toUpperCase());

        System.out.println(array[1].toLowerCase());

        String formattedString = array[1].charAt(0) + " " + array[1].charAt(1) + " " + array[1].substring(2);

        System.out.println(formattedString);

    }

}
