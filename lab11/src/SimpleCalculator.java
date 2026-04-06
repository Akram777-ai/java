import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        double num1 = scanner.nextDouble(); // Чтение первого числа [cite: 147]

        System.out.println("Введите второе число: ");
        double num2 = scanner.nextDouble(); // Чтение второго числа [cite: 149]

        System.out.println("Выберите операцию (+, -, *, /): ");
        char operation = scanner.next().charAt(0); // Чтение знака операции [cite: 151]

        double result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println("Результат: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Результат: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Результат: " + result);
                break;
            case '/':
                if (num2 != 0) { // Проверка деления на ноль [cite: 167]
                    result = num1 / num2;
                    System.out.println("Результат: " + result);
                } else {
                    System.out.println("Ошибка: деление на ноль запрещено.");
                }
                break;
            default:
                System.out.println("Неверная операция.");
        }
    }
}
