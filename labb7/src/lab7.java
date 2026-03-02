import java.util.*;

public class lab7 {

    static Random rand = new Random();

    // 1. Сумма отрицательных A[20]
    static void sumNegativeA() {
        int[] A = randIntArray(20);
        int sum = 0;
        for (int x : A) if (x < 0) sum += x;
        print("A", A);
        System.out.println("Сумма отрицательных = " + sum);
    }

    // 2. Сумма положительных B[15]
    static void sumPositiveB() {
        int[] B = randIntArray(15);
        int sum = 0;
        for (int x : B) if (x > 0) sum += x;
        print("B", B);
        System.out.println("Сумма положительных = " + sum);
    }

    // 3. Произведение отрицательных A[12] (double)
    static void multNegativeDoubleA() {
        double[] A = randDoubleArray(12);
        double mult = 1;
        boolean found = false;
        for (double x : A) {
            if (x < 0) {
                mult *= x;
                found = true;
            }
        }
        print("A(double)", A);
        System.out.println("Произведение отрицательных = " + (found ? mult : 0));
    }

    // 4. Произведение положительных C[25]
    static void multPositiveC() {
        int[] C = randIntArray(25);
        long mult = 1;
        boolean found = false;
        for (int x : C) {
            if (x > 0) {
                mult *= x;
                found = true;
            }
        }
        print("C", C);
        System.out.println("Произведение положительных = " + (found ? mult : 0));
    }

    // 5. Среднее арифметическое D[17]
    static void averageD() {
        int[] D = randIntArray(17);
        double sum = 0;
        for (int x : D) sum += x;
        print("D", D);
        System.out.println("Среднее = " + sum / D.length);
    }

    // 6. A[10][10] сумма отрицательных по строкам → B[10]
    static void sumNegRowsA() {
        int[][] A = randMatrix(10, 10);
        int[] B = new int[10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (A[i][j] < 0) B[i] += A[i][j];
            }
        }

        printMatrix("A", A);
        print("B (суммы по строкам)", B);
    }

    // 7. B[5][5] сумма положительных по строкам → A[5]
    static void sumPosRowsB() {
        int[][] B = randMatrix(5, 5);
        int[] A = new int[5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (B[i][j] > 0) A[i] += B[i][j];
            }
        }

        printMatrix("B", B);
        print("A (суммы по строкам)", A);
    }

    // 8. A[12][6] произведение отрицательных по столбцам
    static void multNegColumnsA() {
        int[][] A = randMatrix(12, 6);
        long[] mult = new long[6];
        Arrays.fill(mult, 1);

        for (int j = 0; j < 6; j++) {
            boolean found = false;
            for (int i = 0; i < 12; i++) {
                if (A[i][j] < 0) {
                    mult[j] *= A[i][j];
                    found = true;
                }
            }
            if (!found) mult[j] = 0;
        }

        printMatrix("A", A);
        print("Произведение по столбцам", mult);
    }

    // 9. C[5][5] произведение положительных главной диагонали
    static void multPosDiagC() {
        int[][] C = randMatrix(5, 5);
        long mult = 1;
        boolean found = false;

        for (int i = 0; i < 5; i++) {
            if (C[i][i] > 0) {
                mult *= C[i][i];
                found = true;
            }
        }

        printMatrix("C", C);
        System.out.println("Произведение диагонали = " + (found ? mult : 0));
    }

    // 10. D[7][7] среднее главной диагонали
    static void avgDiagD() {
        int[][] D = randMatrix(7, 7);
        double sum = 0;

        for (int i = 0; i < 7; i++) sum += D[i][i];

        printMatrix("D", D);
        System.out.println("Среднее диагонали = " + sum / 7);
    }

    // 11. A[25] поменять min и max
    static void swapMinMax() {
        int[] A = randIntArray(25);
        int min = 0, max = 0;

        for (int i = 1; i < A.length; i++) {
            if (A[i] < A[min]) min = i;
            if (A[i] > A[max]) max = i;
        }

        int t = A[min];
        A[min] = A[max];
        A[max] = t;

        print("После обмена", A);
    }

    // 12. B[25] сортировка
    static void sortB() {
        int[] B = randIntArray(25);
        Arrays.sort(B);
        print("Отсортированный B", B);
    }

    // 13. C[20] среднее
    static void avgC() {
        int[] C = randIntArray(20);
        double sum = 0;
        for (int x : C) sum += x;
        print("C", C);
        System.out.println("Среднее = " + sum / C.length);
    }

    // 14. D[30] сумма чётных и нечётных
    static void sumEvenOddD() {
        int[] D = randIntArray(30);
        int even = 0, odd = 0;
        for (int x : D) {
            if (x % 2 == 0) even += x;
            else odd += x;
        }
        print("D", D);
        System.out.println("Сумма чётных = " + even);
        System.out.println("Сумма нечётных = " + odd);
    }

    // 15. Таблица 3×5 случайных < 10
    static void table3x5() {
        int[][] a = new int[3][5];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                a[i][j] = rand.nextInt(10);

        printMatrix("Таблица 3x5", a);
    }

    // 16. maxX()
    static int maxX() {
        int[] A = randIntArray(10);
        int max = A[0];
        for (int x : A) if (x > max) max = x;
        print("Массив для max", A);
        return max;
    }

    // 17. Строки
    static void stringsTask() {
        String s1 = "Hello ";
        String s2 = "World";
        String s3 = "Java";
        String s4 = "test";
        String s5 = "test";

        if (s4.equals(s5)) {
            System.out.println(s1 + s2);
        } else {
            System.out.println(s1 + s3);
        }
    }

    public static void main(String[] args) {
        sumNegativeA();
        sumPositiveB();
        multNegativeDoubleA();
        multPositiveC();
        averageD();
        sumNegRowsA();
        sumPosRowsB();
        multNegColumnsA();
        multPosDiagC();
        avgDiagD();
        swapMinMax();
        sortB();
        avgC();
        sumEvenOddD();
        table3x5();
        System.out.println("Максимальный элемент = " + maxX());
        stringsTask();
    }

    // ===== служебные методы =====

    static int[] randIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = rand.nextInt(41) - 20;
        return a;
    }

    static double[] randDoubleArray(int n) {
        double[] a = new double[n];
        for (int i = 0; i < n; i++) a[i] = rand.nextDouble() * 20 - 10;
        return a;
    }

    static int[][] randMatrix(int r, int c) {
        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = rand.nextInt(41) - 20;
        return m;
    }

    static void print(String name, int[] a) {
        System.out.println(name + " = " + Arrays.toString(a));
    }

    static void print(String name, long[] a) {
        System.out.println(name + " = " + Arrays.toString(a));
    }

    static void print(String name, double[] a) {
        System.out.println(name + " = " + Arrays.toString(a));
    }

    static void printMatrix(String name, int[][] m) {
        System.out.println(name + ":");
        for (int[] row : m) {
            System.out.println(Arrays.toString(row));
        }
    }
}