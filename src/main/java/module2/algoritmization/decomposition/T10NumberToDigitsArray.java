package module2.algoritmization.decomposition;

import module2.algoritmization.array.UtilsArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
10. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
являются цифры числа N.
 */
public class T10NumberToDigitsArray {
    public static void main(String[] args) throws IOException {
        int n;
        int[] array;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите число N: ");
            n = Integer.parseInt(reader.readLine());
            reader.close();
        } catch (NumberFormatException e) {
            System.out.println("Введены неверные данные");
            return;
        } finally {
            reader.close();
        }

        array = toDigitsArray(n);
        UtilsArrays.printArray(array);
    }

    private static int[] toDigitsArray(int n) {
        int countDigits;
        int[] array;

        countDigits = getCountDigits(n);
        array = new int[countDigits];

        for (int i = countDigits - 1; i >= 0; i--) {
            array[i] = n % 10;
            n = n / 10;
        }
        return array;
    }

    private static int getCountDigits(int n) {
        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }
}
