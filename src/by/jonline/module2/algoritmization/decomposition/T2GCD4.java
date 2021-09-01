package module2.algoritmization.decomposition;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел
 */
public class T2GCD4 {
    public static void main(String[] args) {
        int a, b, c, d;

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Введите число А: ");
            a = sc.nextInt();
            System.out.print("Введите число B: ");
            b = sc.nextInt();
            System.out.print("Введите число C: ");
            c = sc.nextInt();
            System.out.print("Введите число D: ");
            d = sc.nextInt();
        } catch (
                InputMismatchException e) {
            System.out.println("Ошибка ввода данных");
            return;
        } finally {
            sc.close();
        }

        System.out.printf("НОД(%d, %d, %d, %d) = %d\n", a, b, c, d, getNOD4(a, b, c, d));

    }

    private static int getNOD4(int a, int b, int c, int d) {
        return getNOD(getNOD(getNOD(a, b), c), d);
    }

    public static int getNOD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
