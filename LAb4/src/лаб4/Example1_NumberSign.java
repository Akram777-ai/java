package лаб4;

import java.util.Scanner;

public class Example1_NumberSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Число положительное");
        } else if (number < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число равно нулю");
        }
    }
}

