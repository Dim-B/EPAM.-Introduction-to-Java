package module2.algoritmization.array;

/*
4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 */

public class T4SwapLargestSmaller {
    public static void main(String[] args) {
        int[] array;
        int max;
        int min;

        array = UtilsArrays.getArray();
        max = array[0];
        min = array[0];

        for (int an : array) {
            if (an < min) min = an;
            if (an > max) max = an;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) array[i] = min;
            else if (array[i] == min) array[i] = max;
        }

        System.out.println("Преобразованная последовательность:");
        UtilsArrays.printArray(array);
    }

}
