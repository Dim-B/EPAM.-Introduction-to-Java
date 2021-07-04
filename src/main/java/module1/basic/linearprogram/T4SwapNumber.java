package module1.basic.linearprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

public class T4SwapNumber {
    public static void main(String[] args) throws IOException {
        double r;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите число R: ");
            r = Double.parseDouble(reader.readLine());

            if (!String.valueOf(r).matches("^\\d{3}\\.\\d{3}$")) {
                System.out.println("Введенное число не удовлетворяет условию задачи");
                return;
            }

        } catch (NumberFormatException e) {
            System.out.println("Введены неверные данные");
            return;
        } finally {
            reader.close();
        }

        System.out.println("Полученное число: " + swapNumber(r));

    }

    private static double swapNumber(double r) {
        int part1;
        int part2;
        double result;

        part1 = (int) r;
        part2 = (int) (r * 1000 - part1 * 1000);
        result = part2 + part1 / 1000.0;
        return result;
    }

}


