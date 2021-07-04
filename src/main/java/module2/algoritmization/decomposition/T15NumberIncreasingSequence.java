package module2.algoritmization.decomposition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
 */
public class T15NumberIncreasingSequence {
    public static void main(String[] args) throws IOException {
        int n;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите n: ");
            n = Integer.parseInt(reader.readLine());
            if (n < 2 || n > 9) {
                System.out.println("Поддерживаются числа с количеством разрядов от 2 до 9");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Введены неверные данные");
            return;
        } finally {
            reader.close();
        }

        System.out.print("Найдены следующие числа, удовлетворяющие условиям поиска: ");
        findIncreasingDigitsNumbers(n);
    }

    private static void findIncreasingDigitsNumbers(int n) {
        int start;
        int end;

        start = getStart(n);
        end = getEnd(n);

        for (int i = start; i <= end; i++) {
            if (isIncreasingDigitsNumber(i))
                System.out.print(" " + i + " ");
        }
    }

    private static int getStart(int n) {
        int start = 1;

        for (int i = 0; i < n - 1; i++) {
            start *= 10;
        }
        return start;
    }

    private static int getEnd(int n) {
        int end = 9;

        for (int i = 0; i < n - 1; i++) {
            end = end * 10 + 9;
        }
        return end;
    }

    private static boolean isIncreasingDigitsNumber(int n) {
        while (n > 0) {
            if (n % 10 <= (n / 10) % 10)
                return false;
            n = n / 10;
        }
        return true;
    }
}
