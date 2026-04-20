import java.util.Scanner;

public class Lab14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задача 1: Сумма от 1 до N
        System.out.print("Введите N: ");
        int n = scanner.nextInt();
        int i = 1, sum = 0;
        do {
            sum += i;
            i++;
        } while (i <= n);
        System.out.println("Сумма от 1 до N: " + sum);

        // Задача 2: Количество цифр
        System.out.print("\nВведите число: ");
        int number = scanner.nextInt();
        int count = 0;
        int temp = number;
        do {
            temp /= 10;
            count++;
        } while (temp != 0);
        System.out.println("Количество цифр: " + count);

        // Задача 3: Таблица умножения
        System.out.print("\nВведите число для таблицы: ");
        int num = scanner.nextInt();
        i = 1;
        do {
            System.out.println(num + " * " + i + " = " + (num * i));
            i++;
        } while (i <= 10);

        // Задача 4: Максимальная цифра
        System.out.print("\nВведите число: ");
        number = scanner.nextInt();
        int max = 0;
        temp = number;
        do {
            int digit = temp % 10;
            if (digit > max) max = digit;
            temp /= 10;
        } while (temp > 0);
        System.out.println("Максимальная цифра: " + max);

        // Задача 5: Палиндром
        System.out.print("\nВведите число: ");
        number = scanner.nextInt();
        int original = number, reversed = 0;
        do {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        } while (number > 0);
        if (original == reversed)
            System.out.println("Палиндром");
        else
            System.out.println("Не палиндром");

        // Задача 6: Чётные цифры
        System.out.print("\nВведите число: ");
        number = scanner.nextInt();
        int evenCount = 0;
        do {
            if ((number % 10) % 2 == 0) evenCount++;
            number /= 10;
        } while (number > 0);
        System.out.println("Чётных цифр: " + evenCount);

        // Задача 7: Случайные числа до 0
        int rand;
        System.out.println("\nСлучайные числа:");
        do {
            rand = (int)(Math.random() * 10);
            System.out.println(rand);
        } while (rand != 0);

        // Задача 8: Сумма до 0
        int input, total = 0;
        do {
            System.out.print("\nВведите число (0 для выхода): ");
            input = scanner.nextInt();
            total += input;
        } while (input != 0);
        System.out.println("Сумма: " + total);

        scanner.nextLine(); // очистка буфера

        // Задача 9: Пароль
        String password;
        do {
            System.out.print("\nВведите пароль (мин 6 символов): ");
            password = scanner.nextLine();
        } while (password.length() < 6);
        System.out.println("Пароль принят");

        // Задача 10: Минимальное число
        int min = Integer.MAX_VALUE;
        do {
            System.out.print("\nВведите число (0 для выхода): ");
            input = scanner.nextInt();
            if (input != 0 && input < min) min = input;
        } while (input != 0);
        System.out.println("Минимальное: " + min);

        scanner.close();
    }
}