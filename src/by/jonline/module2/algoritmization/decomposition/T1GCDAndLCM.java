package module2.algoritmization.decomposition;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
натуральных чисел:
            НОК(A, B) = (A*B)/(НОД(A, B))
 */
public class T1GCDAndLCM {
    public static void main(String[] args) {
        int a;
        int b;

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Введите число А: ");
            a = sc.nextInt();
            System.out.print("Введите число B: ");
            b = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода данных");
            return;
        } finally {
            sc.close();
        }

        System.out.printf("НОД(%d, %d) = %d\n", a, b, getNOD(a, b));
        System.out.printf("НОК(%d, %d) = %d\n", a, b, getNOK(a, b));
    }

    public static int getNOD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int getNOK(int a, int b) {
        return a / getNOD(a, b) * b;
    }

}
