package lab4;

import java.util.Scanner;

public class Example10_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();

        System.out.print("Введите операцию (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();

        switch (op) {
            case '+' -> System.out.println("Результат: " + (a + b));
            case '-' -> System.out.println("Результат: " + (a - b));
            case '*' -> System.out.println("Результат: " + (a * b));
            case '/' -> {
                if (b != 0) {
                    System.out.println("Результат: " + (a / b));
                } else {
                    System.out.println("Ошибка: деление на ноль");
                }
            }
            default -> System.out.println("Неизвестная операция");
        }
    }
}

