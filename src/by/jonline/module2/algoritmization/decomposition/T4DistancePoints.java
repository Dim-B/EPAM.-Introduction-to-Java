package module2.algoritmization.decomposition;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
4. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
 */
public class T4DistancePoints {
    public static void main(String[] args) {
        int[] x;
        int[] y;
        int n;
        double maxDistance = 0;
        int p1 = 0;
        int p2 = 0;

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Введите количество точек n: ");
            n = sc.nextInt();
            x = new int[n];
            y = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.printf("Точка %d. Введите X: ", i + 1);
                x[i] = sc.nextInt();
                System.out.printf("Точка %d. Введите Y: ", i + 1);
                y[i] = sc.nextInt();
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода данных");
            return;
        } finally {
            sc.close();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                double distance = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
                if (distance > maxDistance) {
                    maxDistance = distance;
                    p1 = i;
                    p2 = j;
                }
            }
        }
        System.out.printf("Максимальное расстояние между точками %d(%d, %d) и %d(%d, %d). Оно равно %.3f", p1 + 1, x[p1], y[p1], p2 + 1, x[p2], y[p2], maxDistance);
    }
}
