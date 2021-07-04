package module2.algoritmization.decomposition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */
public class T16NumbersOddDigits {
    public static void main(String[] args) throws IOException {
        int n;
        long sum;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите n: ");
            n = Integer.parseInt(reader.readLine());
            if (n > 10) {
                System.out.println("Работа программы ограничена числами до 10 разрядов.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Введены неверные данные");
            return;
        } finally {
            reader.close();
        }

        sum = getSum(n);
        System.out.printf("Сумма %d-значных чисел, содержащих только нечетные числа равна %d\n", n, sum);
        System.out.printf("Количество четных цифр в значении суммы: %d ", getCountEvenDigits(sum));
    }


    //The sum of n - digit numbers containing only odd digits.
    private static long getSum(int n) {
        int start;
        int end;

        start = getStart(n);
        end = getEnd(n);

        long sum = 0;
        for (int i = start; i <= end; i++) {
            if (isAllOddDigits(i))
                sum += i;
        }
        return sum;
    }

    private static boolean isAllOddDigits(int n) {
        while (n > 0) {
            if (n % 2 == 0)
                return false;
            n = n / 10;
        }
        return true;
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

    private static int getCountEvenDigits(long sum) {
        int count = 0;

        while (sum > 0) {
            if (sum % 2 == 0)
                count++;
            sum = sum / 10;
        }
        return count;
    }
}