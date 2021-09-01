package module2.algoritmization.decomposition;

import module2.algoritmization.array.UtilsArrays;

/*
8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
массива с номерами от k до m.
 */
public class T8SumThreeElements {
    public static void main(String[] args) {
        int[] d;

        d = UtilsArrays.getArray();

        if (d.length < 6) {
            System.out.println("Для решения поставленой задачи массив должен содержать не менее 6 элементов");
            return;
        }

        System.out.println("D[l] + D[2] + D[3] = " + getTripleSum(d, 0));
        System.out.println("D[3] + D[4] + D[5] = " + getTripleSum(d, 2));
        System.out.println("D[4] + D[5] + D[6] = " + getTripleSum(d, 3));

    }

    private static int getTripleSum(int[] d, int start) {
        if (start > d.length - 3) {
            System.out.printf("Невозможно вычислить сумму 3х последовательно расположенных элементов начиная с позиции %d, так как до конца массива имеется меньше 3х элементов.", start);
            System.exit(1);
        }
        int sum = 0;
        for (int i = start; i < start + 3; i++) {
            sum += d[i];
        }
        return sum;
    }
}
