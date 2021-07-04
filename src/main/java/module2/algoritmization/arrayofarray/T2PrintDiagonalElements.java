package module2.algoritmization.arrayofarray;

/*
2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */
public class T2PrintDiagonalElements {
    public static void main(String[] args) {
        int[][] array;

        array = Utils2DArrays.get2DSqrArray();

        System.out.print("Элементы диагонали матрицы: ");

        for (int i = 0; i < array.length; i++) {
            System.out.printf(" %3d ", array[i][i]);
        }
    }

}
