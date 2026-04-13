import java.util.*;
import java.util.function.*;
import java.util.stream.*;

// Класс Student для заданий 13, 14, 16 [cite: 105, 106]
class Student {
    String name;
    int age;
    double grade;

    Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + " (Возраст: " + age + ", Балл: " + grade + ")";
    }
}

public class Lab13 {
    public static void main(String[] args) {

        BinaryOperator<Integer> sum = (a, b) -> a + b;
        System.out.println("1. Сумма: " + sum.apply(10, 5));

        Function<String, String> toUpper = s -> s.toUpperCase();
        System.out.println("2. " + toUpper.apply("java stream api"));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.print("3. Нечётные: ");
        numbers.stream().filter(n -> n % 2 != 0).forEach(n -> System.out.print(n + " "));
        System.out.println();

        System.out.print("4. Квадраты: ");
        numbers.stream().map(n -> n * n).forEach(n -> System.out.print(n + " "));
        System.out.println();

        List<Student> students = Arrays.asList(
                new Student("Anvarov", 20, 85.0),
                new Student("Ivanov", 22, 75.0),
                new Student("Sidorov", 19, 92.0),
                new Student("Kuznetsov", 20, 81.0)
        );

        System.out.println("14. Студенты (балл > 80, сорт. по имени):");
        students.stream()
                .filter(s -> s.grade > 80)
                .sorted(Comparator.comparing(s -> s.name))
                .forEach(System.out::println);

        System.out.println("16. Группировка по возрасту:");
        Map<Integer, List<Student>> byAge = students.stream()
                .collect(Collectors.groupingBy(s -> s.age));
        System.out.println(byAge);

        int totalSum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("17. Сумма чисел списка: " + totalSum);

        List<Integer> dups = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 5);
        System.out.print("18. Уникальные первые 3: ");
        dups.stream().distinct().limit(3).forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}