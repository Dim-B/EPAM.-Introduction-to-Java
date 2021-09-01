package module2.algoritmization.array;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */

public class T1SumElementsMultiplesK {
    public static void main(String[] args) {
        int[] array;
        int k = 0;

        array = UtilsArrays.getArray();

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите K: ");
            k = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода данных");
        } finally {
            scanner.close();
        }

        System.out.printf("Сумма элементов кратных %d равна: %d", k, getSumMultK(array, k));

    }

    private static int getSumMultK(int[] array, int k) {
        int sum = 0;

        for (int an :
                array) {
            if (an % k == 0)
                sum += an;
        }
        return sum;
    }
}
