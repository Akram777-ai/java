package лаб4;

import java.util.Scanner;

public class Example8_Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру: ");
        int temp = scanner.nextInt();

        if (temp < 0) {
            System.out.println("Холодно");
        } else if (temp <= 20) {
            System.out.println("Тепло");
        } else {
            System.out.println("Жарко");
        }
    }
}
