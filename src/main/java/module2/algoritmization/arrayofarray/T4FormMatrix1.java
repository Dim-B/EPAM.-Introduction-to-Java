package module2.algoritmization.arrayofarray;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
        1    2    3   ...   n
        n   n-1  n-2  ...   1
        1    2    3   ...   n
        n   n-1  n-2  ...   1
        1    2    3   ...   n
        :    :    :   '·.   :
        n   n-1  n-2  ...   1
*/
public class T4FormMatrix1 {
    public static void main(String[] args) {
        int n;
        int[][] matrix;

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Введите значение n: ");
            n = sc.nextInt();
            if (n < 2 || n % 2 != 0) throw new InputMismatchException();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода данных");
            return;
        } finally {
            sc.close();
        }

        matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i % 2 == 0)
                    matrix[i][j] = j + 1;
                else
                    matrix[i][j] = n - j;
            }
        }
        Utils2DArrays.print2DArray(matrix);
    }
}
