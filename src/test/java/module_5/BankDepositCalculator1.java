package module_5;

import java.util.Scanner;

public class BankDepositCalculator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму вклада: ");
        float depositAmount = scanner.nextFloat();

        System.out.println("Срок на который можно открыть вклад от 1 до 3 месяцев.");
        System.out.print("Введите срок вклада в месяцах: ");
        int months = scanner.nextInt();
        switch (months) {
            case 1:
                System.out.println("Вклад на 1 месяц");
                break;
            case 2:
                System.out.println("Вклад на 2 месяца");
                break;
            case 3:
                System.out.println("Вклад на 3 месяца");
                break;
            default:
                if (months > 3) {
                    throw new IllegalArgumentException("Ошибка: Введено более 3 месяцев.");
                } else {
                    System.out.println("Ошибка: Неправильный ввод. Срок вклада должен быть от 1 до 3 месяцев.");
                }
                return;
        }

        float interestRate = 0.07f;

        for (int i = 1; i <= months; i++) {
            depositAmount += depositAmount * interestRate;
        }

        System.out.printf("После %d месяцев сумма вклада составит: %.2f%n", months, depositAmount);

        scanner.close();
    }
}
