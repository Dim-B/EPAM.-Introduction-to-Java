package module2.algoritmization.arrayofarray;

/*
9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
столбец содержит максимальную сумму.
 */
public class T9SumColumns {
    public static void main(String[] args) {
        int[][] array;
        int maxColumn = 0;
        int sumMax = 0;
        int sum;

        array = Utils2DArrays.get2DArray();

        for (int j = 0; j < array[0].length; j++) {
            sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i][j];
            }
            if (sum > sumMax) {
                maxColumn = j + 1;
                sumMax = sum;
            }
            System.out.printf("Сумма элементов столбца %d равна: %d\n", j + 1, sum);
        }
        System.out.printf("Столбец %d содержит максимальную сумму.", maxColumn);
    }
}
