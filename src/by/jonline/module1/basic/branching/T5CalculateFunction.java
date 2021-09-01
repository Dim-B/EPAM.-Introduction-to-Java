package module1.basic.branching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
5. Вычислить значение функции:
F(x)={x^2-3x+9, если x<=3; 1/(x^3+6), если x>3
 */

public class T5CalculateFunction {
    public static void main(String[] args) throws IOException {
        double x;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите x: ");
            x = Double.parseDouble(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Введены неверные данные");
            return;
        } finally {
            reader.close();
        }

        System.out.printf("Значение функции при заданном х составляет: %f", calculateF(x));
    }

    private static double calculateF(Double x) {
        return x <= 3 ? Math.pow(x, 2) - 3 * x + 9 : 1 / (Math.pow(x, 3) + 6);
    }
}