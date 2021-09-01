package module1.basic.cycles;

/*
1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T1Sum1toN {
    public static void main(String[] args) throws IOException {
        int n;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите любое целое положительное число: ");
            n = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Введены неверные данные");
            return;
        } finally {
            reader.close();
        }

        System.out.printf("Сумма чисел от 1 до %d составляет %d", n, sum1toN(n));
    }

    private static int sum1toN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i;
        return sum;
    }

    //рекурсивный метод для вычисления суммы
    private static int sum1toNRecursion(int n) {
        if (n == 1)
            return n;
        else
            return n + sum1toNRecursion(n - 1);
    }

}
