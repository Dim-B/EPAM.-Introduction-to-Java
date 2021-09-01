package module1.basic.linearprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.
 */

public class T5TimeFormatting {
    public static void main(String[] args) throws IOException {
        int timeInSeconds;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите значение времени в секундах: ");
            timeInSeconds = Integer.parseInt(reader.readLine());
            if (timeInSeconds < 0) {
                System.out.println("К сожалению значение времени не может принимать отрицательные значения");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Введены неверные данные");
            return;
        } finally {
            reader.close();
        }

        System.out.println("Введенное значение составляет: "+getReadableTime(timeInSeconds));
    }

    private static String getReadableTime(int timeInSeconds) {
        return String.format("%02dч %02dмин %02dс",timeInSeconds/3600, timeInSeconds % 3600 / 60, timeInSeconds % 60);
    }


}
