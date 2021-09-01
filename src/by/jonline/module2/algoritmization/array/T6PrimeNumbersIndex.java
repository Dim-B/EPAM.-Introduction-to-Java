package module2.algoritmization.array;

/*
6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
являются простыми числами.
 */

public class T6PrimeNumbersIndex {
    public static void main(String[] args) {
        int[] array;
        int sum = 0;

        array = UtilsArrays.getArray();

        for (int i = 0; i < array.length; i++) {
            if (isPrime(i+1)) sum += array[i];
        }
        System.out.println("Сумма чисел, порядковые номера которых являются простыми числами равна: " + sum);
    }

    private static boolean isPrime(int i) {
        if (i <= 1)
            return false;
        int j = 2;
        while (j < i) {
            if (i % j == 0)
                return false;
            j++;
        }
        return true;
    }

}
