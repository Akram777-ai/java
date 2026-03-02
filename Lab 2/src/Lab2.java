// ===== Задача 4 и 5 =====
// Базовый класс
class Person {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }
}

// Производный класс
class Student extends Person {
    String group;

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Группа: " + group);
    }
}

class Main {

    int classField = 100;

    void showScope() {
        int localVariable = 50;

        System.out.println("Поле класса: " + classField);
        System.out.println("Локальная переменная: " + localVariable);
    }

    public static void main(String[] args) {

        System.out.println("Задача 1. Переменные и константы");

        int number = 10;
        double price = 99.99;
        boolean isActive = true;

        final double PI = 3.14;

        System.out.println("Целое число: " + number);
        System.out.println("Цена: " + price);
        System.out.println("Активен: " + isActive);
        System.out.println("Константа PI: " + PI);

        // ===== Задача 2 =====
        System.out.println("\nЗадача 2. Примитивные и ссылочные типы");

        int age = 25;
        String name = "Расул";

        System.out.println("Возраст (int): " + age);
        System.out.println("Имя (String): " + name);

        System.out.println("\nЗадача 3. Область видимости");

        Main obj = new Main();
        obj.showScope();

        System.out.println("\nЗадача 4. Наследование");

        Student student = new Student();
        student.name = "Акрам";
        student.age = 20;
        student.group = "ИС-2204";

        student.displayInfo();

        System.out.println("\nЗадача 5. Переопределение и полиморфизм");

        Person personRef = new Student();
        personRef.name = "Талшын";
        personRef.age = 19;

        ((Student) personRef).group = "ИС-2205";

        personRef.displayInfo();
    }
}