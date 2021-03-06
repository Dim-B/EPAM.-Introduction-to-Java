package module1.basic.branching;

/*
2. Найти max{min(a, b), min(c, d)}.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T2FindMax {
    public static void main(String[] args) throws IOException {
        int a, b, c, d;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите число a: ");
            a = Integer.parseInt(reader.readLine());
            System.out.print("Введите число b: ");
            b = Integer.parseInt(reader.readLine());
            System.out.print("Введите число c: ");
            c = Integer.parseInt(reader.readLine());
            System.out.print("Введите число d: ");
            d = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Введены неверные данные");
            return;
        } finally {
            reader.close();
        }

        System.out.printf("Искомое число: %d", Math.max(Math.min(a, b), Math.min(c, d)));
    }
}
