package module1.basic.branching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
 */

public class T1CheckTriangle {
    public static void main(String[] args) throws IOException {
        int a;
        int b;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите угол треугольника А°: ");
            a = Integer.parseInt(reader.readLine());
            System.out.print("Введите угол треугольника B°: ");
            b = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Введены неверные данные");
            return;
        } finally {
            reader.close();
        }

        if (isTriangleExists(a, b)) {
            if (isTriangleRectangular(a, b))
                System.out.printf("Треугольник с заданными углами %d° и %d° существует и он является прямоугольным", a, b);
            else
                System.out.printf("Треугольник с заданными углами %d° и %d° существует, но он не является прямоугольным", a, b);
        } else
            System.out.printf("Треугольник с заданными углами %d° и %d° не существует", a, b);


    }

    private static boolean isTriangleExists(int a, int b) {
        return a + b <= 180;
    }

    private static boolean isTriangleRectangular(int a, int b) {
        return a + b == 90;
    }


}
