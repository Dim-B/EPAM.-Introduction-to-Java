package module2.algoritmization.sorting;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
8.Даны дроби p1/q1, p2/q2, ..., pn/qn (pi, qi, - натуральные). Составить программу, которая приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания
 1930*/
public class T8Fraction {
    public static void main(String[] args) {
        int n;
        int[] p;
        int[] q;
        int nok = 1;

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Введите количество дробей n: ");
            n = sc.nextInt();
            p = new int[n];
            q = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.printf("Дробь %d. Введите числитель: ", i + 1);
                p[i] = sc.nextInt();
                System.out.printf("Дробь %d. Введите знаменатель: ", i + 1);
                q[i] = sc.nextInt();
                if (q[i] == 0) {
                    System.out.println("Знаменатель не может быть равен 0");
                    throw new InputMismatchException();
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода данных");
            return;
        } finally {
            sc.close();
        }

        System.out.println("Исходная последовательность дробей");
        for (int i = 0; i < p.length; i++) {
            System.out.printf(" %d/%d ", p[i], q[i]);
        }
        System.out.println();

        //находим НОК
        for (int i = 0; i < n; i++) {
            nok = getNOK(nok, q[i]);
        }

        //домножаем числители на коэффициэнт
        for (int i = 0; i < n; i++) {
            p[i] = p[i] * (nok / q[i]);
        }

        //сортировка числителей
        int i = 0;
        int tmp;
        while (i < p.length - 1) {
            if (p[i] > p[i + 1]) {
                tmp = p[i];
                p[i] = p[i + 1];
                p[i + 1] = tmp;
                if (i != 0) i--;
            } else
                i++;
        }

        //вывод
        System.out.println("Преобразованная и упорядоченная последовательность дробей");
        for (i = 0; i < p.length; i++) {
            System.out.printf(" %d/%d ", p[i], nok);
        }

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
