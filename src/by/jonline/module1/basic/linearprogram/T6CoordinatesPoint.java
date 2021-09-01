package module1.basic.linearprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:
            ^ y
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|▓|▓|▓|▓|_|_|_|_|_|_|
|_|_|_|_|▓|▓|▓|▓|_|_|_|_|_|_|
|_|_|_|_|▓|▓|▓|▓|_|_|_|_|_|_| x
|_|_|_|_|▓|▓0▓|▓|_|_|_|_|_|_|_\
|_|_|▓|▓|▓|▓|▓|▓|▓|▓|_|_|_|_| /
|_|_|▓|▓|▓|▓|▓|▓|▓|▓|_|_|_|_|
|_|_|▓|▓|▓|▓|▓|▓|▓|▓|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
 */

public class T6CoordinatesPoint {
    public static void main(String[] args) throws IOException {
        double x;
        double y;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите значение x: ");
            x = Double.parseDouble(reader.readLine());
            System.out.print("Введите значение y: ");
            y = Double.parseDouble(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Введены неверные данные");
            return;
        } finally {
            reader.close();
        }

        System.out.println("Результат принадлежности точки закрашенной области: " + isBelongArea(x, y));
    }

    private static boolean isBelongArea(double x, double y) {
        return ((x>=-4 && x<=4) && (y<=0 && y>=-3)) || ((x>=-2 && x<=2) && (y>=0 && y<=4));
    }

}
