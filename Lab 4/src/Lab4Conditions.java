import java.util.Scanner;

public class Lab4Conditions {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Пример 1
        System.out.println("Пример 1. Введите число:");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("Число положительное");
        } else if (num < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число равно нулю");
        }

        // Пример 2
        System.out.println("\nПример 2. Введите балл (0-100):");
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("Оценка: 5");
        } else if (score >= 75) {
            System.out.println("Оценка: 4");
        } else if (score >= 60) {
            System.out.println("Оценка: 3");
        } else {
            System.out.println("Оценка: 2");
        }

        // Пример 3
        System.out.println("\nПример 3. Введите два числа:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("Первое число больше");
        } else if (a < b) {
            System.out.println("Второе число больше");
        } else {
            System.out.println("Числа равны");
        }

        // Пример 4
        System.out.println("\nПример 4. Введите номер дня недели (1-7):");
        int day = scanner.nextInt();

        switch (day) {
            case 1: System.out.println("Понедельник"); break;
            case 2: System.out.println("Вторник"); break;
            case 3: System.out.println("Среда"); break;
            case 4: System.out.println("Четверг"); break;
            case 5: System.out.println("Пятница"); break;
            case 6: System.out.println("Суббота"); break;
            case 7: System.out.println("Воскресенье"); break;
            default: System.out.println("Неверный номер дня");
        }

        // Пример 5
        System.out.println("\nПример 5. Введите число:");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число нечётное");
        }

        // Пример 6
        System.out.println("\nПример 6. Введите возраст:");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Доступ разрешён");
        } else {
            System.out.println("Доступ запрещён");
        }

        // Пример 7
        System.out.println("\nПример 7. Введите номер месяца (1-12):");
        int month = scanner.nextInt();

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31 день");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 дней");
                break;
            case 2:
                System.out.println("28 или 29 дней");
                break;
            default:
                System.out.println("Неверный месяц");
        }

        // Пример 8
        System.out.println("\nПример 8. Введите температуру:");
        int temp = scanner.nextInt();

        if (temp < 0) {
            System.out.println("Холодно");
        } else if (temp <= 25) {
            System.out.println("Тепло");
        } else {
            System.out.println("Жарко");
        }

        // Пример 9
        System.out.println("\nПример 9. Введите число:");
        int range = scanner.nextInt();

        if (range >= 10 && range <= 50) {
            System.out.println("Число входит в диапазон 10-50");
        } else {
            System.out.println("Число вне диапазона");
        }

        // Пример 10
        System.out.println("\nПример 10. Введите два числа:");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        System.out.println("Введите операцию (+, -, *, /):");
        char operation = scanner.next().charAt(0);

        switch (operation) {
            case '+':
                System.out.println("Результат: " + (x + y));
                break;
            case '-':
                System.out.println("Результат: " + (x - y));
                break;
            case '*':
                System.out.println("Результат: " + (x * y));
                break;
            case '/':
                if (y != 0)
                    System.out.println("Результат: " + (x / y));
                else
                    System.out.println("Ошибка: деление на ноль");
                break;
            default:
                System.out.println("Неверная операция");
        }

        scanner.close();
    }
}