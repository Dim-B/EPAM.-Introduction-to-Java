package module2.algoritmization.array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UtilsArrays {

    //выбор способа генерации одномерного массива(последовательности)
    public static int[] getArray() {
        int[] array = new int[0];
        int n;

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите количество элементов N: ");
            n = scanner.nextInt();
            System.out.println("Выберите способ заполнения:");
            System.out.println("1. Заполнить случайными числами [-10;10].");
            System.out.println("2. Заполнить случайными числами с указанием диапазона.");
            System.out.println("3. Заполнить вводом каждого элемента.");
            switch (scanner.nextInt()) {
                case 1: {
                    System.out.println("Выбран метод заполнения случайными числами [-10;10].");
                    array = UtilsArrays.getArrayRnd(n, -10, 10);
                    break;
                }
                case 2: {
                    System.out.println("Выбран метод заполнения случайными числами с указанием диапазона.");
                    System.out.print("Введите минимальное значение: ");
                    int min = scanner.nextInt();
                    System.out.print("Введите максимальное значение: ");
                    int max = scanner.nextInt();
                    array = UtilsArrays.getArrayRnd(n, min, max);
                    break;
                }
                case 3: {
                    System.out.println("Выбран метод заполнения вводом каждого элемента.");
                    array = UtilsArrays.inputArray(n);
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

        printArray(array);

        return array;
    }

    //заполение одномерного массива случайными числами [min;max]
    public static int[] getArrayRnd(int n, int min, int max) {
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
        return array;
    }

    //заполнение одномерного массива вводом каждого элемента
    public static int[] inputArray(int n) {
        int[] array = new int[n];

        Scanner scanner = new Scanner(System.in);
        try {

            for (int i = 0; i < n; i++) {
                System.out.printf("Введите A[%d]: ", i);
                array[i] = scanner.nextInt();
            }
        } catch (
                InputMismatchException e) {
            System.out.println("Ошибка ввода данных");
        }
        return array;
    }

    //печать массива
    public static void printArray(int[] array) {
        String arrayString = "";

        for (int an : array) {
            arrayString = arrayString.concat(an + ", ");
        }
        if (arrayString.length() > 1) arrayString = arrayString.substring(0, arrayString.length() - 2);
        System.out.println("{" + arrayString + "}");
    }
}
