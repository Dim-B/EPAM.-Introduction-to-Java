package module2.algoritmization.arrayofarray;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
единиц равно номеру столбца.

 */
public class T14RandomMatrix {
    public static void main(String[] args) {
        int n;
        int m;
        int[][] matrix;

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Введите n: ");
            n = sc.nextInt();
            System.out.print("Введите m: ");
            m = sc.nextInt();
            if (m > n) {
                System.out.println("Исходя из условия задачи число столбцов не может быть больше числа строк");
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода данных");
            return;
        } finally {
            sc.close();
        }

        matrix = new int[n][m];
        int count1;
        int i;
        for (int j = 0; j < matrix[0].length; j++) {
            count1 = 0;
            while (count1 < j + 1) {
                i = (int) (Math.random() * m);
                if (matrix[i][j] == 0) {
                    count1++;
                    matrix[i][j] = 1;
                }
            }
        }
        Utils2DArrays.print2DArray(matrix);
    }
}
