package module1.basic.cycles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
2. Вычислить значения функции на отрезке [а,b] c шагом h:
y = {x, если x>2; -x, если x<=2
 */

public class T2CalculateFunctionOnSegment {
    public static void main(String[] args) throws IOException {
        double a, b, h;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите начало отрезка a: ");
            a = Double.parseDouble(reader.readLine());
            System.out.print("Введите конец отрезка b: ");
            b = Double.parseDouble(reader.readLine());
            if (a > b) {
                System.out.println("Значение начала отрезка не может быть больше значения конца отрезка");
                return;
            }
            System.out.print("Введите шаг h: ");
            h = Double.parseDouble(reader.readLine());
            if (h <= 0) {
                System.out.println("Значение шага не может принимать нулевое или отрицательное значение");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Введены неверные данные");
            return;
        } finally {
            reader.close();
        }

        System.out.println("Значения функции на заданном отрезке с заданным шагом:");
        for (double i = a; i <= b; i += h) {
            System.out.println(calculateF(i));
        }

    }

    private static double calculateF(Double x) {
        return x <= 2 ? 0 - x : x;
    }

}
