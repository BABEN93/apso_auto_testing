package module_5;

import java.util.Scanner;

public class BankDepositCalculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму вклада: ");
        float depositAmount = scanner.nextFloat();

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

        int currentMonth = 1;

        while (currentMonth <= months) {
            depositAmount += depositAmount * interestRate;
            currentMonth++;
        }

        System.out.printf("После %d месяцев сумма вклада составит: %.2f%n", months, depositAmount);

        scanner.close();
    }
}
