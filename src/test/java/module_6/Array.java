package module_6;

public class Array {

    public static void main(String[] args) {

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

    }
}
