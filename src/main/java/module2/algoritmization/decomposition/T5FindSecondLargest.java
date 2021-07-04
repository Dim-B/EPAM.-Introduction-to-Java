package module2.algoritmization.decomposition;

import module2.algoritmization.array.UtilsArrays;

/*
5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
которое меньше максимального элемента массива, но больше всех других элементов).
 */
public class T5FindSecondLargest {
    public static void main(String[] args) {
        int[] a;

        a = UtilsArrays.getArray();

        System.out.println("Второй по величине элемент массива: " + getSecondMax(a, getMax(a)));
    }

    private static int getSecondMax(int[] a, int max) {
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > secondMax && a[i] < max)
                secondMax = a[i];
        }
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("В массиве все элементы равны или массив состоит из одного элемента. В этом случае не существует вторго по величине максимального элемента.");
            System.exit(1);
        }
        return secondMax;
    }

    private static int getMax(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > max)
                max = a[i];
        }
        return max;
    }
}
