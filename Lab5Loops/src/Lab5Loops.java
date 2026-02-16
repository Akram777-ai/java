import java.util.Scanner;

public class Lab5Loops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задание 1
        System.out.println("Задание 1. Введите число N:");
        int n1 = scanner.nextInt();

        System.out.println("Числа от 1 до " + n1 + ":");
        for (int i = 1; i <= n1; i++) {
            System.out.print(i + " ");
        }

        // Задание 2
        System.out.println("\n\nЗадание 2. Введите число N:");
        int n2 = scanner.nextInt();
        int sum = 0;
        int i = 1;

        while (i <= n2) {
            sum += i;
            i++;
        }
        System.out.println("Сумма от 1 до " + n2 + " = " + sum);

        // Задание 3
        System.out.println("\nЗадание 3. Введите число N:");
        int n3 = scanner.nextInt();
        int factorial = 1;

        for (int j = 1; j <= n3; j++) {
            factorial *= j;
        }
        System.out.println("Факториал " + n3 + " = " + factorial);

        // Задание 4
        System.out.println("\nЗадание 4. Четные числа от 1 до 100:");
        int k = 1;

        while (k <= 100) {
            if (k % 2 != 0) {
                k++;
                continue;
            }
            System.out.print(k + " ");
            k++;
        }

        // Задание 5
        System.out.println("\n\nЗадание 5. Вводите числа (0 для выхода):");
        int number;
        int total = 0;

        do {
            number = scanner.nextInt();
            total += number;
        } while (number != 0);

        System.out.println("Сумма введенных чисел = " + total);

        // Дополнительное задание
        System.out.println("\nТаблица умножения от 1 до 5:");
        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= 5; b++) {
                System.out.print(a * b + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}