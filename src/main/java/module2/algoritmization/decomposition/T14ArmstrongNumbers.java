package module2.algoritmization.decomposition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
использовать декомпозицию.

Число Армстронга -  натуральное число, которое в равно сумме своих цифр, возведённых в степень, равную количеству его цифр.
пример: 1^3 + 5^3 + 3^3 = 153
 */
public class T14ArmstrongNumbers {
    public static void main(String[] args) throws IOException {
        long k;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите число K: ");
            k = Long.parseLong(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Введены неверные данные");
            return;
        } finally {
            reader.close();
        }

        System.out.print("На отрезке от [1, k] найдены числа Армстронга: ");
        findArmstrongNumbers(k);

    }

    private static void findArmstrongNumbers(long k) {
        for (long i = 1; i <= k; i++) {
            if (isArmstrongNumber(i))
                System.out.print(" " + i + " ");
        }
    }

    private static boolean isArmstrongNumber(long n) {
        int exp = countDigits(n);
        long sum = 0;
        long tmp = n;

        while (tmp > 0) {
            sum += Math.pow(tmp % 10, exp);
            tmp = tmp / 10;
        }
        return sum == n;
    }

    private static int countDigits(long n) {
        int count = 1;

        while (Math.abs(n / 10) > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
}
