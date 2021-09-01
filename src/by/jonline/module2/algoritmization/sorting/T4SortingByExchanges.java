package module2.algoritmization.sorting;

import module2.algoritmization.array.UtilsArrays;

/*
4. Сортировка обменами. Дана последовательность чисел
a1, a2, ..., an. Требуется переставить числа в порядке возрастания. Для этого сравниваются два соседних числа a(i) и a(i+1). Если a(i) > a(i+1), то делается перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */
public class T4SortingByExchanges {
    public static void main(String[] args) {
        int[] sequence;
        int count;

        sequence = UtilsArrays.getArray();
        count = sortExchangesIncrease(sequence);

        System.out.println("Отсортированная последовательность: ");
        UtilsArrays.printArray(sequence);
        System.out.println("Количество замен: " + count);
    }

    private static int sortExchangesIncrease(int[] sequence) {
        int count = 0;

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < sequence.length - 1; i++) {
                if (sequence[i] > sequence[i + 1]) {
                    int tmp = sequence[i];
                    sequence[i] = sequence[i + 1];
                    sequence[i + 1] = tmp;
                    count++;
                    isSorted = false;
                }
            }
        }
        return count;
    }
}
