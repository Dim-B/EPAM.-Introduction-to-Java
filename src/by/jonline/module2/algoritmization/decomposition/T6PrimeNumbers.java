package module2.algoritmization.decomposition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми
 */
public class T6PrimeNumbers {
    public static void main(String[] args) throws IOException {
        int a, b, c;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите число 1: ");
            a = Integer.parseInt(reader.readLine());
            System.out.print("Введите число 2: ");
            b = Integer.parseInt(reader.readLine());
            System.out.print("Введите число 3: ");
            c = Integer.parseInt(reader.readLine());
            reader.close();
        } catch (NumberFormatException e) {
            System.out.println("Введены неверные данные");
            return;
        } finally {
            reader.close();
        }

        int nodABC = nod(nod(a, b), c);
        if (nodABC == 1)
            System.out.printf("Числа %d, %d и %d являются взаимно простыми.", a, b, c);
        else
            System.out.printf("Числа %d, %d и %d НЕ являются взаимно простыми. НОД = %d", a, b, c, nodABC);
    }

    public static int nod(int a, int b) {
        if (b == 0)
            return Math.abs(a);
        return nod(b, a % b);
    }
}
