package module2.algoritmization.sorting;

import module2.algoritmization.array.UtilsArrays;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
2. Даны две последовательности a1 ⩽ a2 ⩽ ... ⩽ an и b1 ⩽ b2 ⩽ ... ⩽ bm. Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
 */
public class T2NonDecreasingSequence {
    public static void main(String[] args) {
        int[] a;
        int[] b;
        int n;
        int m;

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Введите размер первой последовательности n:");
            n = sc.nextInt();
            a = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.printf("Введите a%d: ", i + 1);
                a[i] = sc.nextInt();
                while (i >= 1 && a[i] < a[i - 1]) {
                    System.out.printf("Последовательность должна быть не убывающей. Введите a%d еще раз: ", i + 1);
                    a[i] = sc.nextInt();
                }
            }
            System.out.print("Введите размер второй последовательности m:");
            m = sc.nextInt();
            b = new int[m];
            for (int i = 0; i < m; i++) {
                System.out.printf("Введите b%d: ", i + 1);
                b[i] = sc.nextInt();
                while (i >= 1 && b[i] < b[i - 1]) {
                    System.out.printf("Последовательность должна быть не убывающей. Введите b%d еще раз: ", i + 1);
                    b[i] = sc.nextInt();
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода данных");
            return;
        } finally {
            sc.close();
        }

        System.out.print("a: ");
        UtilsArrays.printArray(a);
        System.out.print("b: ");
        UtilsArrays.printArray(b);

        int[] c = new int[n + m];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i + j < n + m) {
            if (j >= b.length || (i < a.length && a[i] <= b[j]))
                c[k++] = a[i++];
            else
                c[k++] = b[j++];
        }

        System.out.print("c: ");
        UtilsArrays.printArray(c);

    }
}
