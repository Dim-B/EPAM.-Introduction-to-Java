package module2.algoritmization.arrayofarray;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3, ..., n^2 так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
собой. Построить такой квадрат. Пример магического квадрата порядка 3:
            6 1 8
            7 5 3
            2 9 4

Алгоритмы построения магических квадратов взяты из книги:
Н. В. Макарова. ВОЛШЕБНЫЙ МИР МАГИЧЕСКИХ КВАДРАТОВ
http://narod.ru/disk/5834353000/Magic_squares.pdf.html

 */
public class T16_Magic_square {
    public static void main(String[] args) {
        int n;
        int[][] magicSquare;

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Введите n: ");
            n = sc.nextInt();
            if (n <= 2) {
                System.out.println("Магического квадрата заданного парядка не существует");
                throw new InputMismatchException();
            }

        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода данных");
            return;
        } finally {
            sc.close();
        }

        if (n % 2 != 0) {
            magicSquare = getOddMagikSquare(n);
        } else if (n % 4 == 0) {
            magicSquare = get2EvenMagikSquare(n);
        } else
            magicSquare = getEvenMagikSquare(n);

        System.out.println("магический квадрат порядка " + n);
        Utils2DArrays.print2DArray(magicSquare);
    }

    public static int[][] getOddMagikSquare(int n) {
        int[][] ms = new int[n][n];
        int i = ms.length - 1;
        int j = n / 2;
        int a = 1;

        while (a <= n * n) {
            ms[(ms.length - 1) - i][j] = a;
            a++;

            if (j == ms.length - 1) j = -1;
            if (i >= ms.length - 1) i = -1;
            i++;
            j++;
            if (ms[ms.length - 1 - i][j] != 0) i--;
        }
        return ms;
    }

    private static int[][] get2EvenMagikSquare(int n) {
        int[][] ms = new int[n][n];
        int a = 1;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                ms[i][j] = a++;

        for (int i = 0; i < n / 2; i++)
            for (int j = (i + 1) & 1; j < n / 2; j += 2) {
                swap(ms, i, j);
                swap(ms, i, n - j - 1);
            }
        return ms;
    }

    static void swap(int[][] ms, int i, int j) {
        int t = ms[i][j];
        ms[i][j] = ms[ms.length - i - 1][ms.length - j - 1];
        ms[ms.length - i - 1][ms.length - j - 1] = t;
    }


    private static int[][] getEvenMagikSquare(int n) {
        int[][] ms = new int[n][n];
        int[][] msD = get2EvenMagikSquare(n - 2);
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                ms[i][j] = msD[i - 1][j - 1] + 2 * (n - 1);
            }
        }
        int l = n / 2;
        int d = n * n + 1;

        ms[0][0] = 3 * l - 1;
        ms[0][n - 1] = 1;
        ms[n - 1][0] = d - 1;
        ms[n - 1][n - 1] = d - 3 * l + 1;

        int i, j;
        for (i = 1; i <= l - 2; i++) {
            ms[0][i] = 2 * i + 1;
        }
        for (j = 1; j <= l; j++) {
            ms[0][j + i - 1] = d - 2 * j;
        }
        for (j = 1; j < n - 1; j++) {
            ms[n - 1][j] = n * n + 1 - ms[0][j];
        }
        ms[1][0] = 2 * l - 1;
        for (i = 1; i <= l / 2; i++) {
            ms[i + 1][0] = 3 * l - 1 - i;
        }
        i--;
        for (j = 1; j <= l / 2 + 1; j++) {
            ms[i + j + 1][0] = d - 4 * l + 1 + j;
        }
        j--;
        for (int q = 1; q <= l / 2 - 1; q++, i++) {
            ms[i + j + q + 1][0] = 3 * l - 1 + q;
            ms[i + j + q + 2][0] = d - 2 * l - q;
        }

        for (i = 1; i < n - 1; i++) {
            ms[i][n - 1] = n * n + 1 - ms[i][0];
        }

        return ms;
    }

}
