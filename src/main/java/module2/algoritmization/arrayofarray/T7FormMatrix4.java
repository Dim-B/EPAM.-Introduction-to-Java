package module2.algoritmization.arrayofarray;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
7. Сформировать квадратную матрицу порядка N по правилу:
        A[I,J]=sin((I^2-J^2)/N)
и подсчитать количество положительных элементов в ней.
 */
public class T7FormMatrix4 {
    public static void main(String[] args) {
        int n;
        double[][] matrix;

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Введите значение N: ");
            n = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода данных");
            return;
        } finally {
            sc.close();
        }

        matrix = new double[n][n];

        int countPos = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = Math.sin((i * i - j * j) / (n * 1.0));
                if (matrix[i][j] > 0) countPos++;
            }
        }
        Utils2DArrays.print2DArray(matrix);
        System.out.printf("\nКоличество положительных элементов: %d", countPos);
    }
}
