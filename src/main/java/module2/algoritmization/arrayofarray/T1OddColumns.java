package module2.algoritmization.arrayofarray;

/*
1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */
public class T1OddColumns {
    public static void main(String[] args) {
        int[][] array;

        array = Utils2DArrays.get2DArray();

        for (int j = 0; j < array[0].length; j += 2) {
            if (array[0][j] > array[array.length - 1][j]) {
                System.out.printf("Столбец %d: ", j + 1);
                for (int i = 0; i < array.length; i++)
                    System.out.printf(" %3d ", array[i][j]);
            }
            System.out.println();
        }
    }
}
