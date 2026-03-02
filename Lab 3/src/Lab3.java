import java.util.Scanner;

public class Lab3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Задание 1. Последовательность выполнения команд");

        int a = 5;
        int b = 10;
        int c = 15;

        int sum = a + b + c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("Сумма = " + sum);

        System.out.println("\nЗадание 2. Арифметические операции");

        double num1 = 8;
        double num2 = 4;

        System.out.println("Сложение: " + (num1 + num2));
        System.out.println("Умножение: " + (num1 * num2));
        System.out.println("Деление: " + (num1 / num2));

        System.out.println("\nЗадание 3. Оператор присваивания");

        int x = 7;
        System.out.println("Начальное значение x = " + x);

        x = x + 5;   // присваивание с выражением
        System.out.println("Новое значение x = " + x);

        System.out.println("\nЗадание 4. Ввод и вывод данных");

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        int square = number * number;

        System.out.println("Квадрат числа = " + square);

        System.out.println("\nЗадание 5. Площадь прямоугольника");

        System.out.print("Введите длину: ");
        double length = scanner.nextDouble();

        System.out.print("Введите ширину: ");
        double width = scanner.nextDouble();

        double area = length * width;

        System.out.println("Площадь прямоугольника = " + area);

        scanner.close();
    }
}