package module1.basic.cycles;

/*
8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T8DigitsInNumbers {
    public static void main(String[] args) throws IOException {
        int a, b;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите первое число: ");
            a = Integer.parseInt(reader.readLine());
            System.out.print("Введите второе число: ");
            b = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException exception) {
            System.out.println("Введены неверные данные");
            return;
        } finally {
            reader.close();
        }

        System.out.printf("Числа %d и %d содержат следующие общие цифры: %s", a, b, getSameDigits(a, b));
    }

    private static String getSameDigits(int a, int b) {
        String sameNum = "";
        int iLastDig;
        int jLastDig;
        for (int i = a; i > 0; i = i / 10) {
            for (int j = b; j > 0; j = j / 10) {
                iLastDig = i % 10;
                jLastDig = j % 10;
                if (iLastDig == jLastDig && !sameNum.contains(String.valueOf(iLastDig)))
                    sameNum = sameNum.concat(iLastDig + ", ");
            }
        }
        return sameNum.length() == 0 ? sameNum : sameNum.substring(0, sameNum.length() - 2);
    }
}
