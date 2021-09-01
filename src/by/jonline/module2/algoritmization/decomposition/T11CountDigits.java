package module2.algoritmization.decomposition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
11. Написать метод (методы), определяющий, в каком из данных двух чисел больше цифр.
 */
public class T11CountDigits {
    public static void main(String[] args) throws IOException {
        int n;
        int m;
        int result;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите число 1: ");
            n = Integer.parseInt(reader.readLine());
            System.out.print("Введите число 2: ");
            m = Integer.parseInt(reader.readLine());
            reader.close();
        } catch (NumberFormatException e) {
            System.out.println("Введены неверные данные");
            return;
        } finally {
            reader.close();
        }

        result = compareCountDigits(n, m);

        if (result == 1)
            System.out.println("В первом числе больше цифр");
        else if (result == 2)
            System.out.println("Во втором числе больше цифр");
        else if (result == 0)
            System.out.println("В заданных числах одинаковое количество цифр");
    }


    /*  метод возвращает:
     *   1 - если в первом переданном числе больше цифр
     *   2 - если во втором переданном числе больше цифр
     *   0 - если количиство цифр одинаково
     */
    private static int compareCountDigits(int n, int m) {
        int countDigitsN;
        int countDigitsM;

        countDigitsN = getCountDigits(n);
        countDigitsM = getCountDigits(m);

        if (countDigitsN > countDigitsM)
            return 1;
        else if (countDigitsM > countDigitsN)
            return 2;
        else
            return 0;
    }

    private static int getCountDigits(int n) {
        int count = 1;
        while (Math.abs(n / 10) > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

}
