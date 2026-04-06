import java.util.Scanner;

public class Lab12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Lab12: Работа со строками ===");
            System.out.println("1. Вывести строку");
            System.out.println("2. Длина строки");
            System.out.println("3. Сравнение двух строк");
            System.out.println("4. Получить символ по индексу");
            System.out.println("5. Подстрока");
            System.out.println("6. Замена символов");
            System.out.println("7. Преобразование регистра");
            System.out.println("8. Проверить, пустая ли строка");
            System.out.println("9. Содержит ли подстроку");
            System.out.println("10. Соединение строк");
            System.out.println("11. Разделение строки");
            System.out.println("12. Проверка равенства без учёта регистра");
            System.out.println("13. Начинается ли со строки");
            System.out.println("14. Заканчивается ли строкой");
            System.out.println("15. Удаление пробелов");
            System.out.println("16. Повтор строки");
            System.out.println("17. Конвертация числа в строку");
            System.out.println("18. Поиск первого символа");
            System.out.println("19. Поиск последнего символа");
            System.out.println("20. Реверс строки");
            System.out.println("0. Выход");
            System.out.print("Выберите задание: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // убрать \n

            switch (choice) {

                case 1: {
                    System.out.print("Введите строку: ");
                    String s = scanner.nextLine();
                    System.out.println("Вы ввели: " + s);
                    break;
                }

                case 2: {
                    System.out.print("Введите строку: ");
                    String s = scanner.nextLine();
                    System.out.println("Длина строки: " + s.length());
                    break;
                }

                case 3: {
                    System.out.print("Введите первую строку: ");
                    String a = scanner.nextLine();
                    System.out.print("Введите вторую строку: ");
                    String b = scanner.nextLine();
                    System.out.println("Строки равны? " + a.equals(b));
                    break;
                }

                case 4: {
                    System.out.print("Введите строку: ");
                    String s = scanner.nextLine();
                    System.out.print("Введите индекс: ");
                    int i = scanner.nextInt();
                    if (i >= 0 && i < s.length())
                        System.out.println("Символ: " + s.charAt(i));
                    else
                        System.out.println("Неверный индекс!");
                    break;
                }

                case 5: {
                    System.out.print("Введите строку: ");
                    String s = scanner.nextLine();
                    System.out.print("Введите начало: ");
                    int start = scanner.nextInt();
                    System.out.print("Введите конец: ");
                    int end = scanner.nextInt();
                    if (start >= 0 && end <= s.length() && start < end)
                        System.out.println("Подстрока: " + s.substring(start, end));
                    else
                        System.out.println("Ошибка диапазона.");
                    break;
                }

                case 6: {
                    System.out.print("Введите строку: ");
                    String s = scanner.nextLine();
                    System.out.print("Введите символ для замены: ");
                    char oldC = scanner.nextLine().charAt(0);
                    System.out.print("Введите новый символ: ");
                    char newC = scanner.nextLine().charAt(0);
                    System.out.println("Результат: " + s.replace(oldC, newC));
                    break;
                }

                case 7: {
                    System.out.print("Введите строку: ");
                    String s = scanner.nextLine();
                    System.out.println("В верхнем регистре: " + s.toUpperCase());
                    System.out.println("В нижнем регистре: " + s.toLowerCase());
                    break;
                }

                case 8: {
                    System.out.print("Введите строку: ");
                    String s = scanner.nextLine();
                    System.out.println("Пустая? " + s.isEmpty());
                    break;
                }

                case 9: {
                    System.out.print("Введите строку: ");
                    String s = scanner.nextLine();
                    System.out.print("Введите подстроку: ");
                    String sub = scanner.nextLine();
                    System.out.println("Содержит? " + s.contains(sub));
                    break;
                }

                case 10: {
                    System.out.print("Введите первую строку: ");
                    String a = scanner.nextLine();
                    System.out.print("Введите вторую строку: ");
                    String b = scanner.nextLine();
                    System.out.println("Результат: " + a + b);
                    break;
                }

                case 11: {
                    System.out.print("Введите строку: ");
                    String s = scanner.nextLine();
                    System.out.print("Разделитель: ");
                    String d = scanner.nextLine();
                    String[] parts = s.split(d);
                    System.out.println("Результат:");
                    for (String p : parts) System.out.println(p);
                    break;
                }

                case 12: {
                    System.out.print("Введите строку: ");
                    String a = scanner.nextLine();
                    System.out.print("Введите другую строку: ");
                    String b = scanner.nextLine();
                    System.out.println("Равны без регистра? " + a.equalsIgnoreCase(b));
                    break;
                }

                case 13: {
                    System.out.print("Введите строку: ");
                    String s = scanner.nextLine();
                    System.out.print("Начало: ");
                    String start = scanner.nextLine();
                    System.out.println("Начинается? " + s.startsWith(start));
                    break;
                }

                case 14: {
                    System.out.print("Введите строку: ");
                    String s = scanner.nextLine();
                    System.out.print("Конец: ");
                    String end = scanner.nextLine();
                    System.out.println("Заканчивается? " + s.endsWith(end));
                    break;
                }

                case 15: {
                    System.out.print("Введите строку: ");
                    String s = scanner.nextLine();
                    System.out.println("Без пробелов: " + s.trim());
                    break;
                }

                case 16: {
                    System.out.print("Введите строку: ");
                    String s = scanner.nextLine();
                    System.out.print("Сколько раз повторить? ");
                    int n = scanner.nextInt();
                    System.out.println("Результат: " + s.repeat(n));
                    break;
                }

                case 17: {
                    System.out.print("Введите число: ");
                    int num = scanner.nextInt();
                    System.out.println("Строка: " + String.valueOf(num));
                    break;
                }

                case 18: {
                    System.out.print("Введите строку: ");
                    String s = scanner.nextLine();
                    System.out.print("Введите символ: ");
                    char c = scanner.nextLine().charAt(0);
                    System.out.println("Индекс: " + s.indexOf(c));
                    break;
                }

                case 19: {
                    System.out.print("Введите строку: ");
                    String s = scanner.nextLine();
                    System.out.print("Введите символ: ");
                    char c = scanner.nextLine().charAt(0);
                    System.out.println("Последний индекс: " + s.lastIndexOf(c));
                    break;
                }

                case 20: {
                    System.out.print("Введите строку: ");
                    String s = scanner.nextLine();
                    String reversed = new StringBuilder(s).reverse().toString();
                    System.out.println("Реверс: " + reversed);
                    break;
                }

                case 0:
                    System.out.println("Выход...");
                    break;

                default:
                    System.out.println("Неверный выбор!");
            }

        } while (choice != 0);
    }
}