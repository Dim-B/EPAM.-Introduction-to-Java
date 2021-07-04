package module2.algoritmization.arrayofarray;

/*
10. Найти положительные элементы главной диагонали квадратной матрицы.
*/
public class T10FindPositiveElements {
    public static void main(String[] args) {
        int[][] matrix;

        matrix = Utils2DArrays.get2DSqrArray();

        System.out.print("На главной диагонали расположены следующие положительные элементы: ");
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > 0)
                System.out.print(" " + matrix[i][i] + " ");
        }
    }
}
