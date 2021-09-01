package module2.algoritmization.arrayofarray;

/*
12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */
public class T12SortRows {
    public static void main(String[] args) {
        int[][] matrix;

        matrix = Utils2DArrays.get2DArray();

        System.out.println("Строки отсортированы по возрастанию элементов:");
        Utils2DArrays.print2DArray(sortRowIncr(matrix));
        System.out.println("Строки отсортированы по убыванию элементов:");
        Utils2DArrays.print2DArray(sortRowDecr(matrix));

    }

    private static int[][] sortRowIncr(int[][] matrix) {
        int tmp;

        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[0].length; k++) {
                for (int j = 0; j < matrix[0].length - 1; j++) {
                    if (matrix[i][j] > matrix[i][j + 1]) {
                        tmp = matrix[i][j];
                        matrix[i][j] = matrix[i][j + 1];
                        matrix[i][j + 1] = tmp;
                    }
                }
            }
        }
        return matrix;
    }

    private static int[][] sortRowDecr(int[][] matrix) {
        int tmp;

        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[0].length; k++) {
                for (int j = 0; j < matrix[0].length - 1; j++) {
                    if (matrix[i][j] < matrix[i][j + 1]) {
                        tmp = matrix[i][j];
                        matrix[i][j] = matrix[i][j + 1];
                        matrix[i][j + 1] = tmp;
                    }
                }
            }
        }
        return matrix;
    }
}
