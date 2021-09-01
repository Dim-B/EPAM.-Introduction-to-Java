package module2.algoritmization.arrayofarray;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils2DArrays {

    //выбор способа генерации двухмерного массива(прямоугольного)
    public static int[][] get2DArray() {
        int[][] array = new int[0][0];
        int n;
        int m;

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите количество строк N: ");
            n = scanner.nextInt();
            System.out.print("Введите количество столбцов M: ");
            m = scanner.nextInt();
            System.out.println("Выберите способ заполнения:");
            System.out.println("1. Заполнить случайными числами [-10;10].");
            System.out.println("2. Заполнить случайными числами с указанием диапазона.");
            System.out.println("3. Заполнить вводом каждого элемента.");
            switch (scanner.nextInt()) {
                case 1: {
                    System.out.println("Выбран метод заполнения случайными числами [-10;10].");
                    array = get2DArrayRnd(n, m, -10, 10);
                    break;
                }
                case 2: {
                    System.out.println("Выбран метод заполнения случайными числами с указанием диапазона.");
                    System.out.print("Введите минимальное значение: ");
                    int min = scanner.nextInt();
                    System.out.print("Введите максимальное значение: ");
                    int max = scanner.nextInt();
                    array = get2DArrayRnd(n, m, min, max);
                    break;
                }
                case 3: {
                    System.out.println("Выбран метод заполнения вводом каждого элемента.");
                    array = input2DArray(n, m);
                    System.out.println("Введенный массив: ");
                    break;
                }
                default: {
                    throw new InputMismatchException();
                }

            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода данных");
            System.exit(1);
        }

        print2DArray(array);

        return array;
    }
    //выбор способа генерации двухмерного массива(квадратного)
    public static int[][] get2DSqrArray() {
        int[][] array = new int[0][0];
        int n;

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите размер квадратной матрицы N: ");
            n = scanner.nextInt();
            System.out.println("Выберите способ заполнения:");
            System.out.println("1. Заполнить случайными числами [-10;10].");
            System.out.println("2. Заполнить случайными числами с указанием диапазона.");
            System.out.println("3. Заполнить вводом каждого элемента.");
            switch (scanner.nextInt()) {
                case 1: {
                    System.out.println("Выбран метод заполнения случайными числами [-10;10].");
                    array = get2DArrayRnd(n, n, -10, 10);
                    break;
                }
                case 2: {
                    System.out.println("Выбран метод заполнения случайными числами с указанием диапазона.");
                    System.out.print("Введите минимальное значение: ");
                    int min = scanner.nextInt();
                    System.out.print("Введите максимальное значение: ");
                    int max = scanner.nextInt();
                    array = get2DArrayRnd(n, n, min, max);
                    break;
                }
                case 3: {
                    System.out.println("Выбран метод заполнения вводом каждого элемента.");
                    array = input2DArray(n, n);
                    System.out.println("Введенный массив: ");
                    break;
                }
                default: {
                    throw new InputMismatchException();
                }

            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода данных");
        }
        print2DArray(array);

        return array;
    }

    //заполение двухмерного массива случайными числами [min;max]
    public static int[][] get2DArrayRnd(int n, int m, int min, int max) {
        int[][] array = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = (int) (Math.random() * (max - min + 1)) + min;
            }
        }
        return array;
    }

    //заполнение двухмерного массива вводом каждого элемента
    public static int[][] input2DArray(int n, int m) {
        int[][] array = new int[n][m];

        Scanner scanner = new Scanner(System.in);
        try {

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.printf("Введите A[%d, %d]: ", i, j);
                    array[i][j] = scanner.nextInt();
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода данных");
        }
        return array;
    }

    //печать массива int
    public static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.printf(" %3d ", array[i][j]);
            }
            System.out.println();
        }
    }
    //печать массива double
    public static void print2DArray(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.printf(" %5.2f ", array[i][j]);
            }
            System.out.println();
        }

    }

}
