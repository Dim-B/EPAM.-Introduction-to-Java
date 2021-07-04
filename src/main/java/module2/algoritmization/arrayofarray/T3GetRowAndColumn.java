package module2.algoritmization.arrayofarray;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */
public class T3GetRowAndColumn {
    public static void main(String[] args) {
        int[][] array;
        int k;
        int p;

        array = Utils2DArrays.get2DArray();

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите номер строки k: ");
            k = scanner.nextInt();
            System.out.printf("Строка %d: ", k);
            for (int j = 0; j < array[0].length; j++) {
                System.out.printf(" %3d ", array[k - 1][j]);
            }
            System.out.println();
            System.out.print("Введите номер столбца p: ");
            p = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода данных");
            return;
        } finally {
            scanner.close();
        }

        System.out.printf("Столбец %d: ", p);
        for (int i = 0; i < array.length; i++) {
            System.out.printf(" %3d ", array[i][p - 1]);
        }
    }
}
