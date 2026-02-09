package lab4;

import java.util.Scanner;

public class Example3_CompareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("Первое число больше");
        } else if (a < b) {
            System.out.println("Второе число больше");
        } else {
            System.out.println("Числа равны");
        }
    }
}

