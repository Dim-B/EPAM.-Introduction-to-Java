package module2.algoritmization.arrayofarray;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
8. В числовой матрице поменять местами два столбца, т. е. все элементы одного столбца поставить
на соответствующие им позиции другого, а элементы второго переместить в первый. Номера столбцов вводит
пользователь с клавиатуры.
 */
public class T8SwapColumns {
    public static void main(String[] args) {
        int[][] array;
        int c1;
        int c2;

        array = Utils2DArrays.get2DArray();

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите номер столбца 1: ");
            c1 = scanner.nextInt();
            if (c1 > array.length || c1 <= 0) throw new InputMismatchException();
            System.out.print("Введите номер столбца 2: ");
            c2 = scanner.nextInt();
            if (c2 > array.length || c1 == c2 || c2 <= 0) throw new InputMismatchException();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода данных");
            return;
        } finally {
            scanner.close();
        }

        c1--;
        c2--;
        int tmp;
        for (int i = 0; i < array.length; i++) {
            tmp = array[i][c1];
            array[i][c1] = array[i][c2];
            array[i][c2] = tmp;
        }
        Utils2DArrays.print2DArray(array);
    }
}
