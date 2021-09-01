package module2.algoritmization.decomposition;

import module2.algoritmization.arrayofarray.Utils2DArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43). Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для решения задачи использовать декомпозицию.
*/
public class T13FindTwins {
    public static void main(String[] args) throws IOException {
        int n;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите число N: ");
            n = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Введены неверные данные");
            return;
        } finally {
            reader.close();
        }

        System.out.println("На отрезке от [n, 2n] найдены слудующие пары \"близнецов\": ");
        Utils2DArrays.print2DArray(findTwins(n));
    }

    private static int[][] findTwins(int n) {
        int[][] array = new int[n - 1][2];
        for (int i = 0; i < n - 1; i++) {
            array[i][0] = n + i;
            array[i][1] = n + i + 2;
        }
        return array;
    }
}
