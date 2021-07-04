package module2.algoritmization.arrayofarray;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
        1   1   1  ...   1   1   1
        2   2   2  ...   2   2   0
        3   3   3  ...   3   0   0
        :   :   :  '·.   :   :   :
       n-1 n-1  0  ...   0   0   0
        n   0   0  ...   0   0   0
*/
public class T5FormMatrix2 {
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
                if (i + j < n)
                    matrix[i][j] = i + 1;
                else
                    matrix[i][j] = 0;
            }
        }

        Utils2DArrays.print2DArray(matrix);
    }
}
