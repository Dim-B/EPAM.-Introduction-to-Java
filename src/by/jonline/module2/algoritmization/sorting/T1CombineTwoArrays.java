package module2.algoritmization.sorting;

import module2.algoritmization.array.UtilsArrays;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
дополнительный массив.
 */
public class T1CombineTwoArrays {
    public static void main(String[] args) {
        int n;
        int m;
        int k;
        int[] array1;
        int[] array2;
        int[] arrayResult;

        System.out.println("Ввод первого массива: ");
        array1 = UtilsArrays.getArray();
        System.out.println("Ввод второго массива: ");
        array2 = UtilsArrays.getArray();
        n = array1.length;
        m = array2.length;

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Введите k: ");
            k = sc.nextInt();
            if (k < 0 || k > n) {
                System.out.println("Позиция k не должна выходить за пределы первого массива");
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода данных");
            return;
        } finally {
            sc.close();
        }

        arrayResult = new int[n + m];

        for (int i = 0; i < n + m; i++) {
            if (i < k)
                arrayResult[i] = array1[i];
            else if (i < k + m) {
                for (int j = 0; j < m; j++) {
                    arrayResult[i] = array2[j];
                    i++;
                }
                i--;
            } else
                arrayResult[i] = array1[i - m];
        }

        UtilsArrays.printArray(arrayResult);
    }
}
