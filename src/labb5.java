import java.util.Scanner;

public class labb5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Лабораторная работа №5");
        System.out.println("1 - Вывод чисел от 1 до N");
        System.out.println("2 - Сумма чисел от 1 до N");
        System.out.println("3 - Факториал числа");
        System.out.println("4 - Чётные числа от 1 до 100");
        System.out.println("5 - Ввод чисел до 0");
        System.out.println("6 - Таблица умножения 1-5");
        System.out.print("Выберите задание: ");

        int choice = scanner.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Введите число N: ");
                int N1 = scanner.nextInt();
                for (int i = 1; i <= N1; i++) {
                    System.out.println(i);
                }
                break;

            case 2:
                System.out.print("Введите число N: ");
                int N2 = scanner.nextInt();
                int sum = 0;
                int i = 1;
                while (i <= N2) {
                    sum += i;
                    i++;
                }
                System.out.println("Сумма = " + sum);
                break;

            case 3:
                System.out.print("Введите число N: ");
                int N3 = scanner.nextInt();
                long factorial = 1;
                for (int j = 1; j <= N3; j++) {
                    factorial *= j;
                }
                System.out.println("Факториал = " + factorial);
                break;

            case 4:
                int k = 1;
                while (k <= 100) {
                    if (k % 2 != 0) {
                        k++;
                        continue;
                    }
                    System.out.println(k);
                    k++;
                }
                break;

            case 5:
                int number;
                int total = 0;
                do {
                    System.out.print("Введите число (0 для выхода): ");
                    number = scanner.nextInt();
                    total += number;
                } while (number != 0);
                System.out.println("Сумма введённых чисел = " + total);
                break;

            case 6:
                for (int a = 1; a <= 5; a++) {
                    for (int b = 1; b <= 5; b++) {
                        System.out.print(a * b + "\t");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Неверный выбор!");
        }

        scanner.close();
    }
}
