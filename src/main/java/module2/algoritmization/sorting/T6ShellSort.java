package module2.algoritmization.sorting;

import module2.algoritmization.array.UtilsArrays;

/*
6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. Если ai ⩽ ai+1, то продвигаются
на один элемент вперед. Если ai < ai+1, то производится перестановка и сдвигаются на один элемент назад.
Составить алгоритм этой сортировки.
 */
public class T6ShellSort {
    public static void main(String[] args) {
        int[] array;

        array = UtilsArrays.getArray();

        int i = 0;
        int tmp;
        while (i < array.length - 1) {
            if (array[i] > array[i + 1]) {
                tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
                if (i != 0) i--;
            } else
                i++;
        }

        System.out.println("Упорядоченный массив: ");
        UtilsArrays.printArray(array);
    }
}
