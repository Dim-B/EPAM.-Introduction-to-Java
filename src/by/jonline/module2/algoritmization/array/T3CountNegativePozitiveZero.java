package module2.algoritmization.array;

/*
3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов.
 */

public class T3CountNegativePozitiveZero {
    public static void main(String[] args) {
        int[] array;
        int negative = 0;
        int positive = 0;
        int zero = 0;

        array = UtilsArrays.getArray();

        for (int an : array) {
            if (an < 0) negative++;
            else if (an > 0) positive++;
            else zero++;
        }

        System.out.printf("Количесво отрицательных элементов: %d\n", negative);
        System.out.printf("Количесво положительных элементов: %d\n", positive);
        System.out.printf("Количесво нулевых элементов: %d\n", zero);
    }
}
