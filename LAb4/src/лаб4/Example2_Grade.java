package лаб4;

import java.util.Scanner;

public class Example2_Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите балл (0-100): ");
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
    }
}
