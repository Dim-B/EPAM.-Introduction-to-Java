package module2.algoritmization.arrayofarray;

/*
11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
которых число 5 встречается три и более раз.
*/
public class T11Number5Counting {
    public static void main(String[] args) {
        int[][] matrix = new int[10][20];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * (15 + 1));
                System.out.printf(" %3d ", matrix[i][j]);
            }
            System.out.println();
        }

        int count5;
        for (int i = 0; i < matrix.length; i++) {
            count5 = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 5) count5++;
            }
            if (count5 >= 3)
                System.out.printf("В строке %d цифра 5 встречается %d раз(а)\n", i + 1, count5);
        }
    }
}
