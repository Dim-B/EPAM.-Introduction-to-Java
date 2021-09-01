package module1.basic.cycles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры.
 */

public class T7NumbersDivisors {
    public static void main(String[] args) throws IOException {
        int m;
        int n;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите начало интервала m: ");
            m = Integer.parseInt(reader.readLine());
            System.out.print("Введите конец интервала n: ");
            n = Integer.parseInt(reader.readLine());
            if (m > n) {
                System.out.println("Начало интервала не может быть больше конца интервала");
                return;
            }
        } catch (NumberFormatException exception) {
            System.out.println("Введены неверные данные");
            return;
        } finally {
            reader.close();
        }

        for (int i = m; i <= n; i++) {
            String div = getDivString(i);
            if (!div.equals(""))
                System.out.printf("Число %d имеет следующие делители: %s.\n", i, div);
            else System.out.printf("Число %d не имеет делителей.\n", i);
        }
    }

    private static String getDivString(int num) {
        String div = "";
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                div = div.concat(i + ", ");
        }
        return div.length() == 0 ? div : div.substring(0, div.length() - 2);
    }

}
