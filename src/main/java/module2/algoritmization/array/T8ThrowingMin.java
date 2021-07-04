package module2.algoritmization.array;

/*
8. Дана последовательность целых чисел a1, a2, ..., an. Образовать новую последовательность, выбросив из исходной те члены, которые равны min(a1, a2, ..., an).
.
 */
public class T8ThrowingMin {
    public static void main(String[] args) {
        int[] array;
        int min;
        int[] arrayNew;

        array = UtilsArrays.getArray();
        min = array[0];

        for (int an : array) {
            if (an < min) {
                min = an;
            }
        }

        int countMin = 0;
        for (int an : array) {
            if (an == min) {
                countMin++;
            }
        }

        arrayNew = new int[array.length - countMin];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != min) {
                arrayNew[j] = array[i];
                j++;
            }
        }

        System.out.println("Новая последовательность: ");
        UtilsArrays.printArray(arrayNew);
    }

}
