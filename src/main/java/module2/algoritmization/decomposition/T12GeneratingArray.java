package module2.algoritmization.decomposition;

import module2.algoritmization.array.UtilsArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
 */
public class T12GeneratingArray {
    public static void main(String[] args) throws IOException {
        int k;
        int n;
        int[] array;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите число K: ");
            k = Integer.parseInt(reader.readLine());
            System.out.print("Введите число N: ");
            n = Integer.parseInt(reader.readLine());
            reader.close();
        } catch (NumberFormatException e) {
            System.out.println("Введены неверные данные");
            return;
        } finally {
            reader.close();
        }

        array = generatingArray(n, k);

        if (array.length > 0)
            UtilsArrays.printArray(array);
        else
            System.out.println("Нет чисел удовлетворяющих условияю задачи");
    }

    private static int[] generatingArray(int n, int k) {
        int[] array = new int[0];

        for (int i = 0; i < n; i++) {
            if (sumDigits(i) == k)
                array = addToArray(array, i);
        }
        return array;
    }

    private static int[] addToArray(int[] array, int n) {
        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = n;

        return newArray;
    }

    private static int sumDigits(int i) {
        int sum = 0;

        while (i > 0) {
            sum += i % 10;
            i = i / 10;
        }
        return sum;
    }
}
