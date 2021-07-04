package module1.basic.linearprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1. Найдите значение функции: z=((a–3)*b/2)+c.
 */

public class T1ValueFunction {
    public static void main(String[] args) throws IOException {
        double a;
        double b;
        double c;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите значение a: ");
            a = Double.parseDouble(reader.readLine());
            System.out.print("Введите значение b: ");
            b = Double.parseDouble(reader.readLine());
            System.out.print("Введите значение c: ");
            c = Double.parseDouble(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Введены неверные данные");
            return;
        } finally {
            reader.close();
        }

        System.out.println("Значение функции z=((a–3)*b/2)+c равно: " + calculateZ(a, b, c));
    }

    public static double calculateZ(double a, double b, double c) {
        return ((a - 3) * b / 2) + c;
    }
}
