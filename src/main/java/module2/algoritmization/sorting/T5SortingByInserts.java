package module2.algoritmization.sorting;

import module2.algoritmization.array.UtilsArrays;

/*
5. Сортировка вставками. Дана последовательность чисел a1, a2, ..., an. Требуется переставить числа в порядке возрастания. Делается это следующим образом. Пусть a1, a2, ..., ai - упорядоченная последовательность, т. е. a1 ⩽ a2 ⩽ ... ⩽ an. Берется следующее число a(i+1) и вставляется в последовательность так, чтобы новая последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i+1 до n не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */
public class T5SortingByInserts {
    public static void main(String[] args) {
        int[] sequence;
        int pos;
        int tmp;

        sequence = UtilsArrays.getArray();

        for (int i = 1; i < sequence.length; i++) {
            pos = getPos(sequence, i);
            if (pos < i) {
                tmp = sequence[i];
                for (int j = i; j > pos; j--) {
                    sequence[j] = sequence[j - 1];
                }
                sequence[pos] = tmp;
            }
        }
        System.out.println("Отсортированная последовательность: ");
        UtilsArrays.printArray(sequence);
    }

    private static int getPos(int[] seq, int i) {
        int start = 0;
        int end = i - 1;

        while (start <= end) {
            int midle = (start + end) / 2;
            if (seq[i] < seq[midle] && (midle == 0 || seq[i] >= seq[midle - 1]))
                return midle;
            else if (midle == i - 1 && seq[i] >= seq[midle])
                return i;
            else if (seq[i] >= seq[midle])
                start = midle + 1;
            else if (seq[i] < seq[midle - 1])
                end = midle - 1;
        }
        return -1;
    }
}
