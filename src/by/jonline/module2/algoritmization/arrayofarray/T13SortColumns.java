package module2.algoritmization.arrayofarray;

/*
13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов
 */
public class T13SortColumns {
    public static void main(String[] args) {
        int[][] matrix;

        matrix = Utils2DArrays.get2DArray();

        System.out.println("Столбцы отсортированы по возрастанию элементов:");
        Utils2DArrays.print2DArray(sortColumnsIncr(matrix));
        System.out.println("Столбцы отсортированы по убыванию элементов:");
        Utils2DArrays.print2DArray(sortColumnsDecr(matrix));
    }

    private static int[][] sortColumnsIncr(int[][] matrix) {
        int tmp;

        for (int j = 0; j < matrix[0].length; j++) {
            for (int k = 0; k < matrix.length; k++) {
                for (int i = 0; i < matrix.length - 1; i++) {
                    if (matrix[i][j] > matrix[i + 1][j]) {
                        tmp = matrix[i][j];
                        matrix[i][j] = matrix[i + 1][j];
                        matrix[i + 1][j] = tmp;
                    }
                }
            }
        }
        return matrix;
    }

    private static int[][] sortColumnsDecr(int[][] matrix) {
        int tmp;

        for (int j = 0; j < matrix[0].length; j++) {
            for (int k = 0; k < matrix.length; k++) {
                for (int i = 0; i < matrix.length - 1; i++) {
                    if (matrix[i][j] < matrix[i + 1][j]) {
                        tmp = matrix[i][j];
                        matrix[i][j] = matrix[i + 1][j];
                        matrix[i + 1][j] = tmp;
                    }
                }
            }
        }
        return matrix;
    }
}
