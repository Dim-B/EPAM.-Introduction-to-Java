package module2.algoritmization.arrayofarray;

/*
15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */
public class T15FindLargestElement {
    public static void main(String[] args) {
        int[][] matrix;
        int max;

        matrix = Utils2DArrays.get2DArray();
        max = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > max)
                    max = matrix[i][j];
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] % 2 != 0)
                    matrix[i][j] = max;
            }
        }

        System.out.println("Преобразованная матрица: ");
        Utils2DArrays.print2DArray(matrix);
    }
}
