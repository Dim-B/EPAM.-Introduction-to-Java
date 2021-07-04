package module2.algoritmization.sorting;

import module2.algoritmization.array.UtilsArrays;

/*
3. Сортировка выбором. Дана последовательность чисел a1, a2, ..., an.Требуется переставить элементы так,
чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
повторяется. Написать алгоритм сортировки выбором.
 */
public class T3SortingBySelection {
    public static void main(String[] args) {
        int[] sequence;

        sequence = UtilsArrays.getArray();

        System.out.println("Отсортированная последовательность: ");
        UtilsArrays.printArray(sortSelectionDecrease(sequence));
    }

    private static int[] sortSelectionDecrease(int[] sequence) {
        int max;
        int maxPos;

        for (int i = 0; i < sequence.length; i++) {
            max = sequence[i];
            maxPos = i;

            for (int j = i; j < sequence.length; j++) {
                if (sequence[j] > max) {
                    max = sequence[j];
                    maxPos = j;
                }
            }
            if (maxPos != i) {
                sequence[maxPos] = sequence[i];
                sequence[i] = max;
            }
        }
        return sequence;
    }
}
